<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Project/Minor Works</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="saveBtn" 
			button="true" 
		>Save</sj:a>
		
		<sj:a id="backBtn" 
			button="true" 
		>Back</sj:a>
	</div>
	
	<div class="xdev-window-body">
		<div id="MinorWorks" class="xdev-window-body-sub">
		<table>
			<s:form>
				<s:textfield name="pmwDescription" label="P/MW Description" required="true"></s:textfield>
				
				<s:textfield name="contact" label="contact" readonly="true"></s:textfield>
				<s:label name="lookupMinorContact" value="Lookups"></s:label>
				
				<s:textfield name="authorisedByName" label="Authorised By Name" readonly="true"></s:textfield>
				<s:label name="lookupMinorAuthorise" value="Lookups"></s:label>
				
				<s:radio name="radioProject" list="{'Project'}"></s:radio>
				<s:radio name="radioMinorWorks" list="{'Minor Works'}"></s:radio>
				
				<s:checkbox name="isTPA" label="Is TPA"></s:checkbox>
				<s:textfield name="status" label="Status" readonly="true"></s:textfield>
				
				<s:textarea name="notesActions" label="Notes Actions" cols="5" rows="4"></s:textarea>
				<s:textfield name="estimatedCost" label="Estimated Cost"></s:textfield>
				<s:textfield name="actualCost" label="Actual Cost"></s:textfield>
				<s:select name="directorate" list="{'',''}" label="Directorate" ></s:select>
				
				<sj:datepicker name="pmwEnqReceivedDate" displayFormat="dd/mm/yy" label="P/MW Enquiry Received Date" required="true"></sj:datepicker>
				<sj:datepicker name="authorisedDate" displayFormat="dd/mm/yy" label="Authorised Date"></sj:datepicker>
				<sj:datepicker name="actualStartDate" displayFormat="dd/mm/yy" label="Actual Start Date"></sj:datepicker>
				<sj:datepicker name="anticipatedCompletion" displayFormat="dd/mm/yy" label="Anticipated Completion"></sj:datepicker>
				<sj:datepicker name="actualCompletionDate" displayFormat="dd/mm/yy" label="Actual Completion Date"></sj:datepicker>
			</s:form>
		
		</table>
		
		</div>
		
		
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>