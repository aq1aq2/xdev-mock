<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service</title>
</head>
<body>
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
	    >
	        <sjg:gridColumn name="name" index="name" title="Service Name" sortable="true"/>
	        <sjg:gridColumn name="descriptionDelivery" index="descriptionDelivery" title="Description" sortable="false"/>
	        <sjg:gridColumn name="serviceType" index="serviceType" title="Service Type" sortable="false"/>
	        <sjg:gridColumn name="contact" index="contact" title="Contact"></sjg:gridColumn>
	        <sjg:gridColumn name="status" index="status" title="IsActived" sortable="false"/>
	    </sjg:grid>
	    </s:form>
	</div>
</body>
</html>