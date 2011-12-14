package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IDirectoratesDao;
import fsoft.xdev.mock.models.Directorates;


public class DirectoratesDao extends HibernateDaoSupport implements IDirectoratesDao{

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Directorates"));
	}

	@Override
	public boolean add(Directorates entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(Directorates entity) {
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(Directorates entity) {
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public Directorates find(Directorates entity) {
		return (Directorates)getHibernateTemplate().get(Directorates.class, entity.getDirectorateId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Directorates> findAll() {
		return getHibernateTemplate().find("from Directorates");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Directorates> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Departments");
		query.setFirstResult(from);
		query.setMaxResults(to - from);		
		return (List<Directorates>) query.list();
	}

}
