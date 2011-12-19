package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITownDao;
import fsoft.xdev.mock.models.Town;

public class TownDao extends HibernateDaoSupport implements ITownDao{

	@Override
	public boolean add(Town entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Town entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Town entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Town find(Town entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Town> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Town> findRange(int from, int to) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
