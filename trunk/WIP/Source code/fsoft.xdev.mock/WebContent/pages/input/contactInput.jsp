<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<sj:tabbedpanel id="tabs">
	<sj:tab id="tab1" target="details1" label="Details 1"/>
	<sj:tab id="tab2" target="details2" label="Details 2"/>
			
	<div id="details1" >
		<form id="form" >
			<xdev:xfield type="textfield" name="contact.firstName" label="Frist Name" required="true" />
			<xdev:xfield type="textarea" name="abc" label="Frist Name" required="true" />
			<s:textfield name="contact.surname" label="Surname" required="true" isXField="true"/>
			<s:textfield name="contact.knowAs" label="Know As" isXField="true"/>
			<s:textfield name="contact.officePhone" label="Office Phone" isXField="true"/>
			<s:textfield name="contact.mobilePhone" label="Mobile Phone" isXField="true"/>
			<s:textfield name="contact.homePhone" label="ST Home Phone" isXField="true"/>
			<s:textfield name="contact.emailAddress" label="Email Address" isXField="true"/>
	    	<xdev:textLookup name="contact.managerName" id="managerLookup" label="Manager Name" isXField="true"/>
			<s:select name="contact.contactType" label="Contact Type" list="{'sample data test'}" required="true" isXField="true"/>
			<s:select name="contact.bestContactMethod" label="Best Contact Method" list="{'sample data test'}" isXField="true"/>
			<s:textfield name="contact.jobRole" label="Job Role" isXField="true"/>
			<s:textfield name="contact.workbase" label="Workbase" isXField="true"/>
			<s:textfield name="contact.jobTitle" label="Job Title" isXField="true"/>
			<s:checkbox name="contact.isActive" label="Is Active?" isXField="true"/>
		</form>
		<div class="clear"></div>
	</div>

	<div id="details2" class="xdev-window-body-sub2">
		<s:textfield id="firstName2" label="Frist Name" required="true"></s:textfield>
		<s:textfield id="surname2" label="Surname" required="true"></s:textfield>
		<s:textfield id="knowAs2" label="Know As" ></s:textfield>
		<s:textfield id="officePhone2" label="Office Phone" ></s:textfield>
		<div class="clear"></div>
	</div>

</sj:tabbedpanel>
