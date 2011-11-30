package fsoft.xdev.mock.actions.test.premises;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestFacilities;
//import fsoft.xdev.mock.models.TestPremise;

public class TestFacilitiesAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TestFacilities> listFacilities;
	public String execute() {
		System.out.println("execute");
		listFacilities = new ArrayList<TestFacilities>();
		listFacilities.add(new TestFacilities("Room", "this facilitity is type of room","thanhDT","phongtv" ,true));
		listFacilities.add(new TestFacilities("facilities2", "this is secrete facilities", "dungnm","hoantt",false));
		return SUCCESS;
	}
	public List<TestFacilities> getListFacilities() {
		return listFacilities;
	}
	public void setListFacilities(List<TestFacilities> listFacilities) {
		this.listFacilities = listFacilities;
	}
	
}
