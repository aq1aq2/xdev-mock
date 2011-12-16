<%@ taglib prefix="s" uri="/struts-tags"%>

<title>Trust Region</title>
<!-- body -->

					
	<s:textfield name ="trustRegion.trustRegionId" ></s:textfield>
	<s:select name="trustRegion.country.countryId" list ="listCountry" label="Nation/Country " required="true" listKey="countryId" listValue="name" key ="countriesId"></s:select>				
	<s:textfield name ="trustRegion.name" label="Trust Region Name" required="true"></s:textfield>
	<s:textarea name="trustRegion.description" label="Description"></s:textarea>		
	
