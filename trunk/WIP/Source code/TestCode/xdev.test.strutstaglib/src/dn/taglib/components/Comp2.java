package dn.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.UIBean;
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
    tldTagClass="dn.taglib.views.jsp.ui.Comp2Tag",
    description="Render my tag (as text tag)",
    allowDynamicAttributes=true)
public class Comp2 extends UIBean {

    public static final String TEMPLATE = "comp2";

    public Comp2(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }
}