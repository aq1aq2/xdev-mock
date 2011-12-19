package fsoft.xdev.mock.dao.imp;

import java.util.List;

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

	

}
