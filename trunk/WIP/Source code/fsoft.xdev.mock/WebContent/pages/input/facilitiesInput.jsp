
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<title> Premise Input</title>

<s:textfield name="facilities.facilityId" value="%{facilities.facilityId}"></s:textfield>

<script type="text/javascript">
<!--
	
	$(document).ready(function(){
// 		if (document.facilitiesForm.equipmentAvailable.checked ==true){
// 			document.facilitiesForm.roomEquipmentNotes.disable = false;
// 		} 
// 		else {
// 			document.facilitiesForm.roomEquipmentNotes.disable = true;
// 		}
		$("#equipmentAvailable").click(function(){
			alert("click");
			if($("#equipmentAvailable").is(":checked") == true) {
				// alert("disable textarea");
				$("#roomEquipmentNotes").attr("disabled", "true");
			}
			else {
				// alert("enable textarea");
				$("#roomEquipmentNotes").removeAttr("disabled");
			}
		});
		
		
	});

//-->

</script>
<!-- body -->
	<div>
	<s:form cssClass="xdev-form" name="facilitiesForm">
			<s:select list="{}" label="Facility Type"></s:select>
			<s:textfield name="contacts.firstName" label="Lead Contact"></s:textfield>
			<s:textarea name="facilityDescription" label="Facility Description" cols="12" rows="3"></s:textarea>
			<s:textfield name="roomCapacity" label="Room Capacity"></s:textfield>
			<s:checkbox  id="equipmentAvailable" name="equipmentAvailable" label="Equipment Available"></s:checkbox>
			<s:textfield name="roomSize" label="Room Size"></s:textfield>
			<s:textarea id="roomEquipmentNotes" name="roomEquipmentNotes" label="Room & Equipment Notes" ></s:textarea>
			<s:checkbox name="roomConnectivity" label="Room Connectivity" checked="true"></s:checkbox>
			<s:textarea name="wirelessAccessInfomation" label="Wireless Access Infomation" ></s:textarea>
	</s:form>
	</div>