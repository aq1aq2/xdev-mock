<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Contact Input</h1>
	</div>
	
	<div class="xdev-window-header">
			<@sj.a id="${id!}_backBtn" 
			button="true" 
		>Back</@sj.a>
	</div>	
	<div class="xdev-window-body">
		<form id="${id!}_form">
			<@s.textfield name="govtOfficeRegions.name" label="Government Office Region Name" readonly="true" isXField=true/>
			<@s.textfield name="govtOfficeRegions.description" label="Description" readonly="true" isXField=true/>
			<@s.textfield name="govtOfficeRegions.counties.name" label="County" readonly="true"  isXField=true/>
		</form>
		<div class="clear"></div>
	</div>
	

</div>
