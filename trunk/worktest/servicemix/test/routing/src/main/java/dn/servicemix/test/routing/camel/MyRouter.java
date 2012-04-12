package dn.servicemix.test.routing.camel;

import org.apache.camel.builder.RouteBuilder;

public class MyRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:bean:serviceA_endpoint?dataFormat=PAYLOAD")
        .to("log:dn.servicemix?showAll=true&multiline=true");
	}

}
