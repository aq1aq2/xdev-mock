<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title> test Input</title>

<script type="text/javascript">
<!--

//-->
	function formatDate(k){
		var dateTimeSplit = k.val().split('/');
		var result = dateTimeSplit[2] + '/' + dateTimeSplit[1] + '/' + dateTimeSplit[0];
		k.val(result);
	}

</script>

<script type="text/javascript">
$(document).ready(function(){
	
	$("#testScript").click(function(){
// 	var dateTimeSplit = $("#startDate").val().split('/');
// 	var startDate = dateTimeSplit[2] + '/' + dateTimeSplit[1] + '/' + dateTimeSplit[0];
// 	alert(startDate);
// 	formatDate($("#startDate"));
// 	alert($("#startDate").val());
	 var date = $("#startDate").datepicker("getDate");
	 alert(date);
	
	});
});
</script>

<!-- body -->
	<div>
	<s:form cssClass="xdev-form" name="facilitiesForm" id="facility">
			<!--  
			<s:textfield name="facility.facilityId" label="FacilityID"></s:textfield>
			-->
			<sj:datepicker id="startDate" name="volunteer.startDate" displayFormat="dd/mm/yy" label="Start Date"/>
			<s:submit id="testScript"></s:submit>
	</s:form>
	</div>
	
<!-- Lookup Dialog -->
