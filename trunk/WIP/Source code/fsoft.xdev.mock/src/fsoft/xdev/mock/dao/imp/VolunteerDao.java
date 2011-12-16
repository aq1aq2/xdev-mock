package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IVolunteerDao;
import fsoft.xdev.mock.models.Volunteer;

public class VolunteerDao extends HibernateDaoSupport implements IVolunteerDao{

	@Override
	public boolean add(Volunteer entity) {
		try{
			getHibernateTemplate().save(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean edit(Volunteer entity) {
		try {
			getHibernateTemplate().update(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean remove(Volunteer entity) {
		try {
			getHibernateTemplate().delete(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Volunteer find(Volunteer entity) {
				
		return (Volunteer)getHibernateTemplate().get(Volunteer.class, entity.getVolunteerId());	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Volunteer> findAll() {
		
		return getHibernateTemplate().find("from Volunteer");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Volunteer> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Volunteer");
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return (List<Volunteer>)query.list();
	}

	@Override
	public int count() {
		
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Volunteer"));
	}

}
