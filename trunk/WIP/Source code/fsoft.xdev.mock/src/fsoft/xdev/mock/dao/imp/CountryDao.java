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
