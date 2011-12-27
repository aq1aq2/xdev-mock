
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title> Facility Input</title>


<script type="text/javascript">
//<!--
	
	$(document).ready(function(){
// 		if (document.facilitiesForm.equipmentAvailable.checked ==true){
// 			document.facilitiesForm.roomEquipmentNotes.disable = false;
// 		} 
// 		else {
// 			document.facilitiesForm.roomEquipmentNotes.disable = true;
// 		}
		$("#equipmentAvailable").click(function(){
			alert("click");
			if($("#equipmentAvailable").is(":checked") == true) {
				// alert("disable textarea");
				$("#roomEquipmentNotes").attr("disabled", "true");
			}
			else {
				
				// alert("enable textarea");
				$("#roomEquipmentNotes").removeAttr("disabled");
			}
		});
		
		
		//select event
		$("#FacilityType").change(function(){
				alert('vao day khong');
				if ($("#FacilityType option:selected").text() == 'Room'){
					
					alert($(this).val());
					$("#roomCapacity").attr("disabled", "true");
					$("#roomSize").attr("disabled", "true");
					$("#roomEquipmentNotes").attr("disabled", "true");
					$("#roomConnectivity").attr("disabled", "true");
					$("#equipmentAvailable").attr("disabled", "true");
					
				}
				else if($("#FacilityType option:selected").text() == 'Internet Access') {
					
					$("#connectivityType").attr("disabled", "false");
				}
				else {
					$("#connectivityType").removeAttr("disabled");
				}
	});
		
		
	// facilityType select change event
// 		$("#FacilityType").change(function(){
// 			alert($("#FacilityType option:selected").text());
// 			alert($("#FacilityType option:selected").val());
// 		});
		
		
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
			window.location.href = "saveFacilities.action?" + query;
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
						//$(":input[name*='contact.managerId']").val("");
						
						$("#leadContact").val("");
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
						var leadContactId = $(":input[name*='gridSelectedRow']").val();
						//$(":input[name*='contact.managerId']").val(managerId);
							$("#leadContact").val(leadContactId);
						$( "#listDialog" ).dialog( "close" );
						
						// Clear dialog content to ensure no confict with other lookup
						$("#listDialogContent").empty();
					});
				}
			);
			
			$( "#listDialog" ).dialog( "open" );
		});
		
		
		//check the range of roomsize is 0-999
		
		 $("#roomSize").change(function() {
			 var data = $("#roomSize").val();
			 //get the length of data
			 var len = data.length;
			 var c=0;
			 var roomsize=0;
			 var flag=0;
			 for(var i=0;i<len;i++)
			    {
			      c=data.charAt(i).charCodeAt(0);
			      //check the input is numeric number
			      if(c <48 || c >57)
			      {
			       flag=1;
				   alert("the roomsize must be numeric number");
				   $("#roomSize").val("");
			        break;
			      }
			      else
			      {
			    	 //don't do anything
			      }
			    }
			 
			 if(flag ==0){
				 roomsize = parseInt(data);
				 if(roomsize <0 || roomsize >999){
					 alert("the range must be in 0 to 999");
					 $("#roomSize").val("");
				 }
 			 }
			 
		 });
		
	});


//-->

</script>
<!-- body -->
	<div>
	<s:form cssClass="xdev-form" name="facilitiesForm" id="facility">
			<!--  
			<s:textfield name="facility.facilityId" label="FacilityID"></s:textfield>
			-->
			<s:hidden name="facility.facilityId"></s:hidden>
			<s:select id="FacilityType" name="facility.referenceDataByFacilityType.referenceDataId" list="listFacilitiesType" label="Facility Type" listKey ="referenceDataId" listValue="type" key ="referenceDataId" required="true"></s:select>
			<xdev:textLookup name="facility.contactByContactId.contactId" id="leadContact" label="Lead Contact" />
			
			<!-- 
			<s:textfield name="contacts.firstName" label="Lead Contact"></s:textfield>
			 -->
			<s:textarea name="facility.facilityDescription" label="Facility Description" cols="12" rows="3"></s:textarea>
			<s:textfield id="roomCapacity" name="facility.roomCapacity" label="Room Capacity"></s:textfield>
			<s:checkbox  id="equipmentAvailable" name="facility.equipmentAvailable" label="Equipment Available" labelposition="left"></s:checkbox>
			<s:textfield id="roomSize" name="facility.roomSize" label="Room Size"></s:textfield>
			<s:textarea id="roomEquipmentNotes" name="facility.roomEquipmentNotes" label="Room & Equipment Notes" ></s:textarea>
			<s:checkbox id="roomConnectivity" name="facility.roomConnectivity" label="Room Connectivity" checked="true" labelposition="left"></s:checkbox>
			<s:select id="connectivityType" name="facility.referenceDataByConnectivityType.referenceDataId" list="listConnectivityType" label="Connectivity Type" listKey="referenceDataId" key="referenceDataId" listValue="type"></s:select>
			<s:textarea name="facility.wirelessAccessInfomation" label="Wireless Access Infomation" ></s:textarea>
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
	