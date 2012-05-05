<div class="xdev-field"
	<#if parameters.id??> id="${parameters.id?html}" </#if>
>
	<#if parameters.id??> 
		<p>Has property id ${parameters.id}</p>
	<#else>
		<p>Don't have property id ${parameters.id}</p>
	</#if>
	
	<#if id??> 
		<p>Assigned property id ${id}</p>
	<#else>
		<p>Don't assigned property id, alternate</p>
		<p>${id!"nestedcomp2"}</p>
	</#if>
	
	<@xdev.comp2 id="nestedcomp2"></@xdev.comp2>
