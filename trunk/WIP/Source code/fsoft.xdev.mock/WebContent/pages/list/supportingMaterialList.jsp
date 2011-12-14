<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<title>Supporting Material List</title>

<!-- Section Title -->
<content tag="sectionTitle">Supporting Material List</content>

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
		<sjg:gridColumn name="url" index="url" title="url" sortable="true"/>
		<sjg:gridColumn name="description" index="description" title="description" sortable="true"/>
		<sjg:gridColumn name="type" index="type" title="type" sortable="true"/>
		<sjg:gridColumn name="users" index="users" title="Added By" sortable="false" formatter="checkbox"/>
		<sjg:gridColumn name="addedDate" index="addedDate" title="Added Date" sortable="true"/>
	</sjg:grid>
</s:form>