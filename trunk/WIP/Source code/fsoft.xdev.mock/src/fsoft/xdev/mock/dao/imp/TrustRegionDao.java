package fsoft.xdev.mock.dao.imp;

import java.util.List;
import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITrustRegionDao;
import fsoft.xdev.mock.models.TrustRegion;

public class TrustRegionDao extends HibernateDaoSupport implements
		ITrustRegionDao {

	@Override
	public boolean add(TrustRegion entity) {
		try {
			getHibernateTemplate().save(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	@Override
	public boolean edit(TrustRegion entity) {
		try {
			getHibernateTemplate().update(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean remove(TrustRegion entity) {

		try {
			getHibernateTemplate().delete(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public TrustRegion find(TrustRegion entity) {
		return (TrustRegion) getHibernateTemplate().get(TrustRegion.class,
				entity.getTrustRegionId());

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrustRegion> findAll() {
		return getHibernateTemplate().find("from TrustRegion");

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrustRegion> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery("from TrustRegion");
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return (List<TrustRegion>) query.list();

	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from TrustRegion"));

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrustRegion> search(String query) {
		String criteria = null;
		if (query == null || "All".equals(query)) {
			criteria = "from TrustRegion";
		} else if (query.equals("0-9")) {
			criteria = "from TrustRegion t where substring(lower(t.name),1,1) in ('0','1','2','3','4','5','6','7','8','9')";
		} else if ("A B C D E".equals(query)) {
			criteria = "from TrustRegion t where substring(lower(t.name),1,1) in ('a','b','c','d','e')";
		} else if ("F G H I J".equals(query)) {
			criteria = "from TrustRegion t where substring(lower(t.name),1,1) in ('f','g','h','i','j')";
		} else if ("K L M N".equals(query)) {
			criteria = "from TrustRegion t where substring(lower(t.name),1,1) in ('k','l','m','n')";
		} else if ("O P Q R".equals(query)) {
			criteria = "from TrustRegion t where substring(lower(t.name),1,1) in ('o','p','q','r')";
		} else if ("S T U V".equals(query)) {
			criteria = "from TrustRegion t where substring(lower(t.name),1,1) in ('s','t','u','v')";
		} else if ("W X Y Z".equals(query)) {
			criteria = "from TrustRegion t where substring(lower(t.name),1,1) in ('w','x','y','z')";
		}

		return getHibernateTemplate().find(criteria);

	}

}
