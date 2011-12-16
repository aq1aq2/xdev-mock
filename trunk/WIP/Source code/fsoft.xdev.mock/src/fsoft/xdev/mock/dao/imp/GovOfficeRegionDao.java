package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IGovOfficeRegionDao;
import fsoft.xdev.mock.models.GovOfficeRegion;
import fsoft.xdev.mock.models.TrustDistrict;

public class GovOfficeRegionDao extends HibernateDaoSupport implements IGovOfficeRegionDao{

	@Override
	public boolean add(GovOfficeRegion entity) {
		try {
			getHibernateTemplate().save(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean edit(GovOfficeRegion entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(GovOfficeRegion entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GovOfficeRegion find(GovOfficeRegion entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GovOfficeRegion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GovOfficeRegion> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery("from GovOfficeRegion");
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return (List<GovOfficeRegion>) query.list();
	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from GovOfficeRegion"));
	}

}
