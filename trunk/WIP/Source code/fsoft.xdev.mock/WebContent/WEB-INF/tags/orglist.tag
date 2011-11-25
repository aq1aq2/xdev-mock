<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Organisation List</h1>
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
		<sjg:grid
	        id="gridtable"
	        gridModel=""
	        autowidth="true"
	        pager="true"
	    	rowList="10,15,20"
	    	rowNum="15"
	    	rownumbers="true"
	    >
	        <sjg:gridColumn name="name" index="orgName" title="Organisation Name" sortable="true"/>
	        <sjg:gridColumn name="office" index="office" title="Head Office" sortable="false"/>
	        <sjg:gridColumn name="postcode" index="postcode" title="Postcode" sortable="false"/>
	        <sjg:gridColumn name="contact" index="contact" title="Contact" sortable="true"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active?" sortable="true"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



