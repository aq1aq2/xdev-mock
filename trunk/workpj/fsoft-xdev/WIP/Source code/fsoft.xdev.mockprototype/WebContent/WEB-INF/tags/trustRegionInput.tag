
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Trust Region Detail</h1>
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
		
		<div class="xdev-window-body-sub" id="detail">
			<s:form>
			<s:url id="addTrustRegion" action="addTrustRegion.action"></s:url>
			<s:select list ="{'Vietnam','US','UK'}" label="Nation/Country " required="true"></s:select>
			<s:textfield label="Trust Region Name" required="true"></s:textfield>
			<s:textarea label="Description"></s:textarea>		
			</s:form>		
		</div>		
				
		<div class="xdev-window-body-sub" id="district">				
			<xdev:trustDistrictList></xdev:trustDistrictList>
						
		</div>
		
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



