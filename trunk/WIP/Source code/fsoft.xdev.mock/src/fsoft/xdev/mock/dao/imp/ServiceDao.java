package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IServiceDao;
import fsoft.xdev.mock.models.Service;
import fsoft.xdev.mock.models.ServiceList;

public class ServiceDao extends HibernateDaoSupport implements IServiceDao{

	@Override
	public boolean add(Service entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Service entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Service entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Service find(Service entity) {
		// TODO Auto-generated method stub
		return null;
	}

	



	

	@Override
	public int count(String filterKey, Boolean filterActive) {
		// TODO Auto-generated method stub
		String strQuery = "select count(*) from Service s where";
		
		if (filterActive == null || filterActive == false) {
			strQuery = strQuery + " (s.status = true) ";
		} else {
			strQuery = strQuery + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[1-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			strQuery = strQuery
					+ " and (s.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			strQuery = strQuery
					+ " and (s.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[w-z]%') ";
		}		
		return DataAccessUtils.intResult(getHibernateTemplate().find(strQuery));
	}

	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		// TODO Auto-generated method stub
		String strQuery = "select new fsoft.xdev.mock.models.ServiceList" +
				"(s.serviceId, s.name, s.descriptionDelivery, rDST.value, c.firstName, s.status) " +
				"from Service as s left join s.contact as c left join s.referenceDataByServiceType as rDST where";
		
		if (filterActive == null || filterActive == false) {
			strQuery = strQuery + " (s.status = true) ";
		} else {
			strQuery = strQuery + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			strQuery = strQuery
					+ " and (s.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			strQuery = strQuery
					+ " and (s.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (s.name like '[w-z]%') ";
		}	
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(strQuery);
		query.setFirstResult(from);
		query.setMaxResults(to-from);
		
		
		
		return query.list();
	}	

}
