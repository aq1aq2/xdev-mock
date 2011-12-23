
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title> Premise Input</title>

	<sj:tabbedpanel id="tabs">
		
		<sj:tab id="tab1" target="details1" label="Details 1"/>
		<sj:tab id="tab2" target="details2" label="Details 2"/>
		<sj:tab id="tab3" target="details3" label="Details 3"/>
		<sj:tab id="tab4" target="details4" label="Details 4"/>
		
		
		<div id="details1" class="xdev-window-body-sub">
		<table>
			
			<s:form cssClass="xdev-form">
				<s:textfield name="premise.locationName" label="Location Name" required="true"></s:textfield>
				<s:checkbox name="premise.primaryLocation" label="Primary Location" labelposition="left"></s:checkbox>
		
				<s:textfield name="premise.knownAs" label="Known As"></s:textfield>
				<s:checkbox name="premise.locationManaged" label="Location Managed" labelposition="left"></s:checkbox>
				
				<!-- link to Organisation -->
				<xdev:textLookup id="locationOrganisation" name="premise.organisation.name" label="Location Organisation"/>
				<s:checkbox id="locationManaged" name="premise.locationManaged" label="Location Managed" labelposition="left"></s:checkbox>
				
				<s:checkbox name="premise.stnetworkConectivity" label="ST Network Connectivity" labelposition="left"></s:checkbox>
				<s:select name="premise.locationStatus" list="{'PendingActive','Active','Pending Closure','Closed'}" label="Location Status" required="true"></s:select>
				
			    <sj:datepicker name="premise.locationStatusDate" displayFormat="dd/mm/yy" label="Location Status Date"></sj:datepicker>
			  
			 	<s:checkboxlist name="premise.locationType" list="listLocationType" required="true" label="Location Type" listValue="type" listKey="referenceDataId" key="referenceDataId"></s:checkboxlist>
	
				<s:textfield name="premise.addressLine1" label="Address Line 1" ></s:textfield>
				<s:textfield name="premise.addressLine2" label="Address Line 2"></s:textfield>	
				
				<s:textfield name="premise.locationDescription" label="Location Description"></s:textfield>
				
				<xdev:textLookup id="postcode" name="premise.postcode" label="Post Code"/>
				
				<s:textfield name="premise.phoneNumber" label="Phone Number" required="true"></s:textfield>
				<s:textfield name="premise.faxNumber" label="General Fax Number"></s:textfield>
			
				<s:select list="{'Viet Nam', 'USA'}" label="Nation/Country"></s:select>
			
				<s:textfield name="premise.cityTown" label="City Town"></s:textfield>
			
				<s:textfield name="premise.county" label="County"></s:textfield>
				<s:checkbox name="premise.isNewShop" label="Is New Shop?" labelposition="left"></s:checkbox>
				
				<sj:datepicker name="premise.shopFlagDate" displayFormat="dd/mm/yy" label="Shop Flag Date"></sj:datepicker>
				<s:checkbox name="premise.specialistShop" label="Specialist Shop" labelposition="left"></s:checkbox>
				
				<s:label name="locationOpeningTime" onclick="loationOpeningTime" value="Location Opening Time"></s:label>
		
		</s:form>
		
		</table>
		
		</div>
		<div id="details2" class="xdev-window-body-sub">
			
			<s:form cssClass="xdev-form">
				
				<s:checkboxlist name="premise.accreditations" list="listAccreditations" label="Accriditations" listValue="type" listKey="referenceDataId" key="referenceDataId"/>
				
				<s:checkboxlist name="premise.jcpoffices" list="{'',''}" label="JCP Offices" labelposition="left" />
				
				
				<xdev:textLookup name="premise.contactId" id="cateringContact" label="Catering Contact" />
				
				<s:checkboxlist name="premise.localDemographicIssue" list="listLocalDemographicIssue" label="Local Demographic Issue" listValue="type" listKey="referenceDataId" key="referenceDataId" ></s:checkboxlist>
				
				<s:select name="premise.referenceData.referenceDataId" list="listCateringType" label="Catering Type" listValue="type" listKey="referenceDataId" key="referenceDataId"></s:select>
				
				<s:select name="premise.isnetwork" list="listNetwork" label="IS/Network" listValue="type" listKey="referenceDataId" key="referenceDataId"></s:select>
				
				<s:checkbox name="premise.roomAvailability" label="Room Availability" labelposition="left"></s:checkbox>
				<s:checkbox name="premise.volunteeringOpportunities" label="Volunteering Opportunities" labelposition="left"></s:checkbox>
				
			</s:form>
		
		</div>
		
		<div id="details3" class="xdev-window-body-sub">
		
			<s:form cssClass="xdev-form">
				<s:checkboxlist name="outreachLocation" list="{'',''}" label="Outreach Location" ></s:checkboxlist>
				<s:checkboxlist name="localHotel" list="{'',''}" label="Local Hotel" ></s:checkboxlist>
				<s:textfield name="travelDetail" label="Travel Detail"></s:textfield>
				<s:textfield name="travelNearestBus" label="Travel Nearest Bus"></s:textfield>
				<s:textfield name="travelNearestRail" label="Travel Nearest Rail"></s:textfield>
				<s:checkbox name="visitorParkingOnsite" label="Visitor Parking Onsite"></s:checkbox>
				<s:textfield name="visitorParkingSpace" label="Visitor Parking Space"></s:textfield>
				<s:textarea name="visitorParkingAlternative" label="Visitor Parking Alternative" cols="5" rows="4"></s:textarea>
				<s:checkbox name="hostVisits" label="Host Visits"></s:checkbox>
				<s:textfield name="hostingContact" label="Hosting Contact" readonly="true"></s:textfield>
				<s:label name="lookupHostingContact" onclick="Lookup" value="Lookups"></s:label>
			</s:form>
		
		</div>
		
		<div id="details4" class="xdev-window-body-sub">
		
			<s:form cssClass="xdev-form">
				<s:textfield name="roomOnlyRate" label="Room Only Rate"></s:textfield>
				<s:textfield name="bbRate" label="B&B Rate"></s:textfield>
				<s:textfield name="ddRate" label="DD Rate"></s:textfield>
				<s:textfield name="24hrRate" label="24hr Rate"></s:textfield>
				<s:textfield name="negotiatedRoomOnlyRate" label="Negotiated Room Only Rate"></s:textfield>
				<s:textfield name="bbNegotiatedRate" label="B&B Negotiated Rate"></s:textfield>
				<s:textfield name="ddNegotiatedRate" label="DD Negotiated Rate"></s:textfield>
				<s:textfield name="24hrNegotiatedRate" label="24hr Negotiated Rate"></s:textfield>
				<sj:datepicker name="lastNegotiatedDate" displayFormat="dd/mm/yy" label="Last Negotiated Date"></sj:datepicker>
				<sj:datepicker name="reNegotiateOn" displayFormat="dd/mm/yy" label="Re-negotiate On"></sj:datepicker>
			</s:form>
		
		</div>
	
	</sj:tabbedpanel>
	<div class="xdev-window-footer">
	</div>
</div>