<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Government Office Region</title>
<content tag="sectionTitle">Government Office Region List</content>

<script>
	$(document).ready(function(){
		/* hide button create */
		$('#createBtn').hide();
		
		/* Filter click event */
		var filterKey = "";
		var filterActive = false;
		
		function sendFilterOptions() {
			query = "filterKey="+filterKey;
			query += '&';
			query += "filterActive="+filterActive;
			$.getJSON("listGovOfficeRegion.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid',[{page:1}]);
			});
		}
		
		$("ul#xdev-filter > li").click(function(){
			filterKey = this.textContent;
			sendFilterOptions();
		});		
		$.subscribe("rowSelect", function(event, data) {	       
	        // Get id of the record
	        var grid = event.originalEvent.grid;
	        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
	        var id = grid.jqGrid('getCell', selectedRowId, 'govOfficeRegionId');
	        // call detail action 
	        query="govOfficeRegion.govOfficeRegionId="+id;
	        window.location.href = "detailGovOfficeRegion.action?" + query;
	        
		});
		$("#includeChkBx").click(function(){
			// Test
			filterActive = $(this).is(":checked");			
			sendFilterOptions();
		});

	});
</script>


<!-- body -->

<s:url id="listGovOfficeRegion" action="listGovOfficeRegion.action"></s:url>
<sjg:grid
	id="gridtable"
	dataType="json"
	href="%{listGovOfficeRegion}"
	gridModel="listModel"
	autowidth="true"
	pager="true"
	rowNum="15"
	rownumbers="true"
	onSelectRowTopics="rowSelect"
>
	<sjg:gridColumn name="govOfficeRegionId" index="govOfficeRegionId" title="ID" hidden="true"/>
	<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	<sjg:gridColumn name="description" index="description" title="Descripstion" sortable="false"/>
	<sjg:gridColumn name="countyName" index="countryName" title="County" sortable="true"/>
	<sjg:gridColumn name="status" index="status" title="IsActived" sortable="true"/>	        
</sjg:grid>    
  

