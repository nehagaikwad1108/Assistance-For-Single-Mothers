package Business.BabySitting;

import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class BabySittersDirectory {

    private ArrayList<Babysitter> BabyitterList;

    public BabySittersDirectory() {
        BabyitterList = new ArrayList<>();
    }

    public Babysitter addBabySitter(String name) {
        Babysitter b = new Babysitter();
        BabyitterList.add(b);
        b.setName(name);
        return b;
    }

    public void removeBabySitter(Babysitter b) {
        BabyitterList.remove(b);
    }

    public Babysitter searchBSbyEmpName(String name) {
        for (Babysitter b : BabyitterList) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public Babysitter searchBSbyCustomerName(String name) {
        for (Babysitter b : BabyitterList) {
            if (b.getAllotedCustomer().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public Babysitter searchBSbyAvailibility() {
        for (Babysitter b : BabyitterList) {
            if (b.isAvailability()) {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Babysitter> getBabyitterList() {
        return BabyitterList;
    }

    public void setBabyitterList(ArrayList<Babysitter> BabyitterList) {
        this.BabyitterList = BabyitterList;
    }

}
