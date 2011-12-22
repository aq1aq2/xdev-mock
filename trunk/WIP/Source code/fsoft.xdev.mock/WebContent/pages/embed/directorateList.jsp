<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<title>Directorate List</title>

<!-- Section Title -->
<content tag="sectionTitle">Directorate List</content>

<s:form>
	<s:url id="directorateList_listURL" action="listDirectorate.action"></s:url>
	<sjg:grid
	   	id="directorateList_gridtable"
	  	dataType="json"
	  	href="%{directorateList_listURL}"
	    gridModel="listModel"
	    autowidth="true"
	    pager="true"
	    rowNum="15"
       	rownumbers="true"
	>
		<sjg:gridColumn name="name" index="name" title="name" sortable="true"/>
		<sjg:gridColumn name="addr1" index="addr1" title="addr1" sortable="true"/>
		<sjg:gridColumn name="postCode" index="postCode" title="postCode" sortable="true"/>
<%-- Need more column <sjg:gridColumn name="users" index="users" title="Added By" sortable="false" formatter="checkbox"/> --%>
		<sjg:gridColumn name="isActive" index="isActive" title="isActive" sortable="true"/>
	</sjg:grid>
</s:form>