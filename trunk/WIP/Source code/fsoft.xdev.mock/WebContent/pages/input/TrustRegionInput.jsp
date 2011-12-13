<%@ taglib prefix="s" uri="/struts-tags"%>

<title>Trust Region</title>
<!-- body -->
	<s:form action ="TrustRegion">				
		<s:textfield name ="trustRegions.trustRegionId" ></s:textfield>
		<s:select name="trustRegions.countries.countryId" list ="listCountries" label="Nation/Country " required="true" listKey="countryId" listValue="name" key ="countriesId"></s:select>				
		<s:textfield name ="trustRegions.name" label="Trust Region Name" required="true"></s:textfield>
		<s:textarea name="trustRegions.description" label="Description"></s:textarea>		
	</s:form>	