package fsoft.xdev.mock.dao.imp;

import java.util.List;

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

	@Override
	public List<TrustRegions> search(String criteria) {
		String query = null;
		if (criteria.equals("All")) {
			query = "from TrustRegions";
		} else if (criteria.equals("0-9")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('0','1','2','3','4','5','6','7','8','9')";
		} else if (criteria.equals("A B C D E")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('a','b','c','d','e')";
		} else if (criteria.equals("F G H I J")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('f','g','h','i','j')";
		} else if (criteria.equals("K L M N")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('k','l','m','n')";
		} else if (criteria.equals("O P Q R")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('o','p','q','r')";
		} else if (criteria.equals("S T U V")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('s','t','u','v')";
		} else if (criteria.equals("W X Y Z")) {
			query = "from TrustRegions t where substring(lower(t.name),1,1) in ('w','x','y','z')";
		}

		return getHibernateTemplate().find(query);

	}

	@Override
	public boolean edit(TrustRegions entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(TrustRegions entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TrustRegions find(TrustRegions entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrustRegions> findAll() {
		return getHibernateTemplate().find("from TrustRegions");
	}

	@Override
	public List<TrustRegions> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

}
