package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ITrustDistrictsDao;
import fsoft.xdev.mock.dao.ITrustRegionsDao;
import fsoft.xdev.mock.models.TrustDistricts;
import fsoft.xdev.mock.models.TrustRegions;

public class TrustDistrictsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustDistricts trustDistrict;
	private ITrustDistrictsDao trustDistrictDao;
	private ITrustRegionsDao trustRegionsDao;
	private List<TrustDistricts> listTrustDistrict = new ArrayList<TrustDistricts>();
	private List<TrustRegions> listTrustRegion = new ArrayList<TrustRegions>();
	
	
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
	 * List all Trust Distric
	 * @return action returns listTrustDistrict
	 */
	public String list(){
		System.out.println("We change");
		//listTrustDistrict = trustDistrictDao.findAll();
		int to = (rows*page);
		int from = to - rows;
		
		//Count Rows (select count(*) from trust District)
		records = trustDistrictDao.count();
		
		//Your logic to search and select the required data.
		listTrustDistrict = trustDistrictDao.findRange(from, to);
		
		//calculate the total pages for the query
		total = (int)Math.ceil((double)records/(double)rows);
		
		listTrustRegion = trustRegionsDao.findAll();
		return "list";
	}
	
	public String save(){
		System.out.println("vao day");
		trustDistrict.setIsActive(false);
		trustDistrictDao.add(trustDistrict);
		System.out.println("One trust districs is added");
		return "add";
	}
	
	public String listAll(){
		System.out.println("We list all");
		listTrustDistrict = trustDistrictDao.findStart();
		return "listAll";
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

	public void setTrustRegionsDao(ITrustRegionsDao trustRegionsDao) {
		this.trustRegionsDao = trustRegionsDao;
	}

	public List<TrustRegions> getListTrustRegion() {
		return listTrustRegion;
	}

	public void setListTrustRegion(List<TrustRegions> listTrustRegion) {
		this.listTrustRegion = listTrustRegion;
	}
	
	

}
