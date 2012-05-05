<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<title>Trust District</title>	
<!-- body -->
<content tag="sectionTitle">Government Office Region Detail</content>

<script>
	$(document).ready(function(){	
		
		$("#backBtn").click(function(){
			window.history.back();
			
		});	
		$('#saveBtn').hide();
		
	});
</script>
<!-- Tabbed Panel -->
<sj:tabbedpanel id="tabs">	
	<sj:tab id="tab1" target="details1" label="Details"/>
	
		<div id="details1" >
			<s:form cssClass="xdev-form" id="trustRegion">				
				<s:textfield name ="govOfficeRegion.name" label="Government Office Region Name" readonly="true"></s:textfield>				
				<s:textarea name="govOfficeRegion.description" label="Description" readonly="true"></s:textarea>		
				<s:textfield name ="govOfficeRegion.county.name" label="County" readonly="true"></s:textfield>
			</s:form>
		</div>		    
		     
		
</sj:tabbedpanel>