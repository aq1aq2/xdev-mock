<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Contact Input</h1>
	</div>
	
	<div class="xdev-window-header">
	</div>
	
	<div class="xdev-window-body">
		<form id="${id!}_form">
			<@s.textfield name="firstName" label="Frist Name" required="true" isXField=true/>
			<@s.textfield name="surname" label="Surname" required="true" isXField=true/>
			<@s.textfield name="knowAs" label="Know As" isXField=true/>
			<@s.textfield name="officePhone" label="Office Phone" isXField=true/>
			<@s.textfield name="mobilePhone" label="Mobile Phone" isXField=true/>
			<@s.textfield name="homePhone" label="ST Home Phone" isXField=true/>
			<@s.textfield name="emailAddress" label="Email Address" isXField=true/>
			<@xdev.textLookup name="managerName" label="Manager Name" isXField=true/>
			<@s.select name="contactType" label="Contact Type" list="{}" required="true" isXField=true/>
			<@s.select name="bestContactMethod" label="Best Contact Method" list="{}" isXField=true/>
			<@s.textfield name="jobRole" label="Job Role" isXField=true/>
			<@s.textfield name="workbase" label="Workbase" isXField=true/>
			<@s.textfield name="jobTitle" label="Job Title" isXField=true/>
			<@s.checkbox name="isActive" label="Is Active?" isXField=true/>
		</form>
		<div class="clear"></div>
	</div>
	
	<div class="xdev-window-footer">
		<@sj.a id="${id!}_saveBtn" 
			button="true"
		>Save</@sj.a>
		
		<@sj.a id="${id!}_backBtn" 
			button="true" 
		>Back</@sj.a>
	</div>
</div>
