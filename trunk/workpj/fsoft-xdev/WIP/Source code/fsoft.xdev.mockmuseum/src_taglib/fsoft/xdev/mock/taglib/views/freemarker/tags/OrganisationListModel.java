package fsoft.xdev.mock.taglib.views.freemarker.tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.freemarker.tags.TagModel;

import com.opensymphony.xwork2.util.ValueStack;

import fsoft.xdev.mock.taglib.components.OrganisationList;


public class OrganisationListModel extends TagModel {

  public OrganisationListModel(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
    super(stack, req, res);
  }

  @Override
  protected Component getBean()
  {
    return new OrganisationList(stack, req, res);
  }

}

