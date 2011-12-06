<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Contact Input</h1>
	</div>
	
	<div class="xdev-window-header">
	</div>
	
	<div class="xdev-window-body">
		<form id="${id!}_form">
			<@s.textfield name="contact.firstName" label="Frist Name" required="true" isXField=true/>
			<@s.textfield name="contact.surname" label="Surname" required="true" isXField=true/>
			<@s.textfield name="contact.knowAs" label="Know As" isXField=true/>
			<@s.textfield name="contact.officePhone" label="Office Phone" isXField=true/>
			<@s.textfield name="contact.mobilePhone" label="Mobile Phone" isXField=true/>
			<@s.textfield name="contact.homePhone" label="ST Home Phone" isXField=true/>
			<@s.textfield name="contact.emailAddress" label="Email Address" isXField=true/>
			<@xdev.textLookup name="contact.managerName" label="Manager Name" isXField=true/>
			<@s.select name="contact.contactType" label="Contact Type" list="{'sample data test'}" required="true" isXField=true/>
			<@s.select name="contact.bestContactMethod" label="Best Contact Method" list="{'sample data test'}" isXField=true/>
			<@s.textfield name="contact.jobRole" label="Job Role" isXField=true/>
			<@s.textfield name="contact.workbase" label="Workbase" isXField=true/>
			<@s.textfield name="contact.jobTitle" label="Job Title" isXField=true/>
			<@s.checkbox name="contact.isActive" label="Is Active?" isXField=true/>
		</form>
		<div class="clear"></div>
	</div>
	
	
	<div class="xdev-window-footer">
		<@sj.a id="${id!}_saveBtn"
			dataType="json"
			button="true"
			onClickTopics="refreshContactList" 
		>
		Save</@sj.a>
		
		<@sj.a id="${id!}_backBtn" 
			button="true" 
		>Back</@sj.a>
	</div>
</div>
