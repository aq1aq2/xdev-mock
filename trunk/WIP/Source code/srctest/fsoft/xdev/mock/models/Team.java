package fsoft.xdev.mock.models;

public class Team {
	
	private String teamName;
	private String addressLine1;
	private String postcode;
	private String contact;
	private boolean active;
	
	
	public Team() {
		super();
	}
	public Team(String teamName, String addressLine1, String postcode,
			String contact, boolean active) {
		super();
		this.teamName = teamName;
		this.addressLine1 = addressLine1;
		this.postcode = postcode;
		this.contact = contact;
		this.active = active;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	
	

}
