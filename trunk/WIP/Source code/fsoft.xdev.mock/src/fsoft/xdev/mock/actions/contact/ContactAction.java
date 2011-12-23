package fsoft.xdev.mock.actions.contact;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IContactDao;
import fsoft.xdev.mock.dao.IReferenceDataDao;
import fsoft.xdev.mock.dao.imp.ReferenceDataDao;
import fsoft.xdev.mock.models.Contact;
import fsoft.xdev.mock.models.ContactList;
import fsoft.xdev.mock.models.ReferenceDataList;

public class ContactAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private IContactDao contactDao;
	private IReferenceDataDao referenceDataDao;
	
	private List listModel;  // For list contact
	private Contact contact; // For create or amend contact
	private int selectedContactId = -1; // For amend selected contact
	
	private List<ReferenceDataList> listContactType;
	private List<ReferenceDataList> listBestContactMethod;
	
	private String filterFirstName = ""; // Filter by first name
	private String filterSurname = ""; // Filter by surname
	private boolean filterActive; // Filter by active
	
	private Integer rows = 0;
	private Integer page = 0;
	private String sord;
	private String sidx;
	private Integer total = 0;
	private Integer records = 0;

	
	public String execute() {
		return SUCCESS;
	}
	
	/**
	 * List all Contacts
	 * @return action returns listModel (JSON)
	 */
	public String list() {
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = contactDao.count(filterFirstName, filterSurname, filterActive);
		// Your logic to search and select the required data.
		listModel = contactDao.search(from, to, filterFirstName, filterSurname, filterActive);
		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);
		
		return "list";
	}

	/**
	 * Contact Input page
	 * @return action returns Contact Input JSP page
	 */
	public String input() {
		System.out.println("Action: Contact Input");
		
		/* Select contact to amend */
		if (selectedContactId > -1) {
			contact = contactDao.find(new Contact(selectedContactId));
			selectedContactId = -1; //Reset selectedContactId
		} else {
			contact = null;
		}
		
		listContactType = referenceDataDao.getContactType();
		listBestContactMethod = referenceDataDao.getBestContactMethod();
		return "input";
	}
	
	/**
	 * Save Contact
	 * @return 
	 */
	public String save() {
		System.out.println("Action: save contact");
		System.out.println(contact.getContactId());
		System.out.println("Contact name: " + contact.getFirstName());
		contactDao.addOrUpdate(contact);
		return "save";
	}
	
	/* 
	 * Filter
	 */
	
	public String getFilterFirstName() {
		return filterFirstName;
	}

	public void setFilterFirstName(String filterFirstName) {
		this.filterFirstName = filterFirstName;
	}

	public String getFilterSurname() {
		return filterSurname;
	}

	public void setFilterSurname(String filterSurname) {
		this.filterSurname = filterSurname;
	}
	
	public boolean isFilterActive() {
		return filterActive;
	}

	public void setFilterActive(boolean filterActive) {
		this.filterActive = filterActive;
	}

	/* 
	 * Display grid
	 */

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
	
	/*
	 * Getters and Setter
	 */
	
	public void setContactDao(IContactDao contactsDao) {
		this.contactDao = contactsDao;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List getListModel() {
		return listModel;
	}

	public void setListModel(List listModel) {
		this.listModel = listModel;
	}
	
	public int getSelectedContactId() {
		return selectedContactId;
	}

	public void setSelectedContactId(int selectedContactId) {
		this.selectedContactId = selectedContactId;
	}

	public void setReferenceDataDao(IReferenceDataDao referenceDataDao) {
		this.referenceDataDao = referenceDataDao;
	}

	public List<ReferenceDataList> getListContactType() {
		return listContactType;
	}

	public void setListContactType(List<ReferenceDataList> listContactType) {
		this.listContactType = listContactType;
	}

	public List<ReferenceDataList> getListBestContactMethod() {
		return listBestContactMethod;
	}

	public void setListBestContactMethod(
			List<ReferenceDataList> listBestContactMethod) {
		this.listBestContactMethod = listBestContactMethod;
	}
}
