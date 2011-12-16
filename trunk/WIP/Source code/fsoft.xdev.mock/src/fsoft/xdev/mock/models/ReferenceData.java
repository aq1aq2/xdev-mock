package fsoft.xdev.mock.models;

// Generated Dec 16, 2011 11:06:42 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * ReferenceData generated by hbm2java
 */
public class ReferenceData implements java.io.Serializable {

	private int referenceDataId;
	private ReferenceType referenceType;
	private String value;
	private Set<Contact> contactsForContactType = new HashSet<Contact>(0);
	private Set<Facility> facilitiesForConnectivityType = new HashSet<Facility>(
			0);
	private Set<Contact> contactsForBestContactMethod = new HashSet<Contact>(0);
	private Set<Facility> facilitiesForFacilityType = new HashSet<Facility>(0);
	private Set<Premise> premises = new HashSet<Premise>(0);
	private Set<Service> servicesForServiceType = new HashSet<Service>(0);
	private Set<Service> servicesForServiceSubType = new HashSet<Service>(0);

	public ReferenceData() {
	}

	public ReferenceData(int referenceDataId) {
		this.referenceDataId = referenceDataId;
	}

	public ReferenceData(int referenceDataId, ReferenceType referenceType,
			String value, Set<Contact> contactsForContactType,
			Set<Facility> facilitiesForConnectivityType,
			Set<Contact> contactsForBestContactMethod,
			Set<Facility> facilitiesForFacilityType, Set<Premise> premises,
			Set<Service> servicesForServiceType,
			Set<Service> servicesForServiceSubType) {
		this.referenceDataId = referenceDataId;
		this.referenceType = referenceType;
		this.value = value;
		this.contactsForContactType = contactsForContactType;
		this.facilitiesForConnectivityType = facilitiesForConnectivityType;
		this.contactsForBestContactMethod = contactsForBestContactMethod;
		this.facilitiesForFacilityType = facilitiesForFacilityType;
		this.premises = premises;
		this.servicesForServiceType = servicesForServiceType;
		this.servicesForServiceSubType = servicesForServiceSubType;
	}

	public int getReferenceDataId() {
		return this.referenceDataId;
	}

	public void setReferenceDataId(int referenceDataId) {
		this.referenceDataId = referenceDataId;
	}

	public ReferenceType getReferenceType() {
		return this.referenceType;
	}

	public void setReferenceType(ReferenceType referenceType) {
		this.referenceType = referenceType;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Set<Contact> getContactsForContactType() {
		return this.contactsForContactType;
	}

	public void setContactsForContactType(Set<Contact> contactsForContactType) {
		this.contactsForContactType = contactsForContactType;
	}

	public Set<Facility> getFacilitiesForConnectivityType() {
		return this.facilitiesForConnectivityType;
	}

	public void setFacilitiesForConnectivityType(
			Set<Facility> facilitiesForConnectivityType) {
		this.facilitiesForConnectivityType = facilitiesForConnectivityType;
	}

	public Set<Contact> getContactsForBestContactMethod() {
		return this.contactsForBestContactMethod;
	}

	public void setContactsForBestContactMethod(
			Set<Contact> contactsForBestContactMethod) {
		this.contactsForBestContactMethod = contactsForBestContactMethod;
	}

	public Set<Facility> getFacilitiesForFacilityType() {
		return this.facilitiesForFacilityType;
	}

	public void setFacilitiesForFacilityType(
			Set<Facility> facilitiesForFacilityType) {
		this.facilitiesForFacilityType = facilitiesForFacilityType;
	}

	public Set<Premise> getPremises() {
		return this.premises;
	}

	public void setPremises(Set<Premise> premises) {
		this.premises = premises;
	}

	public Set<Service> getServicesForServiceType() {
		return this.servicesForServiceType;
	}

	public void setServicesForServiceType(Set<Service> servicesForServiceType) {
		this.servicesForServiceType = servicesForServiceType;
	}

	public Set<Service> getServicesForServiceSubType() {
		return this.servicesForServiceSubType;
	}

	public void setServicesForServiceSubType(
			Set<Service> servicesForServiceSubType) {
		this.servicesForServiceSubType = servicesForServiceSubType;
	}

}
