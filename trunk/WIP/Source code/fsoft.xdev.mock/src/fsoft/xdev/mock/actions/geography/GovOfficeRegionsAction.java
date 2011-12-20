package fsoft.xdev.mock.actions.geography;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import fsoft.xdev.mock.dao.IGovOfficeRegionDao;
import fsoft.xdev.mock.models.GovOfficeRegion;

public class GovOfficeRegionsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GovOfficeRegion govOfficeRegion;
	private IGovOfficeRegionDao govOfficeRegionDao;

	private List listModel;
	private String filterKey;
	private boolean filterActive;
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

	public GovOfficeRegion getGovOfficeRegion() {
		return govOfficeRegion;
	}

	public void setGovOfficeRegion(GovOfficeRegion govOfficeRegion) {
		this.govOfficeRegion = govOfficeRegion;
	}

	public List getListModel() {
		return listModel;
	}

	public void setListModel(List listModel) {
		this.listModel = listModel;
	}

	public String getFilterKey() {
		return filterKey;
	}

	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
	}

	public boolean isFilterActive() {
		return filterActive;
	}

	public void setFilterActive(boolean filterActive) {
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

	public void setGovOfficeRegionDao(IGovOfficeRegionDao govOfficeRegionDao) {
		this.govOfficeRegionDao = govOfficeRegionDao;
	}
	
	public String list(){
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = govOfficeRegionDao.count(filterKey, filterActive);

		// Your logic to search and select the required data.
		listModel = govOfficeRegionDao.findRange(from, to, filterKey, filterActive);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);
		return "list";
	
	}

}
