package fsoft.xdev.mock.models;

public class TestMinorWorks {
	
	private String description;
	private String enqReceivedDate;
	private String notesAction;
	private String directorate;
	private String contact;
	private String status;
	private boolean isActive;
	
	public TestMinorWorks(String description, String enqReceivedDate,
			String notesAction, String directorate, String contact,
			String status, boolean isActive) {
		super();
		this.description = description;
		this.enqReceivedDate = enqReceivedDate;
		this.notesAction = notesAction;
		this.directorate = directorate;
		this.contact = contact;
		this.status = status;
		this.isActive = isActive;
	}
	
	public TestMinorWorks() {
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnqReceivedDate() {
		return enqReceivedDate;
	}

	public void setEnqReceivedDate(String enqReceivedDate) {
		this.enqReceivedDate = enqReceivedDate;
	}

	public String getNotesAction() {
		return notesAction;
	}

	public void setNotesAction(String notesAction) {
		this.notesAction = notesAction;
	}

	public String getDirectorate() {
		return directorate;
	}

	public void setDirectorate(String directorate) {
		this.directorate = directorate;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
