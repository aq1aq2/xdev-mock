package fsoft.xdev.mock.actions.test.service;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestService;

public class ServiceTestAction extends ActionSupport{

	private List<TestService> listService;
	
	public String execute(){
		listService = new ArrayList<TestService>();
		listService.add(new TestService(1, "adfd", "dadfdasdg", "asd", "afdasf", true));
		listService.add(new TestService(2, "adfd", "asdfasfasdfsda", "asd", "afdasf", false));
		return SUCCESS;
	}
	
	public List<TestService> getListService(){
		return listService;
	}

	public void setListService(List<TestService> listService) {
		this.listService = listService;
	}
	
}
