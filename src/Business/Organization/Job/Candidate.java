package Business.Organization.Job;

import Business.Mother.Mother;

/**
 *
 * @author RIDDHI
 */
public class Candidate {

    private Mother mother;
    private String Education;
    private String PastWorkingExperience;
    private String VocationalCertificates;
    private String ProfessionalDegree;
    
    //Add more string values that are set in forms

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    public String getPastWorkingExperience() {
        return PastWorkingExperience;
    }

    public void setPastWorkingExperience(String PastWorkingExperience) {
        this.PastWorkingExperience = PastWorkingExperience;
    }

    public String getVocationalCertificates() {
        return VocationalCertificates;
    }

    public void setVocationalCertificates(String VocationalCertificates) {
        this.VocationalCertificates = VocationalCertificates;
    }

    public String getProfessionalDegree() {
        return ProfessionalDegree;
    }

    public void setProfessionalDegree(String ProfessionalDegree) {
        this.ProfessionalDegree = ProfessionalDegree;
    }

}
