package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IContactsDao;
import fsoft.xdev.mock.models.Contacts;
import fsoft.xdev.mock.models.TrustRegions;

public class ContactsDao extends HibernateDaoSupport implements IContactsDao {

	@Override
	public boolean add(Contacts entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(Contacts entity) {
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(Contacts entity) {
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public Contacts find(Contacts entity) {
		return (Contacts)getHibernateTemplate().get(Contacts.class, entity.getContactId());
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contacts> findAll() {
		return getHibernateTemplate().find("from Contacts");
	}

	@Override
	public List<Contacts> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

}
