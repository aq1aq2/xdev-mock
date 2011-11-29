package fsoft.xdev.mock.actions.test.premises;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

//import fsoft.xdev.mock.models.TestMinorWorks;
import fsoft.xdev.mock.models.TestPremiseService;

public class TestPremiseServiceAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TestPremiseService> premiseServiceList;
	
	public String execute() {
		System.out.println("execute");
		premiseServiceList = new ArrayList<TestPremiseService>();
		premiseServiceList.add(new TestPremiseService("Money", "Description short","Business","contact A"));
		//premiseServiceList.add(new TestPremiseService("Description2", "20/06/2010","Notes Action 2","Diretorate B","Contact B","Completed",false));
		return SUCCESS;
	}

	public List<TestPremiseService> getPremiseServiceList() {
		return premiseServiceList;
	}

	public void setPremiseServiceList(List<TestPremiseService> premiseServiceList) {
		this.premiseServiceList = premiseServiceList;
	}
	
	

}
