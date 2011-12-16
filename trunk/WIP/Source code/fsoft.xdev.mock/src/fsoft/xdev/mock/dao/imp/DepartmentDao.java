package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IDepartmentDao;
import fsoft.xdev.mock.models.Department;

public class DepartmentDao extends HibernateDaoSupport 
						implements IDepartmentDao{

	@Override
	public boolean add(Department entity) {
		getHibernateTemplate().save(entity);
		return true;
	}

	@Override
	public boolean edit(Department entity) {
		getHibernateTemplate().update(entity);
		return true;
	}

	@Override
	public boolean remove(Department entity) {
		getHibernateTemplate().delete(entity);
		return true;
	}

	@Override
	public Department find(Department entity) {
		return (Department) getHibernateTemplate().get(Department.class,
				entity.getDepartmentId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> findAll() {
		return getHibernateTemplate().find("from Department");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery("from Department");
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return (List<Department>) query.list();
	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from Department"));
	}

}
