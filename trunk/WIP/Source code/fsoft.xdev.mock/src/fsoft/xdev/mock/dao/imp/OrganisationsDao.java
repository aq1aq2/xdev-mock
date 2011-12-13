package fsoft.xdev.mock.dao.imp;
import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IOrganisationsDao;
import fsoft.xdev.mock.models.Organisations;

public class OrganisationsDao extends HibernateDaoSupport implements IOrganisationsDao{

	@Override
	public int count() {
		return DataAccessUtils.intResult(getHibernateTemplate().find("select count(*) from Organisations"));
	}

	@Override
	public boolean add(Organisations entity) {
		getHibernateTemplate().save(entity);
		return false;
	}

	@Override
	public boolean edit(Organisations entity) {
		getHibernateTemplate().update(entity);
		return false;
	}

	@Override
	public boolean remove(Organisations entity) {
		getHibernateTemplate().delete(entity);
		return false;
	}

	@Override
	public Organisations find(Organisations entity) {
		return (Organisations)getHibernateTemplate().get(Organisations.class, entity.getOrganisationId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Organisations> findAll() {
		return getHibernateTemplate().find("from Organisations");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Organisations> findRange(int from, int to) {
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Organisations");
		query.setFirstResult(from);
		query.setMaxResults(to - from);		
		return (List<Organisations>) query.list();
	}

}
