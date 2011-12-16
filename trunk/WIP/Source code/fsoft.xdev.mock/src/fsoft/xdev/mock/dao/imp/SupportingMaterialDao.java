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

	@SuppressWarnings("unchecked")
	@Override
	public List<SupportingMaterial> findAll() {
		return getHibernateTemplate().find("from SupportingMaterial");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SupportingMaterial> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery("from SupportingMaterial");
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return (List<SupportingMaterial>) query.list();
	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from SupportingMaterial"));
	}

}
