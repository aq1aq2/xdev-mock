package fsoft.xdev.mock.models;

// Generated Dec 16, 2011 11:06:42 AM by Hibernate Tools 3.4.0.CR1

/**
 * Facility generated by hbm2java
 */
public class Facility implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int facilityId;
	private ReferenceData referenceDataByFacilityType;
	private Contact contactByContactId;
	private Contact contactByRoomHost;
	private ReferenceData referenceDataByConnectivityType;
	private String facilityDescription;
	private Integer roomCapacity;
	private Integer roomSize;
	private Boolean roomConnectivity;
	private Boolean equipmentAvailable;
	private String roomEquipmentNotes;
	private String wirelessAccessInfomation;
	private Boolean status;
	private Integer premiseId;
	private String facilityTypeName;

	public Facility() {
	}

	public Facility(int facilityId, Contact contactByContactId) {
		this.facilityId = facilityId;
		this.contactByContactId = contactByContactId;
	}

	public Facility(int facilityId, ReferenceData referenceDataByFacilityType,
			Contact contactByContactId, Contact contactByRoomHost,
			ReferenceData referenceDataByConnectivityType,
			String facilityDescription, Integer roomCapacity, Integer roomSize,
			Boolean roomConnectivity, Boolean equipmentAvailable,
			String roomEquipmentNotes, String wirelessAccessInfomation,
			Boolean status, Integer premiseId, String facilityTypeName) {
		this.facilityId = facilityId;
		this.referenceDataByFacilityType = referenceDataByFacilityType;
		this.contactByContactId = contactByContactId;
		this.contactByRoomHost = contactByRoomHost;
		this.referenceDataByConnectivityType = referenceDataByConnectivityType;
		this.facilityDescription = facilityDescription;
		this.roomCapacity = roomCapacity;
		this.roomSize = roomSize;
		this.roomConnectivity = roomConnectivity;
		this.equipmentAvailable = equipmentAvailable;
		this.roomEquipmentNotes = roomEquipmentNotes;
		this.wirelessAccessInfomation = wirelessAccessInfomation;
		this.status = status;
		this.premiseId = premiseId;
		this.facilityTypeName = facilityTypeName;
	}

	public int getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public ReferenceData getReferenceDataByFacilityType() {
		return this.referenceDataByFacilityType;
	}

	public void setReferenceDataByFacilityType(
			ReferenceData referenceDataByFacilityType) {
		this.referenceDataByFacilityType = referenceDataByFacilityType;
	}

	public Contact getContactByContactId() {
		return this.contactByContactId;
	}

	public void setContactByContactId(Contact contactByContactId) {
		this.contactByContactId = contactByContactId;
	}

	public Contact getContactByRoomHost() {
		return this.contactByRoomHost;
	}

	public void setContactByRoomHost(Contact contactByRoomHost) {
		this.contactByRoomHost = contactByRoomHost;
	}

	public ReferenceData getReferenceDataByConnectivityType() {
		return this.referenceDataByConnectivityType;
	}

	public void setReferenceDataByConnectivityType(
			ReferenceData referenceDataByConnectivityType) {
		this.referenceDataByConnectivityType = referenceDataByConnectivityType;
	}

	public String getFacilityDescription() {
		return this.facilityDescription;
	}

	public void setFacilityDescription(String facilityDescription) {
		this.facilityDescription = facilityDescription;
	}

	public Integer getRoomCapacity() {
		return this.roomCapacity;
	}

	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public Integer getRoomSize() {
		return this.roomSize;
	}

	public void setRoomSize(Integer roomSize) {
		this.roomSize = roomSize;
	}

	public Boolean getRoomConnectivity() {
		return this.roomConnectivity;
	}

	public void setRoomConnectivity(Boolean roomConnectivity) {
		this.roomConnectivity = roomConnectivity;
	}

	public Boolean getEquipmentAvailable() {
		return this.equipmentAvailable;
	}

	public void setEquipmentAvailable(Boolean equipmentAvailable) {
		this.equipmentAvailable = equipmentAvailable;
	}

	public String getRoomEquipmentNotes() {
		return this.roomEquipmentNotes;
	}

	public void setRoomEquipmentNotes(String roomEquipmentNotes) {
		this.roomEquipmentNotes = roomEquipmentNotes;
	}

	public String getWirelessAccessInfomation() {
		return this.wirelessAccessInfomation;
	}

	public void setWirelessAccessInfomation(String wirelessAccessInfomation) {
		this.wirelessAccessInfomation = wirelessAccessInfomation;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPremiseId() {
		return this.premiseId;
	}

	public void setPremiseId(Integer premiseId) {
		this.premiseId = premiseId;
	}

	public String getFacilityTypeName() {
		return this.facilityTypeName;
	}

	public void setFacilityTypeName(String facilityTypeName) {
		this.facilityTypeName = facilityTypeName;
	}

}
