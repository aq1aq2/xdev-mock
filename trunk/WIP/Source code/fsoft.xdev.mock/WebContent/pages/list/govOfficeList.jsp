<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<s:form>
	<s:url id="listGovermentOfficeRegion" action="listGovernmentOfficeRegion.action"></s:url>
	<sjg:grid
       id="gridtable"
       dataType="json"
       href="%{listGovermentOfficeRegion}"
       gridModel="listGovernmentOfficeRegion"
       autowidth="true"
 	    rowNum="2"
     		rownumbers="true"
       pager="true"
       navigator="true"
   >
        <sjg:gridColumn name="name" index="name" title="Gove Office Region Name" sortable="true"/>
        <sjg:gridColumn name="description" index="description" title="Description" sortable="true"/>
        <sjg:gridColumn name="counties.name" index="counties" title="county" sortable="true"/>
        <sjg:gridColumn name="isActive" index="isActive" title="Is Active?" sortable="true"/>
	</sjg:grid>
</s:form>
	