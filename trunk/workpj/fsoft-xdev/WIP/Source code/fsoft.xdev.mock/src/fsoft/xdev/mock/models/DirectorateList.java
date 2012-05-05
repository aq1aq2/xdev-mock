package fsoft.xdev.mock.models;

public class DirectorateList {

	private int directorateId;
	private String name;
	private String addr1;
	private String postCode;
	private String contactName;
	private Boolean status;
	
	public DirectorateList(int directorateId) {
		this.directorateId = directorateId;
	}
	
	public DirectorateList(int directorateId, String name, String addr1, 
							String postCode, String contactName, Boolean status){
		this.directorateId = directorateId;
		this.name = name;
		this.addr1 = addr1;
		this.postCode = postCode;
		this.contactName = contactName;
		this.status = status;
	}
	
	public int getDirectorateId() {
		return directorateId;
	}
	public void setDirectorateId(int directorateId) {
		this.directorateId = directorateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
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
