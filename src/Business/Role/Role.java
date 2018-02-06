/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author NEHA
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        DoctorRole("Doctor Role"),
        SonographyRole("Sonography Role"),
        DieticianRole("Dietician Role"),
        VaccinationTrackerRole("VaccinationTracker Role"),
        VaccinationDoctorRole("VaccinationDoctor Role"),
        JobFinderRole("Job Finder Role"),
        JobTrainerRole("Job Trainer Role"),
        JobCounselorRole("Job Councelor Role"),
        TrackerRole("Tracker Role"),
        HospitalTrackerRole("HospitalTracker Role"),
        BabySittinAdminRole("BaySittingAdminRole");
        private String value;

        private RoleType(String value) {
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

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName().substring(this.getClass().getName().lastIndexOf('.') + 1).trim();

    }
}
