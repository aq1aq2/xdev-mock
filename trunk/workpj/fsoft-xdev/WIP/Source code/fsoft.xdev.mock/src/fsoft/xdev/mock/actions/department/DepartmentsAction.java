package fsoft.xdev.mock.actions.department;

import java.util.ArrayList;
import java.util.List;

import fsoft.xdev.mock.dao.IDepartmentDao;
import fsoft.xdev.mock.models.Department;
import fsoft.xdev.mock.utilities.XDebugger;

public class DepartmentsAction {
	/**
	 * 
	 */
	private Department department;
	private IDepartmentDao departmentDao;
	private List<Department> listModel = new ArrayList<Department>();
	
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
	


	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Department> getListModel() {
		return listModel;
	}

	public void setListModel(List<Department> listModel) {
		this.listModel = listModel;
	}

	public void setDepartmentsDao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	public DepartmentsAction() {
		XDebugger.show("Constructor: Create Department Action");
	}
	
	public String list() {
		XDebugger.show("DepartmentAction said: list method");
		// listModel = trustRegionDao.findAll();
		int to = (rows * page);
		int from = to - rows;

		// Count Rows (select count(*) from trust Region)
//		records = departmentDao.count();
//
//		// Your logic to search and select the required data.
//		listModel = departmentDao.findRange(from, to);

		// calculate the total pages for the query
		total = (int) Math.ceil((double) records / (double) rows);

		return "list";
	}
	
	public String add() {
		XDebugger.show("DepartmentAction said: add method");
		departmentDao.add(department);
		return "add";
	}
}
