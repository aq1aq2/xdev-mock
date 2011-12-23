<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<script>

var organisationId = "N/A";

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
	
	$("ul#xdev-filter > li").click(function(){
		filterKey = this.textContent;
		alert(filterKey);
		sendFilterOptions();
	});
	
	$("#createBtn").click(function(){
		// Open two tab
		// Call file organisationInput.jsp
		alert("create new");
		var url = "detailOrganisation.action?mode=add";    
		$(location).attr('href',url);
	});
	
	$.subscribe("rowSelect", function(event, data) {
        // Test
		//alert("Selected Row: " + event.originalEvent.id);
        
        // Get status of the record
        var grid = event.originalEvent.grid;
        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
        var status = grid.jqGrid('getCell', selectedRowId, 'status');
        organisationId = grid.jqGrid('getCell', selectedRowId, 'organisationId');
        // Test before
        alert(status + " & " + organisationId);
        
        if(status == 'No') {
            // Show a popoup dialog
        	$("#confirm_dialog").dialog("open");
        }else{
            // Open details with 5 tabs
    		var url = "detailOrganisation.action?mode=amend&organisation.organisationId=" + organisationId;    
    		$(location).attr('href',url);
        }
     
	});
	
	$("#includeChkBx").click(function(){
		// Test
		filterActive = $(this).is(":checked");
		alert(filterActive);
		sendFilterOptions();
	});
});

// MUST place function used by dialog outside document.ready !!!
function chooseOkButton() {
	alert("Choose ok option dialog");
	// Active this org
	active();
	// Reload grid
	$("#gridTable").trigger("reloadGrid");
	$("#confirm_dialog").dialog("close");
}

// MUST place function used by dialog outside document.ready !!!
function chooseCancelButton() {
	alert("Choose cancel option dialog");
	$("#confirm_dialog").dialog("close");
}

function active() {
	query="organisation.organisationId=" + organisationId + "&organisation.status=true";
	$.get("updateOrganisation.action?" + query, 
		function(data){
			$("#gridTable").trigger("reloadGrid", [{page:1}]);
		}
	);
}

</script>

<title>Organisation List</title>

<!-- Section Title -->
<content tag="sectionTitle">Organisation List</content>

<s:form>
	<s:url id="listOrganisation" action="listOrganisation.action"></s:url>
	<sjg:grid
	   	id="gridTable"
	   	caption="Organisation List"
	  	dataType="json"
	  	href="%{listOrganisation}"
	    gridModel="listModel"
	    autowidth="true"
	    pager="true"
	    rowNum="2"
       	rownumbers="true"
       	onSelectRowTopics="rowSelect"
	>
		<sjg:gridColumn name="organisationId" index="organisationId" title="Id" hidden="true" />
		<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
		<sjg:gridColumn name="addr1" index="addr1" title="HeadOfficeAddLine1" sortable="true"/>
		<sjg:gridColumn name="postCode" index="postCode" title="PostCode" sortable="true"/>
		<sjg:gridColumn name="contactName" index="contactName" title="Contact" sortable="true"/>
		<sjg:gridColumn name="status" index="status" title="IsActive" sortable="false" formatter="checkbox"/>
	</sjg:grid>
</s:form>

<sj:dialog id="confirm_dialog"
		  buttons="{
                'OK':function() { chooseOkButton(); },
                'Cancel':function() { chooseCancelButton(); }
                }"
		   autoOpen="false"
		   modal="true"
		   title="Confirm..."
>
	Do you want to make this organisation active ?
</sj:dialog>
