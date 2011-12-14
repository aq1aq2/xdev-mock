package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IDepartmentsDao;
import fsoft.xdev.mock.models.Departments;

public class DepartmentsDao extends HibernateDaoSupport implements IDepartmentsDao{

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Departments"));
	}

	@Override
	public boolean add(Departments entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(Departments entity) {
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(Departments entity) {
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public Departments find(Departments entity) {
		return (Departments)getHibernateTemplate().get(Departments.class, entity.getDepartmentId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Departments> findAll() {
		return getHibernateTemplate().find("from Departments");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Departments> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Departments");
		query.setFirstResult(from);
		query.setMaxResults(to - from);		
		return (List<Departments>) query.list();
	}

}
