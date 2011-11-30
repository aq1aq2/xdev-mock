<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Trust District</title>
	<sj:head jqueryui="true" jquerytheme="smoothness"/>
	<link rel="stylesheet" href="css/xdev.css" type="text/css" media="all" />
</head>
<body>
	<div class="xdev-wrapper">
		<div class="xdev-banner">
			<h1>Banner</h1>
		</div>		
		
		 <div class="xdev-content">
			<xdev:govermentOfficeRegionList></xdev:govermentOfficeRegionList>
		</div>
		<div class="xdev-content">
			<xdev:govermentOfficeRegionInput></xdev:govermentOfficeRegionInput>
		</div>
			
		<div class="xdev-footer">
			<h1>Banner</h1>
		</div>
	</div>
</body>
</html>