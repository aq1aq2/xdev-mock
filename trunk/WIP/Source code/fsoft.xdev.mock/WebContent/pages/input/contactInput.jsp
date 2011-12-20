<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
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
			// Get json
			$.getJSON("saveContact.action?" + query,
				function(data) {
					// Do nothing
				}
			);
		});
		
		/*
		 * Dialog events
		 */
		
		/* Manager lookup event */
		$("#managerName_lookupBtn").click(function(){
			
			$("#listDialogContent").load("../lookup/contactList.jsp",
				function(response){ // Function execute after load complete
					/* Dialog None button */
					$("#noneBtn").click(function(){
						$(":input[name*='contact.managerId']").val("");
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
						var managerId = $(":input[name*='gridSelectedRow']").val();
						$(":input[name*='contact.managerId']").val(managerId);
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

<title>Contact Input</title>

<!-- Section Title -->
<content tag="sectionTitle">Contact Input</content>

<!-- Tabbed Panel -->
<sj:tabbedpanel id="tabs">
	<sj:tab id="tab1" target="details1" label="Details 1"/>
			
	<div id="details1" >
		<s:form cssClass="xdev-form">
			<s:textfield name="contact.firstName" label="Frist Name" required="true"/>
			<s:textfield name="contact.surName" label="Surname" required="true"/>
			<s:textfield name="contact.knowAs" label="Know As" />
			<s:textfield name="contact.officePhone" label="Office Phone" />
			<s:textfield name="contact.mobilePhone" label="Mobile Phone" />
			<s:textfield name="contact.homePhone" label="ST Home Phone" />
			<s:textfield name="contact.emailAddress" label="Email Address" />
			<xdev:textLookup name="contact.managerId" label="Manager ID" disabled="true"/>
			<s:select name="contact.referenceDataByContactType.referenceDataId" label="Contact Type" list="{}" required="true"/>
			<s:select name="bestContactMethod" label="Best Contact Method" list="{}" />
		</s:form>
	</div>
	
</sj:tabbedpanel>

<!-- Contact Lookup Dialog -->
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

