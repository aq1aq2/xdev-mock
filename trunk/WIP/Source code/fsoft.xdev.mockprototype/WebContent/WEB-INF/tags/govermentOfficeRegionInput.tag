
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Government Office Region Detail</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="saveBtn" 
			button="true" 
		>Save</sj:a>
		
		<sj:a id="backBtn" 
			button="true" 
		>Back</sj:a>
	</div>
	
	<div class="xdev-window-body">
	<s:url id="addGovermentOfficeRegion" action="addGovermentOfficeRegion.action"></s:url>
		<div class="xdev-window-body-sub" id ="detail">
			<s:textfield label="Governmen Office Region Name" readonly="true"></s:textfield>			
			<s:textarea label="Description" readonly="true"></s:textarea>
			<s:textarea label="Country" readonly="true"></s:textarea>						
		</div>		
	</div>	
	
	<div class="xdev-window-footer">
	</div>
</div>



