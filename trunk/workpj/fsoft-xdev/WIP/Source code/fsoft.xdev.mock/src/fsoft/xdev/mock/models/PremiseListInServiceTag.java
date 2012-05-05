package fsoft.xdev.mock.models;

public class PremiseListInServiceTag {
	private int serviceId;
	private String name;
	private String shortDescription;
	private String serviceType;
	private String contact;
	public PremiseListInServiceTag(int serviceId, String name,
			String shortDescription, String serviceType, String contact) {
		super();
		this.serviceId = serviceId;
		this.name = name;
		this.shortDescription = shortDescription;
		this.serviceType = serviceType;
		this.contact = contact;
	}
	public PremiseListInServiceTag(int serviceId) {
		super();
		this.serviceId = serviceId;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
