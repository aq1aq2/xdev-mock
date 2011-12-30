
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title> Premise Input</title>


<script type="text/javascript">
<!--

//-->

$(document).ready(function(){
	
	/* Back event */
	$("#backBtn").click(function(){
		window.history.back();
	});
	
	/* Save event */
	$("#saveBtn").click(function(){
		var query = "";
		var forms = $("form");
		$.each(forms, function(){
			// Read id of each form in xForms
			// this implicit an element in the array
			// Searialize data in each form
			var str = $(this).serialize();
			// Concat query string. MUST ADD & symbol !
			query = query + str + "&";
		});			
		query = query.substring(0, query.length-1);
		//send action save
		window.location.href = "savePremises.action?" + query;
	});
	
	
	/* Catering Contact lookup event */
	$("#cateringContact_lookupBtn").click(function(){
		$("#listDialogContent").load("Contact.action",
			function(response){     // Function execute after load complete
				
			/* Dialog None button */
				$("#noneBtn").click(function(){
					//$(":input[name*='contact.managerId']").val("");
					
					$("#cateringContact").val("");
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
				/* Dialog Close button */
				$("#closeBtn").click(function(){
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
				/* Dialog Select button */
				$("#selectBtn").click(function(){
					var cateringContactId = $(":input[name*='gridSelectedRow']").val();
					//$(":input[name*='contact.managerId']").val(managerId);
						$("#cateringContact").val(cateringContactId);
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
			}
		);
		
		$( "#listDialog" ).dialog( "open" );
	});
	
	// organisation lookup 
	$("#locationOrganisation_lookupBtn").click(function(){
		$("#listDialogContent").load("Organisation.action",
			function(response){     // Function execute after load complete
				
			/* Dialog None button */
				$("#noneBtn").click(function(){
					//$(":input[name*='contact.managerId']").val("");
					
					$("#locationOrganisation").val("");
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
				/* Dialog Close button */
				$("#closeBtn").click(function(){
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
				/* Dialog Select button */
				$("#selectBtn").click(function(){
					var organisationId = $(":input[name*='gridSelectedRow']").val();
					//$(":input[name*='contact.managerId']").val(managerId);
						$("#locationOrganisation").val(organisationId);
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
			}
		);
		
		$( "#listDialog" ).dialog( "open" );
	});
	
	// check mode function
	
	function checkMode(){
		var mode = $("#mode").val();
		if(mode == -1){
			$("#premiseTabs").tabs("option", "disabled", [3,4,5]);
		}
		else {
			
		}
	}
	
	$("#premiseTabs").ready(function(){
		
		checkMode();
	});
	
	/*
	 * On Tab change
	 */
	 
	$.subscribe('onTabChange', function(event, data) {
		var tab = event.originalEvent.ui.index;
		if (tab==4) {
			//empty volunteeringOpportunityList to avoid conflict
			$("#volunteeringOpportunityList").empty();
			//load facility List
			$("#facilitiesList").load("Facilities.action",
				function(response){}
			);
		}
		if (tab==5) {
			//empty facilitiesList to avoid conflict
			$("#facilitiesList").empty();
			//load volunteeringOpportunityList
			$("#volunteeringOpportunityList").load("VolunteeringOpportunity.action",
				function(response){}
			);
		}
	});
	
	//check the value of checkbox list locationType
	$("#locationTypeCheckboxList input:checked").click().each(function(){
		alert("vao day nao");
	});
	
	//check is newshop
	
	$("#shopFlagDate").change(function(){
		var date = $("#shopFlagDate").datepicker("getDate");
		 //alert(date);
		 var currentDate = new Date();
		
		 //alert(currentDate);
		 if(date > currentDate){
			 alert("the shopFlagDate must be less than current Date");
			 $("#shopFlagDate").val("");
		 }
		 else {
			 //get the day differ
			 var dayDiff = Math.ceil((currentDate - date) / (1000 * 60 * 60 * 24));
			 //alert(dayDiff);	 
			 if(dayDiff <60){
				 $("#isNewShop").attr('checked','true');
			 }
			 else {
				 $("#isNewShop").removeAttr('checked');
			 }
		 }
	});
	
	//check the Volunteering Oportunity checkBox
	$("#volunteeringOpportunities").click(function(){
		
		if($("#volunteeringOpportunities").is(":checked") == true) {
			$("#premiseTabs").tabs("enable",5);
			
		}
		else {
			$("#premiseTabs").tabs("disable",5);
			
			
		}
	
	});
	
	
	//function to keep the value of checkboxlist when edit

	function keepValueOfCheckboxlist(types,str) {
		//split the string of Id
		var strValue = types.split(", ");
		for(var i = 0; i < strValue.length; i++){
			var k = strValue[i];
			//alert(k);
			namVar = "'"+str+"'";
			$(":checkbox[name="+namVar+"][value="+k+"]").prop('checked', true);
		}
	}

	
	
	//keep the value of checkboxlist in premise Input
	keepValueOfCheckboxlist("${premise.locationType}","premise.locationType");
	keepValueOfCheckboxlist("${premise.localDemographicIssue}","premise.localDemographicIssue");
	
	keepValueOfCheckboxlist("${premise.jcpoffices}","premise.jcpoffices");
	keepValueOfCheckboxlist("${premise.outreachLocation}","premise.outreachLocation");
	
	keepValueOfCheckboxlist("${premise.localHotel}","premise.localHotel");
	
	//take the event of location type
	
	$(":checkbox").click(function(){
        //alert($(this).next().text());
        //alert($(this).val());
       //alert($(":checkbox[name='premise.locationType'][checked='true']").val());
        
       if($(this).next().text()=="Hotel") 
       {
    	   if ($(this).is(":checked") == true) {
    		   $("#premiseTabs").tabs("enable",3);
    	   } else {
        	   $("#premiseTabs").tabs("disable",3);
           }
    	   
       }
    });
		
});

</script>

<!-- body -->

<div>
	<sj:tabbedpanel id="premiseTabs" selectedTab="0" onChangeTopics="onTabChange" >
		
		<sj:tab id="tab1" target="details1" label="Details 1"/>
		<sj:tab id="tab2" target="details2" label="Details 2"/>
		<sj:tab id="tab3" target="details3" label="Details 3"/>
		<sj:tab id="tab4" target="details4" label="Details 4"/>
		<sj:tab id="tab5" target="facilitiesList" label="Facility"></sj:tab>
		<sj:tab id="tab6" target="volunteeringOpportunityList" label="Volunteering"></sj:tab>
		
		
		<div id="details1" class="xdev-window-body-sub">
		<table>
			
			<s:form cssClass="xdev-form">
				<s:hidden id="mode" name="mode"></s:hidden>
				<s:textfield name="premise.locationName" label="Location Name" required="true"></s:textfield>
				<s:checkbox name="premise.primaryLocation" label="Primary Location" labelposition="left"></s:checkbox>
		
				<s:textfield name="premise.knownAs" label="Known As"></s:textfield>
				
				<!-- link to Organisation -->
				  
				<xdev:textLookup id="locationOrganisation" name="premise.organisation.organisationId" label="Location Organisation"/>
				
				<s:checkbox id="locationManaged" name="premise.locationManaged" label="Location Managed" labelposition="left"></s:checkbox>
				
				<s:checkbox name="premise.stnetworkConectivity" label="ST Network Connectivity" labelposition="left"></s:checkbox>
				<s:select name="premise.locationStatus" list="{'PendingActive','Active','Pending Closure','Closed'}" label="Location Status" required="true"></s:select>
				
			    <sj:datepicker name="premise.locationStatusDate" displayFormat="dd/mm/yy" label="Location Status Date"></sj:datepicker>
			  																																																					 
			 	<s:checkboxlist id="locationTypeCheckboxList" name="premise.locationType" list="listLocationType" required="true" label="Location Type" listValue="type" listKey="referenceDataId" key="referenceDataId"></s:checkboxlist>
	
				<s:textfield name="premise.addressLine1" label="Address Line 1" ></s:textfield>
				<s:textfield name="premise.addressLine2" label="Address Line 2"></s:textfield>	
				
				<s:textfield name="premise.locationDescription" label="Location Description"></s:textfield>
				<!-- 
				<xdev:textLookup id="postcode" name="premise.postcode" label="Post Code"/>
				 -->
				<s:textfield name="premise.phoneNumber" label="Phone Number" required="true"></s:textfield>
				<s:textfield name="premise.faxNumber" label="General Fax Number"></s:textfield>
			
				<s:select list="{'Viet Nam', 'USA'}" label="Nation/Country"></s:select>
			
				<s:textfield name="premise.cityTown" label="City Town"></s:textfield>
			
				<s:textfield name="premise.county" label="County"></s:textfield>
				<s:checkbox id="isNewShop" name="premise.isNewShop" label="Is New Shop?" labelposition="left"></s:checkbox>
				
				<sj:datepicker id="shopFlagDate" name="premise.shopFlagDate" displayFormat="dd/mm/yy" label="Shop Flag Date"></sj:datepicker>
				<s:checkbox name="premise.specialistShop" label="Specialist Shop" labelposition="left"></s:checkbox>
		
		</s:form>
		
		</table>
		
		</div>
		<div id="details2" class="xdev-window-body-sub">
			
			<s:form cssClass="xdev-form">
				
				<s:checkboxlist name="premise.accreditations" list="listAccreditations" label="Accriditations" listValue="type" listKey="referenceDataId" key="referenceDataId"/>
				
				<s:checkboxlist name="premise.jcpoffices" list="listPremiseJcpOffice" label="JCP Offices" labelposition="left" listValue="name" listKey="premiseId" key="premiseId"/>
				
				
				<xdev:textLookup name="premise.contactId" id="cateringContact" label="Catering Contact" />
				
				<s:checkboxlist name="premise.localDemographicIssue" list="listLocalDemographicIssue" label="Local Demographic Issue" listValue="type" listKey="referenceDataId" key="referenceDataId" ></s:checkboxlist>
				
				<s:select name="premise.referenceData.referenceDataId" list="listCateringType" label="Catering Type" listValue="type" listKey="referenceDataId" key="referenceDataId"></s:select>
				
				<s:select name="premise.isnetwork" list="listNetwork" label="IS/Network" listValue="type" listKey="referenceDataId" key="referenceDataId"></s:select>
				
				<s:checkbox name="premise.roomAvailability" label="Room Availability" labelposition="left"></s:checkbox>
				<s:checkbox id="volunteeringOpportunities" name="premise.volunteeringOpportunities" label="Volunteering Opportunities" labelposition="left"></s:checkbox>
				
			</s:form>
		
		</div>
		
		<div id="details3" class="xdev-window-body-sub">
		
			<s:form cssClass="xdev-form">
				<s:checkboxlist name="premise.outreachLocation" list="listPremiseOutreachLocation" label="Outreach Location" listValue="name" listKey="premiseId" key="premiseId"></s:checkboxlist>
				<s:checkboxlist name="premise.localHotel" list="listPremiseHotel" label="Local Hotel" listValue="name" listKey="premiseId" key="premiseId"></s:checkboxlist>
				<s:textfield name="premise.travelDetails" label="Travel Detail"></s:textfield>
				<s:textfield name="premise.travelNearestBus" label="Travel Nearest Bus"></s:textfield>
				<s:checkbox name="premise.visitorParkingOnsite" label="Visitor Parking Onsite"></s:checkbox>
				<s:checkbox name="premise.hostVisits" label="Host Visits" labelposition="left"></s:checkbox>
			</s:form>
		
		</div>
		
		<div id="details4" class="xdev-window-body-sub">
			<s:form cssClass="xdev-form">
				<s:textfield name="premise.roomOnlyRate" label="Room Only Rate"></s:textfield>
				<s:textfield name="premise.bbrate" label="B&B Rate"></s:textfield>
				<s:checkbox name="premise.lunch" label="Lunch" labelposition="left"></s:checkbox>
				<s:textfield name="premise.negotiatedRoomOnlyRate" label="Negotiated Room Only Rate"></s:textfield>
				<s:textfield name="premise.bbnegotiatedRate" label="B&B Negotiated Rate"></s:textfield>
				<sj:datepicker name="premise.lastNegotiatedDate" displayFormat="dd/mm/yy" label="Last Negotiated Date"></sj:datepicker>
				<sj:datepicker name="premise.reNegotiatedOn" displayFormat="dd/mm/yy" label="Re-negotiate On"></sj:datepicker>
				<s:textfield name="premise.noOfMeetingRoom" label="No Of Meeting Room"></s:textfield>
			</s:form>
		
		</div>
		
		<div id="facilitiesList"></div>
		<div id="volunteeringOpportunityList"></div>
	
	</sj:tabbedpanel>

</div>

<!-- Lookup Dialog -->
<sj:dialog 
   	id="listDialog" 
   	autoOpen="false" 
   	modal="true" 
   	title="Contact List"
   	width="965"
   	height="650"
>          
	<div id="listDialogContent"></div>
</sj:dialog>
