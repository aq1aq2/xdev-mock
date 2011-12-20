<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>

<title>Programme</title>

<script>
	$(document).ready(function(){
		/* Filter click event */
		var filterKey = "";
		var filterActive = false;
		
		function sendFilterOptions() {
			query = "filterKey="+filterKey;
			query += '&';
			query += "filterActive="+filterActive;
			$.getJSON("listProgramme.action?" + query,
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
	});
</script>

<div class="xdev-window-body">
	<s:form>
	<s:url id="listProgramme" action="listProgramme.action"></s:url>
	<sjg:grid
        id="gridtable"
        dataType="json"
        href="%{listProgramme}"
        gridModel="listProgramme"
        autowidth="true"
        rowNum="3"
    		rownumbers="true"
        pager="true"
      		navigator="true"
    >
        <sjg:gridColumn name="name" index="name" title="Service Name" sortable="true"/>
        <sjg:gridColumn name="description" index="description" title="Description" sortable="false"/>
        <sjg:gridColumn name="contact" index="contact" title="Contact"></sjg:gridColumn>
        <sjg:gridColumn name="status" index="status" title="IsActived" sortable="false"/>
    </sjg:grid>
    </s:form>
</div>
