<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Trust Region</title>	
<!-- body -->
<content tag="sectionTitle">Trust Region Detail</content>

<script>
	$(document).ready(function(){		
		/* Save event */
		var mode = $('#mode').val();
		
		$("#saveBtn").click(function(){
			var query = "";
			var forms = $("form");
			$.each(forms, function(){
				// Read id of each form in xForms
				// this implicit an element in the array
				// Searialize data in each form
				var str = $(this).serialize();
				// Concat query string. MUST ADD & symbol !
				query = query + str + "&";
			});			
			query = query.substring(0, query.length-1);			
			// Get json		
			// if update
			if(mode == 'true'){				
				$.getJSON("addTrustRegion.action?" + query,
					function(data) {
						// Do nothing
					}
				);
			}
			else {
				alert("update ne");
				$.getJSON("editTrustRegion.action?" + query,
						function(data) {
							// Do nothing
						}
					);
			}
		});	
		$("#backBtn").click(function(){
			window.history.back();
			
		});	
		
	});
</script>
<!-- Tabbed Panel -->
<sj:tabbedpanel id="tabs">	
	<sj:tab id="tab1" target="details1" label="Details 1"/>
	<sj:tab id="tab2" target="listTrustDistrict" label="Trust District"/>
	
		<div id="details1" >
			<s:form cssClass="xdev-form" id="trustRegion">
				<s:hidden id="mode" name ="mode"/>			
				<s:hidden name ="trustRegion.trustRegionId"/>
				<s:hidden name ="trustRegion.status"/>
				<s:select  name="trustRegion.country.countryId" list ="listCountry" label="Nation/Country " required="true" listKey="countryId" listValue="countryName" key ="countryId"></s:select>				
				<s:textfield name ="trustRegion.name" label="Trust Region Name" required="true"></s:textfield>
				<s:textarea name="trustRegion.description" label="Description"></s:textarea>		
			</s:form>
		</div>
	
		<div id="listTrustDistrict">		    
		    <%@ include file="/pages/list/TrustDistrictList.jsp" %>
		     
		</div>
</sj:tabbedpanel>