
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title>Premise</title>

<!-- body -->
	<s:form>
		<s:url id="premiseList" action="listPremises"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{premiseList}"
	        gridModel="listPremises"
	        autowidth="true"
	        pager="true"
	        rowNum="3"
	        rownumbers="true"
	        navigator="true"
	        >

	        <sjg:gridColumn name="locationName" index="locationName" title="Location Name" sortable="true"/>
	        <sjg:gridColumn name="addressLine1" index="addressLine1" title="Address Line1" sortable="false"/>
	        <sjg:gridColumn name="postCode" index="postCode" title="Post Code" sortable="false"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</s:form>
