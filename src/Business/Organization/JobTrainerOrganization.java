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

public class JobTrainerOrganization extends Organization {

    public JobTrainerOrganization() {
        super(Organization.Type.JobTrainer.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new JobTrainerRole());
        return roles;
    }

}
