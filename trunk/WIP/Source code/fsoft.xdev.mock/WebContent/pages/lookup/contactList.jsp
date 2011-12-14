<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<title>Contact List</title>

<!-- Section Title -->
<content tag="sectionTitle">Contact List</content>

<!-- Search Options -->
<content tag="searchOptions">
	<s:textfield id="opFirstName" label="Frist Name" />
	<s:textfield id="opSurname" label="Surname" />
</content>

<!-- Grid -->
<s:url id="listURL" action="listContact.action"/>
<sjg:grid
	id="gridtable"
	caption="Contact List"
	dataType="json"
	href="%{listURL}"
	pager="true"
	gridModel="listModel"
	rowList="10,15,20"
	rowNum="15"
	rownumbers="true"
	navigator="false"
	navigatorSearch="true"
	autowidth="true"
>
	<sjg:gridColumn name="firstName" index="firstName" title="Contact Name" sortable="true" 
	        		search="true"
        			searchoptions="{sopt:['eq','ne']}"/>
	<sjg:gridColumn name="mobilePhone" index="mobilePhone" title="Mobile Phone" sortable="true"/>
	<sjg:gridColumn name="emailAddress" index="emailAddress" title="Email" sortable="true"/>
	<sjg:gridColumn name="contactType" index="contactType" title="Contact Type" sortable="true"/>
	<sjg:gridColumn name="isActive" index="isActive" title="Is Active?" sortable="true"/>
</sjg:grid>