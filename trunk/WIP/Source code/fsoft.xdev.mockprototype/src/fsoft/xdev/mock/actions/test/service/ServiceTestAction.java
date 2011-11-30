package fsoft.xdev.mock.actions.test.service;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.Service;

public class ServiceTestAction extends ActionSupport{

	private List<Service> listService;
	
	public String execute(){
		listService = new ArrayList<Service>();
		listService.add(new Service(1, "adfd", "dadfdasdg", "asd", "afdasf", true));
		listService.add(new Service(2, "adfd", "asdfasfasdfsda", "asd", "afdasf", false));
		return SUCCESS;
	}
	
	public List<Service> getListService(){
		return listService;
	}

	public void setListService(List<Service> listService) {
		this.listService = listService;
	}
	
}
