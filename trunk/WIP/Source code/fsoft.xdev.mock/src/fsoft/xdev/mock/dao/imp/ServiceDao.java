package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
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
	public List<Service> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Service> findRange(int from, int to) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ServiceList> findRange(int from, int to) {
		// TODO Auto-generated method stub
		String strQuery = "select new fsoft.xdev.mock.models.ServiceList" +
				"(s.serviceId, s.name, s.descriptionDelivery, rDST.value, c.firstName, s.status) " +
				"from Service as s left join s.contact as c left join s.referenceDataByServiceType as rDST";
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(strQuery);
		query.setFirstResult(from);
		query.setMaxResults(to-from);
		
		
		
		return query.list();
	}

}
