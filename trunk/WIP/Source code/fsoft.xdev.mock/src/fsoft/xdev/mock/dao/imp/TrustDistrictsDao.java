package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITrustDistrictsDao;
import fsoft.xdev.mock.models.TrustDistricts;

public class TrustDistrictsDao extends HibernateDaoSupport implements ITrustDistrictsDao{

	@Override
	public boolean add(TrustDistricts entity) {
		
		getHibernateTemplate().save(entity);	
		return false;
	}

	@Override
	public boolean edit(TrustDistricts entity) {
		
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(TrustDistricts entity) {
		
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public TrustDistricts find(TrustDistricts entity) {
		
		return (TrustDistricts)getHibernateTemplate().get(TrustDistricts.class, entity.getTrustDistrictId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrustDistricts> findAll() {
		
		return getHibernateTemplate().find("from TrustDistricts");
	}

	@Override
	public List<TrustDistricts> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<TrustDistricts> listFilter(String from, String to){
		return getHibernateTemplate().find("from TrustDistricts where");
	}

}
