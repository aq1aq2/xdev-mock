package dn.servicemix.example.utils;

import java.io.File;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlConverter {
	static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	static final String JAXP_SCHEMA_LOCATION = "http://java.sun.com/xml/jaxp/properties/schemaSource";
	static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

	JAXBContext jaxbContext;
	Unmarshaller unmarshaller;
	Marshaller marshaller;

	/**
	 * Process a XML file by unmarshalling it using JAXB. Note that there must
	 * be only one element in the body.
	 * 
	 * @author NhanLD
	 * @param stream
	 * @return
	 * @throws Exception
	 */
	public synchronized Object unmarshall(InputStream stream) throws Exception {
        Object result = null;
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(stream);
        //doc.getDocumentElement().normalize();
 
        NodeList nList = doc.getChildNodes();
        
        if(nList.getLength() == 1)
        {
            //Node node = nList.item(0);
            Element element = doc.getDocumentElement();
            JAXBContext jaxbContext = JAXBContext.newInstance("dn.servicemix.test.xml");
            unmarshaller = jaxbContext.createUnmarshaller();
            
            SchemaFactory sf = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(getClass().getResource( "/dn/servicemix/test/schemas/srva.xsd"));
            unmarshaller.setSchema(schema);
            
            result = unmarshaller.unmarshal(element);
        }
        
        return result;
	}

	/**
	 * Marshalls an object into an appropriate XML and save to file.
	 * 
	 * @author NhanLD
	 * @param filePath
	 * @param input
	 * @throws Exception
	 */
	public synchronized void marshall(String filePath, Object input)
			throws Exception {
		jaxbContext = JAXBContext.newInstance("com.discorp.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(input, doc);

		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		File outFile = new File(filePath);
		StreamResult result = new StreamResult(outFile);
		transformer.transform(source, result);
	}
}
