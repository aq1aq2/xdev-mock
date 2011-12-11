package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITrustRegionsDao;
import fsoft.xdev.mock.models.TrustRegions;

public class TrustRegionsDao extends HibernateDaoSupport implements
		ITrustRegionsDao {

	@Override
	public boolean add(TrustRegions entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrustRegions> search(String criteria) {
		String query = null;
		if (criteria == null || "All".equals(criteria)) {
			query = "from TrustRegions";			
		} else if (criteria.equals("0-9")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('0','1','2','3','4','5','6','7','8','9')";
		} else if ("A B C D E".equals(criteria)) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('a','b','c','d','e')";
		} else if ("F G H I J".equals(criteria)) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('f','g','h','i','j')";
		} else if ("K L M N".equals(criteria)) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('k','l','m','n')";
		} else if ("O P Q R".equals(criteria)) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('o','p','q','r')";
		} else if ("S T U V".equals(criteria)) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('s','t','u','v')";
		} else if ("W X Y Z".equals(criteria)) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('w','x','y','z')";
		}

		return getHibernateTemplate().find(query);

	}

	@Override
	public int count(){
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from TrustRegions"));
	}
	@Override
	public boolean edit(TrustRegions entity) {
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(TrustRegions entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TrustRegions find(TrustRegions entity) {
		
		return (TrustRegions)getHibernateTemplate().get(TrustRegions.class, entity.getTrustRegionId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrustRegions> findAll() {
		return getHibernateTemplate().find("from TrustRegions");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TrustRegions> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from TrustRegions");
		query.setFirstResult(from);
		query.setMaxResults(to - from);		
		return (List<TrustRegions>) query.list();
		
	}

}
