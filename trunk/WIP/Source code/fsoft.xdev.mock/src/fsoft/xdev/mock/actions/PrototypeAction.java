package fsoft.xdev.mock.actions;

import com.opensymphony.xwork2.ActionSupport;

public class PrototypeAction extends ActionSupport {
	public String openOrganisationList() {
		return SUCCESS;
	}
	public String openOrganisationInput() {
		System.out.println("openOrganisationInput");
		return SUCCESS;
	}
}
