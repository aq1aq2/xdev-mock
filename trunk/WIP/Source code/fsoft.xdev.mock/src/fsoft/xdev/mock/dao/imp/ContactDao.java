package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IContactDao;
import fsoft.xdev.mock.models.Contact;
import fsoft.xdev.mock.models.ContactList;

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
	public List<ContactList> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(
						"select new fsoft.xdev.mock.models.ContactList(c.contactId , c.surName+ ' '+ c.firstName, c.mobilePhone,c.emailAddress, b.value, c.status) from Contact c left join c.referenceDataByContactType b");
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		
		return query.list();
	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from Contact"));
	}

}
