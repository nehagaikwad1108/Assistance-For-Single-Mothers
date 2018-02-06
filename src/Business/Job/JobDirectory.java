/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Job;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class JobDirectory {
 
            private ArrayList<Job> jobList;
 public JobDirectory(){
     jobList = new ArrayList<>();
 }

    public ArrayList<Job> getJobList() {
        return jobList;
    }

   
  public Job addJob(String jobName,String jobCategory,float jobSalary,String courseRequired){
      Job job = new Job();
      job.setJobName(jobName);
      job.setJobCategory(jobCategory);
      job.setJobSalary(jobSalary);
      job.setCourseRequired(courseRequired);
     
     jobList.add(job);
      return job;
  } 
}
