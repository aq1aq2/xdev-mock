package fsoft.xdev.mock.actions.test.premises;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

//import fsoft.xdev.mock.models.TestFacilities;
import fsoft.xdev.mock.models.TestVolunteering;

public class TestVolunteeringAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TestVolunteering> listVolunteering;
	public String execute() {
		System.out.println("execute");
		listVolunteering = new ArrayList<TestVolunteering>();
		listVolunteering.add(new TestVolunteering("Contact1", "volunteering default 1",3,"20/06/2011","20/09/2011" ,true));
		//listVolunteering.add(new TestVolunteering("facilities2", "this is secrete facilities", "dungnm","hoantt",false));
		return SUCCESS;
	}
	public List<TestVolunteering> getListVolunteering() {
		return listVolunteering;
	}
	public void setListVolunteering(List<TestVolunteering> listVolunteering) {
		this.listVolunteering = listVolunteering;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
