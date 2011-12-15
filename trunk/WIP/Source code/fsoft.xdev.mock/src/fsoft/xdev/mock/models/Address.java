package fsoft.xdev.mock.models;
public class Address implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int addressId;
	private Town town;
	private String name;
	private String postCode;

	public Address() {
	}

	public Address(int addressId) {
		this.addressId = addressId;
	}

	public Address(int addressId, Town town, String name, String postCode) {
		this.addressId = addressId;
		this.town = town;
		this.name = name;
		this.postCode = postCode;
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Town getTown() {
		return this.town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

}
