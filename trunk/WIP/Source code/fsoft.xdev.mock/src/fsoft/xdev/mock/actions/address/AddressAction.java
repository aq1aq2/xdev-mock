package fsoft.xdev.mock.actions.address;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IAddressDao;

public class AddressAction extends ActionSupport {
	
	private IAddressDao addressDao;
	
	private List listModel;  // For list addresses
	
	private String filterPostcode = ""; // Filter by postcode
	private String filterStreet = ""; // Filter by street
	private String filterTown = ""; // Filter by town
	
	private Integer rows = 0;
	private Integer page = 0;
	private String sord;
	private String sidx;
	private Integer total = 0;
	private Integer records = 0;
	
	
	public String list() {
		int to = (rows * page);
		int from = to - rows;

		records = addressDao.count(filterPostcode, filterStreet, filterTown);
		listModel = addressDao.search(from, to, filterPostcode, filterStreet, filterTown);
		total = (int) Math.ceil((double) records / (double) rows);
		
		return "list";
	}


	/*
	 * Getters and Setters
	 */
	
	public IAddressDao getAddressDao() {
		return addressDao;
	}


	public void setAddressDao(IAddressDao addressDao) {
		this.addressDao = addressDao;
	}


	public List getListModel() {
		return listModel;
	}


	public void setListModel(List listModel) {
		this.listModel = listModel;
	}


	public String getFilterPostcode() {
		return filterPostcode;
	}


	public void setFilterPostcode(String filterPostcode) {
		this.filterPostcode = filterPostcode;
	}


	public String getFilterStreet() {
		return filterStreet;
	}


	public void setFilterStreet(String filterStreet) {
		this.filterStreet = filterStreet;
	}


	public String getFilterTown() {
		return filterTown;
	}


	public void setFilterTown(String filterTown) {
		this.filterTown = filterTown;
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
