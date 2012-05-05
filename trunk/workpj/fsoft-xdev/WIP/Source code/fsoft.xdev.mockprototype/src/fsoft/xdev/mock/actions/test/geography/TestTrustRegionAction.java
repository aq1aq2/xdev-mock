package fsoft.xdev.mock.actions.test.geography;

import fsoft.xdev.mock.models.TestTrustRegion;
import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

public class TestTrustRegionAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TestTrustRegion> listTrustRegion;

	public List<TestTrustRegion> getListTrustRegion() {
		return listTrustRegion;
	}

	public void setListTrustRegion(List<TestTrustRegion> listTrustRegion) {
		this.listTrustRegion = listTrustRegion;
	}

	public String list() {
		listTrustRegion = new ArrayList<TestTrustRegion>();
		listTrustRegion.add(new TestTrustRegion("vung1", "vung1", "viet nam",
				true));
		listTrustRegion.add(new TestTrustRegion("vung2", "vung2", "my", false));
		return "list";
	}

	public String add(){
		return "add";
	}
}
