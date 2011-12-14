package fsoft.xdev.mock.actions.facility;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IFacilitiesDao;
import fsoft.xdev.mock.models.Facilities;

public class FacilitiesAction extends ActionSupport {
	private Facilities facilities;
	private IFacilitiesDao facilitiesDao;
	List<Facilities> listFacilities = new ArrayList<Facilities>();
	
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
		  records = facilitiesDao.count();
		  listFacilities = facilitiesDao.findRange(from, to);
		  total = (int)Math.ceil((double)records/(double)rows);
		  System.out.println("facilities is listed");
		  return "list";
	  }
	  
	  public String save(){
			System.out.println("vao day");
			facilities.setIsActive(false);
			facilitiesDao.add(facilities);
			System.out.println("one facility is added");
			return "add";
		}
	  
	  public String detail(){
		  return "detail";
	  }
	  
	  

	public Facilities getFacilities() {
		return facilities;
	}

	public void setFacilities(Facilities facilities) {
		this.facilities = facilities;
	}

	public void setFacilitiesDao(IFacilitiesDao facilitiesDao) {
		this.facilitiesDao = facilitiesDao;
	}

	public List<Facilities> getListFacilities() {
		return listFacilities;
	}

	public void setListFacilities(List<Facilities> listFacilities) {
		this.listFacilities = listFacilities;
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
