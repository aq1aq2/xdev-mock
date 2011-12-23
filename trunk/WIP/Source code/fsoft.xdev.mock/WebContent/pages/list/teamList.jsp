<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<title>Trust Region</title>

<content tag="sectionTitle">Team List</content>

<script>

	var id ="N/A";	
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
			window.location.href="inputTeam.action";
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
	       	id = grid.jqGrid('getCell', selectedRowId, 'teamId');
	       	var status = grid.jqGrid('getCell', selectedRowId, 'status');
	       	alert(status);
	        if(status == 'No'){	        	
	        	$("#confirm_dialog").dialog("open");
	        	
	        }
	        else{
	        	query="team.teamId="+id;
		        window.location.href = "detailTeam.action?" + query;	
	        }		        
	        
		});
	});
	
		function chooseOkButton() {		
			alert("ok");
			active();		
			$("#confirm_dialog").dialog("close");
		}
		
		function chooseCancelButton() {	
			alert("cancel");
			$("#confirm_dialog").dialog("close");
		}
	
		function active() {
			alert("Id= " + id);
			query="team.teamId=" + id;		
			$.get("activeTeam.action?" + query, 
				function(data){
					$("#gridtable").trigger("reloadGrid", [{page:1}]);
				}
			);
		}	
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
  
  <sj:dialog id="confirm_dialog"
		  buttons="{
                'OK':function() { chooseOkButton(); },
                'Cancel':function() { chooseCancelButton(); }
                }"
		   autoOpen="false"
		   modal="true"
		   title="Confirm..."
>
	Do you want to make this trust team active ?
</sj:dialog>
  
