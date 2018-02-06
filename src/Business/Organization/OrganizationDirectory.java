package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author NEHA
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Dietician.getValue())) {
            organization = new DieticianOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Sonography.getValue())) {
            organization = new SonographyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.HospitalTracker.getValue())) {
            organization = new HospitalTrackerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.VaccinationTrackerOrganization.getValue())) {
            organization = new VaccinationTrackerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.VaccinationDoctorOrganization.getValue())) {
            organization = new VaccinationDoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.JobCounselor.getValue())) {
            organization = new JobCounselorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.JobFinder.getValue())) {
            organization = new JobFinderOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.JobTrainer.getValue())) {
            organization = new JobTrainerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Tracker.getValue())) {
            organization = new TrackerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.FoodOrganization.getValue())) {
            organization = new FoodOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.HousingOrganization.getValue())) {
            organization = new HousingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.TransportOrganization.getValue())) {
            organization = new TransportOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.BabySittingOrganization.getValue())) {
            organization = new BabySittingOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
