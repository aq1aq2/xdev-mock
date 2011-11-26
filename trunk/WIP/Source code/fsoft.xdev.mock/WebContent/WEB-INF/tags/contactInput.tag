<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<%@ attribute name="id" required="true" %>
<s:set name="plus" value="#attr['id']"></s:set>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Organisation Detail</h1>
	</div>
	
	<div class="xdev-window-header">
	</div>
	
	<div class="xdev-window-body">
		<sj:tabbedpanel id="%{#plus}_tabs">
			<sj:tab id="%{#plus}_tab1" target="details1" label="Local Tab One"/>
			<sj:tab id="%{#plus}_tab2" target="details2" label="Local Tab Two"/>
			
		<div id="details1" class="xdev-window-body-sub">
			<s:form>
				<s:textfield label="Frist Name" required="true"></s:textfield>
				<s:textfield label="Surname" required="true"></s:textfield>
				<s:textfield label="Know As" ></s:textfield>
				<s:textfield label="Office Phone" ></s:textfield>
				<s:textfield label="Mobile Phone" ></s:textfield>
				<s:textfield label="ST Home Phone" ></s:textfield>
				<s:textfield label="Email Address" ></s:textfield>
				
				<s:textfield label="Manager Name" ></s:textfield>
				<sj:a id="managerLookup" 
				>lookup</sj:a>
				
				<s:select label="Contact Type" list="{}" required="true"></s:select>
				<s:select label="Best Contact Method" list="{}" ></s:select>
			</s:form>
		</div>
		
		<div id="details2" class="xdev-window-body-sub">
			<s:form>
				<s:textfield label="Know As" id="knNhanld" name="asd"></s:textfield>
				<s:textfield label="Office Phone" id="knNhanld2" name="qwe"></s:textfield>
				<s:textfield label="Mobile Phone" ></s:textfield>
				<s:textfield label="ST Home Phone" ></s:textfield>
				<s:textfield label="Email Address" ></s:textfield>
				
				<sj:a id="managerLookup" 
				>lookup</sj:a>
				
				<s:select label="Contact Type" list="{}" required="true"></s:select>
				<s:select label="Best Contact Method" list="{}" ></s:select>
			</s:form>
		</div>
		
    	</sj:tabbedpanel>
	</div>
	
	<div class="xdev-window-footer">
		<div class="xdev-sub-right">
			<sj:radio
	    		id="checkboxbuttonset"
	            tooltip="Choose your Friends"
	            list="{'Details 1', 'Details 2'}"
	            name="echo"/>
		</div>
	</div>
</div>