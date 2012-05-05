package fsoft.xdev.mock.models;

public class TestSupportingMaterial {

	private String url;
	private String description;
	private String type;
	private String addedBy;
	private String addedDate;
	
	public TestSupportingMaterial(String url, String description, String type,
			String addedBy, String addedDate) {
		super();
		this.url = url;
		this.description = description;
		this.type = type;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public String getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
}
