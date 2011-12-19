package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITrustRegionDao;
import fsoft.xdev.mock.models.TrustRegion;
import fsoft.xdev.mock.models.TrustRegionList;

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
	@Override
	public List<TrustRegionList> findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		String criteria = "select new fsoft.xdev.mock.models.TrustRegionList(c.trustRegionId , c.name ,c.description,c.status,b.name) from TrustRegion c left join c.country b where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[1-9]%')";
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

		// List<Object[]> list = query.list();
		// List<TrustRegion> listTrustRegion = new ArrayList<TrustRegion>();
		// for(Object[] o: list){
		// listTrustRegion.add(new TrustRegion((Integer)o[0],
		// o[1].toString(),o[2].toString(), (Boolean)o[3]));
		// }
		return query.list();

		// // vi du 1
		// http://www.javalobby.org/java/forums/t62077.html
		//
		// // phan trang nay
		// http://forum.springsource.org/showthread.php?54556-Criteria-Query-with-setFetchMode-and-pagination
		//
		// // vi du sau
		// User user = (User) session.createCriteria(User.class)
		// .setFetchMode("permissions", FetchMode.JOIN)
		// .add( Restrictions.idEq(userId) )
		// .uniqueResult();

		// Criteria crit =
		// getHibernateTemplate().getSessionFactory().openSession().createCriteria(TrustRegion.class);
		// crit.setFirstResult(2);
		// crit.setMaxResults(10);
		// crit.setFetchMode("country",FetchMode.JOIN);
		// List<TrustRegion> list = crit.list();
		// getHibernateTemplate().getSessionFactory().close();

		// for( TrustRegion c: list){
		// Hibernate.initialize(c.getCountry().getCounties());
		// }
		// return list;

	}

	@Override
	public int count(String filterKey,	Boolean filterActive) {
		String criteria = "select count(*) from TrustRegion c where";

		if (filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true) ";
		} else {
			criteria = criteria + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			criteria = criteria
					+ " and  (c.name like '[1-9]%')";
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
