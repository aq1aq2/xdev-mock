<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Trust District List</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="btnCreateDistrict" 
			button="true">
		  	Create
		</sj:a>
		
		<s:checkbox name="includeChkBx" label="Include In-active" />
	</div>
	
	<div class="xdev-window-body">
		<s:form>
		<s:url id="listTrustDistrict" action="listTrustDistrict.action"></s:url>
		<sjg:grid
	        id="gridtable2"
	        dataType="json"
	        href="%{listTrustDistrict}"
	        gridModel="listTrustDistrict"
	        autowidth="true"
	        pager="true"
	    >
	        <sjg:gridColumn name="trustDistrictName" index="trustDistrictName" title="Distric Name" sortable="true"/>
	        <sjg:gridColumn name="description" index="description" title="Description" sortable="false"/>
	        <sjg:gridColumn name="region" index="region" title="Region" sortable="false"/>
	        <sjg:gridColumn name="isAcitived" index="isAcitived" title="IsActived" sortable="false"/>
	    </sjg:grid>
	    </s:form>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>



