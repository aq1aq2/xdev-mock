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
				// Get json
				$.getJSON("saveGovOffice.action?" + query,
					function(data) {
						// Do nothing
						// alert("reload_" + parentId + "_listURL");
						// $.publish("reloadOk");	
						$('#${id!}_gridtable').trigger('reloadGrid');
					}
				);
			});
		}
		
		$('#${id!}_govOfficeInput').hide();
		
		$('#${id!}_createBtn').click(function(){
			$('#${id!}_govOfficeInput').show();
		});
		
		$('#${id!}_includeChkBx').click(function(){
			alert("click include in-active");
		});
		
		add("${id!}", "${id!}_govOfficeInput");
	});

</script>

<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Government Office Region List</h1>
	</div>
	
	<div class="xdev-window-header">	
		<div class="xdev-sub">		
			<@s.checkbox name="${id!}_includeChkBx" label="Include In-active" />
		</div>	
	</div>
	
	<div class="xdev-window-body" >
	
		<#-- Grid here -->
		<@s.url id="${id!}_listURL" action="listGovernmentOfficeRegion.action"></@s.url>
		<@sjg.grid
	        id="${id!}_gridtable"
	        dataType="json"
	        href="%{${id!}_listURL}"
	        gridModel="listGovernmentOfficeRegion"
	        autowidth="true"
	        pager="true"
	        navigator="true"
    		rowNum="2"
    		rownumbers="true"
	    >
	        <@sjg.gridColumn name="name" index="name" title="Gove Office Region Name" sortable="true"/>
	        <@sjg.gridColumn name="description" index="description" title="Description" sortable="true"/>
	        <@sjg.gridColumn name="counties.name" index="counties" title="county" sortable="true"/>
	        <@sjg.gridColumn name="isActive" index="isActive" title="Is Active?" sortable="true"/>
	    </@sjg.grid>
	    
	</div>

	<div class="xdev-window-footer">
		<@sj.a id="${id!}_selectBtn" 
			button="true"
		>Select</@sj.a>
		
		<@sj.a id="${id!}_editBtn" 
			button="true"
		>Edit</@sj.a>
		
		<@sj.a id="${id!}_closeBtn" 
			button="true" 
		>Close</@sj.a>
	</div>
	
	<@xdev.govOfficeInput id="${id!}_govOfficeInput"/>
	
</div>
