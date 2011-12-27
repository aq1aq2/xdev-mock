
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title>Premise</title>
<script type="text/javascript">

var premiseId = "N/A";
$(document).ready(function(){
	/* Filter click event */
	var filterKey = "";
	var filterActive = false;
	
	function sendFilterOptions() {
		query = "filterKey="+filterKey;
		query += '&';
		query += "filterActive="+filterActive;
		$.getJSON("listPremises.action?" + query,
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
	
	// click the create button
	
	$("#createBtn").click(function(){
		window.location.href = "detailPremises.action?mode=-1";
	});
	
	//rowselect event
	$.subscribe('rowselect', function(event, data) {
        
        // Get id of the record
        var grid = event.originalEvent.grid;
        var selectedRowId = grid.jqGrid('getGridParam', 'selrow');
        premiseId = grid.jqGrid('getCell', selectedRowId, 'premiseId');
        var status = grid.jqGrid('getCell', selectedRowId, 'status');
		
        if (status == 'No'){
        	//show dialog
        	$("#confirm_dialog").dialog("open");
        }
        else {
        query = "premise.premiseId=" + premiseId;
        query += '&';
        query += "mode =" + premiseId;
        //call detail action
        window.location.href = "detailPremises.action?" + query;
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
	//active function to active one in-active Premise
	function active() {
		query="premise.premiseId=" + premiseId;	
		query += '&';
    	query += "mode =" + premiseId;
		$.get("activePremises.action?" + query, 
		function(data){
			$('#gridtable').trigger('reloadGrid',[{page:1}]);
		}
	);
}
</script>
<!-- body -->
	<s:form>
		<s:url id="premiseList" action="listPremises"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{premiseList}"
	        gridModel="listPremises"
	        autowidth="true"
	        pager="true"
	        rowNum="3"
	        rownumbers="true"
	        navigator="true"
	        onSelectRowTopics="rowselect"
	        >
			<sjg:gridColumn name="premiseId" index="premiseId" title="ID" hidden="true"/>
			<sjg:gridColumn name="name" index="name" title="Premise Name" sortable="true"/>
	        <sjg:gridColumn name="locationName" index="locationName" title="Location Name" sortable="true"/>
	        <sjg:gridColumn name="addressLine1" index="addressLine1" title="Address Line1" sortable="false"/>
	        <sjg:gridColumn name="postcode" index="postcode" title="Post Code" sortable="false"/>
	        <sjg:gridColumn name="status" index="status" title="Is Active" sortable="false" formatter="checkbox"/>
	    </sjg:grid>
	</s:form>
	
	<!-- active one non active- Premises -->
	<sj:dialog id="confirm_dialog"
		  buttons="{
                'OK':function() { chooseOkButton(); },
                'Cancel':function() { chooseCancelButton(); }
                }"
		   autoOpen="false"
		   modal="true"
		   title="Confirm..."
>
	Do you want to make this Premise active ?
</sj:dialog>
