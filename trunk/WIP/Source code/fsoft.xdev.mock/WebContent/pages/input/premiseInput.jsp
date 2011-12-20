
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title> Premise Input</title>

	<sj:tabbedpanel id="tabs">
		
		<sj:tab id="tab1" target="details1" label="Details 1"/>
		<sj:tab id="tab1" target="details2" label="Details 2"/>
		<sj:tab id="tab1" target="details3" label="Details 3"/>
		<sj:tab id="tab1" target="details4" label="Details 4"/>
		
		
		<div id="details1" class="xdev-window-body-sub">
		<table>
			
			<s:form cssClass="xdev-form">
				<s:textfield name="locationName" label="Location Name" required="true"></s:textfield>
				<s:checkbox name="primaryLocation" label="Primary Location" labelposition="left"></s:checkbox>
		
				<s:textfield name="knownAs" label="Known As"></s:textfield>
				<s:checkbox name="locationManaged" label="Location Managed" labelposition="left"></s:checkbox>
				
				<!-- link to Organisation -->
				<xdev:textLookup name="locationOrganisation" label="Location Organisation"/>
				<s:textfield name="locationOrganisation" label="Location Organisation" readonly="true"></s:textfield>
				
				<s:checkbox name="stnetworkConectivity" label="ST Network Connectivity" labelposition="left"></s:checkbox>
				<s:select list="{'PendingActive','Active','Pending Closure','Closed'}" label="Location Status" required="true"></s:select>
				
			    <sj:datepicker name="locationStatusDate" displayFormat="dd/mm/yy" label="Location Status Date"></sj:datepicker>
			  
			 	<s:checkboxlist name="locationType" list="{'Enterprise','Support Center', 'Project','Venue', 'Hotel','JCP Offices'}" required="true" label="Location Type"></s:checkboxlist>
	
				<s:textfield name="addressLine1" label="Address Line 1" ></s:textfield>
				<s:textfield name="addressLine2" label="Address Line 2"></s:textfield>	
				
				<s:textfield name="locationDescription" label="Location Description"></s:textfield>
				
				<xdev:textLookup name="postcode" label="Post Code"/>
				<s:textfield name="postcode" label="Post Code"></s:textfield>
				
				<s:textfield name="phoneNumber" label="Phone Number" required="true"></s:textfield>
				<s:textfield name="faxNumber" label="General Fax Number"></s:textfield>
			
				<s:select list="{'Viet Nam', 'USA'}" label="Nation/Country"></s:select>
			
				<s:textfield name="cityTown" label="City Town"></s:textfield>
			
				<s:textfield name="county" label="County"></s:textfield>
				<s:checkbox name="isNewShop" label="Is New Shop?" labelposition="left"></s:checkbox>
				
				<sj:datepicker name="shopFlagDate" displayFormat="dd/mm/yy" label="Shop Flag Date"></sj:datepicker>
				<s:checkbox name="specialistShop" label="Specialist Shop" labelposition="left"></s:checkbox>
				
				<s:label name="locationOpeningTime" onclick="loationOpeningTime" value="Location Opening Time"></s:label>
		
		</s:form>
		
		</table>
		
		</div>
		<div id="details2" class="xdev-window-body-sub">
			
			<s:form cssClass="xdev-form">
				
				<s:checkboxlist name="accreditations" list="{'Two Ticks','Investors In People', 'ISO 9001','ISO 14001', 'ISO 27001'}" label="Accriditations" ></s:checkboxlist>
				
				<s:checkboxlist name="jcpOffices" list="{'',''}" label="JCP Offices" labelposition="left" ></s:checkboxlist>
				
				<s:checkbox name="cateringFacilities" label="Catering Facilities" labelposition="left"></s:checkbox>
				
				<s:textfield name="cateringContact" label="Catering Contact" readonly="true"></s:textfield>
				
				<s:label name="lookupCatering" onclick="Lookup" value="Lookups"></s:label>
				
				<s:checkboxlist name="localDemographicIssue" list="{'High Un-employment','Rural'}" label="Local Demographic Issue" ></s:checkboxlist>
				
				<s:select name="cateringType" list="{'',''}" label="Catering Type"></s:select>
				
				<s:select name="IS/Network" list="{'Open','Wip','Closed'}" label="IS/Network"></s:select>
				
				<s:checkbox name="clientITFacilities" label="Client IT Facilities"></s:checkbox>
				<s:textarea name="clientITFacilitiesDetail" label="Client IT Facilities Detail" cols="5" rows="4"></s:textarea>
				
				<s:checkbox name="roomAvailability" label="Room Availability"></s:checkbox>
				<s:checkbox name="volunteeringOpportunities" label="Volunteering Opportunities"></s:checkbox>
				
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