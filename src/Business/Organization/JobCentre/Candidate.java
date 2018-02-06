package Business.Organization.JobCentre;

import Business.Mother.Mother;

/**
 *
 * @author RIDDHI
 */
public class Candidate {

    private Mother mother;
    private Job job;
    private String EducationLevel;
    private String skillType;
    private String workExperience;
    private String PastWorkingExperience;
    private String SchoolEducation;
    private String CollegeEducation;
    private String ProfessionalCources;
    private String Certificates;

    private int QuantsScore;
    private int VerbalScore;

    /*  private long WeekDaysHrs;
    private long SaturdayHrs;
    private long SundayHrs;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
     */
    @Override
    public String toString() {
        return mother.getName();
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public String getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(String EducationLevel) {
        this.EducationLevel = EducationLevel;
    }

    public String getPastWorkingExperience() {
        return PastWorkingExperience;
    }

    public void setPastWorkingExperience(String PastWorkingExperience) {
        this.PastWorkingExperience = PastWorkingExperience;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getSchoolEducation() {
        return SchoolEducation;
    }

    public void setSchoolEducation(String SchoolEducation) {
        this.SchoolEducation = SchoolEducation;
    }

    public String getCollegeEducation() {
        return CollegeEducation;
    }

    public void setCollegeEducation(String CollegeEducation) {
        this.CollegeEducation = CollegeEducation;
    }

    public String getProfessionalCources() {
        return ProfessionalCources;
    }

    public void setProfessionalCources(String ProfessionalCources) {
        this.ProfessionalCources = ProfessionalCources;
    }

    public String getCertificates() {
        return Certificates;
    }

    public void setCertificates(String Certificates) {
        this.Certificates = Certificates;
    }

    public int getQuantsScore() {
        return QuantsScore;
    }

    public void setQuantsScore(int QuantsScore) {
        this.QuantsScore = QuantsScore;
    }

    public int getVerbalScore() {
        return VerbalScore;
    }

    public void setVerbalScore(int VerbalScore) {
        this.VerbalScore = VerbalScore;
    }

}
