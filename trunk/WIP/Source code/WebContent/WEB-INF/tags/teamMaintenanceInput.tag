<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>T Detail</h1>
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
				<s:textfield id="teamName" name="teamName" label="Team Name" required="true"></s:textfield>
				<s:textarea id="teamShortDescription" name="teamShortDescription" label="Team Short Description"></s:textarea>
				<s:textfield id="leadContact" name="leadContact" label="Lead Contact" readonly="true"></s:textfield>
<%-- 				<s:checkboxlist list="{'Organisation','Parent'}" label="Copy Address From" id="copyAddressFrom" name="copyAddressFrom"></s:checkboxlist> --%>
				<s:radio list="{'Organisation','Parent'}" id="" label="Coypy Address From"></s:radio>
<%-- 				<s:textfield id="addressLine1" name="addressLine1" label="Address Line 1"></s:textfield> --%>
				<s:textfield id="addressLine1" name="addressLine1" label="Address Line 1"></s:textfield>
				<s:textfield id="addressLine2" name="addressLine2" label="Address Line 2"></s:textfield>
				<s:textfield id="addressLine3" name="addressLine3" label="Address Line 3"></s:textfield>
				<s:textfield id="postcode" name="postcode" label="Postcode"></s:textfield>
				<s:label name="lookup1" onclick="Lookup" value="Lookup"></s:label>
				<s:textfield id="townVillageCity" name="townVillageCity" label="Town/Village/City"></s:textfield>
				<s:textfield id="country" name="country" label="Country"></s:textfield>
				<s:select list="{'Vietnamese','Chinese'}" id="nationCountry" name="nationCountry" label="Nation/Country"></s:select>
				<s:textfield id="typeOfBusiness" name="typeOfBusiness" label="Type of Business" value="man-made fibres spinning" readonly="true"></s:textfield>
				<s:label id="lookup2" onblur="Lookup" value="Lookup"></s:label>
				<s:textfield id="sICCode" name="sICCode" label="SIC Code" value="13100"></s:textfield>
				<s:textarea id="teamFullDescription" name="teamFullDescription" label="Team Full Description"></s:textarea>
				<s:textfield id="phoneNumber" name="phoneNumber" label="Phone Number"></s:textfield>
				<s:textfield id="fax" name="fax" label="Fax"></s:textfield>
				<s:textfield id="email" name="email" label="Email"></s:textfield>
				<s:textfield id="webAddress" name="webAddress" label="Web Address" value="http://fsoft.com.vn"></s:textfield>
				
				
			</s:form>		
		</div>		
				
		<div class="xdev-window-body-sub" id="teamList">				
			<xdev:teamMaintenanceList></xdev:teamMaintenanceList>
						
		</div>
		
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>