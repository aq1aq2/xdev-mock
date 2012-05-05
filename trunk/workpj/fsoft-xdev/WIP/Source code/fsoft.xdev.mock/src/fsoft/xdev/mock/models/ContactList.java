package fsoft.xdev.mock.models;

public class ContactList {
	private int contactId;
	private String name;
	private String mobilePhone;
	private String email;
	private String contactType;
	private Boolean status;
	
	public ContactList(int contactId, String name, String mobilePhone,
			String email, String contactType, Boolean status) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.contactType = contactType;
		this.status = status;
	}
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
