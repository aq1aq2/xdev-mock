<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Premise Detail</h1>
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
		<div id="Detail1" class="xdev-window-body-sub">
		<table>
			<tr>
				<td> <s:textfield name="locationName" label="Location Name" required="true"></s:textfield> </td>
				<td> <s:checkbox name="primaryLocation" label="Primary Location"></s:checkbox></td>
			</tr>
			<tr>
				<td> <s:textfield name="knownAs" label="Known As"></s:textfield> </td>
				<td><s:checkbox name="locationmanaged" label="Location Managed"></s:checkbox> </td>
			</tr>
			<tr>
				<td><s:textfield name="locationOrganisation" label="Location Organisation"></s:textfield> </td>
				<td> <s:label name="lookup" onclick="Lookup" value="Lookup"></s:label></td>
				<td><s:checkbox name="stNetworkConnect" label="ST Network Connectivity"></s:checkbox> </td>
			</tr>
			
		</table>
		</div>
		<div class="xdev-window-body-sub">
			<s:form>
				
			</s:form>
		</div>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>