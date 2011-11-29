package fsoft.xdev.mock.models;

public class TestPremiseService {
	private String serviceName;
	private String description;
	private String serviceType;
	private String contact;
	
	public TestPremiseService(String serviceName, String description,
			String serviceType, String contact) {
		super();
		this.serviceName = serviceName;
		this.description = description;
		this.serviceType = serviceType;
		this.contact = contact;
	}
	
	public TestPremiseService() {
		
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
