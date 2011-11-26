package fsoft.xdev.mock.actions.test.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import fsoft.xdev.mock.models.TestGovermentOfficeRegion;

public class TestGovermentOfficeRegionAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TestGovermentOfficeRegion> listGovermentOfficeRegion;

	public List<TestGovermentOfficeRegion> getListGovermentOfficeRegion() {
		return listGovermentOfficeRegion;
	}

	public void setListGovermentOfficeRegion(
			List<TestGovermentOfficeRegion> listGovermentOfficeRegion) {
		this.listGovermentOfficeRegion = listGovermentOfficeRegion;
	}
	public String list() {
		listGovermentOfficeRegion = new ArrayList<TestGovermentOfficeRegion>();
		listGovermentOfficeRegion.add(new TestGovermentOfficeRegion("Goverment name 1", "Goverment 1", "viet nam", true));
		listGovermentOfficeRegion.add(new TestGovermentOfficeRegion("Goverment name 1", "Goverment 1", "my", false));
		return "list";
	}

	public String add(){
		return "add";
	}
}
