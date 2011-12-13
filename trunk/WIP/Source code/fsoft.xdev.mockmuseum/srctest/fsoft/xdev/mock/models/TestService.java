package fsoft.xdev.mock.models;

public class TestService {
	private int ServiceID;
	private String ServiceName;
	private String Description;
	private String ServiceType;
	private String Contact;
	private boolean Active;
	
	
	
	public TestService() {
		super();
	}
	public TestService(boolean active) {
		super();
		Active = active;
	}
	public TestService(String contact, boolean active) {
		super();
		Contact = contact;
		Active = active;
	}
	public TestService(String serviceType, String contact, boolean active) {
		super();
		ServiceType = serviceType;
		Contact = contact;
		Active = active;
	}
	public TestService(String description, String serviceType, String contact,
			boolean active) {
		super();
		Description = description;
		ServiceType = serviceType;
		Contact = contact;
		Active = active;
	}
	public TestService(String serviceName, String description, String serviceType,
			String contact, boolean active) {
		super();
		ServiceName = serviceName;
		Description = description;
		ServiceType = serviceType;
		Contact = contact;
		Active = active;
	}
	public TestService(int serviceID, String serviceName, String description,
			String serviceType, String contact, boolean active) {
		super();
		ServiceID = serviceID;
		ServiceName = serviceName;
		Description = description;
		ServiceType = serviceType;
		Contact = contact;
		Active = active;
	}
	public int getServiceID() {
		return ServiceID;
	}
	public void setServiceID(int serviceID) {
		ServiceID = serviceID;
	}
	public String getServiceName() {
		return ServiceName;
	}
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getServiceType() {
		return ServiceType;
	}
	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	
	
}
