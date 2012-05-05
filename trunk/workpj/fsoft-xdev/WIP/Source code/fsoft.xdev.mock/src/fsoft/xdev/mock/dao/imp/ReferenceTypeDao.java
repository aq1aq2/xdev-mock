package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IReferenceTypeDao;
import fsoft.xdev.mock.models.ReferenceType;

public class ReferenceTypeDao extends HibernateDaoSupport implements IReferenceTypeDao{

	@Override
	public boolean add(ReferenceType entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(ReferenceType entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(ReferenceType entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReferenceType find(ReferenceType entity) {
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

}
