package fsoft.xdev.mock.actions.contact;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IContactDao;
import fsoft.xdev.mock.models.Contact;
import fsoft.xdev.mock.models.ContactList;
import fsoft.xdev.mock.models.TrustRegion;

public class ContactAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private Contact contact;
	private IContactDao contactDao;
	
	private List<ContactList> listModel;
	
	private String key;
	
	// get how many rows we want to have into the grid - rowNum attribute in the grid
	private Integer rows = 0;
	// Get the requested page. By default grid sets this to 1.
	private Integer page = 0;
	// sorting order - asc or desc
	private String sord;
	// get index row - i.e. user click to sort.
	private String sidx;
	// Your Total Pages
	private Integer total = 0;
	// All Record
	private Integer records = 0;

	
	public String execute() {
//		listModel = contactDao.findAll();
		return SUCCESS;
	}
	
	/**
	 * List all Contacts
	 * @return action returns listModel
	 */
	public String list() {
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = contactDao.count();
		// Your logic to search and select the required data.
		listModel = contactDao.findRange(from, to);
		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);
		
		return "list";
	}

	/**
	 * Contact Input page
	 * @return action returns Contact Input page
	 */
	public String input() {
		System.out.println("Action: Contact Input");
		return "input";
	}
	
	/**
	 * Save Contact
	 * @return 
	 */
	public String save() {
		System.out.println("Action: save contact");
		System.out.println("Contact name: " + contact.getFirstName());
		contactDao.add(contact);
		return "save";
	}
	
	public void setContactDao(IContactDao contactsDao) {
		this.contactDao = contactsDao;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<ContactList> getListModel() {
		return listModel;
	}

	public void setListModel(List<ContactList> listModel) {
		this.listModel = listModel;
	}

	/* 
	 * Display grid
	 */
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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
