<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<title>Trust Region</title>	
<!-- body -->
<content tag="sectionTitle">Trust Region Detail</content>
<!-- Tabbed Panel -->
<sj:tabbedpanel id="tabs">
	<sj:tab id="tab1" target="details1" label="Details 1"/>
		<div id="details1" >
			<s:form cssClass="xdev-form" id="trustRegion">			
				<s:textfield name ="trustRegion.trustRegionId" ></s:textfield>
				<s:select name="trustRegion.country.countryId" list ="listCountry" label="Nation/Country " required="true" listKey="countryId" listValue="countryName" key ="countryId"></s:select>				
				<s:textfield name ="trustRegion.name" label="Trust Region Name" required="true"></s:textfield>
				<s:textarea name="trustRegion.description" label="Description"></s:textarea>		
			</s:form>
		</div>
</sj:tabbedpanel>