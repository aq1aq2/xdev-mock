<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Contact List</h1>
	</div>
	
	<div class="xdev-window-header">
		<div class="xdev-sub">
			<s:textfield label="First Name"></s:textfield>
			<s:textfield label="Surname"></s:textfield>
		</div>
		
		<div class="xdev-sub">
			<sj:a id="searchBtn" 
				button="true" 
			>Search Contact</sj:a>
			
			<sj:a id="noneBtn" 
				button="true" 
			>None</sj:a>
			
			<sj:a id="clearBtn" 
				button="true" 
			>Clear</sj:a>
			
			<sj:a id="createBtn" 
				button="true" 
			>Create</sj:a>
			
			<s:checkbox name="includeChkBx" label="Include In-active" />
		</div>
		
	</div>
	
	<div class="xdev-window-body">
		<sjg:grid
	        id="gridtable"
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
		<sj:a id="selectBtn" 
			button="true" 
		>Select</sj:a>
		
		<sj:a id="editBtn" 
			button="true" 
		>Edit</sj:a>
		
		<sj:a id="closeBtn" 
			button="true" 
		>Close</sj:a>
	</div>
</div>
