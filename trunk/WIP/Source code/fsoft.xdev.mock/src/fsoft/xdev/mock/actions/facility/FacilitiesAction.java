package fsoft.xdev.mock.actions.facility;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IFacilityDao;
import fsoft.xdev.mock.dao.IReferenceDataDao;
import fsoft.xdev.mock.models.Facility;
import fsoft.xdev.mock.models.FacilityList;
import fsoft.xdev.mock.models.ReferenceDataList;

public class FacilitiesAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Facility facility;
	private IFacilityDao facilitiesDao;
	private IReferenceDataDao referenceDataDao;
	List<FacilityList> listFacilities = new ArrayList<FacilityList>();
	
	List<ReferenceDataList> listFacilitiesType = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listConnectivityType = new ArrayList<ReferenceDataList>();
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
	 
	  @SuppressWarnings("unchecked")
	public String list(){
		  int to = (rows*page);
		  int from = to - rows;
		  records = facilitiesDao.count(filterKey, filterActive);
		 
		  listFacilities = facilitiesDao.findRange(from, to,filterKey,filterActive);
		  
		  System.out.println("total record: " + records);
		  
		  total = (int)Math.ceil((double)records/(double)rows);
		  
		  System.out.println("facilities is listed");
		  System.out.println(listFacilities.size());
		  System.out.println("doan cuoi");
		  return "list";
	  }
	  
	  public String save(){
			System.out.println("vao day");
			facility.setStatus(false);
			System.out.println("vao tiep nao");
			System.out.println(facility.getFacilityId());
			System.out.println( "ID for Failitytype: "+facility.getReferenceDataByFacilityType().getReferenceDataId());
			System.out.println( "Description: "+facility.getFacilityDescription());
			System.out.println("id for Connect "+facility.getReferenceDataByConnectivityType().getReferenceDataId());
			System.out.println( "note for room: "+facility.getRoomEquipmentNotes());
			System.out.println(facility.getWirelessAccessInfomation());
			System.out.println(facility.getRoomCapacity());
			System.out.println(facility.getRoomConnectivity());
			System.out.println( "Id OF CONTACT: "+facility.getContactByContactId().getContactId());
			
			facilitiesDao.add(facility);
			System.out.println("one facility is added");
			return "add";
		}
	  
	  public String detail(){
		  
		  listFacilitiesType = referenceDataDao.getFacilityType();
		  listConnectivityType = referenceDataDao.getConnectivityType();
		  for (ReferenceDataList c:listFacilitiesType){
			  System.out.println(c.getType());
		  }
		  for (ReferenceDataList d:listConnectivityType){
			  System.out.println(d.getType());
		  }
		  return "detail";
	  }
	  

	public void setReferenceDataDao(IReferenceDataDao referenceDataDao) {
		this.referenceDataDao = referenceDataDao;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public void setFacilitiesDao(IFacilityDao facilitiesDao) {
		this.facilitiesDao = facilitiesDao;
	}


	public List<FacilityList> getListFacilities() {
		return listFacilities;
	}

	public void setListFacilities(List<FacilityList> listFacilities) {
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

	public List<ReferenceDataList> getListFacilitiesType() {
		return listFacilitiesType;
	}

	public void setListFacilitiesType(List<ReferenceDataList> listFacilitiesType) {
		this.listFacilitiesType = listFacilitiesType;
	}

	public List<ReferenceDataList> getListConnectivityType() {
		return listConnectivityType;
	}

	public void setListConnectivityType(List<ReferenceDataList> listConnectivityType) {
		this.listConnectivityType = listConnectivityType;
	}
	
	  
}
