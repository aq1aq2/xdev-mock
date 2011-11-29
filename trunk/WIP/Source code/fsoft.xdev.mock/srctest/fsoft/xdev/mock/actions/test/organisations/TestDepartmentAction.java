package fsoft.xdev.mock.actions.test.organisations;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestDepartment;
import fsoft.xdev.mock.models.TestOrganisation;
import fsoft.xdev.mock.utilities.XConstants;
import fsoft.xdev.mock.utilities.XDebugger;

public class TestDepartmentAction extends ActionSupport {

	List<TestDepartment> listDepartment;
	
	public String list() {
		XDebugger.show("List method in TestDepartmentAction");
		listDepartment = new ArrayList<TestDepartment>();
		listDepartment.add(new TestDepartment("HCD", "20 Pham Hung", "134", "MS. Lien", true));
		listDepartment.add(new TestDepartment("SC", "Dich Vong, Cau Giay", "787", "MR. Duc", true));
		return XConstants.LIST_TOKEN;
	}
	
	public String add() {
		XDebugger.show("Add method in TestDepartmentAction");
		return XConstants.ADD_TOKEN;
	}
	
	public List<TestDepartment> getListDepartment() {
		return listDepartment;
	}

	public void setListDepartment(List<TestDepartment> listDepartment) {
		this.listDepartment = listDepartment;
	}
}
