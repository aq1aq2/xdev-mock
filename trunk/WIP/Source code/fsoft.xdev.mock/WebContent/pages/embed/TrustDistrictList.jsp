<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Trust Region</title>


<script>
	$(document).ready(function(){
		/* Filter click event */
		var filterKey = "";
		var filterActive = false;
		
		function sendFilterOptions() {
			query = "filterKey="+filterKey;
			query += '&';
			query += "filterActive="+filterActive;
			$.getJSON("listTrustDistrict.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid',[{page:1}]);
			});
		}
		
		$("ul#xdev-filter > li").click(function(){
			filterKey = this.textContent;
			sendFilterOptions();
		});
		
		
		$("#createBtn").click(function(){			
			window.location.href="executeTrustDistrict.action";
		});
		
		$.subscribe("rowSelect", function(event, data) {	       
	        // Get id of the record
	        var grid = event.originalEvent.grid;
	        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
	        var id = grid.jqGrid('getCell', selectedRowId, 'trustDistrictId');
	        // call detail action 
	        query="trustDistrict.trustDistrictId="+id;
	        window.location.href = "detailTrustDistrict.action?" + query;
	        
		});
		$("#includeChkBx").click(function(){
			// Test
			filterActive = $(this).is(":checked");		
			sendFilterOptions();
		});

		
	});
</script>


<!-- body -->	
<s:url id="listTrustDistrict" action="listTrustDistrict.action"></s:url>
<sjg:grid
	id="gridtable"
	dataType="json"
	href="%{listTrustDistrict}"
	gridModel="listModel"
	width="929"
	pager="true"
	rowNum="15"
	rownumbers="true"
	onSelectRowTopics="rowSelect"
>
	<sjg:gridColumn name="trustDistrictId" index="trustDistrictId" title="ID" hidden="true"/>
	<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	<sjg:gridColumn name="description" index="description" title="Descripstion" sortable="false"/>
	<sjg:gridColumn name="trustRegionName" index="trustRegionName" title="Region Name" sortable="true"/>
	<sjg:gridColumn name="status" index="status" title="IsActived" sortable="true"/>	        
</sjg:grid>    

