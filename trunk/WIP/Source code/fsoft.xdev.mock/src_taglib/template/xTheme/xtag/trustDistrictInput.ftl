<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Trust Distric Input</h1>
	</div>
	
	<div class="xdev-window-header">
		<@sj.a id="${id!}_saveBtn" 
			button="true"
			onclick="openTrustDistrictInput();"
		>Save</@sj.a>
		
		<@sj.a id="${id!}_backBtn" 
			button="true" 
		>Back</@sj.a>
	</div>
	
	<div class="xdev-window-body">
		<form id="${id!}_form1">
			<@s.textfield name="trustDistric.trustRegions.name" label="Frist Name" readonly = "true" isXField=true/><br>
			<@s.textfield name="trustDistric.name" label="Trust Distric Name" required="true" isXField=true/><br>
			<@s.textfield name="trustDistric.description" label="Description" isXField=true/>
		</form>
		<div class="clear"></div>
	</div>
	