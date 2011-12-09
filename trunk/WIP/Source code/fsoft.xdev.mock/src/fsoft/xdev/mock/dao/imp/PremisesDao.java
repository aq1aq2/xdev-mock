package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IPremisesDao;
import fsoft.xdev.mock.models.Premises;

public class PremisesDao extends HibernateDaoSupport implements IPremisesDao{

	@Override
	public boolean add(Premises entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(Premises entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Premises entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Premises find(Premises entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Premises> findAll() {
		
		return getHibernateTemplate().find("from Premises");
	}

	@Override
	public List<Premises> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

}
