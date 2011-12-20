package fsoft.xdev.mock.dao;

import java.util.List;

import fsoft.xdev.mock.models.Contact;

public interface IContactDao extends BaseDao<Contact>{
	public int count(String firstName,	String surname,	Boolean filterActive);
	public List search(int from, int to, String firstName, String surname, Boolean filterActive);
}
