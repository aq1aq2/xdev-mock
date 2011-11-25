package fsoft.xdev.mock.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestCustomer;
import fsoft.xdev.mock.models.TestOrganisation;
import fsoft.xdev.mock.models.TestSupportingMaterial;

public class TestAction extends ActionSupport {
	private List<TestCustomer> listCustomer;
	
	public String execute() {
		System.out.println("execute");
		listCustomer = new ArrayList<TestCustomer>();
		listCustomer.add(new TestCustomer("nhan", "nhan@com"));
		listCustomer.add(new TestCustomer("ha", "ha@com"));
		return SUCCESS;
	}

	public List<TestCustomer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<TestCustomer> listCustomer) {
		this.listCustomer = listCustomer;
	}
	
}
