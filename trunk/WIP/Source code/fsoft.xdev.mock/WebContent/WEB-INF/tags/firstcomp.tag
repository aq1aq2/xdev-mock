<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<%@ attribute name="username" required="true" %>

<b>${username}</b>
<b>Le Duc Nhan</b><br/>
<xdev:dialog id="dnDialog"
	autoOpen="false">Le Duc Nhan</xdev:dialog>

<sj:a 
	openDialog="dnDialog" 
	button="true"
	buttonIcon="ui-icon-newwin"
>
	Open modal dialog
</sj:a>



