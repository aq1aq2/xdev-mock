<script>
	function openTrustRegionInput() {
		alert(${parameters.id});
	}
</script>

<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Trust Region Input</h1>
	</div>
	
	<div class="xdev-window-header">
		<@sj.a id="${id!}_saveBtn" 
			button="true"
			dataType="json"
		>Save</@sj.a>		
		
		
		<@sj.a id="${id!}_backBtn" 
			button="true" 
		>Back</@sj.a>
	</div>
	
	<div class="xdev-window-body">
		
			<#-- Details 1 -->
			<form id="${id!}_form">
					<@s.url id="${id!}_listURL" action="listTrustRegion.action"/>
					<@sj.select
						dataType="json"
						href="%{${id!}_listURL}"
						list="listCountries" listValue='name' listKey='countryId'
						name="trustRegions.countries.countryId" label="Nation/Country" required="true" /></br>
					<@s.textfield name="trustRegions.name" label="Trust Region Name" cols="12" rows="3" required="true"/></br>
					<@s.textarea name="trustRegions.description" label="Description" cols="12" rows="3" />
				
				
			</form>		
			
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>

