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
