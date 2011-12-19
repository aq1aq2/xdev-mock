package fsoft.xdev.mock.dao;

import java.util.List;

import fsoft.xdev.mock.models.Contact;
import fsoft.xdev.mock.models.ContactList;

public interface IContactDao extends BaseDao<Contact>{
	List<ContactList> findRange(int from, int to);
}
