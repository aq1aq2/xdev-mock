package fsoft.xdev.mock.models;

// Generated Dec 16, 2011 11:06:42 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TrustRegion generated by hbm2java
 */
public class TrustRegion implements java.io.Serializable {

	private int trustRegionId;
	private Country country;
	private String name;
	private String description;
	private Boolean status;
	private Set<TrustDistrict> trustDistricts = new HashSet<TrustDistrict>(0);

	public TrustRegion() {
	}

	public TrustRegion(int trustRegionId) {
		this.trustRegionId = trustRegionId;
	}

	public TrustRegion(int trustRegionId, Country country, String name,
			String description, Boolean status,
			Set<TrustDistrict> trustDistricts) {
		this.trustRegionId = trustRegionId;
		this.country = country;
		this.name = name;
		this.description = description;
		this.status = status;
		this.trustDistricts = trustDistricts;
	}
	
	
	public int getTrustRegionId() {
		return this.trustRegionId;
	}

	public void setTrustRegionId(int trustRegionId) {
		this.trustRegionId = trustRegionId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Set<TrustDistrict> getTrustDistricts() {
		return this.trustDistricts;
	}

	public void setTrustDistricts(Set<TrustDistrict> trustDistricts) {
		this.trustDistricts = trustDistricts;
	}

}
