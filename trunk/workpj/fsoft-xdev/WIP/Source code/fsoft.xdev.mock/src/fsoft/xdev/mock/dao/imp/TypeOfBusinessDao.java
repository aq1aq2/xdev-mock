package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITypeOfBusinessDao;
import fsoft.xdev.mock.models.TypeOfBusiness;

public class TypeOfBusinessDao extends HibernateDaoSupport implements ITypeOfBusinessDao {

	@Override
	public boolean add(TypeOfBusiness entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(TypeOfBusiness entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(TypeOfBusiness entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TypeOfBusiness find(TypeOfBusiness entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String filterKey, Boolean filterActive) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String businesstName, String sicCode) {
		String criteria = "select count(*) from TypeOfBusiness c where (1=1)";

		businesstName = businesstName.trim();
		sicCode = sicCode.trim();
		if (businesstName != null )
			if (!"".equals(businesstName)) {
				criteria = criteria
						+ " and  (c.name like '" + businesstName + "')";
			}
		if (sicCode != null )
			if (!"".equals(sicCode)) {
				criteria = criteria
						+ " and  (c.sicCode like '" + sicCode + "')";
			}
			
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
	}

	@Override
	public List search(int from, int to, String businesstName, String sicCode) {
		String criteria = 
				"select new fsoft.xdev.mock.models.TypeOfBusinessList(c.typeOfBusinessId , c.name, c.sicCode) "
				+ "from TypeOfBusiness c "
				+ "where (1=1)";

		businesstName = businesstName.trim();
		sicCode = sicCode.trim();
		if (businesstName != null )
			if (!"".equals(businesstName)) {
				criteria = criteria
						+ " and  (c.name like '" + businesstName + "')";
			}
		if (sicCode != null )
			if (!"".equals(sicCode)) {
				criteria = criteria
						+ " and  (c.sicCode like '" + sicCode + "')";
			}
		
		System.out.println(criteria);

		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		
		return query.list();
	}

}
