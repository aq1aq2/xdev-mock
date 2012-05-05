package fsoft.xdev.mock.dao.imp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IGovtOfficeRegionsDao;
import fsoft.xdev.mock.models.GovtOfficeRegions;
import fsoft.xdev.mock.models.TrustRegions;

public class GovtOfficeRegionsDao extends HibernateDaoSupport implements IGovtOfficeRegionsDao{

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from GovtOfficeRegions"));
	}

	@Override
	public boolean add(GovtOfficeRegions entity) {
		getHibernateTemplate().save(entity);
		return true;

	}

	@Override
	public boolean edit(GovtOfficeRegions entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(GovtOfficeRegions entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GovtOfficeRegions find(GovtOfficeRegions entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<GovtOfficeRegions> findAll() {
		List<GovtOfficeRegions> listGovernmentOfficeRegion = new ArrayList<GovtOfficeRegions>();
		// TODO Auto-generated method stub
		try{
			listGovernmentOfficeRegion = getHibernateTemplate().find("from GovtOfficeRegions");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("loi ne: "+e.getMessage());
		}
		return listGovernmentOfficeRegion;
	}

	@Override
	public List<GovtOfficeRegions> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from GovtOfficeRegions");
		query.setFirstResult(from);
		query.setMaxResults(to - from);	
		System.out.println("to: " + to);
		System.out.println("from: " +  from);
		return (List<GovtOfficeRegions>) query.list();
	}

}
