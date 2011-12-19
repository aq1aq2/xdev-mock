package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IDirectorateDao;
import fsoft.xdev.mock.models.Directorate;

public class DirectorateDao extends HibernateDaoSupport 
		implements IDirectorateDao{

	@Override
	public boolean add(Directorate entity) {
		getHibernateTemplate().save(entity);
		return true;
	}

	@Override
	public boolean edit(Directorate entity) {
		getHibernateTemplate().update(entity);
		return true;
	}

	@Override
	public boolean remove(Directorate entity) {
		getHibernateTemplate().delete(entity);
		return true;
	}

	@Override
	public Directorate find(Directorate entity) {
		return (Directorate) getHibernateTemplate().get(Directorate.class,
				entity.getDirectorateId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Directorate> findAll() {
		return getHibernateTemplate().find("from Directorate");
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Directorate> findRange(int from, int to) {
//		Query query = getHibernateTemplate().getSessionFactory()
//				.getCurrentSession().createQuery("from Directorate");
//		query.setFirstResult(from);
//		query.setMaxResults(to - from);
//		return (List<Directorate>) query.list();
//	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from Directorate"));
	}

}
