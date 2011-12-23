package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ISupportingMaterialDao;
import fsoft.xdev.mock.models.SupportingMaterial;

public class SupportingMaterialDao extends HibernateDaoSupport 
			implements ISupportingMaterialDao{

	@Override
	public boolean addOrUpdate(Object entity) {
		try {
			getHibernateTemplate().saveOrUpdate(entity);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean add(SupportingMaterial entity) {
		getHibernateTemplate().save(entity);
		return true;
	}

	@Override
	public boolean edit(SupportingMaterial entity) {
		getHibernateTemplate().update(entity);
		return true;
	}

	@Override
	public boolean remove(SupportingMaterial entity) {
		getHibernateTemplate().delete(entity);
		return true;
	}

	@Override
	public SupportingMaterial find(SupportingMaterial entity) {
		return (SupportingMaterial) getHibernateTemplate().get(SupportingMaterial.class,
				entity.getSupportingMaterialId());
	}

	@Override
	public int count(String filterKey, Boolean filterActive) {
		String criteria = "select count(*) from SupportingMaterial a where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (a.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
			
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
	}

	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		String criteria = 
				"select new fsoft.xdev.mock.models.SupportingMaterialList(" +
						"a.supportingMaterialId , a.url, a.description, a.type, b.userName, a.addedDate) " +
				"from SupportingMaterial a " +
				"left join a.account b " +
				"where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (a.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}

		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		
		return query.list();
	}
}
