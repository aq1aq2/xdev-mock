package fsoft.xdev.mock.models;

public class ServiceList {
	private int serviceId;
	private String name;
	private String descriptionDelivery;
	private String serviceType;
	private String contact;
	private boolean status;
	


	public ServiceList(int serviceId, String name, String descriptionDelivery,
			String serviceType, String contact, boolean status) {
		super();
		this.serviceId = serviceId;
		this.name = name;
		this.descriptionDelivery = descriptionDelivery;
		this.serviceType = serviceType;
		this.contact = contact;
		this.status = status;
	}

	public ServiceList(int serviceId) {
		super();
		this.serviceId = serviceId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getDescriptionDelivery() {
		return descriptionDelivery;
	}

	public void setDescriptionDelivery(String descriptionDelivery) {
		this.descriptionDelivery = descriptionDelivery;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
