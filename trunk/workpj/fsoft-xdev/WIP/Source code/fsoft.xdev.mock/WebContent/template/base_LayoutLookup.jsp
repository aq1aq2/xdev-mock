<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><dec:title default="Welcome" /></title>
        <sj:head jqueryui="true" jquerytheme="smoothness"/>
        <xdev:xhead/>
</head>

<body style="margin-top: 0; margin-bottom: 0; padding: 0">
	
	<div class="xdev-window">

		<!-- Section title -->
		<h1 class="xdev-section-title">
			<dec:getProperty property="page.sectionTitle"/>
		</h1>
		
		<!-- Search options -->
		<div class="xdev-sub">
			<dec:getProperty property="page.searchOptions"/>
		</div>
		
		<!-- Filter -->
		<ul id="xdev-filter">
			<li>All</li>
			<li>0-9</li>
			<li>A B C D E</li>
			<li>F G H I J</li>
			<li>K L M N</li>
			<li>O P Q R</li>
			<li>S T U V</li>
			<li>W X Y Z</li>
		</ul>
		<div class="clear"></div>
		
		<!-- Top buttons -->
		<div class="xdev-sub">
			<sj:a id="searchBtn" 
				button="true" 
			>Search</sj:a>
			
			<sj:a id="noneBtn" 
				button="true" 
			>None</sj:a>
			
			<sj:a id="clearBtn" 
				button="true" 
			>Clear</sj:a>
			
			<sj:a id="createBtn" 
				button="true" 
			>Create</sj:a>
			
			<s:checkbox name="includeChkBx" label="Include In-active" />
		</div>
		
		<!-- Body -->
		<dec:body />
		
		<!-- Bottom buttons -->
	
		<div class="xdev-sub">
			<sj:a id="selectBtn" 
				button="true"
			>Select</sj:a>
			
			<sj:a id="closeBtn" 
				button="true" 
			>Close</sj:a>
		</div>
	
	</div> <!-- End of xdev-wrapper -->
</body>

</html>