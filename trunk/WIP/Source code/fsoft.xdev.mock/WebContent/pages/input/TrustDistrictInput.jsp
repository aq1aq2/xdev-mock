<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Trust District</title>	
<!-- body -->
<content tag="sectionTitle">Trust District Detail</content>

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
				$.getJSON("addTrustDistrict.action?" + query,
					function(data) {
						//Do nothing
					}
				);
			}
			else {				
				$.getJSON("editTrustDistrict.action?" + query,
						function(data) {
 							//Do nothing
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
	<sj:tab id="tab1" target="details1" label="Details"/>
	
		<div id="details1" >
			<s:form cssClass="xdev-form" id="trustRegion">
				<s:hidden id="mode" name ="mode"/>			
				<s:hidden name ="trustDistrict.trustRegionId"/>
				<s:hidden name ="trustDistrict.status"/>								
				<s:hidden name ="trustDistrict.trustRegion.trustRegionId"/>
				<s:textfield name ="trustDistrict.trustRegion.name" label="Trust Region Name" readonly="true"></s:textfield>
				<s:textfield name ="trustDistrict.name" label="Trust District Name" required="true"></s:textfield>
				<s:textarea name="trustDistrict.description" label="Description"></s:textarea>		
			</s:form>
		</div>		    
		     
		
</sj:tabbedpanel>