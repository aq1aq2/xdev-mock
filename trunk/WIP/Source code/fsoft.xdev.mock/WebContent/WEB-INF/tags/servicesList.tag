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
		<s:url id="getServices" action="getServices.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{getServices}"
	        gridModel="listServices"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="serviceName" index="ServiceName" title="Service Name" sortable="true"/>
	        <sjg:gridColumn name="description" index="Description" title="Discription" sortable="true"/>
	        <sjg:gridColumn name="serviceType" index="ServiceType" title="Service Type" sortable="true"/>
	        <sjg:gridColumn name="contact" index="Contact" title="Contact" sortable="true"/>
	        <sjg:gridColumn name="active" index="Active" title="Active" sortable="true"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>