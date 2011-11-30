package fsoft.xdev.mock.actions.test.organisations;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestDepartment;
import fsoft.xdev.mock.models.TestDirectorate;
import fsoft.xdev.mock.utilities.XConstants;
import fsoft.xdev.mock.utilities.XDebugger;

public class TestDirectorateAction extends ActionSupport {

	private List<TestDirectorate> listDirectorate;
	
	public String list() {
		XDebugger.show("List method in TestDirectorateAction");
		listDirectorate = new ArrayList<TestDirectorate>();
		listDirectorate.add(new TestDirectorate("xxx", "20 Pham Hung", "134", "MS. Lien", true));
		listDirectorate.add(new TestDirectorate("yy", "Dich Vong, Cau Giay", "787", "MR. Duc", true));
		return XConstants.LIST_TOKEN;
	}
	
	public String add() {
		XDebugger.show("Add method in TestDirectorateAction");
		return XConstants.ADD_TOKEN;
	}
	
	
	public List<TestDirectorate> getListDirectorate() {
		return listDirectorate;
	}

	public void setListDirectorate(List<TestDirectorate> listDirectorate) {
		this.listDirectorate = listDirectorate;
	}
}
