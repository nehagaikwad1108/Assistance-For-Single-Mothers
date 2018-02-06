/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.*;
import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class JobCounselorOrganization extends Organization {

    public JobCounselorOrganization() {
        super(Organization.Type.JobCounselor.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new JobCounselorRole());
        return roles;
    }
}
