package fsoft.xdev.mock.taglib.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

import com.opensymphony.xwork2.util.ValueStack;

import fsoft.xdev.mock.taglib.components.TrustRegionInput;


public class TrustRegionListTag extends AbstractUITag {

	private static final long serialVersionUID = 5577089764622677517L;

	public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new TrustRegionInput(stack, req, res);
    }
}
