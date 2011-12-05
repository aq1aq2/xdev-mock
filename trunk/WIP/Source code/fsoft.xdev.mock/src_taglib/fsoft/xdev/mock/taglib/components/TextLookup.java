package fsoft.xdev.mock.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.TextField;


import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an Organisation List module;
 * <!-- END SNIPPET: javadoc -->
 *
 */

public class TextLookup extends TextField {

    public static final String TEMPLATE = "textlookup";
    public static final String COMPONENT_NAME = TextLookup.class.getName();
    
    public TextLookup(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }
}