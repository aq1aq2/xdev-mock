<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Trust Region</title>
<script type="text/javascript">
        function formatLink(cellvalue, options, rowObject) {
                return "<a href='detailTrustRegion.action?trustRegion.trustRegionId="+rowObject['trustRegionId']+"'>" + cellvalue + "</a>";
        }   
       
</script>

<script>
	$(document).ready(function(){
		$("ul#xdev-filter > li").click(function() {
			alert(this.textContent);
		});
	});
</script>


<!-- body -->	
		
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
	        <sjg:gridColumn name="countryName" index="countryName" title="Nation/country" sortable="true"/>
	        <sjg:gridColumn name="status" index="status" title="IsActived" sortable="true"/>	        
	    </sjg:grid>    
  

