<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Volunteering Opportunity Detail</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="activeBtn" 
			button="true" 
		>active</sj:a>
		
		<sj:a id="backBtn" 
			button="true" 
		>Back</sj:a>
	</div>
	
	<div class="xdev-window-body">
		<div id="Volunteering" class="xdev-window-body-sub">
		<table>
			<s:form>
				<s:textfield name="volunteeringContact" label="Volunteering Contact" required="true" readonly="true"></s:textfield>
				<s:label name="lookupVoContact" value="Lookups"></s:label>
				<s:textarea name="volunteerPurpose" label="Volunteer Purpose" cols="5" rows="4"></s:textarea>
				<s:textarea name="volunteeringDetail" label="Volunteering Opportunity Detail" cols="5" rows="4"></s:textarea>
				<sj:datepicker name="startDate" displayFormat="dd/mm/yy" label="Start Date"></sj:datepicker>
				<sj:datepicker name="endDate" displayFormat="dd/mm/yy" label="End Date"></sj:datepicker>
				<s:textfield name="volunteerNos" label="Volunteer Nos"></s:textfield>
			</s:form>
		
		</table>
		
		</div>
		
		
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>