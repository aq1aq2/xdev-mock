package dn.servicemix.example.routing.camel;

import org.apache.camel.builder.RouteBuilder;

public class MyRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:bean:serviceA_endpoint?dataFormat=PAYLOAD")
        .to("log:dn.servicemix?showAll=true&multiline=true")
        .to("bean:jaxbProcessor?method=unmarshall")
        .choice()
                .when(header("operationName").isEqualTo("ShowActor"))
                    .beanRef("serviceA", "showActor")
                .when(header("operationName").isEqualTo("ShowActor2"))
                    .beanRef("serviceA", "showActor2")
        .end()
        .to("bean:jaxbProcessor?method=marshall")
	    .to("log:dn.servicemix?showAll=true&multiline=true");
	}
	
	/* 
	 * Simple log routing for test
	 * 
	 * @see org.apache.camel.builder.RouteBuilder#configure()
	 */
//	@Override
//	public void configure() throws Exception {
//		from("cxf:bean:serviceA_endpoint?dataFormat=PAYLOAD")
//        .to("log:dn.servicemix?showAll=true&multiline=true")
//        .end();
//	}

}
