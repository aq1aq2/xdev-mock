package fsoft.xdev.mock.actions.organisation;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.IOrganisationDao;
import fsoft.xdev.mock.models.Organisation;
import fsoft.xdev.mock.utilities.XDebugger;

public class OrganisationsAction extends ActionSupport{
	/**
	 * 
	 */
	private Organisation organisation;
	private IOrganisationDao organisationDao;
	private List<Organisation> listModel = new ArrayList<Organisation>();

	private static final long serialVersionUID = 1L;
	
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
	
	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}
	

	public void setOrganisationDao(IOrganisationDao organisationDao) {
		this.organisationDao = organisationDao;
	}

	public List<Organisation> getListModel() {
		return listModel;
	}

	public void setListModel(List<Organisation> listModel) {
		this.listModel = listModel;
	}

	
	
	public OrganisationsAction() {
		XDebugger.show("Constructor: Create Organisation Action");
	}
	
	public String list() {
		XDebugger.show("OrganisationAction said: list method");
		// listModel = trustRegionDao.findAll();
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
		records = organisationDao.count();

		// Your logic to search and select the required data.
		listModel = organisationDao.findRange(from, to);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);

		return "list";
	}
	
	public String add() {
		XDebugger.show("OrganisationAction said: add method");
		organisationDao.add(organisation);
		return "add";
	}
}
