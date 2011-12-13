<@s.url id="detail" action="detailTrustRegion.action"></@s.url>
<script>
	$(document).ready(function(){

		function add(parentId, dialogId) {
		
			$('#'+dialogId+'_saveBtn').click(function(){
				var query = "";
				var xForms = $('form[id^="'+ dialogId +'"]');
				$.each(xForms, function(){
					// Read id of each form in xForms
					// this implicit an element in the array
					// Searialize data in each form
					var str = $(this).serialize();
					// Concat query string. MUST ADD & symbol !
					query = query + str + "&";
				});			
				query = query.substring(0, query.length-1);
				//alert(query);
				// Get json
				$.getJSON("saveTrustRegion.action?" + query,
					function(data) {
						// Do nothing
						// alert("reload_" + parentId + "_listURL");
						// $.publish("reloadOk");	
						$('#${id!}_gridtable').trigger('reloadGrid');
					}
				);
			});
		}
		
		
		$('#${id!}_trustRegionInput').hide();
		
		$('#${id!}_createBtn').click(function(){
			$('#${id!}_trustRegionInput').show();
		});
		
		$('#${id!}_includeChkBx').click(function(){
			alert("click include in-active");
		});
		
		add("${id!}", "${id!}_trustRegionInput");		
		
	});
	
</script>
<script>	
	function formatLink(cellvalue, options, rowObject) {		
       return "<a href='detailTrustRegion.action?trustRegions.trustRegionId="+rowObject["trustRegionId"] +"'>"+rowObject["name"]+"</a>";  
                 
    }     
    
</script>
       
<div class="xdev-window" id="${id!}" >
	<div class="xdev-window-title">
		<h1>Trust Region List</h1>
	</div>
	
	<div class="xdev-window-header">		
		<div class="xdev-sub">
		<#-- search here -->
			<table>
					<tr>
						<td>
							 <!--Filter all-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">All</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"All\" || key==null}" ><@s.a href="%{url}" > All	|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >All	|</@s.a></@s.else>
	            		<td>
	            		<td>
							 <!--Filter 0 - 9-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">0-9</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"0-9\" || key==null}" ><@s.a href="%{url}"> 0-9	|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >0-9	|</@s.a></@s.else>
	            		<td>
	            		<td>
							 <!--Filter A B C D E-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">A B C D E</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"A B C D E\" || key==null}" ><@s.a href="%{url}">A B C D E		|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >A B C D E		|</@s.a></@s.else>
	            		<td>
	            		<td>
							 <!--Filter F G H I J-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">F G H I J</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"F G H I J\" || key==null}" ><@s.a href="%{url}">F G H I J		|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >F G H I J		|</@s.a></@s.else>
	            		<td>
	            		<td>
							  <!--Filter K L M N-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">K L M N</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"K L M N\" || key==null}" ><@s.a href="%{url}">K L M N		|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >K L M N		|</@s.a></@s.else>
	            		<td>
	            		<td>
							   <!--Filter O P Q R-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">O P Q R</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"O P Q R\" || key==null}" ><@s.a href="%{url}">O P Q R		|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >O P Q R	|</@s.a></@s.else>
	            		<td>
	            		<td>
							   <!--Filter S T U V-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">S T U V</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"S T U V\" || key==null}" ><@s.a href="%{url}">S T U V		|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >S T U V	|</@s.a></@s.else>
	            		<td>
	            		
	            		<td>
							   <!--Filter W X Y Z-->
				            <@s.url var="url" action="searchTrustRegion.action">
				                <@s.param name="key">W X Y Z</@s.param>                            
				            </@s.url>
				            <@s.if test="%{key==\"W X Y Z\" || key==null}" ><@s.a href="%{url}">W X Y Z		|</@s.a></@s.if>
				            <@s.else><@s.a href="%{url}" >W X Y Z		|</@s.a></@s.else>
	            		<td>         		
	            	
					</tr>
			    </table>
			
		</div>
		<div class="xdev-sub">
			<@sj.a id="${id!}_createBtn" 
				button="true" 
			>Create</@sj.a>
			
			<@s.checkbox name="${id!}_includeChkBx" label="Include In-active" />
		</div>
		
	</div>
	
	<div class="xdev-window-body" >
	
		<#-- Grid here -->
		<@s.url id="${id!}_listURL" action="listTrustRegion.action"></@s.url>
		
		<@sjg.grid
	        id="${id!}_gridtable"
	        dataType="json"
	        href="%{${id!}_listURL}"
	        gridModel="listModel"
	        autowidth="true"
	        pager="true"
	        navigator="true"	        
    		rowNum="3"
    		rownumbers="true"    	
    		viewrecords="true"	
    		 
	    >
	    	<@sjg.gridColumn name="trustRegionId" index="trustRegionId" title="ID" sortable="true" hidden="true" key="true"/>
	    	<@sjg.gridColumn name="name" index="name" title="Trust Region Name" sortable="true" formatter = "formatLink"/>
	        <@sjg.gridColumn name="description" index="description" title="Description" sortable="true"/>
	        <@sjg.gridColumn name="countries.name" index="countries.name" title="Nation/Country" sortable="true"/>	       
	        <@sjg.gridColumn name="isActive" index="isActive" title="IsActive" sortable="false"/>
	    </@sjg.grid>
	    
	</div>

	<div class="xdev-window-footer">		
	</div>
	
	<@xdev.trustRegionInput id="${id!}_trustRegionInput"/>
	
</div>
