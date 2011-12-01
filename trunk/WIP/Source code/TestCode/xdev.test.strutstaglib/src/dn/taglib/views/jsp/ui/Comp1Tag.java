package dn.taglib.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractClosingTag;

import com.opensymphony.xwork2.util.ValueStack;

import dn.taglib.components.Comp1;

public class Comp1Tag extends AbstractClosingTag {

	private static final long serialVersionUID = 5577089764622677517L;

	public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Comp1(stack, req, res);
    }
}
