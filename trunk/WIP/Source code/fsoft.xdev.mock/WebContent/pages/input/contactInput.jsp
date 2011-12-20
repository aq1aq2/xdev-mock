<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
	$(document).ready(function(){
		
		/* Back event */
		$("#backBtn").click(function(){
			window.history.back();
		});
		
		/*
		 * Dialog events
		 */
		
		/* Manager lookup event */
		var firstTime = true;
		$("#managerName_lookupBtn").click(function(){
			if (firstTime) {
				$("#listDialogContent").load("../lookup/contactList.jsp",
					function(response){ // Function execute after load complete
						/* Dialog None button */
						$("#noneBtn").click(function(){
							$(":input[name*='managerName']").val("");
							$( "#listDialog" ).dialog( "close" );
						});
						/* Dialog Close button */
						$("#closeBtn").click(function(){
							$( "#listDialog" ).dialog( "close" );
						});
						/* Dialog Select button */
						$("#selectBtn").click(function(){
							var managerId = $(":input[name*='gridSelectedRow']").val();
							$(":input[name*='managerName']").val(managerId);
							$( "#listDialog" ).dialog( "close" );
						});
					}
				);
				firstTime = false;
			}
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
			<s:textfield name="firstName" label="Frist Name" required="true"/>
			<s:textfield name="surname" label="Surname" required="true"/>
			<s:textfield name="knowAs" label="Know As" />
			<s:textfield name="officePhone" label="Office Phone" />
			<s:textfield name="mobilePhone" label="Mobile Phone" />
			<s:textfield name="homePhone" label="ST Home Phone" />
			<s:textfield name="emailAddress" label="Email Address" />
			<xdev:textLookup name="managerName" label="Manager Name"/>
			<s:textfield name="managerName" label="Manager Name" />
			<s:select name="contactType" label="Contact Type" list="{}" required="true"/>
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

