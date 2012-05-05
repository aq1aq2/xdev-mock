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
				alert(query);
				// Get json
				$.getJSON("savePremises.action?" + query,
					function(data) {
						// Do nothing
						// alert("reload_" + parentId + "_listURL");
						// $.publish("reloadOk");	
						$('#${id!}_gridtable').trigger('reloadGrid');
					}
				);
			});
		}
		
		$('#${id!}_premiseInput').hide();
		
		$('#${id!}_createBtn').click(function(){
			$('#${id!}_premiseInput').show();
		});
		
		$('#${id!}_includeChkBx').click(function(){
			alert("click include in-active");
		});
		
		add("${id!}", "${id!}_premiseInput");
	});

</script>

<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Premise  List</h1>
	</div>
	
	<div class="xdev-window-header">
		<div class="xdev-sub">
			
		</div>
		
		<div class="xdev-sub">
			<@sj.a id="${id!}_createBtn" 
				button="true" 
			>Create</@sj.a>
			
			<@s.checkbox name="${id!}_includeChkBx" label="Include In-active" />
		</div>
		
	</div>
	
	<div class="xdev-window-body" >
	
		<#-- Grid here -->
		<@s.url id="${id!}_listURL" action="listPremises.action"></@s.url>
		<@sjg.grid
	        id="${id!}_gridtable"
	        dataType="json"
	        href="%{${id!}_listURL}"
	        gridModel="listPremises"
	        autowidth="true"
	        pager="true"
    		rowNum="100"
    		rownumbers="true"
	    >
	    	<@sjg.gridColumn name="locationName" index="locationName" title="Location Name" sortable="true"/>
	    	<@sjg.gridColumn name="addressLine1" index="addressLine1" title="Address Line 1" sortable="true"/>
	    	<@sjg.gridColumn name="postcode" index="postcode" title="Postcode" sortable="true"/>
	    	<@sjg.gridColumn name="isActive" index="isActive" title="Is Active?" sortable="true"/>
	    </@sjg.grid>
	    
	</div>

	<div class="xdev-window-footer">
		
	</div>
	
	<@xdev.trustDistrictInput id="${id!}_premiseInput"/>
	
</div>
