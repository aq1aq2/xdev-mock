<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Current List of Supporting Materials</h1>
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
		<s:url id="listSupportingMaterial" action="listSupportingMaterial.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listSupportingMaterial}"
	        gridModel="listSupportingMaterial"
	        autowidth="true"
	        pager="true"
	    >

	        <sjg:gridColumn name="url" index="url" title="URL" sortable="true"/>
	        <sjg:gridColumn name="description" index="Description" title="Email" sortable="false"/>
	        <sjg:gridColumn name="type" index="type" title="Type" sortable="false"/>
	        <sjg:gridColumn name="addedBy" index="addedBy" title="AddedBy" sortable="false"/>
	        <sjg:gridColumn name="addedDate" index="addedDate" title="AddedDate" sortable="false" />
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



