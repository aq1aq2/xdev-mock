<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<title>Supporting Material List</title>

<!-- Section Title -->
<content tag="sectionTitle">Supporting Material List</content>

<script>
	$(document).ready(function(){
		alert("${orgId}");
		$("#xdev-filter").empty(); // Material list don't have filter keys.
		/* -------------------
		 * Filter click events 
		 */
		var filterOrgId = $('#orgId').val();
		var filterActive = false;
		
		function sendFilterOptions() {
			query = "filterActive="+filterActive;
			query += "&filterOrgId="+filterOrgId;
			$.getJSON("listSupportingMaterial.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid', [{page:1}]);
			});
		}
		
		$("#includeChkBx").click(function(){
			filterActive = $(this).is(":checked");
			sendFilterOptions();
		});
		
		/* -------------
		 * Button events
		 */
		 
		/* Create */
		$("#createBtn").click(function(){
			window.location.href = "inputSupportingMaterial.action";
		});
		
		/* -----------
		 * Grid events
		 */
		$.subscribe("onRowSelected", 
			function(event, data) {
		        // Get status of the record
		        var grid = event.originalEvent.grid;
		        var selectedRowId = grid.jqGrid('getGridParam', 'selrow');
		        var selectedId = grid.jqGrid('getCell', selectedRowId, 'supportingMaterialId');
		        
		        // Jump to Edit page
		        window.location.href = "inputSupportingMaterial.action?selectedId=" + selectedId;
	        }
		);
	});
</script>

<s:form>
	<s:url id="listURL" action="listSupportingMaterial.action?filterOrgId=%{#orgId}"></s:url>
	<sjg:grid
	   	id="gridtable"
	  	dataType="json"
	  	href="%{listURL}"
	    gridModel="listModel"
	    autowidth="true"
	    pager="true"
	    rowNum="15"
       	rownumbers="true"
       	onSelectRowTopics="onRowSelected"
	>
		<sjg:gridColumn name="supportingMaterialId" index="supportingMaterialId" title="ID" hidden="true"/>
		<sjg:gridColumn name="url" index="url" title="url" sortable="true"/>
		<sjg:gridColumn name="description" index="description" title="description" sortable="true"/>
		<sjg:gridColumn name="type" index="type" title="type" sortable="true"/>
		<sjg:gridColumn name="addedBy" index="addedBy" title="Added By"/>
		<sjg:gridColumn name="addedDate" index="addedDate" title="Added Date" formatter="date"/>
	</sjg:grid>
</s:form>
