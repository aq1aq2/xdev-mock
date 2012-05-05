package fsoft.xdev.mock.actions.login;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IAccountDao;
import fsoft.xdev.mock.utilities.XConstants;

public class LoginAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	
	private IAccountDao accountDao;
	
	private String userName;
	private String password;
	 
	public String check() {
		if (session == null) return "wrong";
		
		/* Check account session exist */
		if (!session.containsKey(XConstants.USER_NAME) || 
				!session.containsKey(XConstants.PASSWORD)) {
			return "input";
		}
		
		return "in";
	}
	
	public String in() {
		if (session == null) return "wrong";
		
		System.out.println(userName);
		System.out.println(password);
		/* Check userName and password */
		if (accountDao.isAccountExist(userName, password)) {
			session.put(XConstants.USER_NAME, userName);
			session.put(XConstants.PASSWORD, password);
			return "in";
		}
		
		return "wrong";
	}
	
	public String out() {
		if (session == null) return "wrong";
		
		session.remove(XConstants.USER_NAME);
		session.remove(XConstants.PASSWORD);
		
		return "out";
	}
	
	
	/*
	 * Getters and Setters
	 */
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public IAccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
