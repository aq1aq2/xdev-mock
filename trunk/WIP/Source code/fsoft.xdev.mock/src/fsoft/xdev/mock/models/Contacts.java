package fsoft.xdev.mock.models;
// Generated Dec 6, 2011 8:45:37 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Contacts generated by hbm2java
 */
public class Contacts  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int contactId;
     private String firstName;
     private String surName;
     private String knowAs;
     private String officePhone;
     private String mobilePhone;
     private String sthomePhone;
     private String emailAddress;
     private Integer managerId;
     private String contactType;
     private String bestContactMethod;
     private String jobRole;
     private String workBase;
     private String jobTitle;
     private Boolean isActive;
     private Set<Programmes> programmeses = new HashSet<Programmes>(0);
     private Set<Directorates> directorateses = new HashSet<Directorates>(0);
     private Set<Facilities> facilitieses = new HashSet<Facilities>(0);
     private Set<Teams> teamses = new HashSet<Teams>(0);
     private Set<Volunteers> volunteerses = new HashSet<Volunteers>(0);

    public Contacts() {
    }

	
    public Contacts(int contactId) {
        this.contactId = contactId;
    }
    public Contacts(int contactId, String firstName, String surName, String knowAs, String officePhone, String mobilePhone, String sthomePhone, String emailAddress, Integer managerId, String contactType, String bestContactMethod, String jobRole, String workBase, String jobTitle, Boolean isActive, Set<Programmes>  programmeses, Set<Directorates> directorateses, Set<Facilities> facilitieses, Set<Teams> teamses, Set<Volunteers> volunteerses) {
       this.contactId = contactId;
       this.firstName = firstName;
       this.surName = surName;
       this.knowAs = knowAs;
       this.officePhone = officePhone;
       this.mobilePhone = mobilePhone;
       this.sthomePhone = sthomePhone;
       this.emailAddress = emailAddress;
       this.managerId = managerId;
       this.contactType = contactType;
       this.bestContactMethod = bestContactMethod;
       this.jobRole = jobRole;
       this.workBase = workBase;
       this.jobTitle = jobTitle;
       this.isActive = isActive;
       this.programmeses = programmeses;
       this.directorateses = directorateses;
       this.facilitieses = facilitieses;
       this.teamses = teamses;
       this.volunteerses = volunteerses;
    }
   
    public int getContactId() {
        return this.contactId;
    }
    
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSurName() {
        return this.surName;
    }
    
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getKnowAs() {
        return this.knowAs;
    }
    
    public void setKnowAs(String knowAs) {
        this.knowAs = knowAs;
    }
    public String getOfficePhone() {
        return this.officePhone;
    }
    
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getSthomePhone() {
        return this.sthomePhone;
    }
    
    public void setSthomePhone(String sthomePhone) {
        this.sthomePhone = sthomePhone;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Integer getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
    public String getContactType() {
        return this.contactType;
    }
    
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
    public String getBestContactMethod() {
        return this.bestContactMethod;
    }
    
    public void setBestContactMethod(String bestContactMethod) {
        this.bestContactMethod = bestContactMethod;
    }
    public String getJobRole() {
        return this.jobRole;
    }
    
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
    public String getWorkBase() {
        return this.workBase;
    }
    
    public void setWorkBase(String workBase) {
        this.workBase = workBase;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public Set<Programmes>  getProgrammeses() {
        return this.programmeses;
    }
    
    public void setProgrammeses(Set<Programmes>  programmeses) {
        this.programmeses = programmeses;
    }
    public Set<Directorates> getDirectorateses() {
        return this.directorateses;
    }
    
    public void setDirectorateses(Set<Directorates> directorateses) {
        this.directorateses = directorateses;
    }
    public Set<Facilities> getFacilitieses() {
        return this.facilitieses;
    }
    
    public void setFacilitieses(Set<Facilities> facilitieses) {
        this.facilitieses = facilitieses;
    }
    public Set<Teams> getTeamses() {
        return this.teamses;
    }
    
    public void setTeamses(Set<Teams> teamses) {
        this.teamses = teamses;
    }
    public Set<Volunteers> getVolunteerses() {
        return this.volunteerses;
    }
    
    public void setVolunteerses(Set<Volunteers> volunteerses) {
        this.volunteerses = volunteerses;
    }




}


