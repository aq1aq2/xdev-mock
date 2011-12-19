package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IPremiseDao;
import fsoft.xdev.mock.models.Premise;
import fsoft.xdev.mock.models.PremiseList;

public class PremiseDao extends HibernateDaoSupport implements IPremiseDao{
	
	@Override
	public boolean add(Premise entity) {
		try {
			getHibernateTemplate().save(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean edit(Premise entity) {
		try {
			getHibernateTemplate().update(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean remove(Premise entity) {
		try {
			getHibernateTemplate().delete(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Premise find(Premise entity) {
		
		return (Premise)getHibernateTemplate().get(Premise.class, entity.getPremiseId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Premise> findAll() {
		
		return getHibernateTemplate().find("from Premise");
	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Premise> findRange(int from, int to) {
//		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Premise");
//		query.setFirstResult(from);
//		query.setMaxResults(to-from);
//		return (List<Premise>)query.list();
//	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PremiseList> findRange(int from, int to){
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("select new fsoft.xdev.mock.models.PremiseList"
											+ "(c.premiseId,c.locationName,c.addressLine1,c.postcode,c.status) from Premise c ");
		query.setFirstResult(from);
		query.setMaxResults(to -  from);
		return query.list();
	}

	@Override
	public int count() {
		
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Premise"));
	}

}
