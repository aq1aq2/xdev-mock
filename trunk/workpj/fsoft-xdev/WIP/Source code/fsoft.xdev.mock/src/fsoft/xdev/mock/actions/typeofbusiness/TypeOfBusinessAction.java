package fsoft.xdev.mock.actions.typeofbusiness;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ITypeOfBusinessDao;

public class TypeOfBusinessAction extends ActionSupport {
	
	private ITypeOfBusinessDao typeOfBusinessDao;
	
	private List listModel;  // For list type of business
	
	private String filterBusinessName = ""; // Filter by business name
	private String filterSicCode = ""; // Filter by SIC code
	
	private Integer rows = 0;
	private Integer page = 0;
	private String sord;
	private String sidx;
	private Integer total = 0;
	private Integer records = 0;
	
	
	/**
	 * Return TypeOfBusiness List page
	 */
	public String execute() {
		return SUCCESS;
	}
	
	/**
	 * List all TypeOfBusiness
	 * @return action returns listModel (JSON)
	 */
	public String list() {		
		int to = (rows * page);
		int from = to - rows;

		records = typeOfBusinessDao.count(filterBusinessName, filterSicCode);
		listModel = typeOfBusinessDao.search(from, to, filterBusinessName, filterSicCode);
		total = (int) Math.ceil((double) records / (double) rows);
		
		return "list";
	}
	
	/*
	 * Getters and Setters
	 */
	
	public ITypeOfBusinessDao getTypeOfBusinessDao() {
		return typeOfBusinessDao;
	}
	public void setTypeOfBusinessDao(ITypeOfBusinessDao typeOfBusinessDao) {
		this.typeOfBusinessDao = typeOfBusinessDao;
	}
	public List getListModel() {
		return listModel;
	}
	public void setListModel(List listModel) {
		this.listModel = listModel;
	}
	public String getFilterBusinessName() {
		return filterBusinessName;
	}
	public void setFilterBusinessName(String filterBusinessName) {
		this.filterBusinessName = filterBusinessName;
	}
	public String getFilterSicCode() {
		return filterSicCode;
	}
	public void setFilterSicCode(String filterSicCode) {
		this.filterSicCode = filterSicCode;
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
}
