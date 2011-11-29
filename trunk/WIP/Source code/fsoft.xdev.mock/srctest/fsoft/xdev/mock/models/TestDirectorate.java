package fsoft.xdev.mock.models;

public class TestDirectorate {
	
	public TestDirectorate(String directorateName, String officeAddressLine1,
			String postCode, String contact, boolean isActive) {
		super();
		this.directorateName = directorateName;
		this.officeAddressLine1 = officeAddressLine1;
		this.postCode = postCode;
		this.contact = contact;
		this.isActive = isActive;
	}
	private String directorateName;
	private String officeAddressLine1;
	private String postCode;
	private String contact;
	private boolean isActive;
	
	public String getDirectorateName() {
		return directorateName;
	}
	public void setDirectorateName(String directorateName) {
		this.directorateName = directorateName;
	}
	public String getOfficeAddressLine1() {
		return officeAddressLine1;
	}
	public void setOfficeAddressLine1(String officeAddressLine1) {
		this.officeAddressLine1 = officeAddressLine1;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
}
