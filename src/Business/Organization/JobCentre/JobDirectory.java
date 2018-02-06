package Business.Organization.JobCentre;

import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class JobDirectory {

    private ArrayList<Job> jobList;

    public JobDirectory() {
        jobList = new ArrayList<>();
    }

    public Job addJob(String name) {
        Job j = new Job();
        jobList.add(j);
        j.setJobTitle(name);
        return j;
    }

    public void removeJob(Job j) {
        jobList.remove(j);
    }

}
