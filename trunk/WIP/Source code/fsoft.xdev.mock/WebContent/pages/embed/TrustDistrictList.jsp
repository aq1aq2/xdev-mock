<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<title>Trust Region</title>


<script>

	var id = "N/A";
	
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
			window.location.href="inputTrustDistrict.action";
		});
		
		$.subscribe("rowSelect", function(event, data) {     
	       
	        var grid = event.originalEvent.grid;
	        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
	        id = grid.jqGrid('getCell', selectedRowId, 'trustDistrictId');
	        var status = grid.jqGrid('getCell',selectedRowId,'status'); 	        
	        
	        if(status =='No'){	        	
	        	$("#confirm_dialog").dialog("open");
	        }	       
	        else{	        
		      
		        query="trustDistrict.trustDistrictId="+id;
		        window.location.href = "detailTrustDistrict.action?" + query;
	        }
	        
		});
		$("#includeChkBx").click(function(){			
			filterActive = $(this).is(":checked");		
			sendFilterOptions();
		});

		
	});
	
	
	function chooseOkButton(){
		active();		
		$("#confirm_dialog").dialog("close");
	}
	
	
	function chooseCancelButton(){
		$("#confirm_dialog").dialog("close");
	}

	function active() {
		query="trustDistrict.trustDistrictId=" + id;		
		$.get("activeTrustDistrict.action?" + query, 
			function(data){
				$("#gridtable").trigger("reloadGrid", [{page:1}]);
			}
		);
	}
</script>


<!-- body -->	
<s:url id="listTrustDistrict" action="listTrustDistrict.action"></s:url>
<sjg:grid
	id="gridtable"
	dataType="json"
	href="%{listTrustDistrict}"
	gridModel="listModel"
	autowidth="true"
	pager="true"
	rowNum="15"
	rownumbers="true"
	onSelectRowTopics="rowSelect"
>
	<sjg:gridColumn name="trustDistrictId" index="trustDistrictId" title="ID" hidden="true"/>
	<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	<sjg:gridColumn name="description" index="description" title="Descripstion" sortable="false"/>
	<sjg:gridColumn name="trustRegionName" index="trustRegionName" title="Region Name" sortable="true"/>
	<sjg:gridColumn name="status" index="status" title="IsActived" sortable="true" formatter="checkbox"/>	        
</sjg:grid>    

<sj:dialog id="confirm_dialog"
	 buttons="{
                'OK':function() { chooseOkButton(); },
                'Cancel':function() { chooseCancelButton(); }
                }"
		   autoOpen="false"
		   modal="true"
		   title="Confirm...">
	Do you want to make this trust district active?	   
</sj:dialog>
