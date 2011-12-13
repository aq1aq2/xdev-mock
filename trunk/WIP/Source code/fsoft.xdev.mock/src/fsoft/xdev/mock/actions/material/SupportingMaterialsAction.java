package fsoft.xdev.mock.actions.material;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ISupportingMaterialsDao;
import fsoft.xdev.mock.models.SupportingMaterials;
import fsoft.xdev.mock.utilities.XDebugger;

public class SupportingMaterialsAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ISupportingMaterialsDao supportingMaterialsDao;
	private SupportingMaterials supportingMaterial;
	private List<SupportingMaterials> listModel = new ArrayList<SupportingMaterials>();
	
	
	//get how many rows we want to have into the grid - rowNum attribute in the grid
	  private Integer             rows             = 0;

	  public ISupportingMaterialsDao getSupportingMaterialsDao() {
		return supportingMaterialsDao;
	}

	public void setSupportingMaterialsDao(
			ISupportingMaterialsDao supportingMaterialsDao) {
		this.supportingMaterialsDao = supportingMaterialsDao;
	}

	public SupportingMaterials getSupportingMaterial() {
		return supportingMaterial;
	}

	public void setSupportingMaterial(SupportingMaterials supportingMaterial) {
		this.supportingMaterial = supportingMaterial;
	}

	public List<SupportingMaterials> getListModel() {
		return listModel;
	}

	public void setListModel(List<SupportingMaterials> listModel) {
		this.listModel = listModel;
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
		XDebugger.show("Supporting Material said: list method");
		int to = (rows*page);
		int from = to - rows;
		
		//Count Rows (select count(*) from trust District)
		records = supportingMaterialsDao.count();
		
		//Your logic to search and select the required data.
		listModel = supportingMaterialsDao.findRange(from, to);
		
		//calculate the total pages for the query
		total = (int)Math.ceil((double)records/(double)rows);
		return "list";
	}
	
	public String add(){
		supportingMaterialsDao.add(supportingMaterial);
		return "add";
	}
}
