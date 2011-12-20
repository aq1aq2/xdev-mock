<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
	$(document).ready(function(){
		/* 
		 * Filter click events 
		 */
		var filterFirstName = "";
		var filterSurname = "";
		var filterActive = false;
		
		function sendFilterOptions() {
			filterFirstName = $("#opFirstName").val();
			filterSurname = $("#opSurname").val();
			
			query = "filterFirstName="+filterFirstName;
			query += '&';
			query += "filterSurname="+filterSurname;
			query += '&';
			query += "filterActive="+filterActive;
			$.getJSON("listContact.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid', [{page:1}]);
			});
		}
		
		$("#includeChkBx").click(function(){
			filterActive = $(this).is(":checked");
			sendFilterOptions();
		});
		
		/* Search */
		$("#searchBtn").click(function(){
			sendFilterOptions();
		});
		
		/* Clear */
		$("#clearBtn").click(function(){
			$("#opFirstName").val("");
			$("#opSurname").val("");
			sendFilterOptions();
		});
		
		/*
		 * Button events
		 */
		 
		/* Create */
		$("#createBtn").click(function(){
			window.location.href = "inputContact.action";
		});
		
		/*
		 * Grid events
		 */
		$.subscribe("onRowSelected", 
			function(event, data) {
		        // Get status of the record
		        var grid = event.originalEvent.grid;
		        var selectedRowId = grid.jqGrid('getGridParam', 'selrow');
		        var contactId = grid.jqGrid('getCell', selectedRowId, 'contactId');
		        $(":input[name*='gridSelectedRow']").val(contactId);
	        }
		);
	});
</script>

<div class="xdev-window">

	<!-- Section title -->
	<h1 class="xdev-section-title">
		Contact List
	</h1>
	
	<!-- Search options -->
	<div class="xdev-sub">
		<s:textfield id="opFirstName" label="First Name" value=""/>
		<s:textfield id="opSurname" label="Surname" value=""/>
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
		
		<sj:a id="createBtn" 
			button="true" 
		>Create</sj:a>
		
		<s:checkbox name="includeChkBx" label="Include In-active" />
	</div>
	
	<!-- Body -->
		<!-- Grid -->
	<s:url id="listURL" action="listContact.action"/>
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
		<sjg:gridColumn name="contactId" index="contactId" title="ID" hidden="true"/>
		<sjg:gridColumn name="name" index="name" title="Contact Name" sortable="true" 
		        		search="true"
	        			searchoptions="{sopt:['eq','ne']}"/>
		<sjg:gridColumn name="mobilePhone" index="mobilePhone" title="Mobile Phone" sortable="true"/>
		<sjg:gridColumn name="email" index="email" title="Email" sortable="true"/>
		<sjg:gridColumn name="contactType" index="contactType" title="Contact Type" sortable="true"/>
		<sjg:gridColumn name="status" index="status" title="Is Active?" sortable="true" formatter="checkbox"/>
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