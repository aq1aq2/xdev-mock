<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<xdev:xhead/>
</head>

<body class="login">
	<div id="login">
	
		<form name="loginform" id="loginform" action="inLogin.action" method="post">
			<p>
				<label>Username<br>
				<input type="text" name="userName" id="user_login" class="input" value="nhanld" size="20" tabindex="10"></label>
			</p>
			<p>
				<label>Password<br>
				<input type="password" name="password" id="user_pass" class="input" value="123456" size="20" tabindex="20"></label>
			</p>
			<p class="submit">
				<input type="submit" name="wp-submit" id="wp-submit" class="button-primary" value="Log In" tabindex="100">
			</p>
		</form>
		
	</div>
</body>
</html>