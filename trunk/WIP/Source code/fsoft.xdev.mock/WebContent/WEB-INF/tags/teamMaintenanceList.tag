<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Service List</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="createBtn" 
			button="true" 
		>
		  	Create
		</sj:a>
		
		<s:checkbox name="includeChkBx" label="Include In-active" />
	</div>
	
	<div class="xdev-window-body">
		<s:url id="getTeam" action="getTeam.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{getTeam}"
	        gridModel="listTeam"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="teamName" index="teamName" title="Team Name" sortable="true"/>
	        <sjg:gridColumn name="addressLine1" index="addressLine1" title="Address Line 1" sortable="true"/>
	        <sjg:gridColumn name="postcode" index="postcode" title="Postcode" sortable="true"/>
	        <sjg:gridColumn name="contact" index="aontact" title="Contact" sortable="true"/>
	        <sjg:gridColumn name="active" index="active" title="Is Active" sortable="true"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>