package fsoft.xdev.mock.actions.template;

import fsoft.xdev.mock.utilities.XConstants;
import fsoft.xdev.mock.utilities.XDebugger;


public class TemplateAction {
	public String home() {
		XDebugger.show("Calling home() method in TemplateAction");
		return XConstants.HOME_PAGE_TOKEN;
	}
	
	public String organisation() {
		XDebugger.show("Calling organisation() method in TemplateAction");
		return XConstants.ORGANISATION_PAGE_TOKEN;
	}

	public String organisationInput() {
		XDebugger.show("Calling organisation() method in TemplateAction");
		return XConstants.ORGANISATION_PAGE_INPUT_TOKEN;
	}
	
	public String serviceMaintenance() {
		XDebugger.show("Calling serviceMaintenance() method in TemplateAction");
		return XConstants.SERVICE_PAGE_TOKEN;
	}
	
	public String programmeMaintenance() {
		XDebugger.show("Calling programmeMaintenance() method in TemplateAction");
		return XConstants.PROGRAMME_PAGE_TOKEN;
	}
	
	public String trustRegionMaintenance() {
		XDebugger.show("Calling trustRegionMaintenance() method in TemplateAction");
		return XConstants.TRUST_REGION_PAGE_TOKEN;
	}
	
	public String governmentOfficeRegion() {
		XDebugger.show("Calling governmentOfficeRegion() method in TemplateAction");
		return XConstants.GOVERNMENT_PAGE_TOKEN;
	}
	
	public String premises() {
		XDebugger.show("Calling premises() method in TemplateAction");
		return XConstants.PREMISES_PAGE_TOKEN;
	}
}
