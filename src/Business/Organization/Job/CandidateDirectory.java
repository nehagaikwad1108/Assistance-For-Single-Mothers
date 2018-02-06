package Business.Organization.Job;

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

    public void removeCandidate(Candidate c) {
        candidateList.remove(c);
    }

}
