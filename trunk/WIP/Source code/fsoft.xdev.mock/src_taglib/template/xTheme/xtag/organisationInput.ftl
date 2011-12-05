<script>
	function openOrganisationInput() {
		window.location.href = "organisationInputTemplate.action";
	}
</script>

<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Organisation Input</h1>
	</div>
	
	<div class="xdev-window-header">
		<@sj.a id="${id!}_saveBtn" 
			button="true" 
		>Save</@sj.a>
		
		<@sj.a id="${id!}_backBtn" 
			button="true" 
		>Back</@sj.a>
	</div>
	
	<div class="xdev-window-body">
		<@sj.tabbedpanel id="${id!}_tabs">
			<@sj.tab id="${id!}_tab1" target="details1" label="Details 1"/>
			<@sj.tab id="${id!}_tab2" target="details2" label="Details 2"/>
			
			<#-- Details 1 -->
			<div class="xdev-window-body-sub" id="details1">
				<div class="xdev-field">
					<@s.textfield name="organisationName" label="Organisation Name" required="true"/>
				</div>
				<div class="xdev-field">
					<@s.textarea name="organisationDesc" label="Organisation Short Description" cols="12" rows="3" required="true"/>
				</div>
				<div class="xdev-field">
					<@s.textfield name="leadContact" label="Lead Contact" readonly="true"/>
					<@sj.a id="managerLookup" 
					>lookup</@sj.a>
				</div>
				<div class="clear"></div>
			</div>
			
			<#-- Details 2 -->
			<div class="xdev-window-body-sub" id="details2">
				<div class="xdev-field">
					<@s.select id="bestContactMethod" label="Best Contact Method" list="{}"/>
				</div>
				<div class="xdev-field">
					<@s.textfield name="organisationName" label="Organisation Name" required="true"/>
				</div>
				<div class="xdev-field">
					<@s.textarea name="organisationDesc" label="Organisation Short Description" cols="12" rows="3" required="true"/>
				</div>
				<div class="xdev-field">
					<@s.textfield name="leadContact" label="Lead Contact" readonly="true"/>
					<@sj.a id="managerLookup" 
					>lookup</@sj.a>
				</div>
				<div class="clear"></div>
			</div>

		</@sj.tabbedpanel>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>

