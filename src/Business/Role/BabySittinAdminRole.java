/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BabySittingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BabySitting.BabySittingAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class BabySittinAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new BabySittingAdminJPanel(userProcessContainer, account, (BabySittingOrganization) organization, organization,enterprise, business);
    }
}
