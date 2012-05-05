<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Department List</title>
<!-- Section Title -->
<content tag="sectionTitle">Department List</content>

<s:url id="listURL" action="listDepartment.action"></s:url>
<sjg:grid
	id="departmentList_gridtable"
	dataType="json"
	href="%{listURL}"
	gridModel="listModel"
	autowidth="true"
	pager="true"
	rowNum="15"
	rownumbers="true"
>
	<sjg:gridColumn name="name" index="name" title="name" sortable="true"/>
	<sjg:gridColumn name="addr1" index="addr1" title="addr1" sortable="true"/>
	<sjg:gridColumn name="postCode" index="postCode" title="postCode" sortable="true"/>
<%-- Need more column 
	<sjg:gridColumn name="users" index="users" title="Added By" sortable="false" formatter="checkbox"/> 
--%>
	<sjg:gridColumn name="isActive" index="isActive" title="isActive" sortable="true"/>
</sjg:grid>
