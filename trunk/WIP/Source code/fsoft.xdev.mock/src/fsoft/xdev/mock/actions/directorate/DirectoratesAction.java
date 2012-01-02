package fsoft.xdev.mock.actions.directorate;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IDirectorateDao;
import fsoft.xdev.mock.models.Directorate;
import fsoft.xdev.mock.utilities.XDebugger;

public class DirectoratesAction  extends ActionSupport{

	private Directorate directorate;
	private IDirectorateDao directoratesDao;
	private List<Directorate> listModel = new ArrayList<Directorate>();
	private String filterKey;
	private Boolean filterActive;
	private Boolean mode;	
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
	
	public Directorate getDirectorate() {
		return directorate;
	}

	public void setDirectorate(Directorate directorate) {
		this.directorate = directorate;
	}

	public List<Directorate> getListModel() {
		return listModel;
	}

	public void setListModel(List<Directorate> listModel) {
		this.listModel = listModel;
	}

	public void setDirectoratesDao(IDirectorateDao directoratesDao) {
		this.directoratesDao = directoratesDao;
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

	public Boolean getMode() {
		return mode;
	}

	public void setMode(Boolean mode) {
		this.mode = mode;
	}

	public String execute(){
		return SUCCESS;
	}
	public DirectoratesAction() {
		XDebugger.show("Constructor: Create Directorate Action");
	}
	
	public String list() {
		XDebugger.show("DirectorateAction said: list method");
		// listModel = trustRegionDao.findAll();
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = directoratesDao.count(filterKey,filterActive);

		// Your logic to search and select the required data.
		listModel = directoratesDao.findRange(from, to,filterKey,filterActive);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);

		return "list";
	}
	
	public String add() {
		XDebugger.show("DepartmentAction said: add method");
		directoratesDao.add(directorate);
		return "add";
	}
	public String edit() {		
		directoratesDao.edit(directorate);
		return "edit";
	}
	public String detail() {
		directorate = directoratesDao.find(directorate);			
		mode = false;
		return "input";
	}
	
	public String active(){
		directorate = directoratesDao.find(directorate);	
		directorate.setStatus(true);
		directoratesDao.edit(directorate);	
		return "list";
	}
	public String input(){
		directorate = new Directorate();
		return "input";
	}
	
}
