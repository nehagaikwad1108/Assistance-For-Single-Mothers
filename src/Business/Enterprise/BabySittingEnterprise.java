package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class BabySittingEnterprise extends Enterprise {

    public BabySittingEnterprise(String name) {
        super(name, EnterpriseType.BabySitting);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
