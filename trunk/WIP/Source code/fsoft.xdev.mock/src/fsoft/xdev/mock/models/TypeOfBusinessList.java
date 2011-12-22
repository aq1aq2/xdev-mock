package fsoft.xdev.mock.models;

public class TypeOfBusinessList implements java.io.Serializable {

	private int typeOfBusinessId;
	private String name;
	private String sicCode;

	public TypeOfBusinessList() {
	}

	public TypeOfBusinessList(int typeOfBusinessId) {
		this.typeOfBusinessId = typeOfBusinessId;
	}

	public int getTypeOfBusinessId() {
		return typeOfBusinessId;
	}

	public void setTypeOfBusinessId(int typeOfBusinessId) {
		this.typeOfBusinessId = typeOfBusinessId;
	}

	public TypeOfBusinessList(int typeOfBusinessId, String name, String sicCode) {
		super();
		this.typeOfBusinessId = typeOfBusinessId;
		this.name = name;
		this.sicCode = sicCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

}
