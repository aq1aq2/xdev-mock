package fsoft.xdev.mock.models;

public class PremiseList {
	private int premiseId;
	private String name;
	private String locationName;
	private String addressLine1;
	private String postcode;
	private Boolean status;

	public PremiseList(int premiseId, String name, String locationName,
			String addressLine1, String postcode, Boolean status) {
		super();
		this.premiseId = premiseId;
		this.name = name;
		this.locationName = locationName;
		this.addressLine1 = addressLine1;
		this.postcode = postcode;
		this.status = status;
	}

	public PremiseList( int premiseId) {
		super();
		this.premiseId = premiseId;
	}

	public int getPremiseId() {
		return premiseId;
	}

	public void setPremiseId(int premiseId) {
		this.premiseId = premiseId;
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

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
