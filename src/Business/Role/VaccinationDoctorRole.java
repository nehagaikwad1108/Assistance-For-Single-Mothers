/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VaccinationDoctorOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.VaccinationDoctorRole.VaccinationDoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nupur
 */
public class VaccinationDoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
  return new  VaccinationDoctorWorkAreaJPanel(userProcessContainer, account, (VaccinationDoctorOrganization) organization,enterprise, business);
    }
    
}
