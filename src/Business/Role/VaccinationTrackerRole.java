/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VaccinationTrackerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.VaccinationTrackerRole.VaccinationTrackerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nupur
 */
public class VaccinationTrackerRole extends Role{

   
   @Override
   public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
      return new VaccinationTrackerWorkAreaJPanel(userProcessContainer, account, (VaccinationTrackerOrganization)organization, enterprise,business);
    }
    
}
