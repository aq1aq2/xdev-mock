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

<ul id="topnav">
	<li><a href="homeTemplate.action">Home</a></li>
	<li><a href="organisationTemplate.action">Organisation</a></li>
	<li onmouseover="display('space')" onmouseout="display('space')">
	
		<!-- xxx404 means dead link -->
		<a href="xxx404" >Services</a>
		<span>
			<a href="programmeTemplate.action">Programme Maintenances</a> |
			<a href="serviceTemplate.action">Service Maintenances</a>
		</span>
	
	</li>
        
	<li onmouseover="display('space')" onmouseout="display('space')">
		<a href="xxx404">Geography</a>
		<span>
			<a href="trustRegionMaintenanceTemplate.action">Trust Region/Trust District Maintenances</a> |
			<a href="xxx404">Government Office Region</a>
		</span>
	</li>
        
	<li><a href="premisesTemplate.action">Premises</a></li>
</ul>

<div id="space" class="hide">&nbsp;</div>
<div class="clear"></div>

<!-- Account information -->
<label>${sessionScope.userName}</label>
<a href="outLogin.action">Logout</a>

