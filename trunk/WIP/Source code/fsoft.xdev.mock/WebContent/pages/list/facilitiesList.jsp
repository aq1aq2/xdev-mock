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
        var facilityId = grid.jqGrid('getCell', selectedRowId, 'facilityId');

        //call detail action
        query = "facility.facilityId=" + facilityId;
        query += '&';
        query += "mode =" + facilityId;
        window.location.href = "detailFacilities.action?" + query;
});
	
});

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
	        <sjg:gridColumn name="status" index="status" title="Is Active" sortable="false"/>
	    </sjg:grid>
	    
	</s:form>
	