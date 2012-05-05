package fsoft.xdev.mock.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.UIBean;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an Trust Region Input module;
 * <!-- END SNIPPET: javadoc -->
 *
 */

public class TrustRegionInput extends UIBean {

    public static final String TEMPLATE = "xtag/trustRegionInput";
    public static final String COMPONENT_NAME = TrustRegionInput.class.getName();
    
    public TrustRegionInput(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }
}