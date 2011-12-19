package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IServiceDao;
import fsoft.xdev.mock.models.Service;

public class ServiceDao extends HibernateDaoSupport implements IServiceDao{

	@Override
	public boolean add(Service entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Service entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Service entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Service find(Service entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Service> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Service> findRange(int from, int to) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
