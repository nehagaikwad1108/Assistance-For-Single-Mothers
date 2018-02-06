package Business.Organization;

import Business.Role.BabySittinAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class BabySittingOrganization extends Organization {

    public BabySittingOrganization() {
        super(Organization.Type.BabySittingOrganization.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BabySittinAdminRole());
        return roles;
    }
}
