package fsoft.xdev.mock.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.ListUIBean;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an Text with lookup component;
 * <!-- END SNIPPET: javadoc -->
 *
 */

public class XField extends ListUIBean {

    public static final String TEMPLATE = "xfield";
    public static final String COMPONENT_NAME = XField.class.getName();
    
    protected String type; // Input type
    
	public XField(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }

	@Override
	public void evaluateExtraParams() {
		super.evaluateExtraParams();
		if (type != null)
	    {
	      addParameter("type", findValue(type, String.class));
	    }
	}
	
	public void setType(String type) {
		this.type = type;
	}
}