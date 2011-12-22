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
		var filterBusinessName = "";
		var filterSicCode = "";
		
		function sendFilterOptions() {
			filterBusinessName = $("#opBusinessName").val();
			filterSicCode = $("#opSicCode").val();
			
			query = "filterBusinessName="+filterBusinessName;
			query += '&';
			query += "filterSicCode="+filterSicCode;
			
			$.getJSON("listTypeOfBusiness.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid', [{page:1}]);
			});
		}
		
		/* -------------------
		 * Button click events
		 */
		
		/* Search */
		$("#searchBtn").click(function(){
			sendFilterOptions();
		});
		
		/* Clear */
		$("#clearBtn").click(function(){
			$("#opBusinessName").val("");
			$("#opSicCode").val("");
			sendFilterOptions();
		});
		
		/* -----------
		 * Grid events
		 */
		$.subscribe("onRowSelected", 
			function(event, data) {
		        // Get status of the record
		        var grid = event.originalEvent.grid;
		        var selectedRowId = grid.jqGrid('getGridParam', 'selrow');
		        var typeOfBusinessId = grid.jqGrid('getCell', selectedRowId, 'typeOfBusinessId');
		        $(":input[name*='gridSelectedRow']").val(typeOfBusinessId);
	        }
		);
	});
</script>

<div class="xdev-window">

	<!-- Section title -->
	<h1 class="xdev-section-title">
		Type of Business
	</h1>
	
	<!-- Search options -->
	<div class="xdev-sub">
		<s:textfield id="opBusinessName" label="Business Name" value=""/>
		<s:textfield id="opSicCode" label="SIC Code" value=""/>
	</div>
	
	<!-- Top buttons -->
	<div class="xdev-sub">
		<sj:a id="searchBtn" 
			button="true" 
		>Search</sj:a>
		
		<sj:a id="noneBtn" 
			button="true" 
		>None</sj:a>
		
		<sj:a id="clearBtn" 
			button="true" 
		>Clear</sj:a>
	</div>
	
	<!-- Body -->
		<!-- Grid -->
	<s:url id="listURL" action="listTypeOfBusiness.action"/>
	<sjg:grid
		id="gridtable"
        dataType="json"
        href="%{listURL}"
        gridModel="listModel"
        autowidth="true"
        pager="true"
        rowNum="10"
		rownumbers="true"
		onSelectRowTopics="onRowSelected"
	>
		<sjg:gridColumn name="typeOfBusinessId" index="typeOfBusinessId" title="ID" hidden="true"/>
		<sjg:gridColumn name="name" index="name" title="Business Name" />
		<sjg:gridColumn name="sicCode" index="sicCode" title="SIC Code" sortable="true" />
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