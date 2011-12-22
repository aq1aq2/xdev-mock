package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITeamDao;
import fsoft.xdev.mock.models.Team;
import fsoft.xdev.mock.models.TrustRegion;

public class TeamDao extends HibernateDaoSupport implements ITeamDao{

	@Override
	public boolean add(Team entity) {
		try {
			getHibernateTemplate().save(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean edit(Team entity) {
		try {
			getHibernateTemplate().update(entity);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean remove(Team entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Team find(Team entity) {
		return (Team) getHibernateTemplate().get(Team.class,
				entity.getTeamId());
	}

	@Override
	public int count(String filterKey, Boolean filterActive) {
		String criteria = "select count(*) from Team c where";

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
		String criteria = "select new fsoft.xdev.mock.models.TeamList(c.teamId , c.name ,c.addr1,c.postCode,b.surName+' '+ b.firstName, c.status) from Team c left join c.contact b where";

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
