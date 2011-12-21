<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>

<title>Service</title>

<script type="text/javascript">
$.subscribe('rowselect', function(event, data) {
        alert('Selected Row : ' + event.originalEvent.id);
       	
});
</script>

<script>
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
			alert(filterKey);
			sendFilterOptions();
		});
		
		$("#includeChkBx").click(function(){
			alert("vao day");
			filterActive = $(this).is(":checked");
			sendFilterOptions();
		});
		//click button Create
		$("#createBtn").click(function(){
			window.location.href = "detailService.action";
		});
	});
</script>

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
        <sjg:gridColumn name="name" index="name" title="Service Name" sortable="true"/>
        <sjg:gridColumn name="descriptionDelivery" index="descriptionDelivery" title="Description" sortable="false"/>
        <sjg:gridColumn name="serviceType" index="serviceType" title="Service Type" sortable="false"/>
        <sjg:gridColumn name="contact" index="contact" title="Contact"></sjg:gridColumn>
        <sjg:gridColumn name="status" index="status" title="IsActived" sortable="false"/>
    </sjg:grid>
    </s:form>
</div>
