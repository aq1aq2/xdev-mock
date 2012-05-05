package fsoft.xdev.mock.models;

public class CountryList {
	private int countryId;
	private String countryName;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public CountryList(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public CountryList(int countryId) {
		super();
		this.countryId = countryId;
	}

}
