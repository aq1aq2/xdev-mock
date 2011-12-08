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
		/*for(GovtOfficeRegions gov: listGovernmentOfficeRegion){
			System.out.println(gov.getGovtOfficeRegionId());
			System.out.println(gov.getName());
			System.out.println(gov.getDescription());
			System.out.println(gov.getCounties().getName());
			System.out.println(gov.getIsActive());
		}*/
		return SUCCESS;
	}

	public GovtOfficeRegions getGovernmentOfficeRegion() {
		return governmentOfficeRegion;
	}

	public void setGovernmentOfficeRegion(GovtOfficeRegions governmentOfficeRegion) {
		this.governmentOfficeRegion = governmentOfficeRegion;
	}
	public void setGovernmentOfficeRegionDao(
			IGovtOfficeRegionsDao governmentOfficeRegionDao) {
		this.governmentOfficeRegionDao = governmentOfficeRegionDao;
	}

	public List<GovtOfficeRegions> getListGovernmentOfficeRegion() {
		return listGovernmentOfficeRegion;
	}

	public void setListGovernmentOfficeRegion(
			List<GovtOfficeRegions> listGovernmentOfficeRegion) {
		this.listGovernmentOfficeRegion = listGovernmentOfficeRegion;
	}

}
