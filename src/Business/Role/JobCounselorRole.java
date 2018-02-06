package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import UserInterface.Job.JobCounselorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class JobCounselorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new JobCounselorJPanel(userProcessContainer, account, organization, (JobCounselorOrganization) organization, enterprise, business);
    }
}
