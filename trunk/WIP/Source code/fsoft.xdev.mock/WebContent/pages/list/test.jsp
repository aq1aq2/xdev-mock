<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<table border="1px">
	<tr>
		<th>Student Id</th>
		<th>Name</th>
		<th>Description</th>
		<th>contact name</th>
	</tr>
	<s:iterator value="listFacilities" status="studentStatus">
		
		<tr>
		
					<td> <s:property value="facilityId"/></td>
					<td> <s:property value="facilityDescription"/> </td>
					<td> <s:property value="roomSize"/> </td>
					
					<td><s:property value="contactByContactId.firstName"/> </td>
					<td><s:property value="status"/> </td> 
		</tr>
	</s:iterator>
</table>
</body>
</html>