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

<!-- Account information -->
<div class="xdev-account">
	<label>${sessionScope.userName}</label>
	<a href="outLogin.action">Logout</a>
</div>

<!-- Main menu -->
<ul id="topnav">
	<li><a href="homeNav.action">Home</a></li>
	<li><a href="orgNav.action">Organisation</a></li>
	
	<li onmouseover="display('space')" onmouseout="display('space')">
		<a href="serviceNav.action" >Services</a>
		<span>
			<a href="programmeNav.action">Programme Maintenances</a> |
			<a href="serviceNav.action">Service Maintenances</a>
		</span>
	
	</li>
        
	<li onmouseover="display('space')" onmouseout="display('space')">
		<a href="regionNav.action">Geography</a>
		<span>
			<a href="regionNav.action">Trust Region/Trust District Maintenances</a> |
			<a href="govNav.action">Government Office Region</a>
		</span>
	</li>
        
	<li><a href="premiseNav.action">Premises</a></li>
</ul>

<div id="space" class="hide">&nbsp;</div>
<div class="clear"></div>
