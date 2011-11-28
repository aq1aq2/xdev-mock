<style type="text/css">
/*
body {
	font: 10px normal Verdana, Arial, Helvetica, sans-serif;
	margin: 0;
	padding: 0;
}
*/

</style>

<script type="text/javascript" src="../js/lib/jquery-1.7.1.js"></script>
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
        <li><a href="#">Home</a></li>
        <li><a href="#">Organisation</a></li>
        <li onmouseover="display('space')" onmouseout="display('space')">
            <a href="#" >Services</a>
            <span>
                <a href="#">Programme Maintenances</a> |
                <a href="#">Service Maintenances</a>
            </span>
        </li>
        <li onmouseover="display('space')" onmouseout="display('space')">
            <a href="#">Geography</a>
            <span>
                <a href="#">Trust Region/Trust District Maintenances</a> |
                <a href="#">Development</a>
            </span>
        </li>
        <li><a href="#">Premises</a></li>
    </ul>
    <div id="space" class="hide">&nbsp;</div>
    <div class="clear"></div>
</div>
