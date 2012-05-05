package fsoft.xdev.mock.actions.geography;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ITrustDistrictDao;
import fsoft.xdev.mock.dao.ITrustRegionDao;
import fsoft.xdev.mock.models.TrustDistrict;
import fsoft.xdev.mock.models.TrustRegion;

public class TrustDistrictsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustDistrict trustDistrict;
	private ITrustDistrictDao trustDistrictDao;
	private ITrustRegionDao trustRegionDao;
	private List listModel;
	private String filterKey;
	private boolean filterActive;
	private Boolean mode;

	// get how many rows we want to have into the grid - rowNum attribute in the
	// grid
	private Integer rows = 0;

	// Get the requested page. By default grid sets this to 1.
	private Integer page = 0;

	// sorting order - asc or desc
	private String sord;

	public Boolean getMode() {
		return mode;
	}

	public void setMode(Boolean mode) {
		this.mode = mode;
	}

	// get index row - i.e. user click to sort.
	private String sidx;

	// Your Total Pages
	private Integer total = 0;

	// All Record
	private Integer records = 0;

	public String getFilterKey() {
		return filterKey;
	}

	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
	}

	public boolean getFilterActive() {
		return filterActive;
	}

	public void setFilterActive(boolean filterActive) {
		this.filterActive = filterActive;
	}

	public void setTrustDistrictDao(ITrustDistrictDao trustDistrictDao) {
		this.trustDistrictDao = trustDistrictDao;
	}

	public void setTrustRegionDao(ITrustRegionDao trustRegionDao) {
		this.trustRegionDao = trustRegionDao;
	}

	public TrustDistrict getTrustDistrict() {
		return trustDistrict;
	}

	public void setTrustDistrict(TrustDistrict trustDistrict) {
		this.trustDistrict = trustDistrict;
	}

	public List getListModel() {
		return listModel;
	}

	public void setListModel(List listModel) {
		this.listModel = listModel;
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
	
	public String execute() {
		return SUCCESS;
	}

	/**
	 * List all Trust Distric
	 * 
	 * @return action returns listTrustDistrict
	 */
	public String list() {
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust District)
		records = trustDistrictDao.count(filterKey, filterActive);

		// Your logic to search and select the required data.
		listModel = trustDistrictDao.findRange(from, to, filterKey,
				filterActive);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);

		return "list";
	}

	public String add() {
		trustDistrict.setStatus(false);
		trustDistrictDao.add(trustDistrict);
		return "add";
	}

	// find trust district by ID
	public String detail() {
		trustDistrict = trustDistrictDao.find(trustDistrict);		
		mode = false;
		return "input";
	}

	public String edit() {	
		trustDistrictDao.edit(trustDistrict);
		return "edit";
	}
	public String input() {
		trustDistrict = new TrustDistrict();
		mode = true;
		return "input";
	}
	public String active(){
		System.out.println("vao day: " + trustDistrict.getTrustDistrictId());
		trustDistrict = trustDistrictDao.find(trustDistrict);
		trustDistrict.setStatus(true);
		trustDistrictDao.edit(trustDistrict);
		return "list";
	}
}
