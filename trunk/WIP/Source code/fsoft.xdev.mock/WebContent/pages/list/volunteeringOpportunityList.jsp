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
$(document).ready(function(){
	/* Filter click event */
	var filterKey = "";
	var filterActive = false;
	
	function sendFilterOptions() {
		query = "filterKey="+filterKey;
		query += '&';
		query += "filterActive="+filterActive;
		$.getJSON("listVolunteeringOpportunity.action?" + query,
			function(data) {
				$('#gridtable').trigger('reloadGrid');
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
		window.location.href = "detailVolunteeringOpportunity?mode = -1";
	});
	
	// click a row in grid
	$.subscribe('rowselect', function(event, data) {
        alert('Selected Row : ' + event.originalEvent.id);
        
        // Get id of the record
        var grid = event.originalEvent.grid;
        var selectedRowId = grid.jqGrid('getGridParam', 'selrow');
        var volunteerId = grid.jqGrid('getCell', selectedRowId, 'volunteerId');

        //call detail action
        query = "volunteer.volunteerId=" + volunteerId;
        query += '&';
        query += "mode =" + volunteerId;
        window.location.href = "detailVolunteeringOpportunity.action?" + query;
       	
	});
	
});
</script>


<!-- body -->

	<s:form name="volunteeringOpportunity">
		<s:url id="volunteeringOpportunityList" action="listVolunteeringOpportunity"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{volunteeringOpportunityList}"
	        gridModel="listVolunteer"
	        autowidth="true"
	        pager="true"
	        rowNum="3"
	        rownumbers="true"
	        navigator="true"
	        onSelectRowTopics="rowselect"
	        >	        
			<sjg:gridColumn name="volunteerId" index="volunteerId" title="ID" hidden="true"/>
	        <sjg:gridColumn name="contactName" index="contactName" title="Contacts" sortable="true" formatter="formatLink"/>
	        <sjg:gridColumn name="volunteerPurpose" index="volunteerPurpose" title="Purpose" sortable="false"/>
	        <sjg:gridColumn name="startDate" index="startDate" title="Start Date" sortable="false"/>
	        <sjg:gridColumn name="endDate" index="endDate" title="End Date" sortable="false"/>
	        <sjg:gridColumn name="status" index="status" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</s:form>