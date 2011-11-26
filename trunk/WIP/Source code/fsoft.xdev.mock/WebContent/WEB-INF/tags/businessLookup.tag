
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Search Business Type</h1>
	</div>	
	<div class="xdev-window-body">
		<s:form>
		<s:url id="listBusinessType" action="listBusinessType.action"></s:url>
		<s:textfield label="Business name"></s:textfield>
		<s:textfield label="SIC code"></s:textfield>
		<sj:a id="btnsearch" 
			button="true" 
		>Search</sj:a>
		
		<sj:a id="btnNone" 
			button="true" 
		>None</sj:a>
		
		<sj:a id="btnClear" 
			button="true" 
		>Clear</sj:a>
		
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listBusinessType}"
	        gridModel="listBusinessType"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="name" index="name" title="Business Name" sortable="true"/>
	        <sjg:gridColumn name="code" index="code" title="SIC code" sortable="false"/>	       
	    </sjg:grid>
	    </s:form>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



