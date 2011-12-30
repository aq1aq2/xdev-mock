package fsoft.xdev.mock.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IPremiseDao;
import fsoft.xdev.mock.dao.IReferenceDataDao;
import fsoft.xdev.mock.models.Premise;
import fsoft.xdev.mock.models.PremiseList;
import fsoft.xdev.mock.models.ReferenceDataList;

public class PremiseDao extends HibernateDaoSupport implements IPremiseDao {
	private IReferenceDataDao referenceDataDao1;

	@Override
	public boolean add(Premise entity) {
		try {
			getHibernateTemplate().saveOrUpdate(entity);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean edit(Premise entity) {
		try {
			getHibernateTemplate().update(entity);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean remove(Premise entity) {
		try {
			getHibernateTemplate().delete(entity);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public Premise find(Premise entity) {

		return (Premise) getHibernateTemplate().get(Premise.class,
				entity.getPremiseId());

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PremiseList> findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		String criteria = "select new fsoft.xdev.mock.models.PremiseList"
				+ "(c.premiseId, c.name,c.locationName,c.addressLine1,c.postcode,c.status) from Premise c where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria + " and (c.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria + " and (c.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[w-z]%') ";
		}

		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return query.list();
	}

	@Override
	public int count(String filterKey, Boolean filterActive) {
		String criteria = "select count(*) from Premise c where";
		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria + " and (c.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria + " and (c.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria + " and  (c.name like '[w-z]%') ";
		}

		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
	}

	// @Override
	// public List<Service> listServiceAlready(){
	//
	// }

	@SuppressWarnings("unchecked")
	@Override
	public List<Premise> listPremiseByLocationType(String value) {

		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select new fsoft.xdev.mock.models.ReferenceDataList(b.referenceDataId, b.value)  from ReferenceData b inner join b.referenceType c with c.refTypeName ='Location Type' where b.value like '" + value +"'");
		List<ReferenceDataList> listRefer = query.list();
		//test
		
//		Query query = getHibernateTemplate()
//				.getSessionFactory()
//				.getCurrentSession()
//				.createQuery(
//						"from ReferenceData b inner join b.referenceType c with c.refTypeName ='Location Type' where b.value like 'JCP Offices'");
//		List<ReferenceData> listRefer = query.list();
		
		System.out.println(listRefer.size());
		int referenceDataId = listRefer.get(0).getReferenceDataId();
		System.out.println(referenceDataId);
		
		String criteria ="select new fsoft.xdev.mock.models.Premise(a.premiseId,a.name) from Premise a where a.locationType like '"
				+ referenceDataId
				+ "' or a.locationType like '%, "
				+ referenceDataId
				+ "' or a.locationType like '%, "
				+ referenceDataId
				+ ",%' or a.locationType like '"
				+ referenceDataId + ", %'" + "and a.status = 'true'";
		System.out.println(criteria);
		query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()	
				.createQuery(criteria);
		return query.list();

	}

	public void setReferenceDataDao1(IReferenceDataDao referenceDataDao1) {
		this.referenceDataDao1 = referenceDataDao1;
	}

}
