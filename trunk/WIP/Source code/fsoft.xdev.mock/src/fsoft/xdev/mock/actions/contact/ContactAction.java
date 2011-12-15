package fsoft.xdev.mock.actions.contact;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IContactDao;
import fsoft.xdev.mock.models.Contact;

public class ContactAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private Contact contact;
	private IContactDao contactsDao;
	
	private List<Contact> listModel = new ArrayList<Contact>();

	public String execute() {
		return SUCCESS;
	}
	
	/**
	 * List all Contacts
	 * @return action returns listModel
	 */
	public String list() {
		System.out.println("Action: List contact");
		listModel = contactsDao.findAll();
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
		contactsDao.add(contact);
		return "save";
	}
	
	public void setContactsDao(IContactDao contactsDao) {
		this.contactsDao = contactsDao;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Contact> getListModel() {
		return listModel;
	}

	public void setListModel(List<Contact> listModel) {
		this.listModel = listModel;
	}

}
