/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Job;

/**
 *
 * @author nupur
 */
public class Job {
    String jobName;
    String jobCategory;
    String courseRequired;
    float jobSalary;

    public float getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(float jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getCourseRequired() {
        return courseRequired;
    }

    public void setCourseRequired(String courseRequired) {
        this.courseRequired = courseRequired;
    }

   
     @Override
    public String toString() {
        return jobName;
    }
}
