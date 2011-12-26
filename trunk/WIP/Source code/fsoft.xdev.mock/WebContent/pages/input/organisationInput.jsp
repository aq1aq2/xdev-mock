<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>
<script>

$(document).ready(function(){
	$("#expressionOfInterest").click(function(){
		// Enable the third tab and navigate automatically
		$("#myOrganisationDetailstabs").tabs("enable", 2);
		$("#myOrganisationDetailstabs").tabs("select", 2);
	});
	
	$("#backBtn").click(function(){
		window.history.back();
	});
	
	$("#saveBtn").click(function(){
		alert("click save button in organisation input");
	});
	
	//Read param in incoming request
// 	function getUrlVars()
// 	{
// 	    var vars = [];
// 	    var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
// 	    for(var i = 0; i < hashes.length; i++)
// 	    {
// 	        hash = hashes[i].split('=');
// 	        vars.push(hash[0]);
// 	        vars[hash[0]] = hash[1];
// 	    }
// 	    return vars;
// 	}

	function checkMode(){
	
		var mode = "${mode}";
		// alert(mode);
		if(mode == 'amend') {
			// Test
			// alert("amend");
			$("#myOrganisationDetailstabs").tabs("option", "disabled", [2]);
			// Load data from action
		}
		else if(mode == 'add') {
			// Test
			//alert("add");
			$("#myOrganisationDetailstabs").tabs("option", "disabled", [2,3,4,5]);
		}
	 	else {
			// alert("default tab");
		}
	}
	
	// MUST use ready event for tabby because of tabby is so heavy !
	$("#myOrganisationDetailstabs").ready(function(){
		checkMode();
		//alert(" organisationId received from server: "+ $("#orgId").val());
		
		// Load data into tab 5 and send filterOrgId now !
		$("#tab5").load("SupportingMaterial.action?filterOrgId=" + $("#orgId").val(), function(){
			
		});
	});
});


</script>


<title>Organisation Details</title>

<!-- Section Title -->
<content tag="sectionTitle">Organisation Details</content>

<sj:tabbedpanel 
	id="myOrganisationDetailstabs" 
	selectedTab="0" 
	cssClass="wwFormTable"
	spinner="Please wait..."
>   
	<sj:tab id="details1" target="tab1" label="Details1"/>
    <sj:tab id="details2" target="tab2" label="Details2"/>
    <sj:tab id="details3" target="tab3" label="Details3"/>
    <sj:tab id="details4" target="tab4" label="Details4"/>
    <sj:tab id="details5" target="tab5" label="Details5"/>
    <sj:tab id="bu" target="bu" label="BU/Directorates"/>
    
    <s:hidden name="organisation.organisationId" id="orgId" />
    
    <div id="tab1">
    	<s:form cssClass="xdev-form">
			<s:textfield name="organisationName" label="Organisation Name" required="true"/>
			<s:checkbox name="preferredOrganisation" label="Preferred Organisation" labelposition="left" />
			<s:textarea name="OrganisationDesc" label="Organisation Short Description" required="true"/>
			<s:checkbox id="expressionOfInterest" name="expressionOfInterest" label="Expression Of Interest" labelposition="left" />
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
		<s:form cssClass="xdev-form" action="detailOrganisation">
			<!-- 			Organisation Specialism -->
			<s:checkboxlist 
				label="Organisation Specicalism"
				labelposition="left"
	            name="organisation.listOrgSpecicalism"
	            list="listOrgSpecicalism"
	            listKey="referenceDataId"
	            listValue="type"
            />
<!-- 			Service Personal Circumstances Capabilities -->
<!-- 			Service Disabilities Capabilities -->
<%-- 			<s:checkboxlist  --%>
<%-- 				label="Service Disabilities Capabilities" --%>
<%-- 				labelposition="left" --%>
<%-- 	            name="organisation.listServDisCapabilities" --%>
<%-- 	            list="listServDisCapabilities" --%>
<%-- 	            listKey="referenceDataId" --%>
<%-- 	            listValue="type" --%>
<%--             /> --%>
<!-- 			Service Ethnicity Capabilities -->
<!-- 			Service Barries Capabilities -->
<!-- 			Accreditation -->
<!-- 			Service Benifits Capabilities 	 -->
		</s:form>  
    </div>
    
    <div id="tab3">
		<s:form cssClass="xdev-form">
			EOI Programmes
			EOI Services
		</s:form>  
    </div>
    
    <div id="tab4">
<!-- 		Load premises list into the tab -->
    </div>
    
    <div id="tab5">
<!-- 		Load supporting material list into the tab -->
    </div>
    
    <div id="bu">
<!-- 		Load directorateList into the tab -->
    </div>
    
</sj:tabbedpanel> 
 
