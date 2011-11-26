<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Organisation Detail</h1>
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
		<div class="xdev-window-body-sub" id="details1">
			<s:url id="addOrganisation" action="addOrganisation.action"></s:url>
			<s:form>
				<s:textfield name="organisationName" label="Organisation Name" required="true"></s:textfield>
				<s:textarea name="organisationDesc" label="Organisation Short Description" cols="12" rows="3" required="true"></s:textarea>
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
				
				<s:checkbox name="preferredOrganisation" label="Preferred Organisation"></s:checkbox>
				<s:checkbox name="expressionOfInterest" label="Expression of Interest"></s:checkbox>
				<s:textfield name="typeOfBusiness" label="Type Of Business" readonly="true" required="true"></s:textfield>
			    <s:label value="Lookup"></s:label>
				<s:textfield name="sicCode" label="SIC Code"></s:textfield>
				<s:textarea name="organisationFullDescription" label="Organisation Full Description" cols="12" rows="3"></s:textarea>
				<s:textfield name="phoneNumber" label="Phone Number" required="true"></s:textfield>
			</s:form>
		</div>
		<div class="xdev-window-body-sub" id="details2">
			<s:form>
				<s:textarea name="organisationSpecialism" label="Organisation Specialism">
				</s:textarea>
				<s:textarea name="serviceDisabilitiesCapabilities" label="Service Disabilities Capabilities">
				</s:textarea>
				<s:textarea name="serviceBarrierCapabilities" label="Service Barriers Capabilies">
				</s:textarea>
				<s:textarea name="serviceBenefitsCapabilies" label="Service Benefits Capabilies">
				</s:textarea>
				<s:textarea name="servicePersonalCircumstancesCapabilities" label="Service Personal Circumstances Capabilities">
				</s:textarea>
				<s:textarea name="serviceEthnicityCapabilities" label="Service Ethnicity Capabilities">
				</s:textarea>
				<s:textarea name="accrediation" label="Accrediation">
				</s:textarea>
			</s:form>
		</div>
		
		<div class="xdev-window-body-sub" id="details3">
			<s:form>
				<s:textarea name="eoiProgrammes" label="EOI Programmes">
				</s:textarea>
				<s:textarea name="eoiServices" label="EOI Services">
				</s:textarea>
			</s:form>
		</div>
		
		<div class="xdev-window-body-sub" id="details4">
			<xdev:premiseList></xdev:premiseList>
		</div>
		
		<div class="xdev-window-body-sub" id="details5">
			<xdev:supportingMaterialList></xdev:supportingMaterialList>
		</div>
		
		<div class="xdev-window-body-sub" id="bu">
			<xdev:directorateList></xdev:directorateList>
		</div>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



