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

	@Override
	public int count(String filterKey, Boolean filterActive) {
		String criteria = "select count(*) from SupportingMaterial a where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
			
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
	}

	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		String criteria = 
				"select new fsoft.xdev.mock.models.AddressList(" +
						"a.addressId , a.name, a.postCode, b.name, c.name, d.name) " +
				"from Address a " +
				"left join a.town b " +
				"left join b.county c " +
				"left join c.country d " +
				"where (1=1)";

		postcode = postcode.trim();
		street = street.trim();
		town = town.trim();
		
		if (postcode != null )
			if (!"".equals(postcode)) {
				criteria = criteria
						+ " and  (a.postCode like '" + postcode + "')";
			}
		if (town != null )
			if (!"".equals(town)) {
				criteria = criteria
						+ " and  (b.name like '" + town + "')";
			}
		
		System.out.println(criteria);

		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		
		return query.list();
	}

}
