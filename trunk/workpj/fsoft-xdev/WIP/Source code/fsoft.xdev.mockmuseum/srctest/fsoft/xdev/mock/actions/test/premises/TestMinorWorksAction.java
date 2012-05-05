package fsoft.xdev.mock.actions.test.premises;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestMinorWorks;
import fsoft.xdev.mock.models.TestVolunteering;

public class TestMinorWorksAction extends ActionSupport{
	private List<TestMinorWorks> listMinorWorks;
	
	public String execute() {
		System.out.println("execute");
		listMinorWorks = new ArrayList<TestMinorWorks>();
		listMinorWorks.add(new TestMinorWorks("Description1", "10/10/2009","Notes Action 1","Diretorate A","Contact A","Completed",true));
		listMinorWorks.add(new TestMinorWorks("Description2", "20/06/2010","Notes Action 2","Diretorate B","Contact B","Completed",false));
		return SUCCESS;
	}

	public List<TestMinorWorks> getListMinorWorks() {
		return listMinorWorks;
	}

	public void setListMinorWorks(List<TestMinorWorks> listMinorWorks) {
		this.listMinorWorks = listMinorWorks;
	}
	
}
