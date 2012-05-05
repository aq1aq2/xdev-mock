<script>
	
	$(document).ready(function(){
		/*
		function add(parentId, dialogId) {
			alert(parentId + " " + dialogId);
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
				$.getJSON("saveContact.action?" + query,
					function(data) {
						// Do nothing
						// alert("reload_" + parentId + "_listURL");
						// $.publish("reloadOk");	
						$('#${id!}_gridtable').trigger('reloadGrid');
					}
				);
			});
		}*/
		
		//$('#${id!}_contactInput').hide();
		
		/*
		$('#${id!}_createBtn').click(function(){
			alert('123');
			// Load data
			// Then show
			$('#${id!}_contactInput').show();
			$('#${id!}_contactInput').load('contactInput.jsp');
		});
		*/
		/*
		$('#${id!}_includeChkBx').click(function(){
			alert("click include in-active");
		});
		*/
		/*
		$('#${id!}_backBtn').click(function(){
			$('#${id!}_contactInput').hide();
		});
		*/	
		//$.add("${id!}", "${id!}_contactInput");
		
		//$('${id!}_contactInput_managerLookup_dialog').hide();
		
	});

</script>

<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Contact List</h1>
	</div>
	
	<div class="xdev-window-header">
		<div class="xdev-sub">
			<@s.textfield label="First Name" id="${id!}_firstName"/>
			<@s.textfield label="Surname" id="${id!}_surname"/>
		</div>
		
		<div class="xdev-sub">
			<@sj.a id="${id!}_searchBtn" 
				button="true" 
			>Search Contact</@sj.a>
			
			<@sj.a id="${id!}_noneBtn" 
				button="true" 
			>None</@sj.a>
			
			<@sj.a id="${id!}_clearBtn" 
				button="true" 
			>Clear</@sj.a>
			
			<@sj.a id="${id!}_createBtn" 
				button="true"
				onclick="$.showElement('${id!}_contactInput')"
			>Create</@sj.a>
			
			<@s.checkbox name="${id!}_includeChkBx" label="Include In-active" />
		</div>
		
	</div>
	
	<div class="xdev-window-body" >
	
		<#-- Grid here -->
		<@s.url id="${id!}_listURL" action="listContact.action"></@s.url>
		<@sjg.grid
	        id="${id!}_gridtable"
    		caption="Contact List"
	        dataType="json"
	        href="%{${id!}_listURL}"
	        pager="true"
	        gridModel="listModel"
	    	rowList="10,15,20"
	    	rowNum="15"
	    	rownumbers="true"
	    	navigator="false"
        	navigatorSearch="true"
	    >
	        <@sjg.gridColumn name="firstName" index="firstName" title="Contact Name" sortable="true" 
	        		search="true"
        			searchoptions="{sopt:['eq','ne']}"/>
	        <@sjg.gridColumn name="mobilePhone" index="mobilePhone" title="Mobile Phone" sortable="true"/>
	        <@sjg.gridColumn name="emailAddress" index="emailAddress" title="Email" sortable="true"/>
	        <@sjg.gridColumn name="contactType" index="contactType" title="Contact Type" sortable="true"/>
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
	
	<div id="${id!}_contactInput">
		fwwe
	</div>
</div>
