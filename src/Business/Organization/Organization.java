/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.CourseCatalog.CourseCatalogDirectory;
import Business.DoctorWorkQueue.WorkQueue;
import Business.Employee.EmployeeDirectory;
import Business.Food.FoodDirectory;
import Business.Housing.HousingNamesDirectory;
import Business.Job.JobDirectory;
import Business.JobWorkQueue.JobWorkQueue;
import Business.BabySitting.BabySittersDirectory;
import Business.BabySitting.ClientDirectory;
import Business.Role.Role;
import Business.Transport.TransportNamesDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.VaccinationTrackerWorkQueue.VaccinationTrackerWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author NEHA
 */
public abstract class Organization {

    private String name;

    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private VaccinationTrackerWorkQueue vaccinationTrackerWorkQueue;
    private JobWorkQueue jobWorkQueue;
    private FoodDirectory foodDirectory;
    private TransportNamesDirectory transportNamesDirectory;
    private HousingNamesDirectory housingNamesDirectory;
    private CourseCatalogDirectory courseCatalogDirectory;
    private JobDirectory jobDirectory;
    private int organizationID;
    private static int counter;
    private BabySittersDirectory bc;
    private ClientDirectory clientDirectory;
    //private TransportNamesDirectory transportNamesDirectory;
    public enum Type {
        Admin("Admin Organization"), Doctor("Doctor Organization"), Sonography("Sonography Organization"),
        Dietician("Dietician Organization"), JobTrainer("Job Training Organization"), HospitalTracker("HospitalTracker Organization"),
        VaccinationDoctorOrganization("VaccinationDoctor Organization"), VaccinationTrackerOrganization("VaccinationTracker Organization"),
        JobCounselor("Job Counselor Organization"), JobFinder("Job Finder Organization"), FoodOrganization("Food Organization"), HousingOrganization("Housing Organization"),
        TransportOrganization("Transport Organization"), Tracker("Tracker Organization"), BabySittingOrganization("BabySitting Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
        workQueue = new WorkQueue();
        vaccinationTrackerWorkQueue = new VaccinationTrackerWorkQueue();
        jobWorkQueue = new JobWorkQueue();
        foodDirectory = new FoodDirectory();
        transportNamesDirectory = new TransportNamesDirectory();
        clientDirectory = new ClientDirectory();
        bc = new BabySittersDirectory();
        housingNamesDirectory =new HousingNamesDirectory();
        courseCatalogDirectory = new CourseCatalogDirectory();
        jobDirectory=new JobDirectory();
    }

    public JobDirectory getJobDirectory() {
        return jobDirectory;
    }

    public void setJobDirectory(JobDirectory jobDirectory) {
        this.jobDirectory = jobDirectory;
    }

    public HousingNamesDirectory getHousingNamesDirectory() {
        return housingNamesDirectory;
    }

    public void setHousingNamesDirectory(HousingNamesDirectory housingNamesDirectory) {
        this.housingNamesDirectory = housingNamesDirectory;
    }

    public CourseCatalogDirectory getCourseCatalogDirectory() {
        return courseCatalogDirectory;
    }

    public void setCourseCatalogDirectory(CourseCatalogDirectory courseCatalogDirectory) {
        this.courseCatalogDirectory = courseCatalogDirectory;
    }

    public TransportNamesDirectory getTransportNamesDirectory() {
        return transportNamesDirectory;
    }

    public void setTransportNamesDirectory(TransportNamesDirectory transportNamesDirectory) {
        this.transportNamesDirectory = transportNamesDirectory;
    }

    public BabySittersDirectory getBc() {
        return bc;
    }

    public void setBc(BabySittersDirectory bc) {
        this.bc = bc;
    }

   
    public ClientDirectory getClientDirectory() {
        return clientDirectory;
    }

    public void setClientDirectory(ClientDirectory clientDirectory) {
        this.clientDirectory = clientDirectory;
    }

   

    public FoodDirectory getFoodDirectory() {
        return foodDirectory;
    }

    public void setFoodDirectory(FoodDirectory foodDirectory) {
        this.foodDirectory = foodDirectory;
    }

    public JobWorkQueue getJobWorkQueue() {
        return jobWorkQueue;
    }

    public void setJobWorkQueue(JobWorkQueue jobWorkQueue) {
        this.jobWorkQueue = jobWorkQueue;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public VaccinationTrackerWorkQueue getVaccinationTrackerWorkQueue() {
        return vaccinationTrackerWorkQueue;
    }
    
    public void setVaccinationTrackerWorkQueue(VaccinationTrackerWorkQueue vaccinationTrackerWorkQueue) {
        this.vaccinationTrackerWorkQueue = vaccinationTrackerWorkQueue;
    }
     
}
