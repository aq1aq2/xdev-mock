package fsoft.xdev.mock.models;

import java.util.Date;

public class VolunteerList {
	private int volunteerId;
	private String contactName;
	private String volunteerPurpose;
	private Date startDate;
	private Date endDate;
	private Boolean status;
	public VolunteerList(int volunteerId, String contactName,
			String volunteerPurpose, Date startDate, Date endDate,
			Boolean status) {
		super();
		this.volunteerId = volunteerId;
		this.contactName = contactName;
		this.volunteerPurpose = volunteerPurpose;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	public VolunteerList(int volunteerId) {
		super();
		this.volunteerId = volunteerId;
	}
	public int getVolunteerId() {
		return volunteerId;
	}
	public void setVolunteerId(int volunteerId) {
		this.volunteerId = volunteerId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getVolunteerPurpose() {
		return volunteerPurpose;
	}
	public void setVolunteerPurpose(String volunteerPurpose) {
		this.volunteerPurpose = volunteerPurpose;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
