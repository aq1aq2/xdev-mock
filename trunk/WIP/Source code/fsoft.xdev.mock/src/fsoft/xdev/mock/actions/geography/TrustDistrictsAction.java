package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ITrustDistrictDao;
import fsoft.xdev.mock.dao.ITrustRegionDao;
import fsoft.xdev.mock.models.TrustDistrict;
import fsoft.xdev.mock.models.TrustRegion;

public class TrustDistrictsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustDistrict trustDistrict;
	private ITrustDistrictDao trustDistrictDao;
	private ITrustRegionDao trustRegionDao;
	private List<TrustDistrict> listTrustDistrict = new ArrayList<TrustDistrict>();
	private List<TrustRegion> listTrustRegion = new ArrayList<TrustRegion>();

	// get how many rows we want to have into the grid - rowNum attribute in the
	// grid
	private Integer rows = 0;

	// Get the requested page. By default grid sets this to 1.
	private Integer page = 0;

	// sorting order - asc or desc
	private String sord;

	// get index row - i.e. user click to sort.
	private String sidx;

	// Your Total Pages
	private Integer total = 0;

	// All Record
	private Integer records = 0;

	public TrustDistrict getTrustDistrict() {
		return trustDistrict;
	}

	public void setTrustDistrict(TrustDistrict trustDistrict) {
		this.trustDistrict = trustDistrict;
	}

	public List<TrustDistrict> getListTrustDistrict() {
		return listTrustDistrict;
	}

	public void setListTrustDistrict(List<TrustDistrict> listTrustDistrict) {
		this.listTrustDistrict = listTrustDistrict;
	}

	public List<TrustRegion> getListTrustRegion() {
		return listTrustRegion;
	}

	public void setListTrustRegion(List<TrustRegion> listTrustRegion) {
		this.listTrustRegion = listTrustRegion;
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

	public void setTrustDistrictDao(ITrustDistrictDao trustDistrictDao) {
		this.trustDistrictDao = trustDistrictDao;
	}

	public void setTrustRegionDao(ITrustRegionDao trustRegionDao) {
		this.trustRegionDao = trustRegionDao;
	}

	/**
	 * List all Trust Distric
	 * 
	 * @return action returns listTrustDistrict
	 */
	public String list() {
		System.out.println("We change");
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust District)
		records = trustDistrictDao.count();

		// Your logic to search and select the required data.
		listTrustDistrict = trustDistrictDao.findRange(from, to);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);

		listTrustRegion = trustRegionDao.findAll();
		return "list";
	}

	public String save() {
		System.out.println("vao day");
		trustDistrict.setStatus(false);
		trustDistrictDao.add(trustDistrict);
		System.out.println("One trust districs is added");
		return "add";
	}

	public String listAll() {
		System.out.println("We list all");
		listTrustDistrict = trustDistrictDao.findStart();
		return "listAll";
	}

}
