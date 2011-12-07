package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITrustRegionsDao;
import fsoft.xdev.mock.models.TrustRegions;

public class TrustRegionsDao extends HibernateDaoSupport implements ITrustRegionsDao{

	@Override
	public boolean add(TrustRegions entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(TrustRegions entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(TrustRegions entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TrustRegions find(TrustRegions entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrustRegions> findAll() {		
		return getHibernateTemplate().find("from TrustRegions");
	}

	@Override
	public List<TrustRegions> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

}
