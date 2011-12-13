package fsoft.xdev.mock.actions.template;

import fsoft.xdev.mock.utilities.XConstants;
import fsoft.xdev.mock.utilities.XDebugger;

// Some page don't need menu then it should remove declaration from the page
public class TemplateAction {
	public String home() {
		XDebugger.show("Calling home() method in TemplateAction");
		return XConstants.HOME_TOKEN;
	}
	
	public String organisation() {
		XDebugger.show("Calling organisation() method in TemplateAction");
		return XConstants.ORGANISATION_TOKEN;
	}
	
	public String supportingMaterials() {
		XDebugger.show("Calling supportingMaterials() method in TemplateAction");
		return XConstants.SUPPORTING_MATERIALS_TOKEN;
	}
	
	public String directorates() {
		XDebugger.show("Calling directorates() method in TemplateAction");
		return XConstants.DIRECTORATES_TOKEN;
	}
	
	public String department() {
		XDebugger.show("Calling department() method in TemplateAction");
		return XConstants.DEPARTMENT_TOKEN;
	}
	
	public String team() {
		XDebugger.show("Calling team() method in TemplateAction");
		return XConstants.TEAM_TOKEN;
	}
	
	public String service() {
		XDebugger.show("Calling service() method in TemplateAction");
		return XConstants.SERVICE_TOKEN;
	}
	
	public String programme() {
		XDebugger.show("Calling programme() method in TemplateAction");
		return XConstants.PROGRAMME_TOKEN;
	}
	
	public String trustRegion() {
		XDebugger.show("Calling trustRegion() method in TemplateAction");
		return XConstants.TRUST_REGION_TOKEN;
	}
	
	public String trustDistrict() {
		XDebugger.show("Calling trustDistrict() method in TemplateAction");
		return XConstants.TRUST_DISTRICT_TOKEN;
	}
	
	public String premises() {
		XDebugger.show("Calling premises() method in TemplateAction");
		return XConstants.PREMISES_TOKEN;
	}
	
	public String contact() {
		XDebugger.show("Calling contact() method in TemplateAction");
		return XConstants.CONTACT_TOKEN;
	}
	
	public String facility() {
		XDebugger.show("Calling facility() method in TemplateAction");
		return XConstants.FACILITY_TOKEN;
	}
	
	public String volunteering() {
		XDebugger.show("Calling volunteering() method in TemplateAction");
		return XConstants.VOLUNTEERING_TOKEN;
	}
	
	public String minorWorkProjects() {
		XDebugger.show("Calling minorWorkProjects() method in TemplateAction");
		return XConstants.MINOR_WORK_PROJECT_TOKEN;
	}
	
	public String addressLookup() {
		XDebugger.show("Calling addressLookup() method in TemplateAction");
		return XConstants.ADDRESS_LOOKUP_TOKEN;
	}
	
	public String typeOfBusiness() {
		XDebugger.show("Calling typeOfBusiness() method in TemplateAction");
		return XConstants.TYPE_OF_BUSINESS_TOKEN;
	}
}
