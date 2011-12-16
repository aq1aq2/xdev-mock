package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IOrganisationDao;
import fsoft.xdev.mock.models.Organisation;

public class OrganisationDao extends HibernateDaoSupport 
				implements IOrganisationDao{

	@Override
	public boolean add(Organisation entity) {
		getHibernateTemplate().save(entity);
		return true;
	}

	@Override
	public boolean edit(Organisation entity) {
		getHibernateTemplate().update(entity);
		return true;
	}

	@Override
	public boolean remove(Organisation entity) {
		getHibernateTemplate().delete(entity);
		return true;
	}

	@Override
	public Organisation find(Organisation entity) {
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
		return (List<Organisation>) query.list();
	}

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find(
				"select count(*) from Organisation"));
	}

}
