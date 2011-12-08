package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ITrustDistrictsDao;
import fsoft.xdev.mock.models.TrustDistricts;

public class TrustDistrictsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustDistricts trustDistrict;
	private ITrustDistrictsDao trustDistrictDao;									
	private List<TrustDistricts> listTrustDistrict = new ArrayList<TrustDistricts>();
	/**
	 * List all Trust Distric
	 * @return action returns listTrustDistrict
	 */
	public String list(){
		System.out.println("We change");
		listTrustDistrict = trustDistrictDao.findAll();
		return "list";
	}
	
	public String save(){
		System.out.println("vao day");
		trustDistrict.setIsActive(false);
		trustDistrictDao.add(trustDistrict);
		System.out.println("One trust districs is added");
		return "add";
	}

	public void setTrustDistrict(TrustDistricts trustDistrict) {
		this.trustDistrict = trustDistrict;
	}
	
	public void setTrustDistrictDao(ITrustDistrictsDao trustDistrictDao) {
		this.trustDistrictDao = trustDistrictDao;
	}

	public TrustDistricts getTrustDistrict() {
		return trustDistrict;
	}

	public List<TrustDistricts> getListTrustDistrict() {
		return listTrustDistrict;
	}

	public void setListTrustDistrict(List<TrustDistricts> listTrustDistrict) {
		this.listTrustDistrict = listTrustDistrict;
	}

}
