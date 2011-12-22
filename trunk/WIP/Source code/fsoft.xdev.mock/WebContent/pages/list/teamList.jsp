<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Trust Region</title>

<content tag="sectionTitle">Team List</content>

<script>
	$(document).ready(function(){
		/* Filter click event */
		var filterKey = "";
		var filterActive = false;
		
		function sendFilterOptions() {
			query = "filterKey="+filterKey;
			query += '&';
			query += "filterActive="+filterActive;			
			$.getJSON("listTeam.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid',[{page:1}]);
			});
		}
		
		$("ul#xdev-filter > li").click(function(){
			filterKey = this.textContent;
			sendFilterOptions();
		});
		
		
		
		$("#createBtn").click(function(){			
			window.location.href="executeTeam.action";
		});
		$("#includeChkBx").click(function(){
			// Test
			filterActive = $(this).is(":checked");		
			sendFilterOptions();
		});
		
		$.subscribe("rowSelect", function(event, data) {	       
	        // Get id of the record
	        var grid = event.originalEvent.grid;
	        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
	        var id = grid.jqGrid('getCell', selectedRowId, 'teamId');
	        // call detail action 
	        query="team.teamId="+id;
	        window.location.href = "detailTeam.action?" + query;
	        
		});
	});
</script>
<!-- body -->	
		
<s:url id="listTeam" action="listTeam.action"></s:url>
<sjg:grid
	id="gridtable"
	dataType="json"
	href="%{listTeam}"
	gridModel="listModel"
	autowidth="true"
	pager="true"
	rowNum="15"
	rownumbers="true"
	onSelectRowTopics="rowSelect"
>
	<sjg:gridColumn name="teamId" index="teamId" title="ID" hidden="true"/>
	<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	<sjg:gridColumn name="addr1" index="addr1" title="Address line 1" sortable="true"/>
	<sjg:gridColumn name="postCode" index="postCode" title="Post code" sortable="true"/>
	<sjg:gridColumn name="contactName" index="contactName" title="Contact" sortable="true"/>
	<sjg:gridColumn name="status" index="status" title="IsActived" sortable="true" formatter="checkbox"/>	        
</sjg:grid>    
  

