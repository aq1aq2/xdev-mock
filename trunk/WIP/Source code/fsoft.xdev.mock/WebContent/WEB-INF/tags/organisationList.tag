<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
	function openOrganisationInput() {
		window.location.href = "pages/openOrganisationInput.action";
	}
</script>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Organisation List</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="createBtn" 
			button="true"
			onclick="openOrganisationInput()"
		>
		  	Create
		</sj:a>
		<s:checkbox name="includeChkBx" label="Include In-active" />
	</div>
	
	<div class="xdev-window-body">
		<s:url id="listOrganisation" action="listOrganisation.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listOrganisation}"
	        gridModel="listOrganisation"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	        <sjg:gridColumn name="headOfficeAddLine1" index="headOfficeAddLine1" title="HeadOfficeAddLine1" sortable="true"/>
	        <sjg:gridColumn name="postCode" index="postCode" title="PostCode" sortable="true"/>
	        <sjg:gridColumn name="contact" index="contact" title="Contact" sortable="true"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="IsActive" sortable="false" formatter="checkbox"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



