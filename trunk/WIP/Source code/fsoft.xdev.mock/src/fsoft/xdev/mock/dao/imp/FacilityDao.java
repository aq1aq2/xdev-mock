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
			getHibernateTemplate().save(entity);
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Facility> findAll() {
		
		return getHibernateTemplate().find("from Facility");
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Facility> findRange(int from, int to) {
//		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Facility");
//		query.setFirstResult(from);
//		query.setMaxResults(to-from);
//		return (List<Facility>)query.list();
//	}
	
	public List<FacilityList> findRange(int from, int to){
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("select new fsoft.xdev.mock.models.FacilityList(c.facilityId, b.value, c.facilityDescription,d.firstName, c.status) from Facility c left join c.referenceDataByFacilityType b left join c.contactByContactId d");
		query.setFirstResult(from);
		query.setMaxResults(to-from);
		return query.list();
	}
	@Override
	public int count() {
		
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Facility"));
	}

}
