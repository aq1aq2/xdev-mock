<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
	$(document).ready(function(){
		/* -------------------
		 * Filter click events 
		 */
		var filterActive = false;
		
		function sendFilterOptions() {
			query = "filterActive="+filterActive;
			$.getJSON("listOrganisation.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid', [{page:1}]);
			});
		}
		
		/* -----------
		 * Grid events
		 */
		$.subscribe("rowSelect", 
			function(event, data) {
		        // Get status of the record
		        var grid = event.originalEvent.grid;
		        var selectedRowId = grid.jqGrid('getGridParam', 'selrow');
		        var organisationId = grid.jqGrid('getCell', selectedRowId, 'organisationId');
		        $(":input[name*='gridSelectedRow']").val(organisationId);
	        }
		);
	});
</script>

<div class="xdev-window">

	<!-- Section title -->
	<h1 class="xdev-section-title">
		Organisation List
	</h1>
	
	<!-- Top buttons -->
	<div class="xdev-sub">
		
		<sj:a id="noneBtn" 
			button="true" 
		>None</sj:a>
	</div>
	
	<!-- Body -->
		<!-- Grid -->
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
	
		<!-- Grid selected row -->
	<s:hidden name="gridSelectedRow" />
	
	<!-- Bottom buttons -->

	<div class="xdev-sub">
		<sj:a id="selectBtn" 
			button="true"
		>Select</sj:a>
		
		<sj:a id="closeBtn" 
			button="true" 
		>Close</sj:a>
	</div>

</div> <!-- End of xdev-wrapper -->