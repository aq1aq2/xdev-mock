<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title> Volunteer Input</title>
<<script type="text/javascript">
	
$(document).ready(function(){

	
	// select event
//		$("#FacilityType").change(function(){
			//alert('vao day khong');
//				if ($(this).val().type == 'Room'){
				
				//alert($(this).val());
//					$("#roomCapacity").attr("disabled", "true");
//					$("#roomSize").attr("disabled", "true");
//					$("#roomEquipmentNotes").attr("disabled", "true");
//					$("#roomConnectivity").attr("disabled", "true");
//					$("#equipmentAvailable").attr("disabled", "true");
				
//				}
//				else if($(this).val().type == 'Internet Access') {
				
//					$("#connectivityType").attr("disabled", "false");
//				}
//				else {
//					$("#connectivityType").removeAttr("disabled");
//				}
//	});
	
	
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
		
		//formate datepicker
		//var date = $("#startDate").val();
		var date = $("#startDate").datepicker('getDate');
		//alert(date);
		//var date = ($("#startDate").datepicker({dateFormat: 'yy-mm-dd'})).val();
		//$("#startDate").datepicker({dateFormat: 'yy-mm-dd'});
		//$("#startDate").datepicker("option","dateFormat",$(this).val());
		//var startDate =$("#startDate").datepicker("option","dateFormat");
		//var startDate = $("#startDate").val($("#startDate").formatDate('yy-mm-dd',date));
		$("#startDate").datepicker("option","dateFormat",$(this).val())
		var startDate = $("#startDate").val();
		alert(startDate);
		
		$("#startDate").datepicker({dateFormat: 'yy-mm-dd'});
		//$("#endDate").datepicker({dateFormat: 'yy-mm-dd'});
		var startDate = $("#startDate").datepicker("option","dateFormat",date);
		//var endDate = $("#endDate").datepicker("option","dateFormat");
		query += '&';
		query += "volunteer.startDate = " + startDate;
		query += '&';
		query += "volunteer.endDate = " + endDate;
		
		
		//send action save
		window.location.href = "saveVolunteeringOpportunity.action?" + query;
	});
	
	
	/*
	 * Dialog events
	 */
	
	/* Lead contact lookup event */
	$("#volunteerContact_lookupBtn").click(function(){
		$("#listDialogContent").load("../lookup/contactList.jsp",
			function(response){ // Function execute after load complete
				/* Dialog None button */
				$("#noneBtn").click(function(){
					//$(":input[name*='contact.managerId']").val("");
					
					$("#volunteerContact").val("");
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
					var volunteerContact = $(":input[name*='gridSelectedRow']").val();
					//$(":input[name*='contact.managerId']").val(managerId);
						$("#volunteerContact").val(volunteerContact);
					$( "#listDialog" ).dialog( "close" );
					
					// Clear dialog content to ensure no confict with other lookup
					$("#listDialogContent").empty();
				});
			}
		);
		
		$( "#listDialog" ).dialog( "open" );
	});
	

});

	
</script>

<!-- body -->

	<div>
		<s:form cssClass="xdev-form" name="facilitiesForm" id="facility">
			<xdev:textLookup name="volunteer.contact.contactId" id="volunteerContact" label="Volunteer Contact"/>
			<s:textfield name="volunteer.volunteerPurpose" label="Volunteer Purpose"/>
			<s:textfield name="volunteer.details" label="Volunteer Opportunity Details"/>
			<sj:datepicker id="startDate" name="volunteer.startDate" displayFormat="dd/mm/yy" label="Start Date"/>
			<sj:datepicker id="endDate" name="volunteer.endDate" displayFormat="dd/mm/yy" label="End Date"/>
			<s:textfield name="volunteer.volunteerNo" label="Volunteer Nos"></s:textfield>
		</s:form>
		
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