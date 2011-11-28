<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<%@ attribute name="id" required="true" rtexprvalue="true" %>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Contact List</h1>
	</div>
	
	<div class="xdev-window-header">
		<div class="xdev-sub">
			<s:textfield label="First Name" id="%{#attr['id']}_firstName}"></s:textfield>
			<s:textfield label="Surname" id="%{#attr['id']}_surname"></s:textfield>
		</div>
		
		<div class="xdev-sub">
			<sj:a id="%{#attr['id']}_searchBtn" 
				button="true" 
			>Search Contact</sj:a>
			
			<sj:a id="%{#attr['id']}_noneBtn" 
				button="true" 
			>None</sj:a>
			
			<sj:a id="%{#attr['id']}_clearBtn" 
				button="true" 
			>Clear</sj:a>
			
			<sj:a id="%{#attr['id']}_createBtn" 
				button="true" 
			>Create</sj:a>
			
			<s:checkbox name="%{#attr['id']}_includeChkBx" label="Include In-active" />
		</div>
		
	</div>
	
	<div class="xdev-window-body">
		<sjg:grid
	        id="%{#attr['id']}_gridtable"
	        gridModel=""
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="name" index="name" title="Contact Name" sortable="true"/>
	        <sjg:gridColumn name="phone" index="phone" title="Mobile Phone" sortable="true"/>
	        <sjg:gridColumn name="email" index="email" title="Email" sortable="true"/>
	        <sjg:gridColumn name="type" index="type" title="Contact Type" sortable="true"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active?" sortable="true"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
		<sj:a id="%{#attr['id']}_selectBtn" 
			button="true"
		>Select</sj:a>
		
		<sj:a id="%{#attr['id']}_editBtn" 
			button="true"
		>Edit</sj:a>
		
		<sj:a id="%{#attr['id']}_closeBtn" 
			button="true" 
		>Close</sj:a>
	</div>
</div>
