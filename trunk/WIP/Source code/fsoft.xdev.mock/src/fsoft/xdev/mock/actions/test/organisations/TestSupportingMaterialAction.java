package fsoft.xdev.mock.actions.test.organisations;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestCustomer;
import fsoft.xdev.mock.models.TestSupportingMaterial;
import fsoft.xdev.mock.utilities.XConstants;
import fsoft.xdev.mock.utilities.XDebugger;

public class TestSupportingMaterialAction extends ActionSupport{
	
	private List<TestSupportingMaterial> listSupportingMaterial;
	
	public String list() {
		XDebugger.show("List method in TestSupportingMaterialAction");
		listSupportingMaterial = new ArrayList<TestSupportingMaterial>();
		listSupportingMaterial.add(new TestSupportingMaterial("www.docs.com", "docs", "doc", "nhanld", "11/25/2011"));
		listSupportingMaterial.add(new TestSupportingMaterial("www.pdfs.com", "pdfs", "pdf", "dungnm2", "11/25/2011"));
		return XConstants.LIST_TOKEN;
	}
	
	public String add() {
		XDebugger.show("Add method in TestSupportingMaterialAction");
		return XConstants.ADD_TOKEN;
	}
	
	public List<TestSupportingMaterial> getListSupportingMaterial() {
		return listSupportingMaterial;
	}

	public void setListSupportingMaterial(
			List<TestSupportingMaterial> listSupportingMaterial) {
		this.listSupportingMaterial = listSupportingMaterial;
	}
}
