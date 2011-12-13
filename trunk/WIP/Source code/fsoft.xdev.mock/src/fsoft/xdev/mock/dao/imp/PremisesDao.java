package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IPremisesDao;
import fsoft.xdev.mock.models.Premises;

public class PremisesDao extends HibernateDaoSupport implements IPremisesDao{

	@Override
	public int count() {
		
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Premises"));
	}

	@Override
	public boolean add(Premises entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(Premises entity) {
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(Premises entity) {
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public Premises find(Premises entity) {
		
		return (Premises)getHibernateTemplate().get(Premises.class, entity.getPremiseId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Premises> findAll() {
		
		return getHibernateTemplate().find("from Premises");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Premises> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Premises");
		query.setFirstResult(from);
		query.setMaxResults(to-from);
		return (List<Premises>)query.list();
	}

}
