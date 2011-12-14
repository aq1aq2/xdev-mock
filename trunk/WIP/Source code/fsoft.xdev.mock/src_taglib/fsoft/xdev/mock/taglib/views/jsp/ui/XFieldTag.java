package fsoft.xdev.mock.taglib.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

import com.opensymphony.xwork2.util.ValueStack;

import fsoft.xdev.mock.taglib.components.XField;


public class XFieldTag extends AbstractUITag {

	private static final long serialVersionUID = 5577089764622677517L;
	
	protected String type; // Input type

	public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new XField(stack, req, res);
    }
	
	protected void populateParams()
	  {
	    super.populateParams();

	    XField xfield = (XField) component;
	    xfield.setType(type);
	  }

	public void setType(String type) {
		this.type = type;
	}

}
