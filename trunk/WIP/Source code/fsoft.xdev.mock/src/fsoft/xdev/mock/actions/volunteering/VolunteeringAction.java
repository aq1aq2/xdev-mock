package fsoft.xdev.mock.actions.volunteering;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IVolunteerDao;
import fsoft.xdev.mock.models.Volunteer;
import fsoft.xdev.mock.models.VolunteerList;

public class VolunteeringAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Volunteer volunteer;
	private IVolunteerDao volunteerDao;
	private List<VolunteerList> listVolunteer = new ArrayList<VolunteerList>();
	private String filterKey;
	private boolean filterActive;
	private int mode = -1;
	
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
	  
	  @SuppressWarnings("unchecked")
	public String list(){
		  int to = (rows*page);
		  int from = to - rows;
		  records = volunteerDao.count(filterKey, filterActive);
		  listVolunteer = volunteerDao.findRange(from, to, filterKey, filterActive);
		  total = (int)Math.ceil((double)records/(double)rows);
		  System.out.println("Volunteer is listed");
		  return "list";
	  }
	  
	  public String save(){
		  System.out.println("vao day");
		  volunteer.setStatus(false);
		  volunteerDao.add(volunteer);
		  System.out.println("one volunteer is added");
		  return "add";
	  }
	  
	  public String detail(){
		  
		  // check save or update volunteer
		  
		 if (mode > -1){
			 volunteer = volunteerDao.find(volunteer);
			 setMode(-1);
		 } else {
			 volunteer = null;
		 }
		  return "detail";
	  }


	public Volunteer getVolunteer() {
		return volunteer;
	}

	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}

	public void setVolunteerDao(IVolunteerDao volunteerDao) {
		this.volunteerDao = volunteerDao;
	}

	public List<VolunteerList> getListVolunteer() {
		return listVolunteer;
	}

	public void setListVolunteer(List<VolunteerList> listVolunteer) {
		this.listVolunteer = listVolunteer;
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

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}
	
}
