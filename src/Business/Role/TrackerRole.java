/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TrackerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Job.JobTrackerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nupur
 */
public class TrackerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
       return new JobTrackerJPanel(userProcessContainer,account,(TrackerOrganization) organization,enterprise,business);
    }
    
}
