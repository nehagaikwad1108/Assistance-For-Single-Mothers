/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TrackerRole;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class TrackerOrganization  extends Organization {

    public TrackerOrganization() {
        super(Organization.Type.Tracker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TrackerRole());
        return roles;
    }
    
}
