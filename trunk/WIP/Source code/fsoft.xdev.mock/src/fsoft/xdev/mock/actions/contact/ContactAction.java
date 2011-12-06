package fsoft.xdev.mock.actions.contact;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IContactsDao;
import fsoft.xdev.mock.dao.imp.ContactsDao;
import fsoft.xdev.mock.models.Contacts;

public class ContactAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Contacts contact;
	private IContactsDao contactsDao;
	
	private List<Contacts> listModel = new ArrayList<Contacts>();

	/**
	 * List all Contacts
	 * @return action returns listModel
	 */
	public String list() {
		System.out.println("Action: List contact");
//		contactsDao = new ContactsDao();
		System.out.println(contactsDao);
		listModel = contactsDao.findAll();
		return SUCCESS;
	}
	
	public void setContactsDao(IContactsDao contactsDao) {
		this.contactsDao = contactsDao;
	}

	public Contacts getContact() {
		return contact;
	}

	public void setContact(Contacts contact) {
		this.contact = contact;
	}

	public List<Contacts> getListModel() {
		return listModel;
	}

	public void setListModel(List<Contacts> listModel) {
		this.listModel = listModel;
	}

}
