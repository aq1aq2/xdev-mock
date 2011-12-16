<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<script>

$(document).ready(function(){
	$("#createBtn").click(function(){
		// Open two tab
		// Call file organisationInput.jsp
		var url = "../input/organisationInput.jsp?mode=add";    
		$(location).attr('href',url);
	});
	
	$.subscribe("rowSelect", function(event, data) {
        // Test
		alert("Selected Row: " + event.originalEvent.id);
        // Open details with 5 tabs
		var url = "../input/organisationInput.jsp?mode=amend";    
		$(location).attr('href',url);
	});
	
	$("#includeChkBx").click(function(){
		// Test
		alert("select include check box");
	});

});

</script>

<title>Organisation List</title>

<!-- Section Title -->
<content tag="sectionTitle">Organisation List</content>

<s:form>
	<s:url id="organisationList_listURL" action="listOrganisation.action"></s:url>
	<sjg:grid
	   	id="organisationList_gridtable"
	  	dataType="json"
	  	href="%{organisationList_listURL}"
	    gridModel="listModel"
	    autowidth="true"
	    pager="true"
	    rowNum="15"
       	rownumbers="true"
       	onSelectRowTopics="rowSelect"
	>
		<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
		<sjg:gridColumn name="headOfficeAddLine1" index="headOfficeAddLine1" title="HeadOfficeAddLine1" sortable="true"/>
		<sjg:gridColumn name="postCode" index="postCode" title="PostCode" sortable="true"/>
		<sjg:gridColumn name="contact" index="contact" title="Contact" sortable="true"/>
		<sjg:gridColumn name="status" index="status" title="IsActive" sortable="false" formatter="checkbox"/>
	</sjg:grid>
</s:form>
