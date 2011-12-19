package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.ITeamDao;
import fsoft.xdev.mock.models.Team;

public class TeamDao extends HibernateDaoSupport implements ITeamDao{

	@Override
	public boolean add(Team entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Team entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Team entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Team find(Team entity) {
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
