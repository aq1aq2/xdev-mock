package fsoft.xdev.mock.actions.test.organisations;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestCustomer;
import fsoft.xdev.mock.models.TestOrganisation;
import fsoft.xdev.mock.utilities.XConstants;
import fsoft.xdev.mock.utilities.XDebugger;

public class TestOrganisationAction extends ActionSupport{
	private List<TestOrganisation> listOrganisation;
	
	public String list() {
		XDebugger.show("List method in TestOrganisationAction");
		listOrganisation = new ArrayList<TestOrganisation>();
		listOrganisation.add(new TestOrganisation("fpt", "Pham Hung", "090", "MS. Lien", false));
		listOrganisation.add(new TestOrganisation("cmc", "Cau Giay", "092", "MR. Duc", true));
		return XConstants.LIST_TOKEN;
	}
	
	public String add() {
		XDebugger.show("Add method in TestOrganisationAction");
		return XConstants.ADD_TOKEN;
	}
	
	public List<TestOrganisation> getListOrganisation() {
		return listOrganisation;
	}

	public void setListOrganisation(List<TestOrganisation> listOrganisation) {
		this.listOrganisation = listOrganisation;
	}
}
