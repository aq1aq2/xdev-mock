package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IFacilitiesDao;
import fsoft.xdev.mock.models.Facilities;


public class FacilitiesDao extends HibernateDaoSupport implements IFacilitiesDao{

	@Override
	public int count() {
		
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Facilities"));
	}

	@Override
	public boolean add(Facilities entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(Facilities entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Facilities entity) {
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public Facilities find(Facilities entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Facilities> findAll() {
		
		return getHibernateTemplate().find("from Facilities");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Facilities> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Facilities");
		query.setFirstResult(from);
		query.setMaxResults(to-from);
		return (List<Facilities>)query.list();
	}

}
