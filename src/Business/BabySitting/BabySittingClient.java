package Business.BabySitting;

import Business.Mother.Mother;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author RIDDHI
 */
public class BabySittingClient {

    private Mother mother;
    private String status;
    private int IDofAllotedBabySitter;
    private Date ServiceSrtDate;
    private Date ServiceEndDate;
    private long WeekDaysHrs;
    private long SaturdayHrs;
    private long SundayHrs;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    private String requirement;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getServiceSrtDate() {
        return ServiceSrtDate;
    }

    public void setServiceSrtDate(Date ServiceSrtDate) {
        this.ServiceSrtDate = ServiceSrtDate;
    }

    public Date getServiceEndDate() {
        return ServiceEndDate;
    }

    public void setServiceEndDate(Date ServiceEndDate) {
        this.ServiceEndDate = ServiceEndDate;
    }

    public long getWeekDaysHrs() {
        return WeekDaysHrs;
    }

    public void setWeekDaysHrs(long WeekDaysHrs) {
        this.WeekDaysHrs = WeekDaysHrs;
    }

    public long getSaturdayHrs() {
        return SaturdayHrs;
    }

    public void setSaturdayHrs(long SaturdayHrs) {
        this.SaturdayHrs = SaturdayHrs;
    }

    public long getSundayHrs() {
        return SundayHrs;
    }

    public void setSundayHrs(long SundayHrs) {
        this.SundayHrs = SundayHrs;
    }

    public int getIDofAllotedBabySitter() {
        return IDofAllotedBabySitter;
    }

    public void setIDofAllotedBabySitter(int IDofAllotedBabySitter) {
        this.IDofAllotedBabySitter = IDofAllotedBabySitter;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

}
