/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VaccinationTrackerRole;
import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class VaccinationTrackerOrganization extends Organization {
   public VaccinationTrackerOrganization() {
        super(Organization.Type.VaccinationTrackerOrganization.getValue());
       
    }  

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VaccinationTrackerRole());
        return roles;
    }

   
}
