<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
	$(document).ready(function(){
		$("#createBtn").click(function(){
			window.location.href = "inputContact.action";
		});
	});
</script>

<div class="xdev-window">

	<!-- Section title -->
	<h1 class="xdev-section-title">
		Contact List
	</h1>
	
	<!-- Search options -->
	<div class="xdev-sub">
		<s:textfield id="opFirstName" label="Frist Name" />
		<s:textfield id="opSurname" label="Surname" />
	</div>
	
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
		rowNum="5"
		rownumbers="true"
		navigator="false"
		navigatorSearch="true"
		autowidth="true"
	>
		<sjg:gridColumn name="contactId" index="contactId" title="ID" hidden="true"/>
		<sjg:gridColumn name="name" index="name" title="Contact Name" sortable="true" 
		        		search="true"
	        			searchoptions="{sopt:['eq','ne']}"/>
		<sjg:gridColumn name="mobilePhone" index="mobilePhone" title="Mobile Phone" sortable="true"/>
		<sjg:gridColumn name="email" index="email" title="Email" sortable="true"/>
		<sjg:gridColumn name="contactType" index="contactType" title="Contact Type" sortable="true"/>
		<sjg:gridColumn name="status" index="status" title="Is Active?" sortable="true" formatter="checkbox"/>
	</sjg:grid>	
	
	<!-- Bottom buttons -->

	<div class="xdev-sub">
		<sj:a id="selectBtn" 
			button="true"
		>Select</sj:a>
		
		<sj:a id="closeBtn" 
			button="true" 
		>Close</sj:a>
	</div>

</div> <!-- End of xdev-wrapper -->