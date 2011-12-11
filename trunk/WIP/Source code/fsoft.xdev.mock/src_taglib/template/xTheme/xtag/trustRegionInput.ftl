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
					<table>
						<tr>
							<td>Nation/Country</td>
							<td><@sj.select
								dataType="json"
								href="%{${id!}_listURL}"
								list="listCountries" listValue='name' listKey='countryId'
								name="trustRegions.countries.countryId" required="true" />
							</td>
						</tr>
						<tr>
							<td>Trust region name</td>
							<td><@s.textfield name="trustRegions.name"  cols="120" rows="3" required="true"/></td>
						</tr>
						<tr>
							<td>Description</td>
							<td><@s.textarea name="trustRegions.description"  cols="120" rows="3" /></td>
						</tr>
					</table>					
				
				
			</form>		
			
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>

