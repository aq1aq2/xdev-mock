package fsoft.xdev.mock.taglib.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.UIBean;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * Creates an Contact List module;
 * <!-- END SNIPPET: javadoc -->
 *
 */

public class ContactList extends UIBean {

    public static final String TEMPLATE = "xtag/contactList";
    public static final String COMPONENT_NAME = ContactList.class.getName();
    
    public ContactList(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }
}