package Business.Organization.JobCentre;

import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class CandidateDirectory {

    private ArrayList<Candidate> candidateList;

    public CandidateDirectory() {
        candidateList = new ArrayList<>();
    }

    public Candidate addCandidate() {
        Candidate c = new Candidate();
        candidateList.add(c);
        return c;
    }
    
    public void addCandidate(Candidate c) {
        //Candidate c = new Candidate();
        candidateList.add(c);
    }

    public Candidate searchByName(String name) {
        for (Candidate b : candidateList) {
            if (b.getMother().getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public Candidate searchBSbyClientID(int id) {
        for (Candidate b : candidateList) {
            if (b.getMother().getMotherID() == id) {
                return b;
            }

        }
        return null;
    }

    public void removeCandidate(Candidate c) {
        candidateList.remove(c);
    }

}
