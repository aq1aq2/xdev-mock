package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ICountryDao;
import fsoft.xdev.mock.dao.ITrustRegionDao;
import fsoft.xdev.mock.models.Country;
import fsoft.xdev.mock.models.TrustRegion;
import fsoft.xdev.mock.models.TrustRegionList;

public class TrustRegionsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustRegion trustRegion;
	private ITrustRegionDao trustRegionDao;
	private List<TrustRegionList> listModel ;
	private List<Country> listCountry = new ArrayList<Country>();
	private ICountryDao countryDao;
	private String key;
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

	// list all trust region
	public String list() {
		// listModel = trustRegionDao.findAll();

		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = trustRegionDao.count();

		// Your logic to search and select the required data.
		listModel = trustRegionDao.findRange(from, to,"S T U V",true);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);

//		listCountry = countryDao.findAll();
		
		System.out.println("du lieu tu action: " + listModel.size());
		
		return "list";
	}

	// save trust region into database
	public String save() {
		trustRegionDao.add(trustRegion);
		return "add";
	}

	public TrustRegion getTrustRegion() {
		return trustRegion;
	}

	public void setTrustRegion(TrustRegion trustRegion) {
		this.trustRegion = trustRegion;
	}

	public List<TrustRegionList>  getListModel() {
		return listModel;
	}

	public void setListModel(List<TrustRegionList>  listModel) {
		this.listModel = listModel;
	}

	public List<Country> getListCountry() {
		return listCountry;
	}

	public void setListCountry(List<Country> listCountry) {
		this.listCountry = listCountry;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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

	// search trust regions
	public String search() throws Exception {
		System.out.println(key);
//		listModel = trustRegionDao.search(key);
		return "list";
	}

	// find trust region by ID
	public String detail() {
		System.out.println(" vao day nha" + trustRegion.getTrustRegionId());
		trustRegion = trustRegionDao.find(trustRegion);

//		listCountry = countryDao.findAll();
		return "detail";
	}

	public String update() {
		trustRegionDao.edit(trustRegion);
		return "update";
	}
}
