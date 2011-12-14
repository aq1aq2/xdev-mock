<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<title>Organisation Details</title>

<!-- Section Title -->
<content tag="sectionTitle">Organisation Details</content>

<sj:tabbedpanel id="myOrganisationDetailstabs" selectedTab="currTab" cssClass="wwFormTable" disabledTabs=""  >   
	<sj:tab id="details1" target="tab1" label="Details1"/>
    <sj:tab id="details2" target="tab2" label="Details2"/>
    <div id="tab1">
    	<s:form cssClass="xdev-form">
			<s:textfield name="organisationName" label="Organisation Name" required="true"/>
			<s:checkbox name="preferredOrganisation" label="Preferred Organisation" />
			<s:textarea name="OrganisationDesc" label="Organisation Short Description" required="true"/>
			<s:checkbox name="expressionOfInterest" label="Expression Of Interest" />
			<xdev:textLookup name="leadContact" label="Lead Contact" />
			<xdev:textLookup name="typeOfBusiness" label="Type of business" />
			<s:textfield name="addr1" label="Address Line 1" />
			<xdev:textLookup name="sicCode" label="SIC Code" />
			<s:textfield name="addr2" label="Address Line 2" />
			<s:textarea name="organisationFullDesc" label="Organisation Full Description" />
			<s:textfield name="addr3" label="Address Line 3" />
			<s:textfield name="phoneNumber" label="Phone Number" required="true" />
			<xdev:textLookup name="postCode" label="Post Code" required="true" />
			<s:textfield name="fax" label="Fax" />
			<s:textfield name="city_town" label="City/Town" />
			<s:textfield name="email" label="Email" />
			<s:textfield name="county" label="County" />
			<s:textfield name="webAddr" label="Web Address" />
			<s:select name="nation_country" label="Nation/Country" list="{}" />
			<s:textfield name="charityNumber" label="Charity Number" />
			<s:textfield name="companyNumber" label="Company Number" />		
		</s:form>
    </div>
    <div id="tab2">
		<s:form cssClass="xdev-form">
			<s:checkboxlist label="Which of the following are states of India"
                            name="states"
                            list="#{'01':'January','02':'February','03':'March','04':'April','05':'May'}"
            />
<!-- 			Organisation Specialism -->
<!-- 			Service Personal Circumstances Capabilities -->
<!-- 			Service Disabilities Capabilities -->
<!-- 			Service Ethnicity Capabilities -->
<!-- 			Service Barries Capabilities -->
<!-- 			Accreditation -->
<!-- 			Service Benifits Capabilities 	 -->
		</s:form>  
    </div>
</sj:tabbedpanel>  
