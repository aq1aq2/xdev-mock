<script type="text/javascript">
function display (category) {
	var whichcategory = document.getElementById(category);
	if (whichcategory.className=="show") {
		whichcategory.className="hide";
	} else {
		whichcategory.className="show";
	}
}
</script>
<div class="container">	
    <ul id="topnav">
        <li><a href="homeTemplate.action">Home</a></li>
        <li><a href="organisationTemplate.action">Organisation</a></li>
        <li onmouseover="display('space')" onmouseout="display('space')">
            <a href="serviceMaintenanceTemplate.action" >Services</a>
            <span>
                <a href="programmeMaintenanceTemplate.action">Programme Maintenances</a> |
                <a href="serviceMaintenanceTemplate.action">Service Maintenances</a>
            </span>
        </li>
        <li onmouseover="display('space')" onmouseout="display('space')">
            <a href="trustRegionMaintenanceTemplate.action">Geography</a>
            <span>
                <a href="trustRegionMaintenanceTemplate.action">Trust Region/Trust District Maintenances</a> |
                <a href="trustRegionMaintenanceTemplate.action">Development</a>
            </span>
        </li>
        <li><a href="premisesTemplate.action">Premises</a></li>
    </ul>
    <div id="space" class="hide">&nbsp;</div>
    <div class="clear"></div>
</div>
