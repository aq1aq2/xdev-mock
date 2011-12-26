<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title>Facilities</title>

<script type="text/javascript">
        function formatLink(cellvalue, options, rowObject) {
                return "<a href='detailFacilities.action?facilities.facilityId="+rowObject['facilityId']+"'>" + cellvalue + "</a>";
        }        
</script>

<script type="text/javascript">
var facilityId = "N/A";

$(document).ready(function(){
	/* Filter click event */
	var filterKey = "";
	var filterActive = false;
	function sendFilterOptions() {
		query = "filterKey="+filterKey;
		query += '&';
		query += "filterActive="+filterActive;
		$.getJSON("listFacilities.action?" + query,
			function(data) {
				$('#gridtable').trigger('reloadGrid',[{page:1}]);
		});
	}
	
	$("ul#xdev-filter > li").click(function(){
		filterKey = this.textContent;
		sendFilterOptions();
	});
	
	$("#includeChkBx").click(function(){
		filterActive = $(this).is(":checked");
		sendFilterOptions();
	});
	// click create button
	
	$("#createBtn").click(function(){
		window.location.href = "detailFacilities.action?mode = -1";
	});
	
	$.subscribe('rowselect', function(event, data) {
        alert('Selected Row : ' + event.originalEvent.id);
        // Get id of the record
        var grid = event.originalEvent.grid;
        var selectedRowId = grid.jqGrid('getGridParam', 'selrow');
        facilityId = grid.jqGrid('getCell', selectedRowId, 'facilityId');
        var status = grid.jqGrid('getCell', selectedRowId, 'status');
		//alert("Status:" + status);
        if (status == 'No'){
        	//show dialog
        	$("#confirm_dialog").dialog("open");
        }
        else {
        query = "facility.facilityId=" + facilityId;
        query += '&';
        query += "mode =" + facilityId;
     
        //call detail action
        window.location.href = "detailFacilities.action?" + query;
        }
    });
	
});


	function chooseOkButton() {		
	
		active();		
		$("#confirm_dialog").dialog("close");
	}

	function chooseCancelButton() {			
		$("#confirm_dialog").dialog("close");
	}

	function active() {
		query="facility.facilityId=" + facilityId;	
		query += '&';
        query += "mode =" + facilityId;
		$.get("activeFacilities.action?" + query, 
			function(data){
			$("#gridtable").trigger("reloadGrid", [{page:1}]);
		}
	);
}

</script>

<!-- body -->

	<s:form name="facilities">
		<s:url id="facilitiesList" action="listFacilities"></s:url>
		<sjg:grid 
	        id="gridtable"
	        dataType="json"
	        href="%{facilitiesList}"
	        gridModel="listFacilities"
	        autowidth="true"
	        pager="true"
	        rowNum="3"
	        rownumbers="true"
	        navigator="true"
	        onSelectRowTopics="rowselect"
	        >	        
			<sjg:gridColumn name="facilityId" index="facilityId" title="ID" hidden="true"/>
	        <sjg:gridColumn name="facilityType" index="facilityType" title="Facility Type" sortable="false"/>
	        <sjg:gridColumn name="description" index="description" title="Description" sortable="false"/>
	        <sjg:gridColumn name="contactName" index="contactName" title="Lead Contacts" sortable="false"/>
	        <sjg:gridColumn name="status" index="status" title="Is Active" sortable="false" formatter="checkbox"/>
	    </sjg:grid>
	    
	</s:form>
	
	<!-- active one non active- facility -->
	<sj:dialog id="confirm_dialog"
		  buttons="{
                'OK':function() { chooseOkButton(); },
                'Cancel':function() { chooseCancelButton(); }
                }"
		   autoOpen="false"
		   modal="true"
		   title="Confirm..."
>
	Do you want to make this facility active ?
</sj:dialog>
	