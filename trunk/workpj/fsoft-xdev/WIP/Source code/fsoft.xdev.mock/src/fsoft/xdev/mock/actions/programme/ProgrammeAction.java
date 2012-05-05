package fsoft.xdev.mock.actions.programme;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IProgrammeDao;
import fsoft.xdev.mock.dao.IServiceDao;
import fsoft.xdev.mock.models.Programme;
import fsoft.xdev.mock.models.ProgrammeList;
import fsoft.xdev.mock.models.Service;
import fsoft.xdev.mock.models.ServiceList;

public class ProgrammeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Programme programme;
	private IProgrammeDao	programmeDao;
	private List listProgramme;
	
	private String filterKey;
	private boolean filterActive;
	/**
	 * parameters for paging
	 */
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
	
	/**
	 * list all Service 
	 * return list
	 */
	public String list(){
		System.out.println("+++++++++++++++++++++++++++++++++++++");		
		System.out.println("co vao day khong");
		
		int to = (rows*page);
		int from = to-rows;
		
		//Count Rows (select count(*) from GovtOfficeRegion)
		records = programmeDao.count(filterKey, filterActive);
		
		//Your logic to search and select the required data.
		listProgramme = programmeDao.findRange(from, to, filterKey, filterActive);
		
//		for (ProgrammeList programme : listProgramme) {
//			System.out.println("Programme Id: "+programme.getProgrammeId());
//			System.out.println("Ten pro: " +programme.getName());
//			System.out.println("Contact Name: "+programme.getContact());
//			System.out.println("Description: "+programme.getDescription());
//			System.out.println("isActived: "+programme.getStatus());
//		}
		
		//calculate the total pages for the query
		total = (int)Math.ceil((double)records/(double)rows);
		

		return "list";
	}
	
	
	public String save(){
		System.out.println("Ten cua service ta dinh them vao la: "+programme.getName());
		programmeDao.add(programme);
		return "save";
	}

	/**
	 * setter method
	 */



	public void setProgrammeDao(IProgrammeDao programmeDao) {
		this.programmeDao = programmeDao;
	}


	public void setProgramme(Programme programme) {
		this.programme = programme;
	}

	public List getListProgramme() {
		return listProgramme;
	}


	public void setListProgramme(List listProgramme) {
		this.listProgramme = listProgramme;
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
