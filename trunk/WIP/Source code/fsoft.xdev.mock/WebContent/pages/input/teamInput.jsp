<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<title>Team</title>	
<!-- body -->
<content tag="sectionTitle">Team Detail</content>
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
				$.getJSON("addTeam.action?" + query,
					function(data) {
						// Do nothing
					}
				);
			}
			else {				
				$.getJSON("editTeam.action?" + query,
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
	<sj:tab id="tab1" target="details1" label="Details"/>	
		<div id="details1" >
			<s:form cssClass="xdev-form" id="team">
				<s:hidden id="mode" name ="mode"/>			
				<s:hidden name ="team.teamId"/>
				<s:hidden name ="team.status"/>								
				<s:textfield name ="team.name" label="Team Name" required="true"></s:textfield>
				<!-- cho nay goi lookup -->
				
				<s:textarea name="team.shortDesc" label="Team short Description"></s:textarea>	
				<!-- cho nay se goi SIC code -->
				<!-- cho nay goi lead contact lookup -->
				<s:textarea name="team.fullDesc" label="Team full description"></s:textarea>
				<!-- cho nay goi copy radio -->
				<s:textfield name="team.addr1" label="Address Line 1"></s:textfield>
				<s:textfield name="team.phoneNumber" label="Phone number"></s:textfield>
				<s:textfield name="team.addr2" label="Address Line 2"></s:textfield>
				<s:textfield name="team.fax" label="Fax"></s:textfield>
				<s:textfield name="team.addr3" label="Address Line 3"></s:textfield>	
				<s:textfield name="team.email" label="Email"></s:textfield>
				<!-- cho nay goi post code lookup  -->
				<s:textfield name="team.webAddr" label="Web Address"></s:textfield>
				<s:textfield name="team.town" label="Town/Village/City"></s:textfield>
				<s:select name ="team.county.countyId" list="listCounty" listKey="countyId" listValue="name" key="countyId"></s:select>
				
			</s:form>
		</div>
	
</sj:tabbedpanel>