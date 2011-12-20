<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<script>

$(document).ready(function(){
	
	var filterKey = "";
	var filterActive = false;
	
	function sendFilterOptions() {
		query = "filterKey=" + filterKey;
		query = query + "&";
		query = query + "filterActive=" + filterActive;
		$.getJSON("listOrganisation.action?" + query, 
			function(data){
				$("#gridTable").trigger("reloadGrid", [{page:1}]);
			}
		);
	}
	
	function active() {
		query="status=true";
		$.getJSON("updateOrganisation.action?" + query, 
			function(data){
				$("#gridTable").trigger("reloadGrid", [{page:1}]);
			}
		);
	}
	
	$("ul#xdev-filter > li").click(function(){
		filterKey = this.textContent;
		alert(filterKey);
		sendFilterOptions();
	});
	
	$("#createBtn").click(function(){
		// Open two tab
		// Call file organisationInput.jsp
		var url = "../input/organisationInput.jsp?mode=add";    
		$(location).attr('href',url);
	});
	
	$.subscribe("rowSelect", function(event, data) {
        // Test
		//alert("Selected Row: " + event.originalEvent.id);
        
        // Get status of the record
        var grid = event.originalEvent.grid;
        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
        var status = grid.jqGrid('getCell', selectedRowId, 'status');
        alert(status);
        
        if(status == false) {
        	// Active this org
        	active();
        	// Reload grid
        	$("#gridTable").trigger("reloadGrid");
        }else{
	        // Open details with 5 tabs
	// 		var url = "../input/organisationInput.jsp?mode=amend";    
	// 		$(location).attr('href',url);
        }
	});
	
	$("#includeChkBx").click(function(){
		// Test
		filterActive = $(this).is(":checked");
		alert(filterActive);
		sendFilterOptions();
	});

});

</script>

<title>Organisation List</title>

<!-- Section Title -->
<content tag="sectionTitle">Organisation List</content>

<s:form>
	<s:url id="listOrganisation" action="listOrganisation.action"></s:url>
	<sjg:grid
	   	id="gridTable"
	  	dataType="json"
	  	href="%{listOrganisation}"
	    gridModel="listModel"
	    autowidth="true"
	    pager="true"
	    rowNum="2"
       	rownumbers="true"
       	onSelectRowTopics="rowSelect"
	>
		<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
		<sjg:gridColumn name="addr1" index="addr1" title="HeadOfficeAddLine1" sortable="true"/>
		<sjg:gridColumn name="postCode" index="postCode" title="PostCode" sortable="true"/>
		<sjg:gridColumn name="contactName" index="contactName" title="Contact" sortable="true"/>
		<sjg:gridColumn name="status" index="status" title="IsActive" sortable="false" formatter="checkbox"/>
	</sjg:grid>
</s:form>
