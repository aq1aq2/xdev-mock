
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
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
    	<%@ include file="mainMenu.jsp" %>
		<div id="content">
			<div id="filter">
				<a href="#" >All	|</a>
				<a href="#" >0-9   |</a>
				<a href="#" >A B C D E   |</a>
				<a href="#" >F G H I J   |</a>
				<a href="#" >K L M N    |</a>
				<a href="#" >O P Q R    |</a>
				<a href="#" >S T U V    |</a>
				<a href="#" >W X Y Z    |</a>
			</div>
             <dec:body />
         </div>
		<%@ include file="footer.jsp" %>
		</div>
    </body>

</html>