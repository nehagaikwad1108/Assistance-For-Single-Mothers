/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author RIDDHI
 */
import Business.Role.*;
import java.util.ArrayList;

public class JobFinderOrganization extends Organization {

    public JobFinderOrganization() {
        super(Organization.Type.JobFinder.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new JobFinderRole());
        return roles;
    }
}
