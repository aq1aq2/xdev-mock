<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Minor Works Project List</h1>
	</div>
	
	<div class="xdev-window-header">
	<sj:a id="createBtn" 
			button="true" 
		>
		  	Create
		</sj:a>
		
		<s:checkbox name="includeChkBx" label="Include In-active" />
	</div>
	
	<div class="xdev-window-body">
		<s:url id="minorWorksList" action="getMinorWorksList"></s:url>

		<sjg:grid
	        id="gridtable_MinorWorks"
	        dataType="json"
	        href="%{minorWorksList}"
	        gridModel="listMinorWorks"
	        autowidth="true"
	        pager="true"
	        >

	        <sjg:gridColumn name="description" index="description" title="Description" sortable="true"/>
	        <sjg:gridColumn name="enqReceivedDate" index="enqReceivedDate" title="Enq Received Date" sortable="false"/>
	        <sjg:gridColumn name="notesAction" index="notesAction" title="Notes Action" sortable="false"/>
	        <sjg:gridColumn name="directorate" index="directorate" title="Directorate" sortable="false"/>
	        <sjg:gridColumn name="contact" index="contact" title="Contact" sortable="false"/>
	        <sjg:gridColumn name="status" index="status" title="Status" sortable="false"/>
	        <sjg:gridColumn name="isActive" index="isActive" title="Is Active" sortable="false"/>
	    </sjg:grid>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>