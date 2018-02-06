/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.DoctorWorkQueue.WorkQueue;
import Business.JobWorkQueue.JobWorkQueue;
import Business.Mother.ChildDirectory;
import Business.Mother.MotherDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.VaccinationTrackerWorkQueue.VaccinationTrackerWorkQueue;

/**
 *
 * @author NEHA
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private WorkQueue workQueue;
    private VaccinationTrackerWorkQueue vaccinationTrackerWorkQueue;
    private JobWorkQueue jobWorkQueue;

    public VaccinationTrackerWorkQueue getVaccinationTrackerWorkQueue() {
        return vaccinationTrackerWorkQueue;
    }

    public void setVaccinationTrackerWorkQueue(VaccinationTrackerWorkQueue vaccinationTrackerWorkQueue) {
        this.vaccinationTrackerWorkQueue = vaccinationTrackerWorkQueue;
    }
   
    private ChildDirectory childDirectory;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        workQueue = new WorkQueue();
        
        childDirectory = new ChildDirectory();
        vaccinationTrackerWorkQueue = new VaccinationTrackerWorkQueue();
        jobWorkQueue = new JobWorkQueue();
    }

    public JobWorkQueue getJobWorkQueue() {
        return jobWorkQueue;
    }

    public void setJobWorkQueue(JobWorkQueue jobWorkQueue) {
        this.jobWorkQueue = jobWorkQueue;
    }

    public ChildDirectory getChildDirectory() {
        return childDirectory;
    }

    public void setChildDirectory(ChildDirectory childDirectory) {
        this.childDirectory = childDirectory;
    }

  

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public enum EnterpriseType {
        Hospital("Hospital"), VaccineCenter("VaccineCenter"), JobCentre("JobCentre"), BabySitting("BabySitting"),Food("Food"),Transport("Transport"),Housing("Housing");
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
