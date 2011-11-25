package fsoft.xdev.mock.actions.test.organisations;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestCustomer;
import fsoft.xdev.mock.models.TestOrganisation;

public class TestOrganisationAction extends ActionSupport{
	private List<TestOrganisation> listOrganisation;
	
	public String execute() {
		System.out.println("execute");
		listOrganisation = new ArrayList<TestOrganisation>();
		listOrganisation.add(new TestOrganisation("fpt", "pham hung", "090", "MS. Lien", true));
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
