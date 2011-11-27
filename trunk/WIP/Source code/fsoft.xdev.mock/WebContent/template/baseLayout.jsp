<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title><tiles:insertAttribute name="title" ignore="false" /></title>
    </head>
    <body>
    	<table width="100%" height="100%" border="0">
	    	<tr height="30">
	    		<td>
		    	<tiles:insertAttribute name="mainMenu" />
		    	</td>
		    </tr>
			<tr height="450">
				<td>
		   		<tiles:insertAttribute name="body" />
		    	</td>
		    </tr>
			<tr height="30">
		    	<td>
		    	<tiles:insertAttribute name="footer" />
		    	</td>
		    </tr>
 		</table>
    </body>
</html>
