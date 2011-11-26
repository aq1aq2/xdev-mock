package fsoft.xdev.mock.actions.test.businesslookup;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestBusinessType;

public class TestBusinessTypeAction extends ActionSupport {
	private List<TestBusinessType> listBusinessType;

	public List<TestBusinessType> getListBusinessType() {
		return listBusinessType;
	}

	public void setListBusinessType(List<TestBusinessType> listBusinessType) {
		this.listBusinessType = listBusinessType;
	}

	public String list() {
		listBusinessType = new ArrayList<TestBusinessType>();
		listBusinessType.add(new TestBusinessType("manufacture", "012243"));
		listBusinessType.add(new TestBusinessType("abcsd", "213243"));
		listBusinessType.add(new TestBusinessType("dsfsf", "34243"));
		return "list";
	}

	
}
