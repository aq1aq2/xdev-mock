package fsoft.xdev.mock.actions.material;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ISupportingMaterialDao;
import fsoft.xdev.mock.models.SupportingMaterial;

public class SupportingMaterialsAction extends ActionSupport{

	private ISupportingMaterialDao entityDao;

	private List listModel;  // For list materials
	private SupportingMaterial entity; // For create or amend material
	private int selectedId = -1; // For amend selected material

	private boolean filterActive; // Filter by active

	private Integer rows = 0;
	private Integer page = 0;
	private String sord;
	private String sidx;
	private Integer total = 0;
	private Integer records = 0;


	/**
	 * List all SupportingMaterial
	 * @return listModel (JSON)
	 */
	public String list() {
		int to = (rows * page);
		int from = to - rows;

		records = entityDao.count(null, filterActive);
		listModel = entityDao.findRange(from, to, null, filterActive);
		total = (int) Math.ceil((double) records / (double) rows);

		return "list";
	}

	/**
	 * SupportingMaterial Input page
	 * @return action returns SupportingMaterial Input JSP page
	 */
	public String input() {
		/* Select material to amend */
		if (selectedId > -1) {
			entity = entityDao.find(new SupportingMaterial(selectedId));
			selectedId = -1; //Reset selectedId
		} else {
			entity = null;
		}

		return "input";
	}
	
	/**
	 * Save material
	 * @return
	 */
	public String save() {
		System.out.println(entity.getSupportingMaterialId());
		System.out.println(entity.getUrl());
		if (entity.getAccount().getAccountId() == 0) {
			entity.setAccount(null);
		}
		entityDao.addOrUpdate(entity);
		return "save";
	}


	public ISupportingMaterialDao getEntityDao() {
		return entityDao;
	}

	public void setEntityDao(ISupportingMaterialDao entityDao) {
		this.entityDao = entityDao;
	}

	public List getListModel() {
		return listModel;
	}


	public void setListModel(List listModel) {
		this.listModel = listModel;
	}

	public SupportingMaterial getEntity() {
		return entity;
	}

	public void setEntity(SupportingMaterial entity) {
		this.entity = entity;
	}

	public int getSelectedId() {
		return selectedId;
	}

	public void setSelectedId(int selectedId) {
		this.selectedId = selectedId;
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
