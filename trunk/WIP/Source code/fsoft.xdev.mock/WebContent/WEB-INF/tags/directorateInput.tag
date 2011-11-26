<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Business Unit/Directorate Details</h1>
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
		<div class="xdev-window-body-sub" id="details">
			<s:url id="addOrganisation" action="addOrganisation.action"></s:url>
			<s:form>
				<s:textfield name="directorateName" label="Directorate Name" required="true"></s:textfield>
				<s:textarea name="directorateShortDesc" label="BU/Directorate Short Description" cols="12" rows="3" required="true"></s:textarea>
				<s:textfield name="leadContact" label="Lead Contact" readonly="true"></s:textfield>
				<s:label value="Lookup"></s:label>
				<s:textfield name="addressLine1" label="Address Line 1" required="true"></s:textfield>
				<s:textfield name="addressLine2" label="Address Line 2" ></s:textfield>
				<s:textfield name="addressLine3" label="Address Line 3" ></s:textfield>
				<s:textfield name="postCode" label="Post Code" required="true"></s:textfield>
				<s:label value="Lookup"></s:label>
				<s:textfield name="CityTown" label="City/Town"></s:textfield>
				<s:textfield name="County" label="County"></s:textfield>
				<s:select name="NationCountry" list="{'Vietnam', 'United State', 'Japan', 'United Kingdom'}"></s:select>
				
				<s:textfield name="typeOfBusiness" label="Type Of Business" readonly="true" required="true"></s:textfield>
			    <s:label value="Lookup"></s:label>
				<s:textfield name="sicCode" label="SIC Code"></s:textfield>
				<s:textarea name="directorateFullDescription" label="BU/Directorate Full Description" cols="12" rows="3"></s:textarea>
				<s:textfield name="phoneNumber" label="Phone Number" required="true"></s:textfield>
			</s:form>
		</div>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



