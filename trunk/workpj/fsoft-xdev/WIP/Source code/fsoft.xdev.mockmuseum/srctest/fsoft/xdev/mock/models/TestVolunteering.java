package fsoft.xdev.mock.models;

import java.sql.Date;

public class TestVolunteering {
	private String contact;
	private String purpose;
	private int number;
	//private String startDate;
	//private String contact;
	private String startDate;
	private String endDate;
	private boolean isActive;
	
	public TestVolunteering(String contact, String purpose, int number,
			String startDate, String endDate, boolean isActive) {
		super();
		this.contact = contact;
		this.purpose = purpose;
		this.number = number;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isActive = isActive;
	}
	
	public TestVolunteering() {
		
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
