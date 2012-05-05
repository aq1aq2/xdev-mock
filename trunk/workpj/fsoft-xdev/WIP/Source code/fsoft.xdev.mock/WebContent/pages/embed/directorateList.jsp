<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<title>Directorate List</title>
<script>
	var id = "N/A";
	var filterActive = false;
	$(document).ready(function(){
		/* Filter click event */
		var filterKey = "";		
		function sendFilterOptions() {
			query = "filterKey="+filterKey;
			query += '&';
			query += "filterActive="+filterActive;			
			$.getJSON("listDirectorate.action?" + query,
				function(data) {
					$('#directorateList_gridtable').trigger('reloadGrid',[{page:1}]);
			});
		}
		
		$("ul#xdev-filter > li").click(function(){			
			filterKey = this.textContent;
			sendFilterOptions();
		});
		
		
		$("#createBtn").click(function(){			
			window.location.href="inputDirectorate.action";
		});
		$("#includeChkBx").click(function(){
			// Test
			filterActive = $(this).is(":checked");		
			sendFilterOptions();
		});
		
		$.subscribe("rowSelect", function(event, data) {  
	        
	        var grid = event.originalEvent.grid;
	        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
	        id = grid.jqGrid('getCell', selectedRowId, 'directorateId');
	        var status = grid.jqGrid('getCell', selectedRowId, 'status');	        
	        if(status =='No'){
	        	//show dialog
	        	$("#confirm_dialog").dialog("open");
	        }
	        else{	        	 
		        query="directorate.directorateId="+id;
		        window.location.href = "detailDirectorate.action?" + query;
	        }		        
	        
		});	

	});	

	function chooseOkButton() {		
		
		active();		
		$("#confirm_dialog").dialog("close");
	}
	
	function chooseCancelButton() {			
		$("#confirm_dialog").dialog("close");
	}

	function active() {
		query="directorate.directorateId=" + id;		
		$.get("activeDirectorate.action?" + query, 
			function(data){
				$("#directorateList_gridtable").trigger("reloadGrid", [{page:1}]);
			}
		);
	}
</script>

	<s:url id="directorateList_listURL" action="listDirectorate.action"></s:url>
	<sjg:grid
		caption="Directorate List"
	   	id="directorateList_gridtable"
	  	dataType="json"
	  	href="%{directorateList_listURL}"
	    gridModel="listModel"
	    width="929"
	    pager="true"
	    rowNum="15"
       	rownumbers="true"
	>
		<sjg:gridColumn name="directorateId" index="directorateId" title="ID" hidden="true"/>
		<sjg:gridColumn name="name" index="name" title="BU/Directoreate Name" sortable="true"/>
		<sjg:gridColumn name="addr1" index="addr1" title="Office Address Line 1" sortable="true"/>
		<sjg:gridColumn name="postCode" index="postCode" title="Post Code" sortable="true"/>
        <sjg:gridColumn name="contactName" index="contactName" title="Contact" sortable="true"/>
		<sjg:gridColumn name="status" index="status" title="isActive" sortable="true" formatter="checkbox"/>
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
	Do you want to make this directorate active ?
</sj:dialog>
  