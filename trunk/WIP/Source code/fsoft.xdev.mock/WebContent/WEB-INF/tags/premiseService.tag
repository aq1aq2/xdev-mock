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
		<s:url id="getServicesOfPremise" action="getServicePremise"></s:url>
		<sjg:grid
	        id="gridtableOfPremiseService"
	        dataType="json"
	        href="%{getServicesOfPremise}"
	        gridModel="premiseServiceList"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="serviceName" index="serviceName" title="Service Name" sortable="true"/>
	        <sjg:gridColumn name="description" index="description" title="Discription" sortable="true"/>
	        <sjg:gridColumn name="serviceType" index="serviceType" title="Service Type" sortable="true"/>
	        <sjg:gridColumn name="contact" index="contact" title="Contact" sortable="true"/>
	        
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>