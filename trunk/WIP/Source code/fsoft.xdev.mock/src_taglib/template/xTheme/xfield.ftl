<div class="xdev-field">

	<#if (parameters.type!) = "textfield">
		<#include "/${parameters.templateDir}/xTheme/text.ftl" />
	<#elseif (parameters.type!) = "textarea">
		<#include "/${parameters.templateDir}/xTheme/textarea.ftl" />
	<#elseif (parameters.type!) = "checkbox">
		<#include "/${parameters.templateDir}/xTheme/checkbox.ftl" />
	<#elseif (parameters.type!) = "select">
		<#include "/${parameters.templateDir}/xTheme/select.ftl" />
	<#elseif (parameters.type!) = "textlookup">
		<#include "/${parameters.templateDir}/xTheme/textlookup.ftl" />
	</#if> 

</div>
