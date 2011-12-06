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
			>Create</@sj.a>
			
			<@s.checkbox name="${id!}_includeChkBx" label="Include In-active" />
		</div>
		
	</div>
	
	<div class="xdev-window-body">
	
		<#-- Grid here -->
		<@s.url id="${id!}_listURL" action="listContact.action"></@s.url>
		<@sjg.grid
	        id="${id!}_gridtable"
	        dataType="json"
	        href="%{${id!}_listURL}"
	        gridModel="listModel"
	        autowidth="true"
	        pager="true"
	    >
	        <@sjg.gridColumn name="contactName" index="firstName" title="Contact Name" sortable="true"/>
	        <@sjg.gridColumn name="mobilePhone" index="mobilePhone" title="Mobile Phone" sortable="true"/>
	        <@sjg.gridColumn name="email" index="emailAddress" title="Email" sortable="true"/>
	        <@sjg.gridColumn name="contactType" index="contactType" title="Contact Type" sortable="true"/>
	        <#-- <@sjg.gridColumn name="isActive" index="isActive" title="Is Active?" sortable="true"/> -->
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
</div>
