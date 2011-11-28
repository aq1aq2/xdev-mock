<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title" ignore="false" /></title>
        <link rel="stylesheet" href="../css/xdev.css" type="text/css" media="all" />
    </head>
    <body style="margin-top: 0; margin-bottom: 0; padding: 0">
    	<tiles:insertAttribute name="mainMenu" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
    </body>
</html>
