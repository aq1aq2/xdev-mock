<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Trust Distric Input</h1>
	</div>
	
	<div class="xdev-window-header">
		<@sj.a id="${id!}_saveBtn"
			dataType="json"
			button="true"
		>
		Save</@sj.a>
		
		<@sj.a id="${id!}_backBtn" 
			button="true" 
		>Back</@sj.a>
	</div>
	
	<div class="xdev-window-body">
		<form id="${id!}_form">
			<!--Hiden to get TrustRegionID-->
			<@s.hidden name="trustDistrict.trustRegions.trustRegionId" label="Trust Region ID" value="106" isXField=true/><br>
			<@s.textfield name="trustDistrict.trustRegions.name" label="Trust Region Name" isXField=true/><br>
			<@s.textfield name="trustDistrict.name" label="Trust Distric Name" required="true" isXField=true/><br>
			<@s.textarea name="trustDistrict.description" label="Description" cols="12" rows="3" isXField=true/><br>
		</form>
		<div class="clear"></div>
	</div>
	