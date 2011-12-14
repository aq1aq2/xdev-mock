<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<sj:tabbedpanel id="tabs">
	<sj:tab id="tab1" target="details1" label="Details 1"/>
	<sj:tab id="tab2" target="details2" label="Details 2"/>
			
	<div id="details1" >
		<s:form cssClass="xdev-form">
			<s:textfield id="firstName" label="Frist Name" required="true"/>
			<s:textfield id="surname" label="Surname" required="true"/>
			<s:textfield id="knowAs" label="Know As" />
			<s:textfield id="officePhone" label="Office Phone" />
			<s:textfield id="mobilePhone" label="Mobile Phone" />
			<s:textfield id="homePhone" label="ST Home Phone" />
			<s:textfield id="emailAddress" label="Email Address" />
			<xdev:textLookup id="managerName" label="Manager Name"/>
			<s:textfield id="managerName" label="Manager Name" />
			<s:select id="contactType" label="Contact Type" list="{}" required="true"/>
			<s:select id="bestContactMethod" label="Best Contact Method" list="{}" />
		</s:form>
	</div>

	<div id="details2" class="xdev-window-body-sub2">
		<s:textfield id="firstName2" label="Frist Name" required="true"></s:textfield>
		<s:textfield id="surname2" label="Surname" required="true"></s:textfield>
		<s:textfield id="knowAs2" label="Know As" ></s:textfield>
		<s:textfield id="officePhone2" label="Office Phone" ></s:textfield>
		<div class="clear"></div>
	</div>
	
</sj:tabbedpanel>
