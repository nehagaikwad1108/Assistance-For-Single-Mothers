package Business.Mother;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class MotherDirectory {

    private ArrayList<Mother> motherList;

    public MotherDirectory() {
        motherList = new ArrayList<>();
    }

    public ArrayList<Mother> getMotherList() {
        return motherList;
    }

    public Mother addMother(String name, int age, String email, String contactNo) {
        Mother mother = new Mother();
        mother.setName(name);
        mother.setAge(age);
        mother.setEmailID(email);
        mother.setContactNo(contactNo);
        motherList.add(mother);
        return mother;
    }

    public Mother searchMotherByName(String name) {
        for (Mother m : motherList) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    public Mother searchMotherByID(int ID) {
        for (Mother m : motherList) {
            if (m.getMotherID() == (ID)) {
                return m;
            }
        }
        return null;
    }
    
    public int getMotherIndex(String name) {
        int index = 0;
        for (Mother m : motherList) {
            if (m.getName().equalsIgnoreCase(name)) {
                 index = motherList.indexOf(m);
            }
        }
        return index;
    }
    

}
