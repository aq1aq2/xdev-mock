package fsoft.xdev.mock.models;

public class TestPremise {
	private String locationName;
	private String addressLine1;
	private String postCode;
	private boolean isActive;
	
	public TestPremise() {
		
	}

	public TestPremise(String locationName, String addressLine1,
			String postCode, boolean isActive) {
		super();
		this.locationName = locationName;
		this.addressLine1 = addressLine1;
		this.postCode = postCode;
		this.isActive = isActive;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
