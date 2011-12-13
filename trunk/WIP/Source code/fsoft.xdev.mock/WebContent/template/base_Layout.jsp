<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="../../css/xdev.css" type="text/css" media="all" />
        <sj:head jqueryui="true" jquerytheme="smoothness"/>
        <script src="../../js/xScript.js"></script>
</head>

<body style="margin-top: 0; margin-bottom: 0; padding: 0">
	
	<div class="xdev-wrapper">

		<!-- Main menu -->	
		<%@ include file="mainMenu.jsp" %>
		
		<!-- Filter -->
		<ul id="xdev-filter">
			<li>All</li>
			<li>0-9</li>
			<li>A B C D E</li>
			<li>F G H I J</li>
			<li>K L M N</li>
			<li>O P Q R</li>
			<li>S T U V</li>
			<li>W X Y Z</li>
		</ul>
		<div class="clear"></div>
		
		<!-- Top buttons -->
		<div class="xdev-sub">
			<sj:a id="searchBtn" 
				button="true" 
			>Search</sj:a>
			
			<sj:a id="noneBtn" 
				button="true" 
			>None</sj:a>
			
			<sj:a id="clearBtn" 
				button="true" 
			>Clear</sj:a>
			
			<sj:a id="createBtn" 
				button="true" 
			>Create</sj:a>
			
			<s:checkbox name="includeChkBx" label="Include In-active" />
		</div>
		
		<!-- Body -->
		<dec:body />
	
		<!-- Footer -->
		<%@ include file="footer.jsp" %>
	</div> <!-- End of xdev-wrapper -->
</body>

</html>