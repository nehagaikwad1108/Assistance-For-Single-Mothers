package Business.BabySitting;

import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class ClientDirectory {

    private ArrayList<BabySittingClient> ClientList;

    public ClientDirectory() {
        ClientList = new ArrayList<>();
    }

    public BabySittingClient addClient() {
        BabySittingClient b = new BabySittingClient();
        ClientList.add(b);
        return b;
    }

    public void removeClient(BabySittingClient b) {
        ClientList.remove(b);
    }

    public BabySittingClient searchBSbyClientName(String name) {
        for (BabySittingClient b : ClientList) {
            if (b.getMother().getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public ArrayList<BabySittingClient> getClientList() {
        return ClientList;
    }

    public void setClientList(ArrayList<BabySittingClient> ClientList) {
        this.ClientList = ClientList;
    }

}
