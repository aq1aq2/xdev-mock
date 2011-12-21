package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IReferenceDataDao;
import fsoft.xdev.mock.models.ReferenceData;
import fsoft.xdev.mock.models.ReferenceDataList;

public class ReferenceDataDao extends HibernateDaoSupport implements IReferenceDataDao {

	@Override
	public boolean add(ReferenceData entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(ReferenceData entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(ReferenceData entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReferenceData find(ReferenceData entity) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public List<ReferenceDataList> getContactType() {
		String criteria = "select new fsoft.xdev.mock.models.ReferenceDataList(c.referenceDataId , c.value) from ReferenceData c inner join c.referenceType b with b.refTypeName ='Contact Type' ";
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		return query.list();
	}

	@Override
	public List<ReferenceDataList> getBestContactMethod() {
		String criteria = "select new fsoft.xdev.mock.models.ReferenceDataList(c.referenceDataId , c.value) from ReferenceData c inner join c.referenceType b with b.refTypeName ='Best Contact Method' ";
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ReferenceDataList> getFacilityType() {
		
		String criteria = "select new fsoft.xdev.mock.models.ReferenceDataList(c.referenceDataId, c.value) from ReferenceData c left join c.referenceType b where b.refTypeName = 'Facility Type'";
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ReferenceDataList> getConnectivityType() {

		String criteria = "select new fsoft.xdev.mock.models.ReferenceDataList(c.referenceDataId, c.value) from ReferenceData c left join c.referenceType b where b.refTypeName = 'Connectivity Type'";
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		return query.list();
	}	
	
	@SuppressWarnings("unchecked")
	public List<ReferenceDataList> getServiceType() {
		String criteria = "select new fsoft.xdev.mock.models.ReferenceDataList(c.referenceDataId, c.value) from ReferenceData c left join c.referenceType b where b.refTypeName = 'Service Type'";
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		return query.list();		
	}
	
	public List<ReferenceDataList> getSubType() {
		String criteria = "select new fsoft.xdev.mock.models.ReferenceDataList(c.referenceDataId, c.value) from ReferenceData c left join c.referenceType b where b.refTypeName = 'Sub Type'";
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		return query.list();			
	}
	
}
