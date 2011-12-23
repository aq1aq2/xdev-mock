package fsoft.xdev.mock.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.UIBean;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an Text with lookup component;
 * <!-- END SNIPPET: javadoc -->
 *
 */

public class XHead extends UIBean {

    public static final String TEMPLATE = "xhead";
    public static final String COMPONENT_NAME = XHead.class.getName();
    
	public XHead(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }

}