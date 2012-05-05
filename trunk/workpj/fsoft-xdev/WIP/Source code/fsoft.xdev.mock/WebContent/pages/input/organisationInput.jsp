<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<script>

$(document).ready(function(){
	
	$.subscribe('onTabChange', function(event, data) {       
        var tab = event.originalEvent.ui.index+1;
        if (tab==4) {
        	$("#tab5").empty();
        	$("#tab6").empty();
        	$("#tab4").load("Premises.action", function(response){});
        }
        if(tab==5){
        	$("#tab4").empty();
        	$("#tab6").empty();
        	$("#tab5").load("SupportingMaterial.action?filterOrgId=" + $("#orgId").val(), function(response){});
        }
        if(tab==6){
        	$("#tab4").empty();
        	$("#tab5").empty();
        	$("#tab6").load("Directorate.action",function(response){});
        }
	});
	function checkbox(types,str) {		
		var strValue = types.split(", ");
		for(var i = 0; i < strValue.length; i++){
			var k = strValue[i];			
			namVar = "'"+str+"'";
			$(":checkbox[name="+namVar+"][value="+k+"]").prop('checked', true);
		}
	}
	checkbox("${organisation.orgSpecicalism}","organisation.orgSpecicalism");
	checkbox("${organisation.servicePerCirCap}","organisation.servicePerCirCap");
	checkbox("${organisation.serviceDisCap}","organisation.serviceDisCap");
	checkbox("${organisation.serviceEthCap}","organisation.serviceEthCap");
	checkbox("${organisation.serviceBarCap}","organisation.serviceBarCap");
	checkbox("${organisation.accreditation}","organisation.accreditation");
	checkbox("${organisation.serviceBenCap}","organisation.serviceBenCap");
	checkbox("${organisation.eoiprogramme}","organisation.eoiprogramme");
	checkbox("${organisation.eoiservice}","organisation.eoiservice");
	
	
	
	$("#expressionOfInterest").click(function(){
		// Enable the third tab and navigate automatically
		$("#myOrganisationDetailstabs").tabs("enable", 2);
		$("#myOrganisationDetailstabs").tabs("select", 2);
	});
	
	$("#backBtn").click(function(){
		window.history.back();
	});
	
	$("#saveBtn").click(function(){
		var mode = "${mode}";
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
		// Get json		
		// if update
		if(mode == 'add'){				
			$.getJSON("saveOrganisation.action?" + query,
				function(data) {
					// Do nothing
				}
			);
		}
		else {				
			$.getJSON("updateOrganisation.action?" + query,
					function(data) {
						// Do nothing
					}
				);
		}
	});

	function checkMode(){
	
		var mode = "${mode}";
		if(mode == 'amend') {
			$("#myOrganisationDetailstabs").tabs("option", "disabled", [2]);
		}
		else if(mode == 'add') {
			$("#myOrganisationDetailstabs").tabs("option", "disabled", [2,3,4,5,6]);
		}
	}	
	// MUST use ready event for tabby because of tabby is so heavy !
	$("#myOrganisationDetailstabs").ready(function(){
		checkMode();
		/* Load data into tab 5 and send filterOrgId now ! */
		$("#tab5").load("SupportingMaterial.action?filterOrgId=" + $("#orgId").val(), function(){});
	});
	
	/*
	 * Dialog events
	 */
		
	/* Lead contact lookup event */
	$("#leadContact_lookupBtn").click(function(){
		$("#listDialogContent").load("Contact.action",
			function(response){ // Function execute after load complete
				/* Dialog None button */
				$("#noneBtn").click(function(){
					$(":input[name*='organisation.contact.contactId']").val("");
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
					$( "#listDialog" ).dialog( "close" );
				});
				/* Dialog Close button */
				$("#closeBtn").click(function(){
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
					$( "#listDialog" ).dialog( "close" );
				});
				/* Dialog Select button */
				$("#selectBtn").click(function(){
					var selectedId = $(":input[name*='gridSelectedRow']").val();
					$(":input[name*='organisation.contact.contactId']").val(selectedId);
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
					$( "#listDialog" ).dialog( "close" );
				});
			}
		);
		/* Hide dialog close button */
		$( "#listDialog" ).dialog({
			closeOnEscape: false,
			open: function(event, ui) { $(".ui-dialog-titlebar-close").hide(); }
		});
		/* Open lookup dialog */
		$( "#listDialog" ).dialog( "open" );
	}); // End of leadContact_lookupBtn
	
	/* TypeOfBusiness lookup event */
	$("#typeOfBusiness_lookupBtn").click(function(){
		$("#listDialogContent").load("TypeOfBusiness.action",
			function(response){ // Function execute after load complete
				/* Dialog None button */
				$("#noneBtn").click(function(){
					$(":input[name*='organisation.typeOfBusiness.typeOfBusinessId']").val("");
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
					var selectedId = $(":input[name*='gridSelectedRow']").val();
					$(":input[name*='organisation.typeOfBusiness.typeOfBusinessId']").val(selectedId);
					$(":input[name*='organisation.typeOfBusiness.sicCode']").val($(":input[name*='sicCode']").val());
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
			}
		);
		/* Hide dialog close button */
		$( "#listDialog" ).dialog({
			closeOnEscape: false,
			open: function(event, ui) { $(".ui-dialog-titlebar-close").hide(); }
		});
		/* Open lookup dialog */
		$( "#listDialog" ).dialog( "open" );
	}); // End of typeOfBusiness_lookupBtn
	
	
	/* sicCode lookup event */
	$("#postCode_lookupBtn").click(function(){
		$("#listDialogContent").load("Address.action",
			function(response){ // Function execute after load complete
				/* Dialog None button */
				$("#noneBtn").click(function(){
					$(":input[name*='postCode']").val("");
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
					var selectedId = $(":input[name*='gridSelectedRow']").val();
					$(":input[name*='postCode']").val(selectedId);
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
			}
		);
		/* Hide dialog close button */
		$( "#listDialog" ).dialog({
			closeOnEscape: false,
			open: function(event, ui) { $(".ui-dialog-titlebar-close").hide(); }
		});
		/* Open lookup dialog */
		$( "#listDialog" ).dialog( "open" );
	}); // End of postCode_lookupBtn
});
</script>


<title>Organisation Details</title>

<!-- Section Title -->
<content tag="sectionTitle">Organisation Details</content>

<sj:tabbedpanel 
	id="myOrganisationDetailstabs" 
	selectedTab="0" 
	cssClass="wwFormTable"
	spinner="Please wait..."
	onChangeTopics="onTabChange"
>   
	<sj:tab id="details1" target="tab1" label="Details1"/>
    <sj:tab id="details2" target="tab2" label="Details2"/>
    <sj:tab id="details3" target="tab3" label="Details3"/>   
    <sj:tab id="details4" target="tab4" label="Details4"/>
    <sj:tab id="details5" target="tab5" label="Details5"/>
    <sj:tab id="details6" target="tab6" label="BU/Directorates"/>
    
    <div id="tab1">
    	<s:form cssClass="xdev-form">
    	 	<s:hidden name="organisation.organisationId" id="orgId" />
			<s:textfield name="organisation.name" label="Organisation Name" required="true"/>
			<s:checkbox name="organisation.preferredOrg" label="Preferred Organisation" labelposition="left" />
			<s:textarea name="organisation.shortDesc" label="Organisation Short Description" required="true"/>
			<s:checkbox id="organisation.expOfInterest" name="expressionOfInterest" label="Expression Of Interest" labelposition="left" />
			<xdev:textLookup name="organisation.contact.contactId" id="leadContact" label="Lead Contact" />
			<xdev:textLookup name="organisation.typeOfBusiness.typeOfBusinessId" id="typeOfBusiness" label="Type of business" />
			<s:textfield name="organisation.addr1" label="Address Line 1" />			
			<s:textfield name="organisation.typeOfBusiness.sicCode" label="SIC code" id="code" readonly="true"> </s:textfield>	
			<s:textfield name="organisation.addr2" label="Address Line 2" />
			<s:textarea name="organisation.fullDesc" label="Organisation Full Description" />
			<s:textfield name="organisation.addr3" label="Address Line 3" />
			<s:textfield name="organisation.phoneNumber" label="Phone Number" required="true" />
			<xdev:textLookup name="organisation.postCode" id="postCode" label="Post Code" required="true" />
			<s:textfield name="organisation.fax" label="Fax" />
			<s:textfield name="organisation.city" label="City/Town" />
			<s:textfield name="organisation.email" label="Email" />
			<%--  <s:select name="organisation.county.countyId" label="County" /> --%>
			<s:textfield name="organisation.webAddr" label="Web Address" />
			
			<s:textfield name="organisation.charityNumber" label="Charity Number" />
			<s:textfield name="organisation.companyNumber" label="Company Number" />		
		</s:form>
    </div>
    
    <div id="tab2">
		<s:form cssClass="xdev-form" >
			<s:checkboxlist 
				label="Organisation Specicalism" 
				name="organisation.orgSpecicalism"
				list="listOrgSpecicalism"
	            listKey="referenceDataId"
	            listValue="type"
            />
            <s:checkboxlist 
				label="Service Persional Circumstances Capabilities" 
				name="organisation.servicePerCirCap"
				list="listServicePerCirCap"
	            listKey="referenceDataId"
	            listValue="type"
            />
            <s:checkboxlist 
				label="Service Disablities Capabilities" 
				name="organisation.serviceDisCap"
				list="listServiceDisCap"
	            listKey="referenceDataId"
	            listValue="type"
            />
            <s:checkboxlist 
				label="Service Ethnicity Capabilities" 
				name="organisation.serviceEthCap"
				list="listServiceEthCap"
	            listKey="referenceDataId"
	            listValue="type"
            />
            <s:checkboxlist 
				label="Service Barriers Capabilities" 
				name="organisation.serviceBarCap"
				list="listServiceBarCap"
	            listKey="referenceDataId"
	            listValue="type"
            />
            <s:checkboxlist 
				label="Accreditation" 
				name="organisation.accreditation"
				list="listAccreditation"
	            listKey="referenceDataId"
	            listValue="type"
            />
            <s:checkboxlist 
				label="Service Benefits Capabilites" 
				name="organisation.serviceBenCap"
				list="listServiceBenCap"
	            listKey="referenceDataId"
	            listValue="type"
            />
		</s:form>  
    </div>
    
    <div id="tab3">
		<s:form cssClass="xdev-form">
			 <s:checkboxlist 
					label="EOI Programmes" 
					name="organisation.eoiprogramme"
					list="listEoiprogramme"
		            listKey="referenceDataId"
		            listValue="type"
	            />
	        <s:checkboxlist 
				label="EOI Services" 
				name="organisation.eoiservice"
				list="listEoiservice"
	            listKey="referenceDataId"
	            listValue="type"
	          />
						
		</s:form>  
    </div>   
    <div id="tab4"></div>
    <div id="tab5"></div> 
    <div id="tab6"></div>      

    
</sj:tabbedpanel> 
 
<!-- Lookup Dialog -->
<sj:dialog 
   	id="listDialog" 
   	autoOpen="false" 
   	modal="true" 
   	width="965"
   	height="650"
>
	<div id="listDialogContent"></div>
</sj:dialog>
