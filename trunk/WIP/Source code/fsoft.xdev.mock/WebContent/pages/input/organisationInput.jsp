<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<script>

$(document).ready(function(){
	$("#expressionOfInterest").click(function(){
		// Enable the third tab and navigate automatically
		$("#myOrganisationDetailstabs").tabs("enable", 2);
		$("#myOrganisationDetailstabs").tabs("select", 2);
	});
	
	$("#backBtn").click(function(){
		window.history.back();
	});
	
	$("#saveBtn").click(function(){
		alert("Comming soon !");
	});

	function checkMode(){
	
		var mode = "${mode}";
		if(mode == 'amend') {
			$("#myOrganisationDetailstabs").tabs("option", "disabled", [2,3]);
		}
		else if(mode == 'add') {
			$("#myOrganisationDetailstabs").tabs("option", "disabled", [2,3,4,5]);
		}
	}
	
	/*
	 * On Tab change
	 */
	 
	$.subscribe('onTabChange', function(event, data) {
		/* Check create or amend mode */
		//checkMode();
		/* Load properly page into tab */
		var tab = event.originalEvent.ui.index+1;
		if (tab==5) {
			$("#tab5").load("SupportingMaterial.action?filterOrgId=" + $("#orgId").val(), function(response){});
		}
	});
	
	// MUST use ready event for tabby because of tabby is so heavy !
// 	$("#myOrganisationDetailstabs").ready(function(){
// 		checkMode();
// 		/* Load data into tab 5 and send filterOrgId now ! */
// 		$("#tab5").load("SupportingMaterial.action?filterOrgId=" + $("#orgId").val(), function(){});
// 	});
	
	/*
	 * Dialog events
	 */
		
	/* Lead contact lookup event */
	$("#leadContact_lookupBtn").click(function(){
		$("#listDialogContent").load("Contact.action",
			function(response){ // Function execute after load complete
				/* Dialog None button */
				$("#noneBtn").click(function(){
					$(":input[name*='leadContact']").val("");
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
					$(":input[name*='leadContact']").val(selectedId);
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
					$(":input[name*='typeOfBusiness']").val("");
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
					$(":input[name*='typeOfBusiness']").val(selectedId);
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
	$("#sicCode_lookupBtn").click(function(){
		$("#listDialogContent").load("TypeOfBusiness.action",
			function(response){ // Function execute after load complete
				/* Dialog None button */
				$("#noneBtn").click(function(){
					$(":input[name*='sicCode']").val("");
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
					$(":input[name*='sicCode']").val(selectedId);
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
	}); // End of sicCode_lookupBtn
	
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
    <sj:tab id="bu" target="bu" label="BU/Directorates"/>
    
    <s:hidden name="organisation.organisationId" id="orgId" />
    
    <div id="tab1">
    	<s:form cssClass="xdev-form">
			<s:textfield name="organisationName" label="Organisation Name" required="true"/>
			<s:checkbox name="preferredOrganisation" label="Preferred Organisation" labelposition="left" />
			<s:textarea name="OrganisationDesc" label="Organisation Short Description" required="true"/>
			<s:checkbox id="expressionOfInterest" name="expressionOfInterest" label="Expression Of Interest" labelposition="left" />
			<xdev:textLookup name="leadContact" id="leadContact" label="Lead Contact" />
			<xdev:textLookup name="typeOfBusiness" id="typeOfBusiness" label="Type of business" />
			<s:textfield name="addr1" label="Address Line 1" />
			<xdev:textLookup name="sicCode" id="sicCode" label="SIC Code" />
			<s:textfield name="addr2" label="Address Line 2" />
			<s:textarea name="organisationFullDesc" label="Organisation Full Description" />
			<s:textfield name="addr3" label="Address Line 3" />
			<s:textfield name="phoneNumber" label="Phone Number" required="true" />
			<xdev:textLookup name="postCode" id="postCode" label="Post Code" required="true" />
			<s:textfield name="fax" label="Fax" />
			<s:textfield name="city_town" label="City/Town" />
			<s:textfield name="email" label="Email" />
			<s:textfield name="county" label="County" />
			<s:textfield name="webAddr" label="Web Address" />
			<s:select name="nation_country" label="Nation/Country" list="{}" />
			<s:textfield name="charityNumber" label="Charity Number" />
			<s:textfield name="companyNumber" label="Company Number" />		
		</s:form>
    </div>
    
    <div id="tab2">
		<s:form cssClass="xdev-form" >
			<s:checkboxlist 
				label="Organisation Specicalism" 
				name="organisation.listOrgSpecicalism"
				list="listOrgSpecicalism"
	            listKey="referenceDataId"
	            listValue="type"
            />
		</s:form>  
    </div>
    
    <div id="tab3">
		<s:form cssClass="xdev-form">
			EOI Programmes
			EOI Services
		</s:form>  
    </div>
    
    <div id="tab4"></div>
    <div id="tab5"></div>
    <div id="bu"></div>
    
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
