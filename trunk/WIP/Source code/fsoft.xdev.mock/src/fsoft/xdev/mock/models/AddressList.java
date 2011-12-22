package fsoft.xdev.mock.models;

public class AddressList {
	private int addressId;
	private String name;
	private String postCode;
	private String town;
	private String county;
	private String country;
	
	
	public AddressList(int addressId, String name, String postCode,
			String town, String county, String country) {
		super();
		this.addressId = addressId;
		this.name = name;
		this.postCode = postCode;
		this.town = town;
		this.county = county;
		this.country = country;
	}
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

