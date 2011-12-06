package fsoft.xdev.mock.models;

// Generated Dec 6, 2011 8:45:37 AM by Hibernate Tools 3.2.1.GA

/**
 * ServicePremise generated by hbm2java
 */
public class ServicePremise implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Services services;
	private Premises premises;
	private String projectCode;

	public ServicePremise() {
	}

	public ServicePremise(int id) {
		this.id = id;
	}

	public ServicePremise(int id, Services services, Premises premises,
			String projectCode) {
		this.id = id;
		this.services = services;
		this.premises = premises;
		this.projectCode = projectCode;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Services getServices() {
		return this.services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public Premises getPremises() {
		return this.premises;
	}

	public void setPremises(Premises premises) {
		this.premises = premises;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

}
