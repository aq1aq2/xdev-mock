package dn.servicemix.example.routing.camel;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class MyRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:bean:enterpriseServiceEndpoint?dataFormat=PAYLOAD")
        .to("log:dn.servicemix?showAll=true&multiline=true")
        .to("bean:jaxbProcessor?method=unmarshall")
        .choice()
                .when(header("operationName").isEqualTo("GetDealer"))
                    .beanRef("enterpriseService", "getDealer")
        .end()
        .to("bean:jaxbProcessor?method=marshall")
        .to("log:dn.servicemix?showAll=true&multiline=true")
        //.to("cxf://http://10.16.6.69:8181/cxf/webservices/enterprise?portName=EnterpriseEndpoint;serviceName=EnterpriseService;wsdlURL=http://10.16.6.69:8181/cxf/webservices/enterprise?wsdl;dataFormat=PAYLOAD;serviceClass=dn.servicemix.example.services.EnterpriseService")
        //.to("jbi:endpoint:http://10.16.6.69:8181/cxf/webservices/enterprise/ExternalServiceEndpoint")
        //.setHeader(CxfConstants.OPERATION_NAME, constant("GetDealer"))
        //.setHeader(CxfConstants.OPERATION_NAMESPACE, constant("http://www.dis-corp.com"))
        //.to("log:dn.servicemix?showAll=true&multiline=true")
        //.to("http://10.16.6.69:8181/cxf/webservices/enterprise")
        //.to("cxf:bean:externalServiceEndpoint?dataFormat=PAYLOAD")
        //.to("cxf://http://10.16.6.61:8181/cxf/webservices/2.0/enterprise?dataFormat=PAYLOAD&wsdlURL=http://10.16.6.61:8181/cxf/webservices/2.0/enterprise?wsdl&serviceName={http://www.dis-corp.com}EnterpriseService")
        .to("cxf://http://10.16.6.61:8181/cxf/webservices/2.0/enterprise?dataFormat=PAYLOAD&wsdlURL=http://10.16.6.61:8181/cxf/webservices/2.0/enterprise?wsdl")
	    .to("log:dn.servicemix?showAll=true&multiline=true")
	    .to("bean:jaxbProcessor?method=getXml")
	    .setHeader(Exchange.XSLT_FILE_NAME, constant("c:/dntmp/test.html"))
	    .to("log:dn.servicemix?showAll=true&multiline=true")
	    .to("xslt:dn/servicemix/example/xslt/test.xsl?output=file")
	    ;
	}
	
}
