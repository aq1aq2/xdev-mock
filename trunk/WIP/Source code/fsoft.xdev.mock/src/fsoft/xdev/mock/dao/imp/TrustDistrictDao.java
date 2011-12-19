package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITrustDistrictDao;
import fsoft.xdev.mock.models.TrustDistrict;
import fsoft.xdev.mock.models.TrustRegion;

public class TrustDistrictDao extends HibernateDaoSupport implements ITrustDistrictDao{

	@Override
	public boolean add(TrustDistrict entity) {
		try {
			getHibernateTemplate().save(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean edit(TrustDistrict entity) {
		try {
			getHibernateTemplate().update(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean remove(TrustDistrict entity) {
		try {
			getHibernateTemplate().delete(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public TrustDistrict find(TrustDistrict entity) {
		return (TrustDistrict) getHibernateTemplate().get(TrustDistrict.class,
				entity.getTrustDistrictId());
	}

	@Override
	public List<TrustDistrict> findAll() {
		return getHibernateTemplate().find("from TrustDistrict");
	}

//	@Override
//	public List<TrustDistrict> findRange(int from, int to) {
//		Query query = getHibernateTemplate().getSessionFactory()
//				.getCurrentSession().createQuery("from TrustDistrict");
//		query.setFirstResult(from);
//		query.setMaxResults(to - from);
//		return (List<TrustDistrict>) query.list();
//	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from TrustDistrict"));
	}

	@Override
	public List<TrustDistrict> findStart() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
