/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Housing;

/**
 *
 * @author nupur
 */
public class HousingNames {
    private String housingName;
    private float price;
    private String location;
    private String housingID;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    private String housingType;

    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHousingID() {
        return housingID;
    }

    public void setHousingID(String housingID) {
        this.housingID = housingID;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }
    public String getHousingName() {
        return housingName;
    }

    public void setHousingName(String housingName) {
        this.housingName = housingName;
    }

   
    
    @Override
    public String toString(){
    return housingName;
    }
}    

