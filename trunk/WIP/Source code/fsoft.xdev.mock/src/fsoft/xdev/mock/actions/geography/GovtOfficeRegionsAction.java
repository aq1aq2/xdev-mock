package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ICountiesDao;
import fsoft.xdev.mock.dao.IGovtOfficeRegionsDao;
import fsoft.xdev.mock.models.Counties;
import fsoft.xdev.mock.models.GovtOfficeRegions;

public class GovtOfficeRegionsAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private GovtOfficeRegions governmentOfficeRegion;
	private IGovtOfficeRegionsDao governmentOfficeRegionDao;
	//private ICountiesDao countiesDao;
	private List<Counties> listCounties = new ArrayList<Counties>();
	private List<GovtOfficeRegions> listGovernmentOfficeRegion = new ArrayList<GovtOfficeRegions>();


	//get how many rows we want to have into the grid - rowNum attribute in the grid
	private Integer             rows             = 0;

	//Get the requested page. By default grid sets this to 1.
	private Integer             page             = 0;

	// sorting order - asc or desc
	private String              sord;

	// get index row - i.e. user click to sort.
	private String              sidx;

	// Your Total Pages
	private Integer             total            = 0;

	// All Record
	private Integer             records          = 0;	

	/**
	 * List Government Office Region
	 * @return action, listGovernmentOfficeRegion
	 */
	public String list(){
		System.out.println("+++++++++++++++++++++++++++++++++++++");		
		System.out.println("co vao day khong");
		
		int to = (rows*page);
		int from = to-rows;
		
		//Count Rows (select count(*) from GovtOfficeRegion)
		records = governmentOfficeRegionDao.count();
		
		//Your logic to search and select the required data.
		listGovernmentOfficeRegion = governmentOfficeRegionDao.findRange(from, to);
		
		//calculate the total pages for the query
		total = (int)Math.ceil((double)records/(double)rows);
		
		//listCounties = countiesDao.findAll();
		
		//listGovernmentOfficeRegion = governmentOfficeRegionDao.findAll();
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		System.out.println("||||||||||||||||||||||||||||||||||||");
//		for(GovtOfficeRegions gov: listGovernmentOfficeRegion){
//			System.out.println(gov.getGovtOfficeRegionId());
//			System.out.println(gov.getName());
//			System.out.println(gov.getDescription());
//			System.out.println(gov.getCounties().getName());
//			System.out.println(gov.getIsActive());
//		}
		return "list";
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

//	public ICountiesDao getCountiesDao() {
//		return countiesDao;
//	}
//
//	public void setCountiesDao(ICountiesDao countiesDao) {
//		this.countiesDao = countiesDao;
//	}

	public List<Counties> getListCounties() {
		return listCounties;
	}

	public void setListCounties(List<Counties> listCounties) {
		this.listCounties = listCounties;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}


	
}
