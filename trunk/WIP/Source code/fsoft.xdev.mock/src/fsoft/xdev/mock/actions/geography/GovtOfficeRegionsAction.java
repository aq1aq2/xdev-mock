package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IGovtOfficeRegionsDao;
import fsoft.xdev.mock.models.GovtOfficeRegions;

public class GovtOfficeRegionsAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GovtOfficeRegions governmentOfficeRegion;
	private IGovtOfficeRegionsDao governmentOfficeRegionDao;
	private List<GovtOfficeRegions> listGovernmentOfficeRegion = new ArrayList<GovtOfficeRegions>();
	
	public String list(){
		System.out.println("co vao day khong");
		listGovernmentOfficeRegion = governmentOfficeRegionDao.findAll();
		return "list";
	}

	public GovtOfficeRegions getGovernmentOfficeRegion() {
		return governmentOfficeRegion;
	}

	public void setGovernmentOfficeRegion(GovtOfficeRegions governmentOfficeRegion) {
		this.governmentOfficeRegion = governmentOfficeRegion;
	}

//	public IGovtOfficeRegionsDao getGovernmentOfficeRegionDAO() {
//		return governmentOfficeRegionDao;
//	}

	public void setGovernmentOfficeRegionDao(
			IGovtOfficeRegionsDao governmentOfficeRegionDAO) {
		this.governmentOfficeRegionDao = governmentOfficeRegionDAO;
	}

	public List<GovtOfficeRegions> getListGovernmentOfficeRegion() {
		return listGovernmentOfficeRegion;
	}

	public void setListGovernmentOfficeRegion(
			List<GovtOfficeRegions> listGovernmentOfficeRegion) {
		this.listGovernmentOfficeRegion = listGovernmentOfficeRegion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
