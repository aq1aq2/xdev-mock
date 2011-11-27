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
			<sj:tab id="%{#plus}_tab1" target="details1" label="Details 1"/>
			
		<div id="details1" class="xdev-window-body-sub2">
			<div class="xdev-field">
				<s:textfield id="%{#plus}_firstName" label="Frist Name" required="true"></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#plus}_surname" label="Surname" required="true"></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#plus}_knowAs" label="Know As" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#plus}_officePhone" label="Office Phone" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#plus}_mobilePhone" label="Mobile Phone" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#plus}_homePhone" label="ST Home Phone" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#plus}_emailAddress" label="Email Address" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#plus}_managerName" label="Manager Name" ></s:textfield>
				<sj:a id="%{#plus}_managerLookup" 
					>lookup</sj:a>
			</div>
			<div class="xdev-field">
				<s:select id="%{#plus}_contactType" label="Contact Type" list="{}" required="true"></s:select>
			</div>
			<div class="xdev-field">
				<s:select id="%{#plus}_bestContactMethod" label="Best Contact Method" list="{}" ></s:select>
			</div>
			<div class="clear"></div>
		</div>
		
    	</sj:tabbedpanel>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>