package fsoft.xdev.mock.actions;

import java.util.ArrayList;
import java.util.List;
import fsoft.xdev.mock.models.Service;

import com.opensymphony.xwork2.ActionSupport;


import fsoft.xdev.mock.models.TestCustomer;
import fsoft.xdev.mock.models.TestOrganisation;
import fsoft.xdev.mock.models.TestSupportingMaterial;

public class TestAction extends ActionSupport {
	private List<TestCustomer> listCustomer;
	private List<Service> listService;
	
	public String execute() {
		System.out.println("execute");
		listCustomer = new ArrayList<TestCustomer>();
		listCustomer.add(new TestCustomer("nhan", "nhan@com"));
		listCustomer.add(new TestCustomer("ha", "ha@com"));
		listService = new ArrayList<Service>();
		listService.add(new Service(1, "adfd", "dadfdasdg", "asd", "afdasf", true));
		listService.add(new Service(2, "adfd", "asdfasfasdfsda", "asd", "afdasf", false));
		return SUCCESS;
	}

	public List<TestCustomer> getListCustomer() {
		return listCustomer;
	}

	public List<Service> getListService(){
		return listService;
	}
	public void setListCustomer(List<TestCustomer> listCustomer) {
		this.listCustomer = listCustomer;
	}
	
}
