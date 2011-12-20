package fsoft.xdev.mock.actions.premise;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import fsoft.xdev.mock.dao.IPremiseDao;
import fsoft.xdev.mock.models.Premise;
import fsoft.xdev.mock.models.PremiseList;

public class PremiseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IPremiseDao premiseDao;
	private Premise premise;
	private List<PremiseList> listPremises = new ArrayList<PremiseList>();
	private String filterKey;
	private boolean filterActive;
	
	//get how many rows we want to have into the grid - rowNum attribute in the grid
	  private Integer             rows             = 0;

	  //Get the requested page. By default grid sets this to 1.
	  private Integer             page             = 0;

	  // sorting order - asc or desc
	  private String              sord;

	  // get index row - i.e. user click to sort.
	  private String              sidx;

	  // Your Total Pages
	  private Integer             total            = 0;

	  // All Record
	  private Integer             records          = 0;

	public String list(){
		int to = (rows*page);
		int from = to - rows;
		records = premiseDao.count(filterKey, filterActive);
		listPremises = premiseDao.findRange(from, to, filterKey, filterActive);
		total = (int)Math.ceil((double)records/(double)rows);
		//listPremises = premisesDao.findAll();
		System.out.println("List premise " + listPremises.size());
		return "list";
	}
	
	public String save(){
		System.out.println("vao day");
		premise.setStatus(false);
		premiseDao.add(premise);
		System.out.println("one premise is added");
		return "add";
	}

	public void setPremiseDao(IPremiseDao premiseDao) {
		this.premiseDao = premiseDao;
	}

	public Premise getPremise() {
		return premise;
	}

	public void setPremise(Premise premise) {
		this.premise = premise;
	}

	public List<PremiseList> getListPremises() {
		return listPremises;
	}

	public void setListPremises(List<PremiseList> listPremises) {
		this.listPremises = listPremises;
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

	public boolean isFilterActive() {
		return filterActive;
	}

	public void setFilterActive(boolean filterActive) {
		this.filterActive = filterActive;
	}
	

}
