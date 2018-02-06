package Business;

import Business.Mother.MotherDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author NEHA
 */
public class Ecosystem extends Organization {

    private static Ecosystem business;
    private MotherDirectory motherDirectory;
    private ArrayList<Network> networkList;
//    private Organization organization;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    private Ecosystem() {
        super(null);
        networkList = new ArrayList<>();
         motherDirectory = new MotherDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
      public MotherDirectory getMotherDirectory() {
        return motherDirectory;
    }

    public void setMotherDirectory(MotherDirectory motherDirectory) {
        this.motherDirectory = motherDirectory;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    } 

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        return true;
    }

}
