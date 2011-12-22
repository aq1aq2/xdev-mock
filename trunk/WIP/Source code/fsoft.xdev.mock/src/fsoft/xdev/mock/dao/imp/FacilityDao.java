package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IFacilityDao;
import fsoft.xdev.mock.models.Facility;
import fsoft.xdev.mock.models.FacilityList;

public class FacilityDao extends HibernateDaoSupport implements IFacilityDao{

	@Override
	public boolean add(Facility entity) {
		try {
			getHibernateTemplate().saveOrUpdate(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean edit(Facility entity) {
		try {
			getHibernateTemplate().update(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean remove(Facility entity) {
		try {
			getHibernateTemplate().delete(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Facility find(Facility entity) {
		
		return (Facility)getHibernateTemplate().get(Facility.class, entity.getFacilityId());
	}

	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Facility> findRange(int from, int to) {
//		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Facility");
//		query.setFirstResult(from);
//		query.setMaxResults(to-from);
//		return (List<Facility>)query.list();
//	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<FacilityList> findRange(int from, int to,String filterKey,Boolean filterActive){
		
		String criteria = "select new fsoft.xdev.mock.models.FacilityList(c.facilityId, b.value, c.facilityDescription,d.firstName, c.status) from Facility c left join c.referenceDataByFacilityType b left join c.contactByContactId d where";
		
		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria
					+ " and (b.value like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria
					+ " and (b.value like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[w-z]%') ";
		}
		
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to-from);
		return query.list();
	}
	@Override
	public int count(String filterKey,	Boolean filterActive) {
		String criteria ="select count(*) from Facility c left join c.referenceDataByFacilityType b where";
		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria
					+ " and (b.value like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria
					+ " and (b.value like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria
					+ " and  (b.value like '[w-z]%') ";
		}
		
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
	}

}
