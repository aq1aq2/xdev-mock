<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Team</title>
</head>
<body>
	<div class="xdev-window-body">
		<s:form>
		<s:url id="listTeam" action="listTeam.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listTeam}"
	        gridModel="listTeam"
	        autowidth="true"
	        rowNum="2"
     		rownumbers="true"
	        pager="true"
       		navigator="true"
	    >
	        <sjg:gridColumn name="name" index="name" title="Team Name" sortable="true"/>
	        <sjg:gridColumn name="addr1" index="addr1" title="Address Line 1" sortable="false"/>
	        <sjg:gridColumn name="postCode" index="postCode" title="Postcode" sortable="false"/>
	        <sjg:gridColumn name="contacts.surName" index="contacts" title="Contact"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="IsActived" sortable="false"/>
	    </sjg:grid>
	    </s:form>
	</div>
</body>
</html>