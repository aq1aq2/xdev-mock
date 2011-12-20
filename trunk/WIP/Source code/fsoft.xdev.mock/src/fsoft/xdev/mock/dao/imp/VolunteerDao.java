package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IVolunteerDao;
import fsoft.xdev.mock.models.Volunteer;
import fsoft.xdev.mock.models.VolunteerList;

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

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Volunteer> findRange(int from, int to) {
//		Query query = getHibernateTempsate().getSessionFactory().getCurrentSession().createQuery("from Volunteer");
//		query.setFirstResult(from);
//		query.setMaxResults(to - from);
//		return (List<Volunteer>)query.list();
//	}

	@SuppressWarnings("unchecked")
	public List<VolunteerList> findRange(int from, int to, String filterKey, Boolean filterActive){
		String criteria = "select new fsoft.xdev.mock.models.VolunteerList"
				+"(c.volunteerId,(ctact.firstName + ctact.surName),c.volunteerPurpose,c.startDate,c.endDate,c.status ) from Volunteer c left join c.contact ctact where";
		
		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria
					+ " and ((ctact.firstName + ctact.surName) like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria
					+ " and ((ctact.firstName + ctact.surName) like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[w-z]%') ";
		}
		
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to-from);
		return query.list();
	}
	@Override
	public int count(String filterKey, Boolean filterActive) {
		String criteria = "select count(*) from Volunteer c left join c.contact ctact where";
		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria
					+ " and ((ctact.firstName + ctact.surName) like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria
					+ " and ((ctact.firstName + ctact.surName) like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria
					+ " and  ((ctact.firstName + ctact.surName) like '[w-z]%') ";
		}
		
		
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
	}

}
