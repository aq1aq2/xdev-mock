package fsoft.xdev.mock.taglib.views.freemarker.tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.freemarker.tags.TagModel;

import com.opensymphony.xwork2.util.ValueStack;

import fsoft.xdev.mock.taglib.components.Comp1;


public class Comp1Model extends TagModel {

  public Comp1Model(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
    super(stack, req, res);
  }

  @Override
  protected Component getBean()
  {
    return new Comp1(stack, req, res);
  }

}

