package fsoft.xdev.mock.actions.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IReferenceDataDao;
import fsoft.xdev.mock.dao.IServiceDao;
import fsoft.xdev.mock.models.ReferenceDataList;
import fsoft.xdev.mock.models.Service;
import fsoft.xdev.mock.models.ServiceList;

public class ServiceAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Service service;
	private IServiceDao servicesDao;
	private IReferenceDataDao referenceDataDao;
	private List<ServiceList> listService = new ArrayList<ServiceList>();

	List<ReferenceDataList> listServiceType = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listSubType = new ArrayList<ReferenceDataList>();
	
	//seventeen listcheckbox
	List<ReferenceDataList>	listServiceBenefitsCriterion = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList>	listServiceBarriersCriterion = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList>	listServiceEthnicityCriterion = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listServiceDisabilityCriterion = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listServicePersonalCircumstancesCriterion = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listOtherServiceParticipationCriterion = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listClientSupportProcess = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listIntervention = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listClientJourney = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listOtherServices = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listSupportCentres = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listClientOutcome = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listTargetClient = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listAccreditations = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listReferralSources = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listProgramme = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listContactOutcome = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listContactObligation = new ArrayList<ReferenceDataList>();
	List<ReferenceDataList> listParticipation = new ArrayList<ReferenceDataList>();
	
	//list all Checkbox is checked
	
	
	String listServiceBenefitsCriterion_Checked;
	String listServiceBarriersCriterion_Checked; 
	String listServiceEthnicityCriterion_Checked; 
	String listServiceDisabilityCriterion_Checked;
	String listServicePersonalCircumstancesCriterion_Checked;
	String listOtherServiceParticipationCriterion_Checked; 
	String listClientSupportProcess_Checked; 
	String listIntervention_Checked; 
	String listClientJourney_Checked; 
	String listOtherServices_Checked; 
	String listSupportCentres_Checked;
	String listClientOutcome_Checked; 
	String listTargetClient_Checked; 
	String listAccreditations_Checked; 
	String listReferralSources_Checked; 
 
	String listContactOutcome_Checked; 
	String listContactObligation_Checked; 

	Date dateStart;
	
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
		records = servicesDao.count(filterKey, filterActive);
		
		//Your logic to search and select the required data.
		listService = servicesDao.findRange(from, to, filterKey, filterActive);
		
		//calculate the total pages for the query
		total = (int)Math.ceil((double)records/(double)rows);
		

		return "list";
	}
	
	public String detail(){
		
		listServiceType = referenceDataDao.getServiceType();
		listSubType = referenceDataDao.getSubType();
		
		listServiceBenefitsCriterion = referenceDataDao.getItem("Service Benefits Criterion");
		listServiceBarriersCriterion = referenceDataDao.getItem("Service Barriers Criterion");
		listServiceEthnicityCriterion = referenceDataDao.getItem("Service Ethnicity Criterion");
		 listServiceDisabilityCriterion = referenceDataDao.getItem("Service Disability Criterion");
		 listServicePersonalCircumstancesCriterion = referenceDataDao.getItem("Service Personal Circumstances Criterion");
		 listOtherServiceParticipationCriterion = referenceDataDao.getItem("Other Service Participation Criterion");
		 listClientSupportProcess = referenceDataDao.getItem("Client Support Process");
		 listIntervention = referenceDataDao.getItem("Intervention");
		 listClientJourney = referenceDataDao.getItem("Client Journey");
		 listOtherServices = referenceDataDao.getItem("Other Services");
		 listSupportCentres = referenceDataDao.getItem("Support Centres");
		 listClientOutcome = referenceDataDao.getItem("Client Outcome");
		 listTargetClient = referenceDataDao.getItem("Target Client");
		 listAccreditations = referenceDataDao.getItem("Accreditations");
		 listReferralSources = referenceDataDao.getItem("Referral Sources");
		 listProgramme = referenceDataDao.getItem("Programme");
		 listContactOutcome = referenceDataDao.getItem("Contact Outcome");
		 listContactObligation = referenceDataDao.getItem("Contact Obligation");
		 listParticipation = referenceDataDao.getItem("Participation");
		
		for (ReferenceDataList refer : listServiceType) {
			System.out.println(refer.getType());
		}
		
		for (ReferenceDataList refer : listSubType) {
			System.out.println(refer.getType());
		}
		
		for(ReferenceDataList refer : listServiceBenefitsCriterion){
			System.out.println( "Type: "+ refer.getType());
			System.out.println("ID: " + refer.getReferenceDataId());
			
		}
		
		
		return "detailService";
	}
	
	public String save(){
		System.out.println("Ten cua service ta dinh them vao la: "+service.getName());
		System.out.println();
		System.out.println("Chay vao day!");
		
		System.out.println("Service name: "+service.getName());
		System.out.println("Service Short Description: "+service.getShortDescription());
		System.out.println("Sub typ: "+service.getReferenceDataByServiceSubType().getValue());
		System.out.println("Client Description: "+service.getClientDescription());
		System.out.println("Service Attendance: "+service.getServiceAttendace());
		System.out.println("Service Start Expected: "+service.getServiceStartExpected());
		System.out.println("Service Start Date: "+service.getServiceStart());
		System.out.println("Service End Date: "+service.getServiceEnd());
		System.out.println("Service Extendable: "+service.getServiceExtendable());
		System.out.println("Service Active: "+service.getStatus());
		System.out.println("Service Full Description: "+service.getFullDescription());
		System.out.println("Service Dept Code: "+service.getReferenceDataByServiceType().getValue());
		System.out.println("Service Description Delivery: "+service.getDescriptionDelivery());
		System.out.println("Service Contact Code: "+service.getServiceContractCode());
		System.out.println("Service Contact Value:"+service.getServiceContactValue());
		System.out.println("Service Staged Payment: ");
		System.out.println("Service Time Limited: "+service.getServiceTimeLimited());
		System.out.println("Service Benefits Criterion: "+service.getSerBenCrit());
		System.out.println("Service Barries Criterion: "+service.getSerBarCrit());
		System.out.println("Service Ethnicity Criterion: "+service.getSerEthCrit());
		System.out.println("Service Disanblity Criterion: "+service.getSerDisCrit());
		System.out.println("Service Personal Circumstance Criterion: "+service.getSerPerCirCrit());
		System.out.println("Other Service Participation Criterion: "+service.getSerOrtherCrit());
		System.out.println("Client Support Proces: "+service.getClientSupportProcess());
		System.out.println("Intervention: "+service.getIntervention());
		System.out.println("Client Journey: "+service.getClientJourney());
		System.out.println("Other Services: "+service.getOtherService());
//		System.out.println("Support Centres: "+service.);
//		System.out.println("Client Outcome: "+service);
//		System.out.println("Target Client: "+service);
//		System.out.println("Accreditations: "+service);
//		System.out.println("Referral Sources: "+service);
//		System.out.println("Programme: "+service);
//		System.out.println("Contact Outcome: "+service);
//		System.out.println("Participation: "+service);
//		System.out.println("Contact Obligation: "+service);
//		System.out.println("Participation: "+service);
		
//		System.out.println(""+service);
//		System.out.println(""+service);
//		System.out.println(""+service);
//		System.out.println(""+service);
//		
//		System.out.println("Serivce ");
//		
		
		
		servicesDao.add(service);

		System.out.println(dateStart);
//		System.out.println("checkbox checked: "+listServiceBenefitsCriterion_Checked);
//		System.out.println("checkbox checked: "+listServiceBarriersCriterion_Checked);
//		System.out.println("checkbox checked: "+listServiceEthnicityCriterion_Checked);
//		System.out.println("checkbox checked: "+listServiceDisabilityCriterion_Checked);
//		System.out.println("checkbox checked: "+listServicePersonalCircumstancesCriterion_Checked);
//		System.out.println("checkbox checked: "+listOtherServiceParticipationCriterion_Checked);
//		System.out.println("checkbox checked: "+listClientSupportProcess_Checked);
//		System.out.println("checkbox checked: "+listIntervention_Checked);
//		System.out.println("checkbox checked: "+listClientJourney_Checked);
//		System.out.println("checkbox checked: "+listOtherServices_Checked);
//		System.out.println("checkbox checked: "+listSupportCentres_Checked);
//		System.out.println("checkbox checked: "+listClientOutcome_Checked);
//		System.out.println("checkbox checked: "+listTargetClient_Checked);
//		System.out.println("checkbox checked: "+listAccreditations_Checked);
//		System.out.println("checkbox checked: "+listReferralSources_Checked);
//		System.out.println("checkbox checked: "+listContactOutcome_Checked);
//		System.out.println("checkbox checked: "+listContactObligation_Checked);
		
		
		return "save";
	}

	/**
	 * update status for Service
	 *
	 */
	
	public String active(){
		service = servicesDao.find(service);
		System.out.println("ServiceId: "+service.getServiceId());
		service.setStatus(true);
		servicesDao.edit(service);	
		return "list";
	}
	
	/**
	 * setter method
	 */

	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}

	
	public void setServicesDao(IServiceDao servicesDao) {
		this.servicesDao = servicesDao;
	}


	public List<ServiceList> getListService() {
		return listService;
	}


	public void setListService(List<ServiceList> listService) {
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

	public List<ReferenceDataList> getListServiceType() {
		return listServiceType;
	}

	public void setListServiceType(List<ReferenceDataList> listServiceType) {
		this.listServiceType = listServiceType;
	}

	public List<ReferenceDataList> getListSubType() {
		return listSubType;
	}

	public void setListSubType(List<ReferenceDataList> listSubType) {
		this.listSubType = listSubType;
	}

	public void setReferenceDataDao(IReferenceDataDao referenceDataDao) {
		this.referenceDataDao = referenceDataDao;
	}


	public List<ReferenceDataList> getListServiceBenefitsCriterion() {
		return listServiceBenefitsCriterion;
	}

	public void setListServiceBenefitsCriterion(
			List<ReferenceDataList> listServiceBenefitsCriterion) {
		this.listServiceBenefitsCriterion = listServiceBenefitsCriterion;
	}

	public List<ReferenceDataList> getListServiceBarriersCriterion() {
		return listServiceBarriersCriterion;
	}

	public void setListServiceBarriersCriterion(
			List<ReferenceDataList> listServiceBarriersCriterion) {
		this.listServiceBarriersCriterion = listServiceBarriersCriterion;
	}

	public List<ReferenceDataList> getListServiceEthnicityCriterion() {
		return listServiceEthnicityCriterion;
	}

	public void setListServiceEthnicityCriterion(
			List<ReferenceDataList> listServiceEthnicityCriterion) {
		this.listServiceEthnicityCriterion = listServiceEthnicityCriterion;
	}

	public List<ReferenceDataList> getListServiceDisabilityCriterion() {
		return listServiceDisabilityCriterion;
	}

	public void setListServiceDisabilityCriterion(
			List<ReferenceDataList> listServiceDisabilityCriterion) {
		this.listServiceDisabilityCriterion = listServiceDisabilityCriterion;
	}

	public List<ReferenceDataList> getListServicePersonalCircumstancesCriterion() {
		return listServicePersonalCircumstancesCriterion;
	}

	public void setListServicePersonalCircumstancesCriterion(
			List<ReferenceDataList> listServicePersonalCircumstancesCriterion) {
		this.listServicePersonalCircumstancesCriterion = listServicePersonalCircumstancesCriterion;
	}

	public List<ReferenceDataList> getListOtherServiceParticipationCriterion() {
		return listOtherServiceParticipationCriterion;
	}

	public void setListOtherServiceParticipationCriterion(
			List<ReferenceDataList> listOtherServiceParticipationCriterion) {
		this.listOtherServiceParticipationCriterion = listOtherServiceParticipationCriterion;
	}

	public List<ReferenceDataList> getListClientSupportProcess() {
		return listClientSupportProcess;
	}

	public void setListClientSupportProcess(
			List<ReferenceDataList> listClientSupportProcess) {
		this.listClientSupportProcess = listClientSupportProcess;
	}

	public List<ReferenceDataList> getListIntervention() {
		return listIntervention;
	}

	public void setListIntervention(List<ReferenceDataList> listIntervention) {
		this.listIntervention = listIntervention;
	}

	public List<ReferenceDataList> getListClientJourney() {
		return listClientJourney;
	}

	public void setListClientJourney(List<ReferenceDataList> listClientJourney) {
		this.listClientJourney = listClientJourney;
	}

	public List<ReferenceDataList> getListOtherServices() {
		return listOtherServices;
	}

	public void setListOtherServices(List<ReferenceDataList> listOtherServices) {
		this.listOtherServices = listOtherServices;
	}

	public List<ReferenceDataList> getListSupportCentres() {
		return listSupportCentres;
	}

	public void setListSupportCentres(List<ReferenceDataList> listSupportCentres) {
		this.listSupportCentres = listSupportCentres;
	}

	public List<ReferenceDataList> getListClientOutcome() {
		return listClientOutcome;
	}

	public void setListClientOutcome(List<ReferenceDataList> listClientOutcome) {
		this.listClientOutcome = listClientOutcome;
	}

	public List<ReferenceDataList> getListTargetClient() {
		return listTargetClient;
	}

	public void setListTargetClient(List<ReferenceDataList> listTargetClient) {
		this.listTargetClient = listTargetClient;
	}

	public List<ReferenceDataList> getListAccreditations() {
		return listAccreditations;
	}

	public void setListAccreditations(List<ReferenceDataList> listAccreditations) {
		this.listAccreditations = listAccreditations;
	}

	public List<ReferenceDataList> getListReferralSources() {
		return listReferralSources;
	}

	public void setListReferralSources(List<ReferenceDataList> listReferralSources) {
		this.listReferralSources = listReferralSources;
	}

	public List<ReferenceDataList> getListProgramme() {
		return listProgramme;
	}

	public void setListProgramme(List<ReferenceDataList> listProgramme) {
		this.listProgramme = listProgramme;
	}

	public List<ReferenceDataList> getListContactOutcome() {
		return listContactOutcome;
	}

	public void setListContactOutcome(List<ReferenceDataList> listContactOutcome) {
		this.listContactOutcome = listContactOutcome;
	}

	public List<ReferenceDataList> getListContactObligation() {
		return listContactObligation;
	}

	public void setListContactObligation(
			List<ReferenceDataList> listContactObligation) {
		this.listContactObligation = listContactObligation;
	}

	public List<ReferenceDataList> getListParticipation() {
		return listParticipation;
	}

	public void setListParticipation(List<ReferenceDataList> listParticipation) {
		this.listParticipation = listParticipation;
	}

	public String getListServiceBenefitsCriterion_Checked() {
		return listServiceBenefitsCriterion_Checked;
	}

	public void setListServiceBenefitsCriterion_Checked(
			String listServiceBenefitsCriterion_Checked) {
		this.listServiceBenefitsCriterion_Checked = listServiceBenefitsCriterion_Checked;
	}

	public String getListServiceBarriersCriterion_Checked() {
		return listServiceBarriersCriterion_Checked;
	}

	public void setListServiceBarriersCriterion_Checked(
			String listServiceBarriersCriterion_Checked) {
		this.listServiceBarriersCriterion_Checked = listServiceBarriersCriterion_Checked;
	}

	public String getListServiceEthnicityCriterion_Checked() {
		return listServiceEthnicityCriterion_Checked;
	}

	public void setListServiceEthnicityCriterion_Checked(
			String listServiceEthnicityCriterion_Checked) {
		this.listServiceEthnicityCriterion_Checked = listServiceEthnicityCriterion_Checked;
	}

	public String getListServiceDisabilityCriterion_Checked() {
		return listServiceDisabilityCriterion_Checked;
	}

	public void setListServiceDisabilityCriterion_Checked(
			String listServiceDisabilityCriterion_Checked) {
		this.listServiceDisabilityCriterion_Checked = listServiceDisabilityCriterion_Checked;
	}

	public String getListServicePersonalCircumstancesCriterion_Checked() {
		return listServicePersonalCircumstancesCriterion_Checked;
	}

	public void setListServicePersonalCircumstancesCriterion_Checked(
			String listServicePersonalCircumstancesCriterion_Checked) {
		this.listServicePersonalCircumstancesCriterion_Checked = listServicePersonalCircumstancesCriterion_Checked;
	}

	public String getListOtherServiceParticipationCriterion_Checked() {
		return listOtherServiceParticipationCriterion_Checked;
	}

	public void setListOtherServiceParticipationCriterion_Checked(
			String listOtherServiceParticipationCriterion_Checked) {
		this.listOtherServiceParticipationCriterion_Checked = listOtherServiceParticipationCriterion_Checked;
	}

	public String getListClientSupportProcess_Checked() {
		return listClientSupportProcess_Checked;
	}

	public void setListClientSupportProcess_Checked(
			String listClientSupportProcess_Checked) {
		this.listClientSupportProcess_Checked = listClientSupportProcess_Checked;
	}

	public String getListIntervention_Checked() {
		return listIntervention_Checked;
	}

	public void setListIntervention_Checked(String listIntervention_Checked) {
		this.listIntervention_Checked = listIntervention_Checked;
	}

	public String getListClientJourney_Checked() {
		return listClientJourney_Checked;
	}

	public void setListClientJourney_Checked(String listClientJourney_Checked) {
		this.listClientJourney_Checked = listClientJourney_Checked;
	}

	public String getListOtherServices_Checked() {
		return listOtherServices_Checked;
	}

	public void setListOtherServices_Checked(String listOtherServices_Checked) {
		this.listOtherServices_Checked = listOtherServices_Checked;
	}

	public String getListSupportCentres_Checked() {
		return listSupportCentres_Checked;
	}

	public void setListSupportCentres_Checked(String listSupportCentres_Checked) {
		this.listSupportCentres_Checked = listSupportCentres_Checked;
	}

	public String getListClientOutcome_Checked() {
		return listClientOutcome_Checked;
	}

	public void setListClientOutcome_Checked(String listClientOutcome_Checked) {
		this.listClientOutcome_Checked = listClientOutcome_Checked;
	}

	public String getListTargetClient_Checked() {
		return listTargetClient_Checked;
	}

	public void setListTargetClient_Checked(String listTargetClient_Checked) {
		this.listTargetClient_Checked = listTargetClient_Checked;
	}

	public String getListAccreditations_Checked() {
		return listAccreditations_Checked;
	}

	public void setListAccreditations_Checked(String listAccreditations_Checked) {
		this.listAccreditations_Checked = listAccreditations_Checked;
	}

	public String getListReferralSources_Checked() {
		return listReferralSources_Checked;
	}

	public void setListReferralSources_Checked(String listReferralSources_Checked) {
		this.listReferralSources_Checked = listReferralSources_Checked;
	}

	public String getListContactOutcome_Checked() {
		return listContactOutcome_Checked;
	}

	public void setListContactOutcome_Checked(String listContactOutcome_Checked) {
		this.listContactOutcome_Checked = listContactOutcome_Checked;
	}

	public String getListContactObligation_Checked() {
		return listContactObligation_Checked;
	}

	public void setListContactObligation_Checked(
			String listContactObligation_Checked) {
		this.listContactObligation_Checked = listContactObligation_Checked;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}	
}



