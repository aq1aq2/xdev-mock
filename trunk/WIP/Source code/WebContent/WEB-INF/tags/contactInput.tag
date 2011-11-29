<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<%@ attribute name="id" required="true" rtexprvalue="true" %>

<div class="xdev-window" id="${id }">
	<div class="xdev-window-title">
		<h1>Organisation Detail</h1>
	</div>
	
	<div class="xdev-window-header">
	</div>
	
	<div class="xdev-window-body">
		<sj:tabbedpanel id="%{#attr['id']}_tabs">
			<sj:tab id="%{#attr['id']}_tab1" target="details1" label="Details 1"/>
			
		<div id="details1" class="xdev-window-body-sub2">
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_firstName" label="Frist Name" required="true"></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_surname" label="Surname" required="true"></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_knowAs" label="Know As" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_officePhone" label="Office Phone" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_mobilePhone" label="Mobile Phone" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_homePhone" label="ST Home Phone" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_emailAddress" label="Email Address" ></s:textfield>
			</div>
			<div class="xdev-field">
				<s:textfield id="%{#attr['id']}_managerName" label="Manager Name" ></s:textfield>
				<sj:a id="%{#attr['id']}_managerLookup" 
					>lookup</sj:a>
			</div>
			<div class="xdev-field">
				<s:select id="%{#attr['id']}_contactType" label="Contact Type" list="{}" required="true"></s:select>
			</div>
			<div class="xdev-field">
				<s:select id="%{#attr['id']}_bestContactMethod" label="Best Contact Method" list="{}" ></s:select>
			</div>
			<div class="clear"></div>
		</div>
		
    	</sj:tabbedpanel>
	</div>
	
	<div class="xdev-window-footer">
		<sj:a id="%{#attr['id']}_saveBtn" 
			button="true"
		>Save</sj:a>
		
		<sj:a id="%{#attr['id']}_backBtn" 
			button="true" 
		>Back</sj:a>
	</div>
</div>