<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<title>Supporting Material List</title>
<s:form>
	<s:url id="supportingMaterialList_listURL" action="listSupportingMaterial.action"></s:url>
	<sjg:grid
	   	id="supportingMaterialList_gridtable"
	  	dataType="json"
	  	href="%{supportingMaterialList_listURL}"
	    gridModel="listModel"
	    autowidth="true"
	    pager="true"
	    rowNum="15"
       	rownumbers="true"
	>
<%-- 		<sjg:gridColumn name="name" index="name" title="Name" sortable="true"/> --%>
<%-- 		<sjg:gridColumn name="headOfficeAddLine1" index="headOfficeAddLine1" title="HeadOfficeAddLine1" sortable="true"/> --%>
<%-- 		<sjg:gridColumn name="postCode" index="postCode" title="PostCode" sortable="true"/> --%>
<%-- 		<sjg:gridColumn name="contact" index="contact" title="Contact" sortable="true"/> --%>
<%-- 		<sjg:gridColumn name="isActive" index="isActive" title="IsActive" sortable="false" formatter="checkbox"/> --%>
	</sjg:grid>
</s:form>