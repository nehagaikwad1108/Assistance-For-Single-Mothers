package Business.Organization.JobCentre;

import java.util.Date;

/**
 *
 * @author RIDDHI
 */
public class Job {

    private String jobTitle;
    private int jobID;
    private static int count = 1;

    public Job() {
        jobID = count;
        count++;
    }

    private String type;
    private String Position;
    private String industry;
    private Float wage;
    private Date SiringDate;
    private String ProfileRequirement;

    @Override
    public String toString() {
        return jobTitle;
    }

    public int getJobID() {
        return jobID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Float getWage() {
        return wage;
    }

    public void setWage(Float wage) {
        this.wage = wage;
    }

    public Date getSiringDate() {
        return SiringDate;
    }

    public void setSiringDate(Date SiringDate) {
        this.SiringDate = SiringDate;
    }

    public String getProfileRequirement() {
        return ProfileRequirement;
    }

    public void setProfileRequirement(String ProfileRequirement) {
        this.ProfileRequirement = ProfileRequirement;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
