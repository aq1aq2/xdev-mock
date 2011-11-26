<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Facility Detail</h1>
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
			<s:form>
				<s:select name="facilityType" list="{'loai 1','loai 2','Room','Internet Access'}" label="Facility Type" required="true"></s:select>
				<s:textfield name="leadContact" label="Lead Contact" readonly="true"></s:textfield>
				<s:label name="lookupLeadContact" value="Lookups"></s:label>
				<s:textarea name="facilityDescription" label="Facility Description" cols="5" rows="4" required="true"></s:textarea>
				<s:textfield name="roomHost" label="Room Host" readonly="true" ></s:textfield>
				<s:label name="lookupRoomhost" value="Lookups"></s:label>
				<s:textfield name="roomCapacity" label="Room Capacity"></s:textfield>
				<s:textfield name="roomSize" label="Room Size"></s:textfield>
				<s:checkbox name="equipmentAvailable" label="Equipment Available"></s:checkbox>
				<s:checkbox name="roomConnectivity" label="Room Connectivity"></s:checkbox>
				<s:select name="connectivityType"  list="{'',''}" label="Connectivity Type"></s:select>
				
		
			</s:form>
		
		</table>
		
		</div>
		
		
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>