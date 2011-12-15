<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<title>Contact Input</title>

<!-- Section Title -->
<content tag="sectionTitle">Contact Input</content>

<sj:tabbedpanel id="tabs">
	<sj:tab id="tab1" target="details1" label="Details 1"/>
			
	<div id="details1" >
		<s:form cssClass="xdev-form">
			<s:textfield name="firstName" label="Frist Name" required="true"/>
			<s:textfield name="surname" label="Surname" required="true"/>
			<s:textfield name="knowAs" label="Know As" />
			<s:textfield name="officePhone" label="Office Phone" />
			<s:textfield name="mobilePhone" label="Mobile Phone" />
			<s:textfield name="homePhone" label="ST Home Phone" />
			<s:textfield name="emailAddress" label="Email Address" />
			<xdev:textLookup name="managerName" label="Manager Name"/>
			<s:textfield name="managerName" label="Manager Name" />
			<s:select name="contactType" label="Contact Type" list="{}" required="true"/>
			<s:select name="bestContactMethod" label="Best Contact Method" list="{}" />
		</s:form>
	</div>
	
</sj:tabbedpanel>
