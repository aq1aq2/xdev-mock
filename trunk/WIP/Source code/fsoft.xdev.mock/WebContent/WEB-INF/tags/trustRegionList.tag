<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Trust Region List</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="btnCreateRegion" 
			button="true" 
		>
		  	Create
		</sj:a>
		
		<s:checkbox name="includeChkBx" label="Include In-active" />
	</div>
	
	<div class="xdev-window-body">	
		<s:form>
		<s:url id="listTrustRegion" action="listTrustRegion.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listTrustRegion}"
	        gridModel="listTrustRegion"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="name" index="name" title="Name" sortable="true"/>
	        <sjg:gridColumn name="description" index="description" title="Descripstion" sortable="false"/>
	        <sjg:gridColumn name="country" index="country" title="Nation/country" sortable="false"/>
	        <sjg:gridColumn name="isActived" index="isActived" title="IsActived" sortable="false"/>	        
	    </sjg:grid>
	    
	    </s:form>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



