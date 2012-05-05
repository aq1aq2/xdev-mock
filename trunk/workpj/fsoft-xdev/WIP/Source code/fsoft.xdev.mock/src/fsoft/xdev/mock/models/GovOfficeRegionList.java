package fsoft.xdev.mock.models;

public class GovOfficeRegionList {
	private int govOfficeRegionId;
	private String name;
	private String description;
	private String countyName;
	private Boolean status;
	
	public GovOfficeRegionList(int govOfficeRegionId, String name,
			String description, String countyName, Boolean status) {
		super();
		this.govOfficeRegionId = govOfficeRegionId;
		this.name = name;
		this.description = description;
		this.countyName = countyName;
		this.status = status;
	}
	public int getGovOfficeRegionId() {
		return govOfficeRegionId;
	}
	public void setGovOfficeRegionId(int govOfficeRegionId) {
		this.govOfficeRegionId = govOfficeRegionId;
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
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
