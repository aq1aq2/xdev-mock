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
			$.getJSON("listTrustRegion.action?" + query,
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
		
		$("#createBtn").click(function(){			
			window.location.href="executeTrustRegion.action";
		});
		
		$.subscribe("rowSelect", function(event, data) {	       
	        // Get id of the record
	        var grid = event.originalEvent.grid;
	        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
	        var id = grid.jqGrid('getCell', selectedRowId, 'trustRegionId');
	        // call detail action 
	        query="trustRegion.trustRegionId="+id;
	        window.location.href = "detailTrustRegion.action?" + query;
	        
		});
	});
</script>
<!-- body -->	
		
		<s:url id="listTrustRegion" action="listTrustRegion.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listTrustRegion}"
	        gridModel="listModel"
	        autowidth="true"
	        pager="true"
	        rowNum="15"
       		rownumbers="true"
       		onSelectRowTopics="rowSelect"
	        
	    >
	    	<sjg:gridColumn name="trustRegionId" index="trustRegionId" title="ID" hidden="true"/>
	        <sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	        <sjg:gridColumn name="description" index="description" title="Descripstion" sortable="false"/>
	        <sjg:gridColumn name="countryName" index="countryName" title="Nation/country" sortable="true"/>
	        <sjg:gridColumn name="status" index="status" title="IsActived" sortable="true" formatter="checkbox"/>	        
	    </sjg:grid>    
  

