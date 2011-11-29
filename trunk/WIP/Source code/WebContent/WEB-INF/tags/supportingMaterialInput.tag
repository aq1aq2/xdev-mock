<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Supporting Material Detail</h1>
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
		<div class="xdev-window-body-sub" id="details">
			<s:textfield name="url" label="URL" required="true" />
			<s:textarea name="desc" label="Description" cols="12" rows="3" />
			<s:select name="type" list="{'something'}" label="Type" />
			<s:textfield name="addedBy" value="Added By" readonly="true"/>
			<s:textfield name="addedDate" value="Added Date" readonly="true"/>
		</div>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



