package fsoft.xdev.mock.dao.imp;

import java.util.List;

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
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> findRange(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
