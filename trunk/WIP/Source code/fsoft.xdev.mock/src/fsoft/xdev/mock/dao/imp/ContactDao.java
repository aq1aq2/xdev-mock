package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IContactDao;
import fsoft.xdev.mock.models.Contact;

public class ContactDao extends HibernateDaoSupport implements IContactDao{

	@Override
	public boolean add(Contact entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Contact entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Contact entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact find(Contact entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> findAll() {
		return getHibernateTemplate().find("from Contact");
	}

	@Override
	public List<Contact> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
