<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>

<title>Service</title>

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
			$.getJSON("listService.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid');
			});
		}
		
		$("ul#xdev-filter > li").click(function(){
			filterKey = this.textContent;
			//alert(filterKey);
			sendFilterOptions();
		});
		
		$("#includeChkBx").click(function(){
			///alert("vao day");
			filterActive = $(this).is(":checked");
			sendFilterOptions();
		});
		//click button Create
		$("#createBtn").click(function(){
			window.location.href = "detailService.action";
		});
		
		
		$.subscribe("rowselect", function(event, data) {  
	        
	        var grid = event.originalEvent.grid;
	        var selectedRowId = grid.jqGrid('getGridParam', 'selrow'); 
	        id = grid.jqGrid('getCell', selectedRowId, 'serviceId');
	        var status = grid.jqGrid('getCell', selectedRowId, 'status');	        
	        if(status =='No'){	        	
	        	$("#confirm_dialog").dialog("open");
	        }
	        else{	        	 
		        query="service.serviceId="+id;
		        window.location.href = "detailService.action?" + query;
	        }		        
	        
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
		alert("ID: " + id);
		query="service.serviceId=" + id;		
		$.get("activeService.action?" + query, 
			function(data){
			//alert("co vay day khong");
				$("#gridtable").trigger("reloadGrid", [{page:1}]);
			}
		);
	}
</script>
<div class="xdev-wrapper">
<div class="xdev-sub">
			<sj:a id="copyBtn" 
				button="true" 
			>Copy</sj:a>
			</div>
</div>
<div class="xdev-window-body">
	<s:form>
	<s:url id="listService" action="listService.action"></s:url>
	<sjg:grid
        id="gridtable"
        dataType="json"
        href="%{listService}"
        gridModel="listService"
        autowidth="true"
        rowNum="3"
    	rownumbers="true"
        pager="true"
      	navigator="true"
      	onSelectRowTopics="rowselect"
    >
    	<sjg:gridColumn name="serviceId" index="serviceId" title="ID" hidden="true"></sjg:gridColumn>
        <sjg:gridColumn name="name" index="name" title="Service Name" sortable="true"/>
        <sjg:gridColumn name="descriptionDelivery" index="descriptionDelivery" title="Description" sortable="false"/>
        <sjg:gridColumn name="serviceType" index="serviceType" title="Service Type" sortable="false"/>
        <sjg:gridColumn name="contact" index="contact" title="Contact"></sjg:gridColumn>
        <sjg:gridColumn name="status" index="status" title="IsActived" sortable="false" formatter="checkbox"/>
    </sjg:grid>
    </s:form>
    
  <sj:dialog id="confirm_dialog"
		  buttons="{
                'OK':function() { chooseOkButton(); },
                'Cancel':function() { chooseCancelButton(); }
                }"
		   autoOpen="false"
		   modal="true"
		   title="Confirm..."
	>
    Do you want to make this Service active ?
    </sj:dialog>
</div>
