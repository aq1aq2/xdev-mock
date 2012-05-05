package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IAddressDao;
import fsoft.xdev.mock.models.Address;

public class AddressDao extends HibernateDaoSupport implements IAddressDao {

	@Override
	public boolean add(Address entity) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean edit(Address entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Address entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Address find(Address entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String postcode, String street, String town) {
		String criteria = 
				"select count(*) " +
				"from Address a " +
				"left join a.town b " +
				"where (1=1)";

		postcode = postcode.trim();
		street = street.trim();
		town = town.trim();
		
		if (postcode != null )
			if (!"".equals(postcode)) {
				criteria = criteria
						+ " and  (a.postCode like '" + postcode + "')";
			}
		if (town != null )
			if (!"".equals(town)) {
				criteria = criteria
						+ " and  (b.name like '" + town + "')";
			}
			
		return DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
	}

	@Override
	public List search(int from, int to, String postcode, String street,
			String town) {
		String criteria = 
				"select new fsoft.xdev.mock.models.AddressList(" +
						"a.addressId , a.name, a.postCode, b.name, c.name, d.name) " +
				"from Address a " +
				"left join a.town b " +
				"left join b.county c " +
				"left join c.country d " +
				"where (1=1)";

		postcode = postcode.trim();
		street = street.trim();
		town = town.trim();
		
		if (postcode != null )
			if (!"".equals(postcode)) {
				criteria = criteria
						+ " and  (a.postCode like '" + postcode + "')";
			}
		if (town != null )
			if (!"".equals(town)) {
				criteria = criteria
						+ " and  (b.name like '" + town + "')";
			}
		
		System.out.println(criteria);

		Query query = getHibernateTemplate().getSessionFactory()
				.getCurrentSession().createQuery(criteria);
		query.setFirstResult(from);
		query.setMaxResults(to - from);
		
		return query.list();
	}	

}
