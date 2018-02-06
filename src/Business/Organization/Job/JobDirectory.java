package Business.Organization.Job;

import java.util.ArrayList;

/**
 *
 * @author RIDDHI
 */
public class JobDirectory {

    private ArrayList<JobOpenings> jobList;

    public JobDirectory() {
        jobList = new ArrayList<>();
    }

    public JobOpenings addJob(String name) {
        JobOpenings j = new JobOpenings();
        jobList.add(j);
        j.setJobTitle(name);
        return j;
    }

    public void removeJob(JobOpenings j) {
        jobList.remove(j);
    }

}
