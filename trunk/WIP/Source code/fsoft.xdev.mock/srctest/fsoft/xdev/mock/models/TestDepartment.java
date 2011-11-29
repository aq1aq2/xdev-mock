package fsoft.xdev.mock.models;

public class TestDepartment {
	
	public TestDepartment(String departmentName, String addressLine1,
			String postCode, String contact, boolean isActive) {
		super();
		this.departmentName = departmentName;
		this.addressLine1 = addressLine1;
		this.postCode = postCode;
		this.contact = contact;
		this.isActive = isActive;
	}
	private String departmentName;
	private String addressLine1;
	private String postCode;
	private String contact;
	private boolean isActive;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
