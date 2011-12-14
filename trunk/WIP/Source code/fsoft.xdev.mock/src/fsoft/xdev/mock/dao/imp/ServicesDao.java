package fsoft.xdev.mock.dao.imp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IServicesDao;
import fsoft.xdev.mock.models.Services;

public class ServicesDao extends HibernateDaoSupport implements IServicesDao{

	@Override
	public int count() {
		// TODO Auto-generated method stub
		int count = 0;
		String queryString = "select count(*) from Services";
		count = DataAccessUtils.intResult(getHibernateTemplate().find(queryString));
		return count;
	}

	@Override
	public boolean add(Services entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			getHibernateTemplate().save(entity);
			flag = true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Sai o add cua ServicesDao");
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean edit(Services entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			getHibernateTemplate().saveOrUpdate(entity);
			flag = true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Error at edit() of ServiceDao");
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean remove(Services entity) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			getHibernateTemplate().delete(entity);
			flag = true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			flag = false;
			System.out.println("Error at remove of ServicesDao");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Services find(Services entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Services> findAll() {
		// TODO Auto-generated method stub
		List<Services> listService = new ArrayList<Services>();
		try {
			String queryString = "from Services";
			listService = getHibernateTemplate().find(queryString);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Services> findRange(int from, int to) {
		// TODO Auto-generated method stub
		List<Services> listService = new ArrayList<Services>();
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Services");
		query.setFirstResult(from);
		query.setMaxResults(to - from);	
		System.out.println("to: " + to);
		System.out.println("from: " +  from);
		listService = (List<Services>)query.list();
		return listService;
	}

}
