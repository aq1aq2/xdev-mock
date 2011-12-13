package fsoft.xdev.mock.actions.premise;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import fsoft.xdev.mock.dao.IPremisesDao;
import fsoft.xdev.mock.models.Premises;

public class PremiseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IPremisesDao premisesDao;
	private Premises premises;
	private List<Premises> listPremises = new ArrayList<Premises>();
	
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
		records = premisesDao.count();
		listPremises = premisesDao.findRange(from, to);
		total = (int)Math.ceil((double)records/(double)rows);
		//listPremises = premisesDao.findAll();
		System.out.println("List premises " + listPremises.size());
		return "list";
	}
	
	public String save(){
		System.out.println("vao day");
		premises.setIsActive(false);
		premisesDao.add(premises);
		System.out.println("one premise is added");
		return "add";
	}

	public void setPremisesDao(IPremisesDao premisesDao) {
		this.premisesDao = premisesDao;
	}

	public Premises getPremises() {
		return premises;
	}

	public void setPremises(Premises premises) {
		this.premises = premises;
	}

	public List<Premises> getListPremises() {
		return listPremises;
	}

	public void setListPremises(List<Premises> listPremises) {
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

}
