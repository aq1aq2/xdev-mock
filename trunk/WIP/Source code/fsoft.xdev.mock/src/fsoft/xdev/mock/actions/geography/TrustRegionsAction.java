package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ITrustRegionsDao;
import fsoft.xdev.mock.models.TrustRegions;

public class TrustRegionsAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustRegions trustRegions;
	private ITrustRegionsDao trustRegionDao;
	private List<TrustRegions> listModel = new ArrayList<TrustRegions>();

	public TrustRegions getTrustRegions() {
		return trustRegions;
	}

	public List<TrustRegions> getListModel() {
		return listModel;
	}

	public void setListModel(List<TrustRegions> listModel) {
		this.listModel = listModel;
	}

	public void setTrustRegions(TrustRegions trustRegions) {
		this.trustRegions = trustRegions;
	}

	public void setTrustRegionDao(ITrustRegionsDao trustRegionDao) {
		this.trustRegionDao = trustRegionDao;
	}

	// list all trust region
	public String list(){
		listModel = trustRegionDao.findAll();
		return SUCCESS;
	}
	// save trust region into database
	public String save(){
		trustRegionDao.add(trustRegions);
		return "save";
	}
	
}
