
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title>Premise</title>
<script type="text/javascript">
$(document).ready(function(){
	/* Filter click event */
	var filterKey = "";
	var filterActive = false;
	
	function sendFilterOptions() {
		query = "filterKey="+filterKey;
		query += '&';
		query += "filterActive="+filterActive;
		$.getJSON("listPremises.action?" + query,
			function(data) {
				$('#gridtable').trigger('reloadGrid');
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
			<sjg:gridColumn name="premiseId" index="premiseId" title="ID" hidden="true"/>
			<sjg:gridColumn name="name" index="name" title="Premise Name" sortable="true"/>
	        <sjg:gridColumn name="locationName" index="locationName" title="Location Name" sortable="true"/>
	        <sjg:gridColumn name="addressLine1" index="addressLine1" title="Address Line1" sortable="false"/>
	        <sjg:gridColumn name="postcode" index="postcode" title="Post Code" sortable="false"/>
	        <sjg:gridColumn name="status" index="status" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</s:form>
