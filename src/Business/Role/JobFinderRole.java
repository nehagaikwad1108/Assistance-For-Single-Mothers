package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import UserInterface.Job.JobFinderJPanel;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class JobFinderRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new JobFinderJPanel(userProcessContainer, account, (JobFinderOrganization) organization, enterprise, business);
    }
}
