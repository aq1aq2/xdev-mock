package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IGovOfficeRegionDao;
import fsoft.xdev.mock.models.GovOfficeRegion;
import fsoft.xdev.mock.models.TrustDistrict;

public class GovOfficeRegionDao extends HibernateDaoSupport implements IGovOfficeRegionDao{

	@Override
	public boolean add(GovOfficeRegion entity) {
		try {
			getHibernateTemplate().save(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean edit(GovOfficeRegion entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(GovOfficeRegion entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GovOfficeRegion find(GovOfficeRegion entity) {
		return getHibernateTemplate().get(GovOfficeRegion.class, entity.getGovOfficeRegionId());
	}

	@Override
	public int count(String filterKey, Boolean filterActive) {
		String criteria = "select count(*) from GovOfficeRegion c where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria
					+ " and (c.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria
					+ " and (c.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[w-z]%') ";
		}
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));

	}

	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		String criteria = "select new fsoft.xdev.mock.models.GovOfficeRegionList(c.govOfficeRegionId , c.name ,c.description,b.name,c.status) from GovOfficeRegion c left join c.county b where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[0-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			criteria = criteria
					+ " and (c.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			criteria = criteria
					+ " and (c.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[w-z]%') ";
		}
		

		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return query.list();
	}

	
}
