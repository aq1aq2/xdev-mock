package fsoft.xdev.mock.actions.test.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.models.TestTrustDistrict;

public class TestTrustDistrictAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TestTrustDistrict> listTrustDistrict;

	public List<TestTrustDistrict> getListTrustDistrict() {
		return listTrustDistrict;
	}

	public void setListTrustDistrict(List<TestTrustDistrict> listTrustDistrict) {
		this.listTrustDistrict = listTrustDistrict;
	}

	public String list() {
		listTrustDistrict = new ArrayList<TestTrustDistrict>();
		listTrustDistrict.add(new TestTrustDistrict("District name 1",
				"district 1", "region name 1", true));
		listTrustDistrict.add(new TestTrustDistrict("District name 2",
				"district 2", "region name 1", true));
		return "list";
	}

	public String add() {
		return "add";
	}
}
