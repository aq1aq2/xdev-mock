package fsoft.xdev.mock.actions.test.premises;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestOrganisation;
import fsoft.xdev.mock.models.TestPremise;

public class TestPremiseAction extends ActionSupport{
private List<TestPremise> listPremise;
	
	public String execute() {
		System.out.println("execute");
		listPremise = new ArrayList<TestPremise>();
		listPremise.add(new TestPremise("LocationName1", "cau giay","LD 1234" ,true));
		listPremise.add(new TestPremise("LocationName2", "kim ma", "092",false));
		return SUCCESS;
	}

	public List<TestPremise> getListPremise() {
		return listPremise;
	}

	public void setListPremise(List<TestPremise> listPremise) {
		this.listPremise = listPremise;
	}
	
	

}
