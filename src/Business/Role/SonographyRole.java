/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SonographyOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SonographyRole.SonographyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author NEHA
 */
public class SonographyRole extends Role{
  
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
       return new SonographyWorkAreaJPanel(userProcessContainer, account, (SonographyOrganization)organization, enterprise,business);
    }
   
  
}
