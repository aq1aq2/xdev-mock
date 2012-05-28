package dn.servicemix.example.routing.converter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.camel.Exchange;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.cxf.binding.soap.SoapHeader;
import org.springframework.beans.factory.InitializingBean;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class JAXBProcessor implements InitializingBean {
	
	JAXBContext jaxbContext;
	Unmarshaller unmarshaller;
	Marshaller marshaller;
	
	String contextString = "dn.servicemix.test.xml";

	/**
	 * Process a Camel exchange with a CXF payload by unmarshalling it using
	 * JAXB. Note that there must be only one element in the CXF body.
	 * 
	 * @param exchange
	 * @throws JAXBException
	 */
	public synchronized void unmarshall(Exchange exchange) throws JAXBException {
		CxfPayload<SoapHeader> requestPayload = exchange.getIn().getBody(
				CxfPayload.class);
		List<Element> inElements = requestPayload.getBody();
		if (inElements.size() == 1) {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(contextString);
			unmarshaller = jaxbContext.createUnmarshaller();
			Object object = unmarshaller.unmarshal(inElements.get(0));
			exchange.getIn().setBody(object);
		}
	}

	/**
	 * Marshalls an object into an appropriate XML representation for CXF
	 * 
	 * @param exchange
	 * @throws Exception
	 */
	public synchronized void marshall(Exchange exchange) throws Exception {
		jaxbContext = JAXBContext.newInstance(contextString);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		
		// For test (start)
		Object xmlObject = exchange.getIn().getBody();
		String xmlClass = xmlObject.getClass().getName();
		// For test (end)
		
		marshaller.marshal(exchange.getIn().getBody(), doc);
		List outputElement = new ArrayList();
		outputElement.add(doc.getDocumentElement());
		CxfPayload<SoapHeader> responsePayload = new CxfPayload<SoapHeader>(
				null, outputElement);
		exchange.getIn().setBody(responsePayload);
	}

	public void afterPropertiesSet() throws Exception {
		jaxbContext = JAXBContext.newInstance(contextString);
		unmarshaller = jaxbContext.createUnmarshaller();
		marshaller = jaxbContext.createMarshaller();
	}
}
