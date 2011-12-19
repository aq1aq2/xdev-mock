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
	public int count(String filterKey, Boolean filterActive) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
