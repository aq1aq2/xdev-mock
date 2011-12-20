package fsoft.xdev.mock.models;

public class TrustDistrictList {
	private int trustDistrictId;
	private String name;
	private String description;
	private String trustRegionName;
	private Boolean status;
	
	
	public TrustDistrictList(int trustDistrictId) {
		super();
		this.trustDistrictId = trustDistrictId;
	}
	public TrustDistrictList(int trustDistrictId, String name,
			String description, String trustRegionName, Boolean status) {
		super();
		this.trustDistrictId = trustDistrictId;
		this.name = name;
		this.description = description;
		this.trustRegionName = trustRegionName;
		this.status = status;
	}
	public int getTrustDistrictId() {
		return trustDistrictId;
	}
	public void setTrustDistrictId(int trustDistrictId) {
		this.trustDistrictId = trustDistrictId;
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
	public String getTrustRegionName() {
		return trustRegionName;
	}
	public void setTrustRegionName(String trustRegionName) {
		this.trustRegionName = trustRegionName;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
