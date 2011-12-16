package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import fsoft.xdev.mock.dao.IOrganisationDao;
import fsoft.xdev.mock.models.Organisation;

@Transactional
public class OrganisationDao extends HibernateDaoSupport 
				implements IOrganisationDao{

	
	@Override
	public boolean add(Organisation entity) {
		//getHibernateTemplate().initialize(entity);
		getHibernateTemplate().save(entity);
		return true;
	}

	@Override
	public boolean edit(Organisation entity) {
		//getHibernateTemplate().initialize(entity);
		getHibernateTemplate().update(entity);
		return true;
	}

	@Override
	public boolean remove(Organisation entity) {
		//getHibernateTemplate().initialize(entity);
		getHibernateTemplate().delete(entity);
		return true;
	}

	@Override
	public Organisation find(Organisation entity) {
		//getHibernateTemplate().initialize(entity);
		return (Organisation) getHibernateTemplate().get(Organisation.class,
				entity.getOrganisationId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Organisation> findAll() {
		return getHibernateTemplate().find("from Organisation");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Organisation> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery("from Organisation");
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		List<Organisation> listOrganisation = query.list();
		//getHibernateTemplate().initialize(listOrganisation);
		return listOrganisation;
	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from Organisation"));
	}

}
