package fsoft.xdev.mock.models;

public class ProgrammeList {
	private int programmeId;
	private String contact;
	private String name;
	private String description;
	private Boolean status;
	
	public ProgrammeList(int programmeId, String contact, String name,
			String description, Boolean status) {
		super();
		this.programmeId = programmeId;
		this.contact = contact;
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public ProgrammeList(int programmeId) {
		super();
		this.programmeId = programmeId;
	}

	public int getProgrammeId() {
		return programmeId;
	}

	public void setProgrammeId(int programmeId) {
		this.programmeId = programmeId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	
}
