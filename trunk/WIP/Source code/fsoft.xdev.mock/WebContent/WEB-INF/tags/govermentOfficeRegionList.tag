<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Government Office List</h1>
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
		<s:form>
		<s:url id="listGovermentOfficeRegion" action="listGovermentOfficeRegion.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listGovermentOfficeRegion}"
	        gridModel="listGovermentOfficeRegion"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="name" index="name" title="Governmant Office Name" sortable="true"/>
	        <sjg:gridColumn name="description" index="description" title="Description" sortable="false"/>
	        <sjg:gridColumn name="country" index="country" title="Country" sortable="false"/>
	        <sjg:gridColumn name="isAcitived" index="isAcitived" title="IsActived" sortable="false"/>
	    </sjg:grid>
	    </s:form>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



