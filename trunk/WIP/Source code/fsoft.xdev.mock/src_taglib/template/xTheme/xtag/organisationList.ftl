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
			onclick="openOrganisationInput()"
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
</div>
