package fsoft.xdev.mock.dao.imp;

import java.util.List;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fsoft.xdev.mock.dao.IAccountDao;
import fsoft.xdev.mock.models.Account;

public class AccountDao extends HibernateDaoSupport implements IAccountDao {

	@Override
	public boolean add(Account entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Account entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Account entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account find(Account entity) {
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
	public boolean isAccountExist(String userName, String password) {
		
		if ((userName==null) || (password==null)) return false;
		
		userName = userName.trim();
		password = password.trim();
		
		String criteria = "select count(*) from Account a where" +
				" (a.userName like '" + userName + "')" +
				" and (a.password like '" + password + "')";
			
		int count = DataAccessUtils.intResult(getHibernateTemplate().find(criteria));
		if (count>0) 
			return true;
		
		return false;
	}

}
