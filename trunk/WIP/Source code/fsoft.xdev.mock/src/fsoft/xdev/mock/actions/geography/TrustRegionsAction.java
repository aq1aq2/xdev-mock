package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ICountryDao;
import fsoft.xdev.mock.dao.ITrustRegionDao;
import fsoft.xdev.mock.models.Country;
import fsoft.xdev.mock.models.CountryList;
import fsoft.xdev.mock.models.TrustRegion;

public class TrustRegionsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustRegion trustRegion;
	private ITrustRegionDao trustRegionDao;
	private List listModel;
	private List<CountryList> listCountry = new ArrayList<CountryList>();
	private ICountryDao countryDao;
	private String filterKey;
	private Boolean filterActive;

	// get how many rows we want to have into the grid - rowNum attribute in the
	// grid
	private Integer rows = 0;

	// Get the requested page. By default grid sets this to 1.
	private Integer page = 0;

	// sorting order - asc or desc
	private String sord;

	// get index row - i.e. user click to sort.
	private String sidx;

	// Your Total Pages
	private Integer total = 0;

	// All Record
	private Integer records = 0;

	public TrustRegionsAction() {
		trustRegion = new TrustRegion();
	}

	public TrustRegion getTrustRegion() {
		return trustRegion;
	}

	public void setTrustRegion(TrustRegion trustRegion) {
		this.trustRegion = trustRegion;
	}

	public List getListModel() {
		return listModel;
	}

	public void setListModel(List listModel) {
		this.listModel = listModel;
	}

	public List<CountryList> getListCountry() {
		return listCountry;
	}

	public void setListCountry(List<CountryList> listCountry) {
		this.listCountry = listCountry;
	}

	public String getFilterKey() {
		return filterKey;
	}

	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
	}

	public Boolean getFilterActive() {
		return filterActive;
	}

	public void setFilterActive(Boolean filterActive) {
		this.filterActive = filterActive;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public void setTrustRegionDao(ITrustRegionDao trustRegionDao) {
		this.trustRegionDao = trustRegionDao;
	}

	public void setCountryDao(ICountryDao countryDao) {
		this.countryDao = countryDao;
	}

	// list all trust region
	public String list() {
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = trustRegionDao.count(filterKey, filterActive);
		listModel = trustRegionDao.findRange(from, to, filterKey, filterActive);
		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);
		return "list";
	}

	// save trust region into database
	public String save() {
		trustRegionDao.add(trustRegion);
		return "add";
	}
	// find trust region by ID
	public String detail() {
		System.out.println(" vao day nha" + trustRegion.getTrustRegionId());
		trustRegion = trustRegionDao.find(trustRegion);

		 listCountry = countryDao.findAll();
		return "detail";
	}

	public String update() {
		trustRegionDao.edit(trustRegion);
		return "update";
	}
}
