package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ICountryDao;
import fsoft.xdev.mock.models.Country;

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
		return getHibernateTemplate().find("from Country");
	}

	@Override
	public List<Country> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
