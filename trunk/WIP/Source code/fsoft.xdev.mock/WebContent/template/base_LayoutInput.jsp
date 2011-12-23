<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><dec:title default="Welcome" /></title>
        <sj:head jqueryui="true" jquerytheme="smoothness"/>
        <xdev:xhead/>
</head>

<body style="margin-top: 0; margin-bottom: 0; padding: 0">
	
	<div class="xdev-wrapper">

		<!-- Main menu -->	
		<%@ include file="mainMenu.jsp" %>
		
		<!-- Section title -->
		<h1 class="xdev-section-title">
			<dec:getProperty property="page.sectionTitle"/>
		</h1>
		
		<!-- Top buttons -->
		<div class="xdev-sub">
			<sj:a id="saveBtn" 
				button="true"
			>Save</sj:a>
			
			<sj:a id="backBtn" 
				button="true" 
			>Back</sj:a>
		</div>
		
		<!-- Body -->
		<dec:body />
	
		<!-- Footer -->
		<%@ include file="footer.jsp" %>
	</div> <!-- End of xdev-wrapper -->
</body>

</html>