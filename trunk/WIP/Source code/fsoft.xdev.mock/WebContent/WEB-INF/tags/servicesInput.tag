<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<div class="xdev-window" >
	<div class="xdev-window-title">
		<h1>Service Detail</h1>
	</div>
	
	<div class="xdev-window-header">
		<sj:a id="saveBtn" 
			button="true" 
		>Save</sj:a>
		
		<sj:a id="backBtn" 
			button="true" 
		>Back</sj:a>
	</div>
	
	<div class="xdev-window-body">

		<div id="detail1" class="xdev-window-body-sub">
		<s:form>
		<%--Detail1 --%>
			<s:textfield label="Service Name " required="true" name="servicename"></s:textfield>
			<s:textarea label="Service Short Description" name="serviceShortDescripstion" required="true"></s:textarea>
			<s:select list="{'Contact','Punding'}" name="listSubType" label="Syb Type"></s:select>
			<s:textfield label="Lead Contact" name="leadContact" readonly="true"></s:textfield>
			<s:select list="{'sadf','adfdasf'}" name="serviceAttendance" label="Service Attendance"></s:select>
<%-- 			<sj:datepicker id="date1" label="Service Started Expected" name="serviceStartedExpected" displayFormat="dd/mm/yy"></sj:datepicker> --%>
			<sj:datepicker id="date1" label="Service Started Expected" name="serviceStartedExpected" displayFormat="dd/mm/yy"></sj:datepicker>
			<sj:datepicker id="date2" label="Service Start Date" name="serviceStartDate" displayFormat="dd/mm/yy"></sj:datepicker>
			<sj:datepicker id="date3" label="Service End Date" name="serviceEndDate" displayFormat="dd/mm/yy"></sj:datepicker>
			<sj:submit targets="formResult" label="Service Extenable" value="" button="true"></sj:submit>
			<sj:spinner name="spinner2" id="spinner2" min="5" max="50" step="1" value="25" size="5" label="Years"/>
			<sj:spinner name="spinner3" id="spinner3" min="0" max="12" step="1" value="6" size="5" label="Month"/>
			<s:checkbox label="Service Active" name="serviceActive" id="serviceActive"></s:checkbox>
			<s:textarea name="serviceFullDescription" id="serviceFullDescription" label="Service Full Description"></s:textarea>
			<s:textfield name="deptCode" id="deptCode" label="Dept Code"> </s:textfield>
			<s:select list="{'asdfasdf','asdfsd'}" label="Service Type" name="listServiceType" id="listServiceType"></s:select>
			<s:textfield id="serviceDescriptionDelivery" name="serviceDe"></s:textfield>
			<s:textfield id="serviceContractCode" name="serviceContractCode" label="Service Contract Code"></s:textfield>
			<s:textfield id="serviceContractValue" name="serviceContractValue" label="Service Contract Value"></s:textfield>
			<sj:submit id="contractStagedPayment" name="contractStagedPayment" label="ContractStagedPayment" button="true"></sj:submit>
			<s:select list="{'dsafsda','asdfsda'}" id="referralProcessMethod" name="referralProcessMethod" label="Referral Process/Method"></s:select>
			<sj:submit id="serviceTimeLimited" name="serviceTimeLimited" label="Service Time Limited" value=""></sj:submit>
			<sj:spinner name="spinner4" id="spinner4" min="5" max="50" step="1" value="25" size="5" label="Years"/>
			<sj:spinner name="spinner5" id="spinner5" min="0" max="12" step="1" value="6" size="5" label="Month"/>
			
		</s:form>
		
		</div>
		<div id="detail2" class="xdev-window-body-sub">
			<s:form>
			</s:form>
		</div>
		
		<div id="detail3" class="xdev-window-body-sub">
			<s:form>
			</s:form>
		</div>
		
		<div id="contact" class="xdev-window-body-sub">
			<s:form>
			</s:form>
		</div>
		
		<div id="punding" class="xdev-window-body-sub">
			<s:form>
			</s:form>
		</div>
	</div>
	
	<div class="xdev-window-footer">
	</div>
</div>
