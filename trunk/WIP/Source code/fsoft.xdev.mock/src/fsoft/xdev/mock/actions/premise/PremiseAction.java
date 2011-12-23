package fsoft.xdev.mock.actions.premise;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import fsoft.xdev.mock.dao.IPremiseDao;
import fsoft.xdev.mock.dao.IReferenceDataDao;
import fsoft.xdev.mock.models.Premise;
import fsoft.xdev.mock.models.PremiseList;
import fsoft.xdev.mock.models.ReferenceDataList;

public class PremiseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IPremiseDao premiseDao;
	private Premise premise;
	private IReferenceDataDao referenceDataDao;
	private List<PremiseList> listPremises = new ArrayList<PremiseList>();
	private List<ReferenceDataList> listLocationType = new ArrayList<ReferenceDataList>();
	private List<ReferenceDataList> listAccreditations = new ArrayList<ReferenceDataList>();
	private List<ReferenceDataList> listLocalDemographicIssue = new ArrayList<ReferenceDataList>();
	private List<ReferenceDataList> listCateringType = new ArrayList<ReferenceDataList>();
	private List<ReferenceDataList> listNetwork = new ArrayList<ReferenceDataList>();
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
		//Get all record following filterKey and filterActive
		records = premiseDao.count(filterKey, filterActive);
		//get the range of records to display in one page
		listPremises = premiseDao.findRange(from, to, filterKey, filterActive);
		//the number of page
		total = (int)Math.ceil((double)records/(double)rows);
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
	
	public String detail(){
		// check save or update premise
		if (mode > -1){
			premise = premiseDao.find(premise);
			setMode(-1);
		}	else {
			premise = null;
		}
		
		listLocationType = referenceDataDao.getItem("Location Type");
		listAccreditations = referenceDataDao.getItem("Accreditation");
		listCateringType = referenceDataDao.getItem("Catering Type");
		listLocalDemographicIssue = referenceDataDao.getItem("Local Demographic Issue");
		//listNetwork = referenceDataDao.getItem("Network");
		listNetwork = referenceDataDao.getItem("Network");
		for(ReferenceDataList s: listNetwork){
			System.out.println(s.getType());
		}
		return "detail";
	}

	public void setPremiseDao(IPremiseDao premiseDao) {
		this.premiseDao = premiseDao;
	}

	public Premise getPremise() {
		return premise;
	}

	public void setReferenceDataDao(IReferenceDataDao referenceDataDao) {
		this.referenceDataDao = referenceDataDao;
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

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public List<ReferenceDataList> getListLocationType() {
		return listLocationType;
	}

	public void setListLocationType(List<ReferenceDataList> listLocationType) {
		this.listLocationType = listLocationType;
	}

	public List<ReferenceDataList> getListAccreditations() {
		return listAccreditations;
	}

	public void setListAccreditations(List<ReferenceDataList> listAccreditations) {
		this.listAccreditations = listAccreditations;
	}

	public List<ReferenceDataList> getListLocalDemographicIssue() {
		return listLocalDemographicIssue;
	}

	public void setListLocalDemographicIssue(
			List<ReferenceDataList> listLocalDemographicIssue) {
		this.listLocalDemographicIssue = listLocalDemographicIssue;
	}

	public List<ReferenceDataList> getListCateringType() {
		return listCateringType;
	}

	public void setListCateringType(List<ReferenceDataList> listCateringType) {
		this.listCateringType = listCateringType;
	}

	public List<ReferenceDataList> getListNetwork() {
		return listNetwork;
	}

	public void setListNetwork(List<ReferenceDataList> listNetwork) {
		this.listNetwork = listNetwork;
	}
	
}
