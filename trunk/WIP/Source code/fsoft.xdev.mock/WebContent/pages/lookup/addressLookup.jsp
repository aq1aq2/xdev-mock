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
		var filterPostcode = "";
		var filterStreet = "";
		var filterTown = "";
		
		function sendFilterOptions() {
			filterPostcode = $("#opPostcode").val();
			filterStreet = $("#opStreet").val();
			filterTown = $("#opTown").val();
			
			query = "filterPostcode="+filterPostcode;
			query += '&';
			query += "filterStreet="+filterStreet;
			query += '&';
			query += "filterTown="+filterTown;
			
			$.getJSON("listAddress.action?" + query,
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
			$("#opPostcode").val("");
			$("#opStreet").val("");
			$("#opTown").val("");
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
		        var addressId = grid.jqGrid('getCell', selectedRowId, 'addressId');
		        $(":input[name*='gridSelectedRow']").val(addressId);
	        }
		);
	});
</script>

<div class="xdev-window">

	<!-- Section title -->
	<h1 class="xdev-section-title">
		Address
	</h1>
	
	<!-- Search options -->
	<div class="xdev-sub">
		<s:textfield id="opPostcode" label="Postcode" value=""/>
		<s:textfield id="opStreet" label="Street" value=""/>
		<s:textfield id="opTown" label="Town" value=""/>
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
	<s:url id="listURL" action="listAddress.action"/>
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
		<sjg:gridColumn name="addressId" index="addressId" title="ID" hidden="true" formatter="integer"/>
		<sjg:gridColumn name="name" index="name" title="Address" />
		<sjg:gridColumn name="postCode" index="postCode" title="Post Code" sortable="true" />
		<sjg:gridColumn name="town" index="town" title="Town" />
		<sjg:gridColumn name="county" index="county" title="County" />
		<sjg:gridColumn name="country" index="country" title="Country" />
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