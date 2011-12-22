package fsoft.xdev.mock.dao;
import java.util.List;

import fsoft.xdev.mock.models.Account;


public interface IAccountDao extends BaseDao<Account>{
	public boolean isAccountExist(String userName, String password);
}
