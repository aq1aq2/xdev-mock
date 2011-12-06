$(document).ready(function(){
	
	function add(parentId, dialogId) {
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
			// Get json
			$.getJSON("saveContact.action?" + query,
				function(data) {
					// Do nothing
					// alert("reload_" + parentId + "_listURL");
					// $.publish("reloadOk");	
				}
			);
	}

	
	$('#${id!}_contactInput').hide();
	
	$('#${id!}_createBtn').click(function(){
		$('#${id!}_contactInput').show();
	});
	
	$('#${id!}_includeChkBx').click(function(){
		alert("click include in-active");
	});
	
	$.subscribe('refreshContactList', function(event,data) {
		$.publish('reloadContactList');	
	});
	
	$(function(){
		$('#'+dialogId+'_saveBtn').click(add("${id!}", "${id!}_contactInput"));
	});
	
});