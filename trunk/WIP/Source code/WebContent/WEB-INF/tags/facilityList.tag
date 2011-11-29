<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Facility List</h1>
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
		<s:url id="facilitiesList" action="getFacilitiesList"></s:url>

		<sjg:grid
	        id="gridtable_Facilities"
	        dataType="json"
	        href="%{facilitiesList}"
	        gridModel="listFacilities"
	        autowidth="true"
	        pager="true"
	        >

	        <sjg:gridColumn name="facilityType" index="facilityType" title="Facility Type" sortable="true"/>
	        <sjg:gridColumn name="description" index="description" title="Description" sortable="false"/>
	        <sjg:gridColumn name="leadContact" index="leadContact" title="Lead Contact" sortable="false"/>
	        <sjg:gridColumn name="roomHost" index="roomHost" title="Room Host" sortable="false"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>