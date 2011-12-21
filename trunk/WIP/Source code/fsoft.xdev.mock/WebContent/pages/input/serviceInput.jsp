<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="xdev" uri="xdev-tags.tld"%>

<script>
</script>

<title></title>

<!-- Section Title -->
<content tag="sectionTitle">Service Input</content>

<!-- Table Panel -->
<sj:tabbedpanel id="tabs">
		<sj:tab id="tab1" target="details1" label="Details 1"/>
		<sj:tab id="tab1" target="details2" label="Details 2"/>
		<sj:tab id="tab1" target="details3" label="Details 3"/>
		<sj:tab id="tab1" target="contact" label="Contact"/>
		<sj:tab id="tab1" target="funding" label="funding"/>
		
		<div id="details1" class="xdev-window-body-sub">
			<table>
				<s:form cssClass="xdev-form">
					<s:textfield label="Service Name " required="true" name="servicename"></s:textfield>
					<s:checkbox label="Service Active" name="serviceActive" id="serviceActive" labelposition="left"></s:checkbox>
					<s:textarea label="Service Short Description" name="serviceShortDescripstion" id="serviceShortDescripstion" required="true"></s:textarea>
					<s:textarea name="serviceFullDescription" id="serviceFullDescription" label="Service Full Description"></s:textarea>
					<s:select list="{'Contact','Punding'}" name="listSubType" label="Syb Type"></s:select>
					<s:textfield name="deptCode" id="deptCode" label="Dept Code"> </s:textfield>
					<s:textfield label="Lead Contact" name="leadContact" readonly="true"></s:textfield>
					<s:select list="{'sadf','adfdasf'}" name="serviceAttendance" label="Service Attendance"></s:select>
		<%-- 			<sj:datepicker id="date1" label="Service Started Expected" name="serviceStartedExpected" displayFormat="dd/mm/yy"></sj:datepicker> --%>
					<sj:datepicker id="date1" label="Service Started Expected" name="serviceStartedExpected" displayFormat="dd/mm/yy"></sj:datepicker>
					<sj:datepicker id="date2" label="Service Start Date" name="serviceStartDate" displayFormat="dd/mm/yy"></sj:datepicker>
					<sj:datepicker id="date3" label="Service End Date" name="serviceEndDate" displayFormat="dd/mm/yy"></sj:datepicker>
					<sj:submit targets="formResult" label="Service Extenable" value="" button="true"></sj:submit>
					<sj:spinner name="spinner2" id="spinner2" min="5" max="50" step="1" value="25" size="5" label="Years"/>
					<sj:spinner name="spinner3" id="spinner3" min="0" max="12" step="1" value="6" size="5" label="Month"/>
					
					
					
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
			</table>
		</div>
		
		<div id="details2" class="xdev-window-body-sub">
			<table>
				<s:form cssClass="xdev-form">
					<s:checkboxlist label="Service Benefits Criterion" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Service Disability Criterion" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Service Barriers Criterion" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Service Personal Circumstances Criterion" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Service Ethnicity Criterion" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Other Service Participation Criterion" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
				</s:form>
			</table>
		</div>
		
		<div id="details3" class="xdev-window-body-sub">
			<table>
				<s:form cssClass="xdev-form">
					
					<s:checkboxlist label="Client Support Process" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Client Outcome" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Intervention" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Target Client" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Client Journey" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Accreditations" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Other Services" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist label="Referral Sources" name="q" list="{'Hungasfjasdopfjoasdjfasdfasdfdsaf','Nguyenasdfasdfasdfdsa','Manh','dsafasdfdsaljflasdjflsdajflsdfsd xbfsdgfsdgsdfg fsdgfdsgvfsdgfds sdfgsdfg'}"></s:checkboxlist>
					<s:checkboxlist name="q" label="Support Centres" list="{'Hung','Nguyen','Manh'}"></s:checkboxlist>
					<s:select label="Programme" name="q" list="{'Ga','Cho','Lon'}"></s:select>
				</s:form>
			</table>
		</div>		
		
		<div id="contact" class="xdev-window-body-sub">
			<table>
				<s:form cssClass="xdev-form">
					<s:checkboxlist label="Contact Outcome" name="q" list="{'Hung','Nguyen','Manh'}"></s:checkboxlist>
					<s:checkboxlist label="Contact Obligation" name="q" list="{'Hung','Nguyen','Manh'}"></s:checkboxlist>
					<s:select label="Participation" list="{'Ham','Muon','Qua'}"></s:select>
				</s:form>
			</table>
		</div>	
		
		<div id="funding" class="xdev-window-body-sub">
			<table>
				<s:form cssClass="xdev-form">
<%-- 				<s:textfield id="fundingSource" name="fundingSource" ></s:textfield> --%>
				<s:select id="fundingSource" name="fundingSource" label="Funding Source" list="{'kk','ll'}"></s:select>
				<s:textfield id="fundingContactDetails" name="fundingContactDetails" label="Funding Contact Details" required="true" readonly="true"></s:textfield>
				<s:label id="lookUp3" name="lookUp3" value="Lookup" onclick="true"></s:label>
				<s:textfield id="fundingAmount" name="fundingAmount" label="Funding Amount" required="true"></s:textfield>
				<sj:datepicker id="fungdingStart" name="fundingStart" label="Funding Start" required="true" displayFormat="dd/mm/yyyy"></sj:datepicker>
				<sj:datepicker id="fundingEnd"  name="fundingEnd" label="Funding End" readonly="true" displayFormat="dd/mm/yy"></sj:datepicker>
				<%--Funding For Service Project --%>
				<s:textfield id="fundingForText" name="fundingForText" label="Funding For Text"></s:textfield>
				<s:textarea id="fundraisingWhy" name="fundraisingWhy" label="Fundraising Why"></s:textarea>
				<%--Fundraising Donor --%>
				<s:submit id="fundraisingDonorAnonymous" name="fundraisingDonorAnonymous" label="Fundraising Donor Anonymous" value="" ></s:submit>
				<s:textfield id="fundraisingDonorAmount" name="fundraisingDonorAmount" label="Fundraising Donor Amount"></s:textfield>
				<s:textfield id="fundingNeeds" name="fundingNeeds" label="Funding Needs"></s:textfield>
				<sj:submit id="fundingContinuation" name="fundingContinuationNeeded" label="Funding Continuation Needed" button="true" value=""></sj:submit>
				<s:textfield id="fundingContinuationAmount" name="fundingContinuationAmount" label="Funding Continuation Amount" readonly="true"></s:textfield>
				<s:textfield readonly="true" id="fundingContinuationDetails" name="fundingContinuationDetails" label="Funding Continuation Details"></s:textfield>
				<s:textfield id="fundraisingNeeds" name="fundraisingNeeds" label="Fundraising Needs"></s:textfield>
				<sj:datepicker id="fundraisingRequiredBy" name="fundraisingRequiredBy" label="Fundraising Required By" displayFormat="dd/mm/yy"></sj:datepicker>
				
				</s:form>
			</table>
		</div>	
</sj:tabbedpanel>