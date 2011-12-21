package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IContactDao;
import fsoft.xdev.mock.models.Contact;

public class ContactDao extends HibernateDaoSupport implements IContactDao{

	@Override
	public boolean add(Contact entity) {
		getHibernateTemplate().save(entity);
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
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		return null;
	}

	@Override
	public int count(String filterKey,	Boolean filterActive) {
		return 0;
	}

	@Override
	public int count(String firstName,	String surname,	Boolean filterActive) {
		String criteria = "select count(*) from Contact c where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		
		firstName = firstName.trim();
		surname = surname.trim();
		if (firstName != null )
			if (!"".equals(firstName)) {
				criteria = criteria
						+ " and  (c.firstName like '" + firstName + "')";
			}
		if (surname != null )
			if (!"".equals(surname)) {
				criteria = criteria
						+ " and  (c.surName like '" + surname + "')";
			}
			
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));

	}

	@Override
	public List search(int from, int to, String firstName, String surname, Boolean filterActive) {
		String criteria = 
			"select new fsoft.xdev.mock.models.ContactList(c.contactId , c.firstName+ ' '+ c.surName, c.mobilePhone,c.emailAddress, b.value, c.status) "
			+ "from Contact c left join c.referenceDataByContactType b "
			+ "where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		
		firstName = firstName.trim();
		surname = surname.trim();
		if (firstName != null )
			if (!"".equals(firstName)) {
				criteria = criteria
						+ " and  (c.firstName like '" + firstName + "')";
			}
		if (surname != null )
			if (!"".equals(surname)) {
				criteria = criteria
						+ " and  (c.surName like '" + surname + "')";
			}
		
		System.out.println(criteria);

		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		
		return query.list();
	}

}
