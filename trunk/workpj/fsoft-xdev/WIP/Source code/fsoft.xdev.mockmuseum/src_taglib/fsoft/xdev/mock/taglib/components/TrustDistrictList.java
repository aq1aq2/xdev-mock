package fsoft.xdev.mock.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.UIBean;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an Trust District List module;
 * <!-- END SNIPPET: javadoc -->
 *
 */

public class TrustDistrictList extends UIBean {

    public static final String TEMPLATE = "xtag/trustDistrictList";
    public static final String COMPONENT_NAME = TrustDistrictList.class.getName();
    
    public TrustDistrictList(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }
}