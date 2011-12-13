package fsoft.xdev.mock.models;

// Generated Dec 6, 2011 8:45:37 AM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Counties generated by hbm2java
 */
public class Counties implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private int countyId;
	private Countries countries;
	private String name;
	private Set<GovtOfficeRegions> govtOfficeRegionses = new HashSet<GovtOfficeRegions>(
			0);
	private Set<Towns> townses = new HashSet<Towns>(0);

	public Counties() {
	}

	public Counties(int countyId) {
		this.countyId = countyId;
	}

	public Counties(int countyId, Countries countries, String name,
			Set<GovtOfficeRegions> govtOfficeRegionses, Set<Towns> townses) {
		this.countyId = countyId;
		this.countries = countries;
		this.name = name;
		this.govtOfficeRegionses = govtOfficeRegionses;
		this.townses = townses;
	}

	public int getCountyId() {
		return this.countyId;
	}

	public void setCountyId(int countyId) {
		this.countyId = countyId;
	}

	public Countries getCountries() {
		return this.countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<GovtOfficeRegions> getGovtOfficeRegionses() {
		return this.govtOfficeRegionses;
	}

	public void setGovtOfficeRegionses(
			Set<GovtOfficeRegions> govtOfficeRegionses) {
		this.govtOfficeRegionses = govtOfficeRegionses;
	}

	public Set<Towns> getTownses() {
		return this.townses;
	}

	public void setTownses(Set<Towns> townses) {
		this.townses = townses;
	}

}
