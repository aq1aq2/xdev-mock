package fsoft.xdev.mock.models;

public class TrustRegionList {
	private int trustRegionId;
	private String name;
	private String description;
	private Boolean status;
	private String countryName;

	public TrustRegionList(int trustRegionId) {
		super();
		this.trustRegionId = trustRegionId;
	}

	public TrustRegionList(int trustRegionId, String name, String description,
			Boolean status, String countryName) {
		super();
		this.trustRegionId = trustRegionId;
		this.name = name;
		this.description = description;
		this.status = status;
		this.countryName = countryName;
	}

	public int getTrustRegionId() {
		return trustRegionId;
	}

	public void setTrustRegionId(int trustRegionId) {
		this.trustRegionId = trustRegionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
