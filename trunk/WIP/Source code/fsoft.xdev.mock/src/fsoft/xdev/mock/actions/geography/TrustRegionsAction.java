package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ICountriesDao;
import fsoft.xdev.mock.dao.ITrustRegionsDao;
import fsoft.xdev.mock.models.Countries;
import fsoft.xdev.mock.models.TrustRegions;

public class TrustRegionsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustRegions trustRegions;
	private ITrustRegionsDao trustRegionDao;
	private List<TrustRegions> listModel = new ArrayList<TrustRegions>();
	private List<Countries> listCountries = new ArrayList<Countries>();
	private ICountriesDao countriesDao;

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

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public TrustRegions getTrustRegions() {
		return trustRegions;
	}

	public List<Countries> getListCountries() {
		return listCountries;
	}

	public void setListCountries(List<Countries> listCountries) {
		this.listCountries = listCountries;
	}

	public void setCountriesDao(ICountriesDao countriesDao) {
		this.countriesDao = countriesDao;
	}

	public List<TrustRegions> getListModel() {
		return listModel;
	}

	public void setListModel(List<TrustRegions> listModel) {
		this.listModel = listModel;
	}

	public void setTrustRegions(TrustRegions trustRegions) {
		this.trustRegions = trustRegions;
	}

	public void setTrustRegionDao(ITrustRegionsDao trustRegionDao) {
		this.trustRegionDao = trustRegionDao;
	}

	public TrustRegionsAction() {
		trustRegions = new TrustRegions();
	}

	// list all trust region
	public String list() {
		// listModel = trustRegionDao.findAll();

		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = trustRegionDao.count();

		// Your logic to search and select the required data.
		listModel = trustRegionDao.findRange(from, to);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);

		listCountries = countriesDao.findAll();
		return "list";
	}

	// save trust region into database
	public String save() {
		trustRegionDao.add(trustRegions);
		return "add";
	}

	// search trust regions
	public String search() throws Exception {
		System.out.println(key);
		listModel = trustRegionDao.search(key);
		return "list";
	}

	// find trust region by ID
	public String detail(){
		System.out.println(trustRegions.getTrustRegionId());
		trustRegions = trustRegionDao.find(trustRegions);
		
		listCountries = countriesDao.findAll();
		return "detail";
	}
	
	public String update() {
		trustRegionDao.edit(trustRegions);
		return "update";
	}
}
