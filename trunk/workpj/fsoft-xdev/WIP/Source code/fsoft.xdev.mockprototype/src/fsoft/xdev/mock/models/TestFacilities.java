package fsoft.xdev.mock.models;

public class TestFacilities {
	private String facilityType;
	private String description;
	private String leadContact;
	private String roomHost;
	private boolean isActive;
	
	public TestFacilities(String facilityType, String description,
			String leadContact, String roomHost, boolean isActive) {
		super();
		this.facilityType = facilityType;
		this.description = description;
		this.leadContact = leadContact;
		this.roomHost = roomHost;
		this.isActive = isActive;
	}
	
	public TestFacilities() {
		
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

	public String getLeadContact() {
		return leadContact;
	}

	public void setLeadContact(String leadContact) {
		this.leadContact = leadContact;
	}

	public String getRoomHost() {
		return roomHost;
	}

	public void setRoomHost(String roomHost) {
		this.roomHost = roomHost;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
