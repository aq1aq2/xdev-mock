package fsoft.xdev.mock.models;
import java.util.HashSet;
import java.util.Set;

/**
 * County generated by hbm2java
 */
public class County implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int countyId;
	private Country country;
	private String name;
	private Set<GovOfficeRegion> govOfficeRegions = new HashSet<GovOfficeRegion>(
			0);
	private Set<Directorate> directorates = new HashSet<Directorate>(0);
	private Set<Organisation> organisations = new HashSet<Organisation>(0);
	private Set<Town> towns = new HashSet<Town>(0);
	private Set<Team> teams = new HashSet<Team>(0);

	public County() {
	}

	public County(int countyId) {
		this.countyId = countyId;
	}

	public County(int countyId, Country country, String name,
			Set<GovOfficeRegion> govOfficeRegions,
			Set<Directorate> directorates, Set<Organisation> organisations,
			Set<Town> towns, Set<Team> teams) {
		this.countyId = countyId;
		this.country = country;
		this.name = name;
		this.govOfficeRegions = govOfficeRegions;
		this.directorates = directorates;
		this.organisations = organisations;
		this.towns = towns;
		this.teams = teams;
	}

	public int getCountyId() {
		return this.countyId;
	}

	public void setCountyId(int countyId) {
		this.countyId = countyId;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<GovOfficeRegion> getGovOfficeRegions() {
		return this.govOfficeRegions;
	}

	public void setGovOfficeRegions(Set<GovOfficeRegion> govOfficeRegions) {
		this.govOfficeRegions = govOfficeRegions;
	}

	public Set<Directorate> getDirectorates() {
		return this.directorates;
	}

	public void setDirectorates(Set<Directorate> directorates) {
		this.directorates = directorates;
	}

	public Set<Organisation> getOrganisations() {
		return this.organisations;
	}

	public void setOrganisations(Set<Organisation> organisations) {
		this.organisations = organisations;
	}

	public Set<Town> getTowns() {
		return this.towns;
	}

	public void setTowns(Set<Town> towns) {
		this.towns = towns;
	}

	public Set<Team> getTeams() {
		return this.teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

}
