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
