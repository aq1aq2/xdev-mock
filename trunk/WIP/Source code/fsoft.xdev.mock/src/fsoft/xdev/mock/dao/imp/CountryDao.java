package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ICountryDao;
import fsoft.xdev.mock.models.Country;
import fsoft.xdev.mock.models.TrustRegion;

public class CountryDao extends HibernateDaoSupport implements ICountryDao{

	@Override
	public boolean add(Country entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Country entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Country entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Country find(Country entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> findAll() {
//		return getHibernateTemplate().find("from Country");
		Criteria crit = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Country.class);
		return  (List<Country>) crit.list();
	}

//	@Override
//	public List<Country> findRange(int from, int to) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
