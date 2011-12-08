package fsoft.xdev.mock.actions.geography;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fsoft.xdev.mock.dao.ICountriesDao;
import fsoft.xdev.mock.dao.ITrustRegionsDao;
import fsoft.xdev.mock.models.Countries;
import fsoft.xdev.mock.models.TrustRegions;

public class TrustRegionsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TrustRegions trustRegions;
	private ITrustRegionsDao trustRegionDao;
	private List<TrustRegions> listModel = new ArrayList<TrustRegions>();
	private List<Countries> listCountries = new ArrayList<Countries>();
	private ICountriesDao countriesDao;

	public TrustRegions getTrustRegions() {
		return trustRegions;
	}

	public List<Countries> getListCountries() {
		return listCountries;
	}

	public void setListCountries(List<Countries> listCountries) {
		this.listCountries = listCountries;
	}

	public void setCountriesDao(ICountriesDao countriesDao) {
		this.countriesDao = countriesDao;
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

	public TrustRegionsAction() {
		trustRegions = new TrustRegions();
	}

	// list all trust region
	public String list() {
		System.out.println("list");
		listModel = trustRegionDao.findAll();
		listCountries = countriesDao.findAll();
		for(Countries c : listCountries){
			System.out.println(c.getName());
		}
		return "list";
	}
	

	// save trust region into database
	public String save() {
		trustRegionDao.add(trustRegions);
		return "add";
	}

}
