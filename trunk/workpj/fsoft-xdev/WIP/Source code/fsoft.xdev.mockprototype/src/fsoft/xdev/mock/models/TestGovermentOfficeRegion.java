package fsoft.xdev.mock.models;

public class TestGovermentOfficeRegion {
	private String name;
	private String description;
	private String country;
	private boolean isActived;

	public String getName() {
		return name;
	}

	public TestGovermentOfficeRegion(String name, String description,
			String country, boolean isActived) {
		super();
		this.name = name;
		this.description = description;
		this.country = country;
		this.isActived = isActived;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isActived() {
		return isActived;
	}

	public void setActived(boolean isActived) {
		this.isActived = isActived;
	}
}
