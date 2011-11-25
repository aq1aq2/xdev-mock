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
		listPremise.add(new TestPremise("LocationName1", "cau giay","LD 1234" ,));
		listOrganisation.add(new TestOrganisation("cmc", "pham hung", "092", "MR. Duc", true));
		return SUCCESS;
	}
	
	public List<TestOrganisation> getListOrganisation() {
		return listOrganisation;
	}

	public void setListOrganisation(List<TestOrganisation> listOrganisation) {
		this.listOrganisation = listOrganisation;
	}

}
