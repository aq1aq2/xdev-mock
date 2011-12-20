package fsoft.xdev.mock.models;

import java.util.Date;

public class SupportingMaterialList {
	
	private int supportingMaterialId;
	private String url;
	private String description;
	private String type;
	private String addedBy;
	private Date addedDate;
	
	public SupportingMaterialList(int supportingMaterialId) {
		this.supportingMaterialId = supportingMaterialId;
	}
	
	public SupportingMaterialList(int supportingMaterialId, String url, 
			String description, String type, String addedBy, Date addedDate) {
		this.supportingMaterialId = supportingMaterialId;
		this.url = url;
		this.description = description;
		this.type = type;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
	}
	
	public int getSupportingMaterialId() {
		return supportingMaterialId;
	}
	public void setSupportingMaterialId(int supportingMaterialId) {
		this.supportingMaterialId = supportingMaterialId;
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
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
}
