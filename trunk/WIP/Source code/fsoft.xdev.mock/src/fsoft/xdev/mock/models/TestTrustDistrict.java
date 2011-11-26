package fsoft.xdev.mock.models;

public class TestTrustDistrict {
	private String trustDistrictName;
	private String description;
	private String region;
	private boolean isAcitived;

	public String getTrustDistrictName() {
		return trustDistrictName;
	}

	public void setTrustDistrictName(String trustDistrictName) {
		this.trustDistrictName = trustDistrictName;
	}

	public String getDescription() {
		return description;
	}

	public TestTrustDistrict(String trustDistrictName, String description,
			String region, boolean isAcitived) {
		super();
		this.trustDistrictName = trustDistrictName;
		this.description = description;
		this.region = region;
		this.isAcitived = isAcitived;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public boolean isAcitived() {
		return isAcitived;
	}

	public void setAcitived(boolean isAcitived) {
		this.isAcitived = isAcitived;
	}
}
