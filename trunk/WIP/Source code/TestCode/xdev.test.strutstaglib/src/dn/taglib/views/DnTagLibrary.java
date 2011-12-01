package dn.taglib.views;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.views.TagLibrary;

import com.opensymphony.xwork2.util.ValueStack;

import dn.taglib.views.freemarker.tags.DnModels;

public class DnTagLibrary implements TagLibrary {

	@Override
	public Object getFreemarkerModels(ValueStack stack, HttpServletRequest req,
			HttpServletResponse res) {
		return new DnModels(stack, req, res);
	}

	@Override
	public List<Class> getVelocityDirectiveClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
