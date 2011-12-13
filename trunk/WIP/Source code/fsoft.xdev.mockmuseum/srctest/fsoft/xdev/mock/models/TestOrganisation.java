package fsoft.xdev.mock.models;

public class TestOrganisation {
	
	private String name;
	private String headOfficeAddLine1;
	private String postCode;
	private String contact;
	private boolean isActive;
	
	public TestOrganisation(String name, String headOfficeAddLine1,
			String postCode, String contact, boolean isActive) {
		super();
		this.name = name;
		this.headOfficeAddLine1 = headOfficeAddLine1;
		this.postCode = postCode;
		this.contact = contact;
		this.isActive = isActive;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadOfficeAddLine1() {
		return headOfficeAddLine1;
	}
	public void setHeadOfficeAddLine1(String headOfficeAddLine1) {
		this.headOfficeAddLine1 = headOfficeAddLine1;
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
