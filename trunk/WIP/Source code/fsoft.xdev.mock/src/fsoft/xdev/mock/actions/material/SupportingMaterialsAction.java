package fsoft.xdev.mock.actions.material;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ISupportingMaterialDao;

public class SupportingMaterialsAction extends ActionSupport{
	
	private ISupportingMaterialDao materialDao;
	
	private List listModel;  // For list materials
	
	private boolean filterActive; // Filter by active
	
	private Integer rows = 0;
	private Integer page = 0;
	private String sord;
	private String sidx;
	private Integer total = 0;
	private Integer records = 0;
	
	
	public String list() {
		int to = (rows * page);
		int from = to - rows;

		records = materialDao.count(null, filterActive);
		listModel = materialDao.findRange(from, to, null, filterActive);
		total = (int) Math.ceil((double) records / (double) rows);
		
		return "list";
	}


	public ISupportingMaterialDao getMaterialDao() {
		return materialDao;
	}

	public void setMaterialDao(ISupportingMaterialDao materialDao) {
		this.materialDao = materialDao;
	}

	public List getListModel() {
		return listModel;
	}


	public void setListModel(List listModel) {
		this.listModel = listModel;
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
}
