package fsoft.xdev.mock.models;

public class FacilityList {
	private int facilityId;
	private String facilityType;
	private String description;
	private String contactName;
	private Boolean status;
	
	public FacilityList(int facilityId, String facilityType,
			String description, String contactName, Boolean status) {
		super();
		this.facilityId = facilityId;
		this.facilityType = facilityType;
		this.description = description;
		this.contactName = contactName;
		this.status = status;
	}

	public FacilityList(int facilityId) {
		super();
		this.facilityId = facilityId;
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityType() {
		return facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
