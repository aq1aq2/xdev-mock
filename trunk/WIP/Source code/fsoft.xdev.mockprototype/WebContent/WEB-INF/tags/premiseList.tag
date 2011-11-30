<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Premise List</h1>
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
		<s:url id="premiseList" action="getPremiseList"></s:url>

		<s:url id="getPremise" action="getPremiseList"></s:url>

		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{premiseList}"
	        gridModel="listPremise"
	        autowidth="true"
	        pager="true"
	        >

	        <sjg:gridColumn name="locationName" index="locationName" title="Location Name" sortable="true"/>
	        <sjg:gridColumn name="addressLine1" index="addressLine1" title="Address Line1" sortable="false"/>
	        <sjg:gridColumn name="postCode" index="postCode" title="Post Code" sortable="false"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>