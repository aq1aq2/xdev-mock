package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ICountriesDao;
import fsoft.xdev.mock.models.Countries;


public class CountriesDao extends HibernateDaoSupport implements ICountriesDao{

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean add(Countries entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Countries entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Countries entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Countries find(Countries entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Countries> findAll() {
		
		return getHibernateTemplate().find("from Countries");
	}

	@Override
	public List<Countries> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

}
