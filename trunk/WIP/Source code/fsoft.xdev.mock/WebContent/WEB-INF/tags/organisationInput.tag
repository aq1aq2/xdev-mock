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
		<sj:tabbedpanel id="tabs">
			<sj:tab id="tab1" target="details1" label="Details 1"/>
			<sj:tab id="tab2" target="details2" label="Details 2"/>
			<sj:tab id="tab3" target="details3" label="Details 3"/>
			<sj:tab id="tab4" target="details4" label="Details 4"/>
			<sj:tab id="tab5" target="details5" label="Details 5"/>
			<sj:tab id="tab1" target="bu" label="BU"/>
			
		<div class="xdev-window-body-sub" id="details1">
			<s:url id="addOrganisation" action="addOrganisation.action"></s:url>
			<div class="xdev-field">
				<s:textfield name="organisationName" label="Organisation Name" required="true"></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textarea name="organisationDesc" label="Organisation Short Description" cols="12" rows="3" required="true"></s:textarea>
			</div>
			<div class="xdev-field">
				<s:textfield name="leadContact" label="Lead Contact" readonly="true"></s:textfield>
			</div>
			<div class="xdev-field">
				<s:label value="Lookup"></s:label>
			</div>
			<div class="xdev-field">
				<s:textfield name="addressLine1" label="Address Line 1" required="true"></s:textfield>
			</div>
			<div class="xdev-field">	
				<s:textfield name="addressLine2" label="Address Line 2" ></s:textfield>
			</div>
			<div class="xdev-field">	
				<s:textfield name="addressLine3" label="Address Line 3" ></s:textfield>
			</div>
			<div class="xdev-field">	
				<s:textfield name="postCode" label="Post Code" required="true"></s:textfield>
			</div>
			<div class="xdev-field">	
				<s:label value="Lookup"></s:label>
			</div>
			<div class="xdev-field">	
				<s:textfield name="CityTown" label="City/Town"></s:textfield>
			</div>
			<div class="xdev-field">	
				<s:textfield name="County" label="County"></s:textfield>
			</div>
			<div class="xdev-field">	
				<s:select name="NationCountry" list="{'Vietnam', 'United State', 'Japan', 'United Kingdom'}" label="Nation/Country"></s:select>
			</div>
				
			<div class="xdev-field">
				<s:checkbox name="preferredOrganisation" label="Preferred Organisation"></s:checkbox>
			</div>
			<div class="xdev-field">	
				<s:checkbox name="expressionOfInterest" label="Expression of Interest"></s:checkbox>
			</div>
			<div class="xdev-field">	
				<s:textfield name="typeOfBusiness" label="Type Of Business" readonly="true" required="true"></s:textfield>
			</div>
			<div class="xdev-field">    
			    <s:label value="Lookup"></s:label>
			</div>
			<div class="xdev-field">	
				<s:textfield name="sicCode" label="SIC Code"></s:textfield>
			</div>
			<div class="xdev-field">	
				<s:textarea name="organisationFullDescription" label="Organisation Full Description" cols="12" rows="3"></s:textarea>
			</div>
			<div class="xdev-field">	
				<s:textfield name="phoneNumber" label="Phone Number" required="true"></s:textfield>
			</div>
			
			<div class="clear"></div>
		</div>
		
		<div class="xdev-window-body-sub" id="details2">
			<div class="xdev-field">	
				<s:textarea name="organisationSpecialism" label="Organisation Specialism">
				</s:textarea>
			</div>
			<div class="xdev-field">	
				<s:textarea name="serviceDisabilitiesCapabilities" label="Service Disabilities Capabilities">
				</s:textarea>
			</div>
			<div class="xdev-field">	
				<s:textarea name="serviceBarrierCapabilities" label="Service Barriers Capabilies">
				</s:textarea>
			</div>
			<div class="xdev-field">	
				<s:textarea name="serviceBenefitsCapabilies" label="Service Benefits Capabilies">
				</s:textarea>
			</div>
			<div class="xdev-field">	
				<s:textarea name="servicePersonalCircumstancesCapabilities" label="Service Personal Circumstances Capabilities">
				</s:textarea>
			</div>
			<div class="xdev-field">	
				<s:textarea name="serviceEthnicityCapabilities" label="Service Ethnicity Capabilities">
				</s:textarea>
			</div>
			<div class="xdev-field">	
				<s:textarea name="accrediation" label="Accrediation">
				</s:textarea>
			</div>
			
			<div class="clear"></div>
		</div>
		
		<div class="xdev-window-body-sub" id="details3">
			<s:form id="details">
					<div class="xdev-field">
						<s:textarea name="eoiProgrammes" label="EOI Programmes">
						</s:textarea>
					</div>
					<div class="clear"></div>
					<div class="xdev-field">
						<s:textarea name="eoiServices" label="EOI Services">
						</s:textarea>
					</div>

			</s:form>
			<div class="clear"></div>
		</div>
		
		<div class="xdev-window-body-sub" id="details4">
			<div class="clear"></div>
		</div>
		
		<div class="xdev-window-body-sub" id="details5">
			<div class="clear"></div>
		</div>
		
		<div class="xdev-window-body-sub" id="bu">
			<div class="clear"></div>
		</div>
		
		</sj:tabbedpanel>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



