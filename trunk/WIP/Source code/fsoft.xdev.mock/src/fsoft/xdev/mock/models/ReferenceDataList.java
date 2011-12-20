package fsoft.xdev.mock.models;

public class ReferenceDataList {
	private int referenceDataId;
	private String type;
	
	public ReferenceDataList(int referenceDataId, String type) {
		super();
		this.referenceDataId = referenceDataId;
		this.type = type;
	}
	public int getReferenceDataId() {
		return referenceDataId;
	}
	public void setReferenceDataId(int referenceDataId) {
		this.referenceDataId = referenceDataId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
