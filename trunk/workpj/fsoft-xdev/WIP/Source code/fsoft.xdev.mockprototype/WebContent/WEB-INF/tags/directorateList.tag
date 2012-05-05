<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>List Directorate</h1>
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
		<s:url id="listDirectorate" action="listDirectorate.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listDirectorate}"
	        gridModel="listDirectorate"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="directorateName" index="directorateName" title="BU/Directorate Name" sortable="true"/>
	        <sjg:gridColumn name="officeAddressLine1" index="officeAddressLine1" title="Office Address Line 1" sortable="false"/>
	        <sjg:gridColumn name="postCode" index="postCode" title="Postcode" sortable="false"/>
	        <sjg:gridColumn name="contact" index="contact" title="Contact" sortable="false"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active?" sortable="false" formatter="checkbox" />
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



