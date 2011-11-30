package fsoft.xdev.mock.models;
// Generated Nov 30, 2011 9:23:56 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Premises generated by hbm2java
 */
public class Premises  implements java.io.Serializable {


     private int premiseId;
     private String name;
     private String locationName;
     private String knownAs;
     private boolean primaryLocation;
     private boolean locationManaged;
     private int orgnisationId;
     private String locationStatus;
     private boolean stnetworkConectivity;
     private Date locationStatusDate;
     private String locationType;
     private String locationDescription;
     private String addressLine1;
     private String addressLine2;
     private String phoneNumber;
     private String postcode;
     private String faxNumber;
     private String cityTown;
     private String county;
     private Boolean isNewShop;
     private String nation;
     private Date shopFlagDate;
     private boolean specialistShop;
     private String accreditations;
     private String jcpoffices;
     private Integer cateringType;
     private String localDemographicIssue;
     private Integer isnetwork;
     private boolean roomAvailability;
     private boolean volunteeringOpportunities;
     private String outreachLocation;
     private String localHotel;
     private String travelDetails;
     private Boolean visitorParkingOnsite;
     private String travelNearestBus;
     private Boolean hostVisits;
     private Integer contactId;
     private Double roomOnlyRate;
     private Double negotiatedRoomOnlyRate;
     private Double bbrate;
     private Double bbnegotiatedRate;
     private Boolean lunch;
     private Date lastNegotiatedDate;
     private Date reNegotiatedOn;
     private Integer noOfMeetingRoom;
     private Double meetingRoomRatePerDay;
     private boolean isActive;

    public Premises() {
    }

	
    public Premises(int premiseId, String name, String locationName, boolean primaryLocation, boolean locationManaged, int orgnisationId, String locationStatus, boolean stnetworkConectivity, String locationType, String phoneNumber, boolean specialistShop, String accreditations, boolean roomAvailability, boolean volunteeringOpportunities, boolean isActive) {
        this.premiseId = premiseId;
        this.name = name;
        this.locationName = locationName;
        this.primaryLocation = primaryLocation;
        this.locationManaged = locationManaged;
        this.orgnisationId = orgnisationId;
        this.locationStatus = locationStatus;
        this.stnetworkConectivity = stnetworkConectivity;
        this.locationType = locationType;
        this.phoneNumber = phoneNumber;
        this.specialistShop = specialistShop;
        this.accreditations = accreditations;
        this.roomAvailability = roomAvailability;
        this.volunteeringOpportunities = volunteeringOpportunities;
        this.isActive = isActive;
    }
    public Premises(int premiseId, String name, String locationName, String knownAs, boolean primaryLocation, boolean locationManaged, int orgnisationId, String locationStatus, boolean stnetworkConectivity, Date locationStatusDate, String locationType, String locationDescription, String addressLine1, String addressLine2, String phoneNumber, String postcode, String faxNumber, String cityTown, String county, Boolean isNewShop, String nation, Date shopFlagDate, boolean specialistShop, String accreditations, String jcpoffices, Integer cateringType, String localDemographicIssue, Integer isnetwork, boolean roomAvailability, boolean volunteeringOpportunities, String outreachLocation, String localHotel, String travelDetails, Boolean visitorParkingOnsite, String travelNearestBus, Boolean hostVisits, Integer contactId, Double roomOnlyRate, Double negotiatedRoomOnlyRate, Double bbrate, Double bbnegotiatedRate, Boolean lunch, Date lastNegotiatedDate, Date reNegotiatedOn, Integer noOfMeetingRoom, Double meetingRoomRatePerDay, boolean isActive) {
       this.premiseId = premiseId;
       this.name = name;
       this.locationName = locationName;
       this.knownAs = knownAs;
       this.primaryLocation = primaryLocation;
       this.locationManaged = locationManaged;
       this.orgnisationId = orgnisationId;
       this.locationStatus = locationStatus;
       this.stnetworkConectivity = stnetworkConectivity;
       this.locationStatusDate = locationStatusDate;
       this.locationType = locationType;
       this.locationDescription = locationDescription;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.phoneNumber = phoneNumber;
       this.postcode = postcode;
       this.faxNumber = faxNumber;
       this.cityTown = cityTown;
       this.county = county;
       this.isNewShop = isNewShop;
       this.nation = nation;
       this.shopFlagDate = shopFlagDate;
       this.specialistShop = specialistShop;
       this.accreditations = accreditations;
       this.jcpoffices = jcpoffices;
       this.cateringType = cateringType;
       this.localDemographicIssue = localDemographicIssue;
       this.isnetwork = isnetwork;
       this.roomAvailability = roomAvailability;
       this.volunteeringOpportunities = volunteeringOpportunities;
       this.outreachLocation = outreachLocation;
       this.localHotel = localHotel;
       this.travelDetails = travelDetails;
       this.visitorParkingOnsite = visitorParkingOnsite;
       this.travelNearestBus = travelNearestBus;
       this.hostVisits = hostVisits;
       this.contactId = contactId;
       this.roomOnlyRate = roomOnlyRate;
       this.negotiatedRoomOnlyRate = negotiatedRoomOnlyRate;
       this.bbrate = bbrate;
       this.bbnegotiatedRate = bbnegotiatedRate;
       this.lunch = lunch;
       this.lastNegotiatedDate = lastNegotiatedDate;
       this.reNegotiatedOn = reNegotiatedOn;
       this.noOfMeetingRoom = noOfMeetingRoom;
       this.meetingRoomRatePerDay = meetingRoomRatePerDay;
       this.isActive = isActive;
    }
   
    public int getPremiseId() {
        return this.premiseId;
    }
    
    public void setPremiseId(int premiseId) {
        this.premiseId = premiseId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLocationName() {
        return this.locationName;
    }
    
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
    public String getKnownAs() {
        return this.knownAs;
    }
    
    public void setKnownAs(String knownAs) {
        this.knownAs = knownAs;
    }
    public boolean isPrimaryLocation() {
        return this.primaryLocation;
    }
    
    public void setPrimaryLocation(boolean primaryLocation) {
        this.primaryLocation = primaryLocation;
    }
    public boolean isLocationManaged() {
        return this.locationManaged;
    }
    
    public void setLocationManaged(boolean locationManaged) {
        this.locationManaged = locationManaged;
    }
    public int getOrgnisationId() {
        return this.orgnisationId;
    }
    
    public void setOrgnisationId(int orgnisationId) {
        this.orgnisationId = orgnisationId;
    }
    public String getLocationStatus() {
        return this.locationStatus;
    }
    
    public void setLocationStatus(String locationStatus) {
        this.locationStatus = locationStatus;
    }
    public boolean isStnetworkConectivity() {
        return this.stnetworkConectivity;
    }
    
    public void setStnetworkConectivity(boolean stnetworkConectivity) {
        this.stnetworkConectivity = stnetworkConectivity;
    }
    public Date getLocationStatusDate() {
        return this.locationStatusDate;
    }
    
    public void setLocationStatusDate(Date locationStatusDate) {
        this.locationStatusDate = locationStatusDate;
    }
    public String getLocationType() {
        return this.locationType;
    }
    
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
    public String getLocationDescription() {
        return this.locationDescription;
    }
    
    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getFaxNumber() {
        return this.faxNumber;
    }
    
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }
    public String getCityTown() {
        return this.cityTown;
    }
    
    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }
    public String getCounty() {
        return this.county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }
    public Boolean getIsNewShop() {
        return this.isNewShop;
    }
    
    public void setIsNewShop(Boolean isNewShop) {
        this.isNewShop = isNewShop;
    }
    public String getNation() {
        return this.nation;
    }
    
    public void setNation(String nation) {
        this.nation = nation;
    }
    public Date getShopFlagDate() {
        return this.shopFlagDate;
    }
    
    public void setShopFlagDate(Date shopFlagDate) {
        this.shopFlagDate = shopFlagDate;
    }
    public boolean isSpecialistShop() {
        return this.specialistShop;
    }
    
    public void setSpecialistShop(boolean specialistShop) {
        this.specialistShop = specialistShop;
    }
    public String getAccreditations() {
        return this.accreditations;
    }
    
    public void setAccreditations(String accreditations) {
        this.accreditations = accreditations;
    }
    public String getJcpoffices() {
        return this.jcpoffices;
    }
    
    public void setJcpoffices(String jcpoffices) {
        this.jcpoffices = jcpoffices;
    }
    public Integer getCateringType() {
        return this.cateringType;
    }
    
    public void setCateringType(Integer cateringType) {
        this.cateringType = cateringType;
    }
    public String getLocalDemographicIssue() {
        return this.localDemographicIssue;
    }
    
    public void setLocalDemographicIssue(String localDemographicIssue) {
        this.localDemographicIssue = localDemographicIssue;
    }
    public Integer getIsnetwork() {
        return this.isnetwork;
    }
    
    public void setIsnetwork(Integer isnetwork) {
        this.isnetwork = isnetwork;
    }
    public boolean isRoomAvailability() {
        return this.roomAvailability;
    }
    
    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }
    public boolean isVolunteeringOpportunities() {
        return this.volunteeringOpportunities;
    }
    
    public void setVolunteeringOpportunities(boolean volunteeringOpportunities) {
        this.volunteeringOpportunities = volunteeringOpportunities;
    }
    public String getOutreachLocation() {
        return this.outreachLocation;
    }
    
    public void setOutreachLocation(String outreachLocation) {
        this.outreachLocation = outreachLocation;
    }
    public String getLocalHotel() {
        return this.localHotel;
    }
    
    public void setLocalHotel(String localHotel) {
        this.localHotel = localHotel;
    }
    public String getTravelDetails() {
        return this.travelDetails;
    }
    
    public void setTravelDetails(String travelDetails) {
        this.travelDetails = travelDetails;
    }
    public Boolean getVisitorParkingOnsite() {
        return this.visitorParkingOnsite;
    }
    
    public void setVisitorParkingOnsite(Boolean visitorParkingOnsite) {
        this.visitorParkingOnsite = visitorParkingOnsite;
    }
    public String getTravelNearestBus() {
        return this.travelNearestBus;
    }
    
    public void setTravelNearestBus(String travelNearestBus) {
        this.travelNearestBus = travelNearestBus;
    }
    public Boolean getHostVisits() {
        return this.hostVisits;
    }
    
    public void setHostVisits(Boolean hostVisits) {
        this.hostVisits = hostVisits;
    }
    public Integer getContactId() {
        return this.contactId;
    }
    
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }
    public Double getRoomOnlyRate() {
        return this.roomOnlyRate;
    }
    
    public void setRoomOnlyRate(Double roomOnlyRate) {
        this.roomOnlyRate = roomOnlyRate;
    }
    public Double getNegotiatedRoomOnlyRate() {
        return this.negotiatedRoomOnlyRate;
    }
    
    public void setNegotiatedRoomOnlyRate(Double negotiatedRoomOnlyRate) {
        this.negotiatedRoomOnlyRate = negotiatedRoomOnlyRate;
    }
    public Double getBbrate() {
        return this.bbrate;
    }
    
    public void setBbrate(Double bbrate) {
        this.bbrate = bbrate;
    }
    public Double getBbnegotiatedRate() {
        return this.bbnegotiatedRate;
    }
    
    public void setBbnegotiatedRate(Double bbnegotiatedRate) {
        this.bbnegotiatedRate = bbnegotiatedRate;
    }
    public Boolean getLunch() {
        return this.lunch;
    }
    
    public void setLunch(Boolean lunch) {
        this.lunch = lunch;
    }
    public Date getLastNegotiatedDate() {
        return this.lastNegotiatedDate;
    }
    
    public void setLastNegotiatedDate(Date lastNegotiatedDate) {
        this.lastNegotiatedDate = lastNegotiatedDate;
    }
    public Date getReNegotiatedOn() {
        return this.reNegotiatedOn;
    }
    
    public void setReNegotiatedOn(Date reNegotiatedOn) {
        this.reNegotiatedOn = reNegotiatedOn;
    }
    public Integer getNoOfMeetingRoom() {
        return this.noOfMeetingRoom;
    }
    
    public void setNoOfMeetingRoom(Integer noOfMeetingRoom) {
        this.noOfMeetingRoom = noOfMeetingRoom;
    }
    public Double getMeetingRoomRatePerDay() {
        return this.meetingRoomRatePerDay;
    }
    
    public void setMeetingRoomRatePerDay(Double meetingRoomRatePerDay) {
        this.meetingRoomRatePerDay = meetingRoomRatePerDay;
    }
    public boolean isIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }




}


