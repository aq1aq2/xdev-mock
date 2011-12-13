package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ISupportingMaterialsDao;
import fsoft.xdev.mock.models.SupportingMaterials;

public class SupportingMaterialsDao extends HibernateDaoSupport implements ISupportingMaterialsDao{

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from SupportingMaterials"));
	}

	@Override
	public boolean add(SupportingMaterials entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(SupportingMaterials entity) {
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(SupportingMaterials entity) {
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public SupportingMaterials find(SupportingMaterials entity) {
		return (SupportingMaterials)getHibernateTemplate().get(SupportingMaterials.class, entity.getSupportingMaterialId());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SupportingMaterials> findAll() {
		return getHibernateTemplate().find("from SupportingMaterials");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SupportingMaterials> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from SupportingMaterials");
		query.setFirstResult(from);
		query.setMaxResults(to - from);		
		return (List<SupportingMaterials>) query.list();
	}

}
