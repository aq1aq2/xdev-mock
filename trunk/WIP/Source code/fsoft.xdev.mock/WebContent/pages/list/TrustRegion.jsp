<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Trust Region</title>
<script type="text/javascript">
        function formatLink(cellvalue, options, rowObject) {
                return "<a href='detailTrustRegion.action?trustRegions.trustRegionId="+rowObject['trustRegionId']+")'>" + cellvalue + "</a>";
        }        
</script>

<!-- body -->

	<s:form>
		<s:url id="listTrustRegion" action="listTrustRegion.action"></s:url>
		<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{listTrustRegion}"
	        gridModel="listModel"
	        autowidth="true"
	        pager="true"
	        rowNum="15"
       		rownumbers="true"
	        
	    >
	    	<sjg:gridColumn name="trustRegionId" index="trustRegionId" title="ID" hidden="true"/>
	        <sjg:gridColumn name="name" index="name" title="Name" sortable="true" formatter="formatLink"/>
	        <sjg:gridColumn name="description" index="description" title="Descripstion" sortable="false"/>
	        <sjg:gridColumn name="countries.name" index="countries.name" title="Nation/country" sortable="true"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="IsActived" sortable="true"/>	        
	    </sjg:grid>
    
    </s:form>

