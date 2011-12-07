package fsoft.xdev.mock.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.TextField;


import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an Text with lookup component;
 * <!-- END SNIPPET: javadoc -->
 *
 */

public class TextLookup extends TextField {

    public static final String TEMPLATE = "textlookup";
    public static final String COMPONENT_NAME = TextLookup.class.getName();
    
    protected String lookupType; // Dialog type ?????
    
	public TextLookup(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }

    public void setLookuptype(String lookuptype) {
		this.lookupType = lookuptype;
	}

}