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
		/* Filter click event */
		var filterKey = "";
		var filterActive = false;
		
		function sendFilterOptions() {
			query = "filterKey="+filterKey;
			query += '&';
			query += "filterActive="+filterActive;			
			$.getJSON("listTrustRegion.action?" + query,
				function(data) {
					$('#gridtable').trigger('reloadGrid',[{page:1}]);
			});
		}
		
		$("ul#xdev-filter > li").click(function(){
			filterKey = this.textContent;
			sendFilterOptions();
		});
		
		$("#includeChkBx").click(function(){
			filterActive = $(this).is(":checked");
			sendFilterOptions();
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
  

