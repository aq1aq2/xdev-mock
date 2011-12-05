<script>
	function openOrganisationInput() {
		window.location.href = "organisationInputTemplate.action";
	}
</script>

<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Organisation List</h1>
	</div>
	
	<div class="xdev-window-header">
		<@sj.a id="${id!}_createBtn" 
			button="true"
			onclick="${id!}.style.display='none'"
		>Create</@sj.a>
		<@s.checkbox name="${id!}_includeChkBx" label="Include In-active" />
	</div>
	
	<div class="xdev-window-body">
		<@s.url id="${id!}_listURL" action="listOrganisation.action"></@s.url>
		<@sjg.grid
	        id="${id!}_gridtable"
	        dataType="json"
	        href="%{${id!}_listURL}"
	        gridModel="listOrganisation"
	        autowidth="true"
	        pager="true"
	    >
	        <@sjg.gridColumn name="name" index="name" title="Name" sortable="true"/>
	        <@sjg.gridColumn name="headOfficeAddLine1" index="headOfficeAddLine1" title="HeadOfficeAddLine1" sortable="true"/>
	        <@sjg.gridColumn name="postCode" index="postCode" title="PostCode" sortable="true"/>
	        <@sjg.gridColumn name="contact" index="contact" title="Contact" sortable="true"/>
	        <@sjg.gridColumn name="isActive" index="isActive" title="IsActive" sortable="false" formatter="checkbox"/>
	    </@sjg.grid>
	</div>
	
	<div class="xdev-window-footer">
		<@xdev.organisationInput id="nestedInput" />
	</div>
	
	<#-- ------- -->
	<#-- Dialogs -->
	<#-- ------- -->
	
	<@sj.dialog 
    	id="${id!}_dialog_contactInput" 
    	autoOpen="false" 
    	modal="true" 
    	title="Contact Input"
    	width="965"
    	draggable="false"
    	resizable="false"
    >
    	<@xdev.organisationInput id="nestedInputDialog" />
    </@sj.dialog>
    
    <div id="dialog-form" class="ui-dialog-content ui-widget-content">
		<@xdev.organisationInput id="nestedInputDialog2" />
	</div>
	
	<script>
	$(function() {
		$( "#dialog:ui-dialog" ).dialog( "destroy" );
		
		$( "#dialog-form" ).dialog({
			autoOpen: false,
			height: 300,
			width: 350,
			modal: true,
			buttons: {
				"Create an account": function() {
				},
				Cancel: function() {
					$( this ).dialog( "close" );
				}
			},
			close: function() {
				allFields.val( "" ).removeClass( "ui-state-error" );
			}
		});

		$( "#create-user" )
			.button()
			.click(function() {
				$( "#dialog-form" ).dialog( "open" );
			});
	});
	</script>
	<button id="create-user" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" role="button" aria-disabled="false"><span class="ui-button-text">Create new user</span></button>
</div>
