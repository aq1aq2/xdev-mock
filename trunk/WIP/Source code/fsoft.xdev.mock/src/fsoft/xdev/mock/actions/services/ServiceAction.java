package fsoft.xdev.mock.actions.services;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IServicesDao;
import fsoft.xdev.mock.models.Services;

public class ServiceAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Services service;
	private IServicesDao servicesDao;
	private List<Services> listService = new ArrayList<Services>();
	
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
		records = servicesDao.count();
		
		//Your logic to search and select the required data.
		listService = servicesDao.findRange(from, to);
		
		//calculate the total pages for the query
		total = (int)Math.ceil((double)records/(double)rows);
		

		return "list";
	}
	
	
	public String save(){
		System.out.println("Ten cua service ta dinh them vao la: "+service.getName());
		servicesDao.add(service);
		return "save";
	}

	/**
	 * setter method
	 */

	public Services getService() {
		return service;
	}


	public void setService(Services service) {
		this.service = service;
	}

	
	public void setServicesDao(IServicesDao servicesDao) {
		this.servicesDao = servicesDao;
	}


	public List<Services> getListService() {
		return listService;
	}


	public void setListService(List<Services> listService) {
		this.listService = listService;
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



