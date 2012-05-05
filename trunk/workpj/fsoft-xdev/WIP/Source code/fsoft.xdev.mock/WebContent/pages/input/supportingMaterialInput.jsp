<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
	$(document).ready(function(){
		
		/* Check if create new or amend */
		if ("${entity}" == "") {
			// Get current login user
			$(":input[name*='entity.account.userName']").val("${sessionScope.userName}");
		}
		
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
			$.getJSON("saveSupportingMaterial.action?" + query,
				function(data) {
					alert("Save successful");
				}
			);
		});
	});
</script>

<title>Supporting Material Input</title>

<!-- Section Title -->
<content tag="sectionTitle">Supporting Material Input</content>

<!-- Tabbed Panel -->
<sj:tabbedpanel id="tabs">	
	<sj:tab id="tab1" target="details1" label="Details 1"/>
	
		<div id="details1" >
			<s:form cssClass="xdev-form" >
				<s:textfield name="entity.url" label="URL" required="true" />
				<s:textfield name="entity.account.userName" label="Added By" readonly="true"/>
				<s:textarea name="entity.description" label="Description" />
				<sj:datepicker name="entity.addedDate" label="Added Date" value="today" readonly="true" />
				<s:select name="entity.type" label="Type" list="#{'Doc':'Doc', 'PDF':'PDF', 'Excel':'Excel'}" />
			</s:form>
		</div>
		
</sj:tabbedpanel>