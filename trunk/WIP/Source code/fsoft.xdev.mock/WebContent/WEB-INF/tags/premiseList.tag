<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Premise List</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="createBtn" 
			button="true" 
		>
		  	Create
		</sj:a>
		
		<s:checkbox name="includeChkBx" label="Include In-active" />
	</div>
	
	<div class="xdev-window-body">
		<s:url id="getcustomer" action="getcustomer.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{getcustomer}"
	        gridModel="listCustomer"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	        <sjg:gridColumn name="email" index="email" title="Email" sortable="false"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>