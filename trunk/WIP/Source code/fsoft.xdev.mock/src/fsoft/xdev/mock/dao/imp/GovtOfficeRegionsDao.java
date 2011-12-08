package fsoft.xdev.mock.dao.imp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IGovtOfficeRegionsDao;
import fsoft.xdev.mock.models.GovtOfficeRegions;

public class GovtOfficeRegionsDao extends HibernateDaoSupport implements IGovtOfficeRegionsDao{

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
		// TODO Auto-generated method stub
		return null;
	}

}
