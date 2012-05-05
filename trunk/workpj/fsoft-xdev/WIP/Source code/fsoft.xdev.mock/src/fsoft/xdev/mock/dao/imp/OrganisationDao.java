package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import fsoft.xdev.mock.dao.IOrganisationDao;
import fsoft.xdev.mock.models.Organisation;
import fsoft.xdev.mock.utilities.XDebugger;

@Transactional
public class OrganisationDao extends HibernateDaoSupport 
				implements IOrganisationDao{

	
	@Override
	public boolean add(Organisation entity) {
		try{
			if(getHibernateTemplate() == null) {
				XDebugger.show("null hibernate template when adding");
			}
			getHibernateTemplate().save(entity);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean edit(Organisation entity) {
		try{
			// Get new data
			boolean status = entity.getStatus();
			// Get original organisation based id
			String criteria = "from Organisation where organisationId = " + entity.getOrganisationId();
			// Copy all original data
			entity = DataAccessUtils.objectResult(getHibernateTemplate().find(criteria), Organisation.class);
			// enter new data
			entity.setStatus(status);
			// official update
			getHibernateTemplate().update(entity);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	// Unused temporarily !
	@Override
	public boolean remove(Organisation entity) {
		try{
			getHibernateTemplate().delete(entity);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	// Unused temprarily
	@Override
	public Organisation find(Organisation entity) {
		return (Organisation) getHibernateTemplate().get(Organisation.class,
				entity.getOrganisationId());
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		String criteria = "select new fsoft.xdev.mock.models.OrganisationList(c.organisationId, c.name, " +
				"c.addr1, c.postCode, (b.firstName + ' ' + b.surName), c.status) from Organisation c left join c.contact b where";
		if(filterActive == null || filterActive == false) {
			criteria = criteria + " (c.status = true)";
		}
		else{
			criteria = criteria + " (1 = 1)";
		}
		
		System.out.println("From page: " + from);
		
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
		
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		return query.list();
	}
	
	@Override
	public int count(String filterKey, Boolean filterActive) {
		String criteria = "select count(*) from Organisation c where";
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

}
