/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Housing;

import Business.Housing.*;
import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class HousingNamesDirectory {
    private ArrayList <HousingNames> housingNames;

    public ArrayList<HousingNames> getHousingNames() {
        return housingNames;
    }

    public void setHousingNames(ArrayList<HousingNames> housingNames) {
        this.housingNames = housingNames;
    }
    public HousingNamesDirectory(){
        housingNames = new ArrayList<>();
    }
     public HousingNames addHousing(String transName,String transID,String transRoute,String transTyoe,float price){
        HousingNames housingName = new HousingNames();
        housingName.setHousingName(transName);
        housingName.setPrice(price);
        housingName.setLocation(transRoute);
        housingName.setHousingID(transID);
        housingName.setHousingType(transTyoe);
        housingNames.add(housingName);
        return housingName;
    }
}
