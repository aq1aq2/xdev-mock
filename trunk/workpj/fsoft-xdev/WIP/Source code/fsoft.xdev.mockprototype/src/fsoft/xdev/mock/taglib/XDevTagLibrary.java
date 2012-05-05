package fsoft.xdev.mock.taglib;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.views.TagLibrary;

import com.opensymphony.xwork2.util.ValueStack;

public class XDevTagLibrary implements TagLibrary {

	@Override
	public Object getFreemarkerModels(ValueStack arg0, HttpServletRequest arg1,
			HttpServletResponse arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Class> getVelocityDirectiveClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
