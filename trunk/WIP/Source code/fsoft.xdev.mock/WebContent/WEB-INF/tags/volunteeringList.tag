<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Volunteering List</h1>
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
		<s:url id="volunteeringList" action="getVolunteeringList"></s:url>

		<sjg:grid
	        id="gridtable_Volunteering"
	        dataType="json"
	        href="%{volunteeringList}"
	        gridModel="listVolunteering"
	        autowidth="true"
	        pager="true"
	        >

	        <sjg:gridColumn name="contact" index="contact" title="Contact" sortable="true"/>
	        <sjg:gridColumn name="purpose" index="purpose" title="Purpose" sortable="false"/>
	        <sjg:gridColumn name="number" index="Number" title="Number" sortable="false"/>
	        <sjg:gridColumn name="startDate" index="startDate" title="Start Date" sortable="false"/>
	        <sjg:gridColumn name="endDate" index="endDate" title="End Date" sortable="false"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>