package dn.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.views.annotations.StrutsTag;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an HTML &lt;div&gt;
 * <!-- END SNIPPET: javadoc -->
 *
 */
@StrutsTag(
    name="div",
    tldTagClass="dn.taglib.views.jsp.ui.Comp1Tag",
    description="Render my tag (as div tag)",
    allowDynamicAttributes=true)
public class Comp1 extends ClosingUIBean {

    public static final String TEMPLATE = "comp1";
    public static final String TEMPLATE_CLOSE = "comp1-close";
    public static final String COMPONENT_NAME = Comp1.class.getName();

    public Comp1(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    public String getDefaultOpenTemplate() {
        return TEMPLATE;
    }

    protected String getDefaultTemplate() {
        return TEMPLATE_CLOSE;
    }
}