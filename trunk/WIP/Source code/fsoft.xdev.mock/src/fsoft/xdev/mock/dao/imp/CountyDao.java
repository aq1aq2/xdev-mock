package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ICountyDao;
import fsoft.xdev.mock.models.County;

public class CountyDao extends HibernateDaoSupport implements ICountyDao{

	@Override
	public boolean add(County entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(County entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(County entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public County find(County entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<County> findAll() {		
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery("select new fsoft.xdev.mock.models.County(c.countyId , c.name) from County c");
		return query.list();		
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
