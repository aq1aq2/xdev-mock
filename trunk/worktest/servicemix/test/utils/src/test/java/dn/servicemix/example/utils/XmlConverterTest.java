package dn.servicemix.example.utils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dn.servicemix.example.utils.common.ResourceUtil;
import dn.servicemix.example.utils.common.TestConstants;
import dn.servicemix.example.xml.ShowActorRequest;

/**
 * @author NhanLD Created May 28, 2012 $Revision$ $Date$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
public class XmlConverterTest {
	@Autowired
	ResourceUtil resourceUtil;

	/**
	 * Test XmlConverter function.
	 * 
	 * @author NhanLD
	 * @throws Exception
	 *             exception
	 */
	@Test
	public void testXmlConverter() throws Exception {
		XmlConverter converter = new XmlConverter();
		Object object = converter.unmarshall(resourceUtil.getInputXml().getInputStream());
		Assert.assertNotNull(TestConstants.FAILED_NULL, object);
		Assert.assertTrue(TestConstants.FAILED_NOT_TRUE, object instanceof ShowActorRequest);
	}
}
