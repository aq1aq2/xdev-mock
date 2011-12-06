package fsoft.xdev.mock.actions.contact;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IContactsDao;
import fsoft.xdev.mock.models.Contacts;

public class ContactAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Contacts contact;
	private IContactsDao contactsDao;

	public void setContactsDao(IContactsDao contactsDao) {
		this.contactsDao = contactsDao;
	}

	public Contacts getContact() {
		return contact;
	}

	public void setContact(Contacts contact) {
		this.contact = contact;
	}

}
