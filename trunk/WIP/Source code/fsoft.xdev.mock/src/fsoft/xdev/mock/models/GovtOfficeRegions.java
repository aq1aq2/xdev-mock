package fsoft.xdev.mock.models;
// Generated Nov 29, 2011 3:23:26 PM by Hibernate Tools 3.2.1.GA



/**
 * GovtOfficeRegions generated by hbm2java
 */
public class GovtOfficeRegions  implements java.io.Serializable {


     private int govtOfficeRegionId;
     private Counties counties;
     private String name;
     private String description;
     private boolean isActive;

    public GovtOfficeRegions() {
    }

	
    public GovtOfficeRegions(int govtOfficeRegionId, Counties counties, String name, boolean isActive) {
        this.govtOfficeRegionId = govtOfficeRegionId;
        this.counties = counties;
        this.name = name;
        this.isActive = isActive;
    }
    public GovtOfficeRegions(int govtOfficeRegionId, Counties counties, String name, String description, boolean isActive) {
       this.govtOfficeRegionId = govtOfficeRegionId;
       this.counties = counties;
       this.name = name;
       this.description = description;
       this.isActive = isActive;
    }
   
    public int getGovtOfficeRegionId() {
        return this.govtOfficeRegionId;
    }
    
    public void setGovtOfficeRegionId(int govtOfficeRegionId) {
        this.govtOfficeRegionId = govtOfficeRegionId;
    }
    public Counties getCounties() {
        return this.counties;
    }
    
    public void setCounties(Counties counties) {
        this.counties = counties;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }




}


