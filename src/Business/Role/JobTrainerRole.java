/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import UserInterface.Job.JobTrainerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class JobTrainerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new JobTrainerJPanel(userProcessContainer, account, (JobTrainerOrganization) organization, enterprise, business);
    }

}
