package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IGovtOfficeRegionsDao;
import fsoft.xdev.mock.models.GovtOfficeRegions;

public class GovtOfficeRegionsDao extends HibernateDaoSupport implements IGovtOfficeRegionsDao{

	@Override
	public boolean add(GovtOfficeRegions entity) {
		//if flag = true -> add successfull
		boolean flag = false;
		// TODO Auto-generated method stub
		try {
			getHibernateTemplate().save(entity);
			flag = true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Ban bi sai o ham add() trong lop GovtOfficeRegionDao: "+e.getMessage());
			e.printStackTrace();
		}
		return flag;
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

	@Override
	public List<GovtOfficeRegions> findAll() {
		// TODO Auto-generated method stub
		
		return getHibernateTemplate().find("from GovtOfficeRegions");
	}

	@Override
	public List<GovtOfficeRegions> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

}
