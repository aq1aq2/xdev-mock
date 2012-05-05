<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<title>Team</title>	
<!-- body -->
<content tag="sectionTitle">Team Detail</content>
<script>
	$(document).ready(function(){		
		/* Save event */
		var mode = $('#mode').val();
		
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
			// Get json		
			// if update
			if(mode == 'true'){				
				$.getJSON("addTeam.action?" + query,
					function(data) {
						// Do nothing
					}
				);
			}
			else {				
				$.getJSON("editTeam.action?" + query,
						function(data) {
							// Do nothing
						}
					);
			}
		});	
		$("#backBtn").click(function(){
			window.history.back();
			
		});	
		
		
		/* Lead contact lookup event */
		$("#leadContactId_lookupBtn").click(function(){
			$("#listDialogContent").load("Contact.action",
				function(response){ // Function execute after load complete
					/* Dialog None button */
					$("#noneBtn").click(function(){
						$(":input[name*='team.contact.contactId']").val("");
						$( "#listDialog" ).dialog( "close" );		
					
						$("#listDialogContent").empty();
					});
					/* Dialog Close button */
					$("#closeBtn").click(function(){
						$( "#listDialog" ).dialog( "close" );						
						
						$("#listDialogContent").empty();
					});
					/* Dialog Select button */
					$("#selectBtn").click(function(){
						var selectedId = $(":input[name*='gridSelectedRow']").val();
						$(":input[name*='team.contact.contactId']").val(selectedId);
						$( "#listDialog" ).dialog( "close" );						
						
						$("#listDialogContent").empty();
					});
				}
			);
			/* Open lookup dialog */
			$( "#listDialog" ).dialog( "open" );
		}); // End of leadContact_lookupBtn	
	
		/* Lead type of business lookup event */
		$("#typeOfBusinessId_lookupBtn").click(function(){
			$("#listDialogContent").load("TypeOfBusiness.action",
				function(response){ // Function execute after load complete
					/* Dialog None button */
					$("#noneBtn").click(function(){
						$(":input[name*='team.typeOfBusiness.typeOfBusinessId']").val("");
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
						var sicCode = $(":input[name*='sicCode']").val();						
						$(":input[name*='team.typeOfBusiness.typeOfBusinessId']").val(selectedId);
						$(":input[name*='code']").val(sicCode);
						$( "#listDialog" ).dialog( "close" );
						
						// Clear dialog content to ensure no confict with other lookup
						$("#listDialogContent").empty();
							
					});
				}
			);
			/* Open lookup dialog */
			$( "#listDialog" ).dialog( "open" );
		}); // End of type of business_lookupBtn	
		
		/* Lead address lookup event */
		$("#postCode_lookupBtn").click(function(){
			$("#listDialogContent").load("Address.action",
				function(response){ // Function execute after load complete
					/* Dialog None button */
					$("#noneBtn").click(function(){
						$(":input[name*='team.postCode']").val("");
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
						var postCode = $(":input[name*='postCodeLookup']").val();						
						$(":input[name*='postCode']").val(postCode);
						$( "#listDialog" ).dialog( "close" );
						
						// Clear dialog content to ensure no confict with other lookup
						$("#listDialogContent").empty();
							
					});
				}
			);
			/* Open lookup dialog */
			$( "#listDialog" ).dialog( "open" );
		}); // End of address_lookupBtn	
		
		$('input:radio').change(
                function(){                    
                    $("input:radio").removeAttr("checked");
                    $(this).prop('checked', true);
                    var typeOfCopy = $("input[@name='typeOfCopy']:checked").val();
                    if(typeOfCopy == 1){                    	
                    	$(":input[name*='team.addr1']").val($(":input[name*='team.organisation.addr1']").val());
                    	$(":input[name*='team.addr2']").val($(":input[name*='team.organisation.addr2']").val());
                    	$(":input[name*='team.addr3']").val($(":input[name*='team.organisation.addr3']").val());
                    }
                    else{
                    	$(":input[name*='team.addr1']").val($(":input[name*='team.department.addr1']").val());
                    	$(":input[name*='team.addr2']").val($(":input[name*='team.department.addr2']").val());
                    	$(":input[name*='team.addr3']").val($(":input[name*='team.department.addr3']").val());
                    }
                }
            );  
	});
</script>

<!-- Tabbed Panel -->
<sj:tabbedpanel id="tabs">	
	<sj:tab id="tab1" target="details1" label="Details"/>	
		<div id="details1" >
			<s:form cssClass="xdev-form" id="team">										
				<s:textfield name ="team.name" label="Team Name" required="true"></s:textfield>
			 	<xdev:textLookup label="Type of Business" name="team.typeOfBusiness.typeOfBusinessId" id="typeOfBusinessId" readonly="true"/>
				
				<s:textarea name="team.shortDesc" label="Team short Description"></s:textarea>	
				<s:textfield name="team.typeOfBusiness.sicCode" label="SIC code" id="code" readonly="true"> </s:textfield>				
				<s:textarea name="team.fullDesc" label="Team full description"></s:textarea>
				<xdev:textLookup label="Lead Contact" name="team.contact.contactId" id="leadContactId" readonly="true"/>				
				<s:radio label="Copy address from " name ="typeOfCopy" id="typeOfCopy" list="#{'1':'Organisation','2':'Parent'}"></s:radio>
							
				<s:textfield name="team.addr1" label="Address Line 1"></s:textfield>
				<s:textfield name="team.phoneNumber" label="Phone number"></s:textfield>
				<s:textfield name="team.addr2" label="Address Line 2"></s:textfield>
				<s:textfield name="team.fax" label="Fax"></s:textfield>
				<s:textfield name="team.addr3" label="Address Line 3"></s:textfield>	
				<s:textfield name="team.email" label="Email"></s:textfield>
				<xdev:textLookup label="Post code" name="team.postCode" id="postCode" readonly="true"/>
				<s:textfield name="team.webAddr" label="Web Address"></s:textfield>
				<s:textfield name="team.town" label="Town/Village/City"></s:textfield>
				<s:select name ="team.county.countyId" list="listCounty" listKey="countyId" listValue="name" key="countyId"></s:select>	
				<s:hidden id="mode" name ="mode"/>			
				<s:hidden name ="team.teamId"/>
				<s:hidden name ="team.status"/>		
				<s:hidden name ="team.organisation.addr1"></s:hidden>
				<s:hidden name ="team.organisation.addr2"></s:hidden>	
				<s:hidden name ="team.organisation.addr3"></s:hidden>
				<s:hidden name ="team.department.addr1"></s:hidden>
				<s:hidden name ="team.department.addr2"></s:hidden>	
				<s:hidden name ="team.department.addr3"></s:hidden>			
			</s:form>
		</div>
	
</sj:tabbedpanel>

<!-- Contact Lookup Dialog -->
<sj:dialog 
   	id="listDialog" 
   	autoOpen="false" 
   	modal="true"   	
   	width="965"
   	height="650"
>
	<div id="listDialogContent"></div>
</sj:dialog>