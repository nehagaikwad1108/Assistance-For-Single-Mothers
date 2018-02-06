/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VaccinationDoctorRole;
import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class VaccinationDoctorOrganization extends Organization{

   
        public VaccinationDoctorOrganization (){
        super(Organization.Type.VaccinationDoctorOrganization.getValue());
       
    }  

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VaccinationDoctorRole());
        return roles;
    }

    }
    

