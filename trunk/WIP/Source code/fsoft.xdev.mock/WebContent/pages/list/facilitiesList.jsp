<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title>Facilities</title>

<script type="text/javascript">
        function formatLink(cellvalue, options, rowObject) {
                return "<a href='detailFacilities.action?facilities.facilityId="+rowObject['facilityId']+"'>" + cellvalue + "</a>";
        }        
</script>

<!-- body -->

	<s:form>
		<s:url id="facilitiesList" action="listFacilities"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{facilitiesList}"
	        gridModel="listFacilities"
	        autowidth="true"
	        pager="true"
	        rowNum="3"
	        rownumbers="true"
	        navigator="true"
	        >	        
			<sjg:gridColumn name="facilityId" index="facilityId" title="ID" hidden="true"/>
	        <sjg:gridColumn name="facilityType" index="facilityType" title="Facility Type" sortable="true" formatter="formatLink"/>
	        <sjg:gridColumn name="facilityDescription" index="facilityDescription" title="Description" sortable="false"/>
	        <sjg:gridColumn name="contacts.firstName" index="contacts" title="Lead Contacts" sortable="false"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</s:form>