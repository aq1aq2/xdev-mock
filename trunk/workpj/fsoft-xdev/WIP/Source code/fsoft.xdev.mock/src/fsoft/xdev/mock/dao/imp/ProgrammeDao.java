package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.dao.TypeMismatchDataAccessException;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IProgrammeDao;
import fsoft.xdev.mock.models.Programme;
import fsoft.xdev.mock.models.ProgrammeList;

public class ProgrammeDao extends HibernateDaoSupport implements IProgrammeDao{

	@Override
	public boolean add(Programme entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Programme entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Programme entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Programme find(Programme entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int count(String filterKey, Boolean filterActive) {
		// TODO Auto-generated method stub
		String strQuery = "select count(*) from Programme p where";
		
		if (filterActive == null || filterActive == false) {
			strQuery = strQuery + " (p.status = true) ";
		} else {
			strQuery = strQuery + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[1-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			strQuery = strQuery
					+ " and (p.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			strQuery = strQuery
					+ " and (p.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[w-z]%') ";
		}	
		int countRecords = 0;
		try {
			countRecords = DataAccessUtils.intResult(getHibernateTemplate().find(strQuery));
		} catch (IncorrectResultSizeDataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Error at here!" +e.getMessage());
			e.printStackTrace();
		} catch (TypeMismatchDataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Error at here!" +e.getMessage());
			e.printStackTrace();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Error at here!" +e.getMessage());
			e.printStackTrace();
		}
		return countRecords;
	}

	@Override
	public List findRange(int from, int to, String filterKey,
			Boolean filterActive) {
		// TODO Auto-generated method stub
		
		String strQuery = "select new fsoft.xdev.mock.models.ProgrammeList(p.programmeId, c.firstName, p.name, p.description, p.status)" +
				" from Programme as p left join p.contact as c where";
		if (filterActive == null || filterActive == false) {
			strQuery = strQuery + " (p.status = true) ";
		} else {
			strQuery = strQuery + " (1 = 1) ";
		}
		if ("0-9".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[1-9]%')";
		} else if ("A B C D E".equals(filterKey)) {
			strQuery = strQuery
					+ " and (p.name like '[a-e]%') ";
		} else if ("F G H I J".equals(filterKey)) {
			strQuery = strQuery
					+ " and (p.name like '[f-j]%')";
		} else if ("K L M N".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[k-n]%' )";
		} else if ("O P Q R".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[o-r]%') ";
		} else if ("S T U V".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[s-v]%')";
		} else if ("W X Y Z".equals(filterKey)) {
			strQuery = strQuery
					+ " and  (p.name like '[w-z]%') ";
		}		
		Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(strQuery);
		query.setFirstResult(from);
		query.setMaxResults(to-from);

		return query.list();

	}

}
