/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Role.DieticianRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author NEHA
 */
public class DieticianOrganization extends Organization {
      public DieticianOrganization() {
        super(Type.Dietician.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DieticianRole());
        return roles;
    }
}
