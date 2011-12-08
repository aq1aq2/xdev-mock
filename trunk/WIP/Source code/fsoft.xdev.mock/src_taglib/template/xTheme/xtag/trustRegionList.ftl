<script>
	$(document).ready(function(){

		function add(parentId, dialogId) {
		
			$('#'+dialogId+'_saveBtn').click(function(){
				var query = "";
				var xForms = $('form[id^="'+ dialogId +'"]');
				$.each(xForms, function(){
					// Read id of each form in xForms
					// this implicit an element in the array
					// Searialize data in each form
					var str = $(this).serialize();
					// Concat query string. MUST ADD & symbol !
					query = query + str + "&";
				});			
				query = query.substring(0, query.length-1);
				//alert(query);
				// Get json
				$.getJSON("saveTrustRegion.action?" + query,
					function(data) {
						// Do nothing
						// alert("reload_" + parentId + "_listURL");
						// $.publish("reloadOk");	
						$('#${id!}_gridtable').trigger('reloadGrid');
					}
				);
			});
		}
		
		$('#${id!}_trustRegionInput').hide();
		
		$('#${id!}_createBtn').click(function(){
			$('#${id!}_trustRegionInput').show();
		});
		
		$('#${id!}_includeChkBx').click(function(){
			alert("click include in-active");
		});
		
		add("${id!}", "${id!}_trustRegionInput");
	});

</script>

<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Trust Region List</h1>
	</div>
	
	<div class="xdev-window-header">		
		
		<div class="xdev-sub">
			<@sj.a id="${id!}_createBtn" 
				button="true" 
			>Create</@sj.a>
			
			<@s.checkbox name="${id!}_includeChkBx" label="Include In-active" />
		</div>
		
	</div>
	
	<div class="xdev-window-body" >
	
		<#-- Grid here -->
		<@s.url id="${id!}_listURL" action="listTrustRegion.action"></@s.url>
		<@sjg.grid
	        id="${id!}_gridtable"
	        dataType="json"
	        href="%{${id!}_listURL}"
	        gridModel="listModel"
	        autowidth="true"
	        pager="true"
    		rowNum="100"
    		rownumbers="true"
	    >
	    	<@sjg.gridColumn name="name" index="name" title="Trust Region Name" sortable="true"/>
	        <@sjg.gridColumn name="description" index="description" title="Description" sortable="true"/>
	        <@sjg.gridColumn name="countries.name" index="countries.name" title="Nation/Country" sortable="true"/>	       
	        <@sjg.gridColumn name="isActive" index="isActive" title="IsActive" sortable="false"/>
	    </@sjg.grid>
	    
	</div>

	<div class="xdev-window-footer">		
	</div>
	
	<@xdev.trustRegionInput id="${id!}_trustRegionInput"/>
	
</div>
