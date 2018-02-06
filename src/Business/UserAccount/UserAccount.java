/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
 
import Business.JobWorkQueue.JobWorkQueue;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.DoctorWorkQueue.WorkQueue;
import Business.VaccinationTrackerWorkQueue.VaccinationTrackerWorkQueue;

/**
 *
 * @author NEHA
 */
public class UserAccount {
     private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private JobWorkQueue jobWorkQueue;

    public JobWorkQueue getJobWorkQueue() {
        return jobWorkQueue;
    }

    public void setJobWorkQueue(JobWorkQueue jobWorkQueue) {
        this.jobWorkQueue = jobWorkQueue;
    }
    
    private VaccinationTrackerWorkQueue vaccinationTrackerWorkQueue;

   
     public UserAccount() {
        workQueue = new WorkQueue();
        vaccinationTrackerWorkQueue = new VaccinationTrackerWorkQueue();
        jobWorkQueue= new JobWorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
     public VaccinationTrackerWorkQueue getVaccinationTrackerWorkQueue() {
        return vaccinationTrackerWorkQueue;
    }

   
    
    
    @Override
    public String toString() {
        return username;
    }
    
}
