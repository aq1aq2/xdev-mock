package dn.taglib.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

import com.opensymphony.xwork2.util.ValueStack;

import dn.taglib.components.Comp2;

public class Comp2Tag extends AbstractUITag {

	private static final long serialVersionUID = 5098317235818877157L;

	public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Comp2(stack, req, res);
    }
}
