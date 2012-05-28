/**
 * EnterpriseXMLResource.java
 *
 * ====================================================================================
 * $Id$
 * ====================================================================================
 */
package dn.servicemix.example.utils.common;

import org.springframework.core.io.Resource;

/**
 * @author NhanLD
 * Created May 28, 2012
 * $Revision$ $Date$
 */
public class ResourceUtil
{
    private Resource inputXml;

    /**
     * Getter for inputXml.
     *
     * @author NhanLD
     * @return the inputXml
     */
    public Resource getInputXml()
    {
        return inputXml;
    }

    /**
     * Setter for inputXml.
     *
     * @author NhanLD
     * @param inputXml the inputXml to set
     */
    public void setInputXml(Resource inputXml)
    {
        this.inputXml = inputXml;
    }
}
