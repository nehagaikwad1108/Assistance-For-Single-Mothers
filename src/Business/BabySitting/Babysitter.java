package Business.BabySitting;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author RIDDHI
 */
public class Babysitter {

    private String name;
    private int empID;
    private static int count = 1;

    public Babysitter() {
        empID = count;
        count++;
    }
    private String address;
    private String ContactNo;
    private String gender;
    private boolean availability;
    private int age;
    //  private int AvailabeHrsPerWeek;
    private Date availableSDate;
    private Date availableEDate;
    private Date EmployementSrtDate;
    private Date EmployementEndDate;
    //alloted timeslots
    private long WeekDaysHrs;
    private long SaturdayHrs;
    private long SundayHrs;
    //current working time
    private String WeekDayWrkTimings;
    private String SaturdaywrkTimings;
    private String SundayWrkTimings;

    //availible hours
    private String WeekDayTimings;
    private String SaturdayTimings;
    private String SundayTimings;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    //Date date = dateFormat.parse("12/31/2006");
    private float ExpectedWage;
    private String BackgrndCheckStatus;
    private String AllotedCustomer;
    private int IDofAllotedCustomer;

    public int getIDofAllotedCustomer() {
        return IDofAllotedCustomer;
    }

    public void setIDofAllotedCustomer(int IDofAllotedCustomer) {
        this.IDofAllotedCustomer = IDofAllotedCustomer;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Date getEmployementSrtDate() {
        return EmployementSrtDate;
    }

    public void setEmployementSrtDate(Date EmployementSrtDate) {
        this.EmployementSrtDate = EmployementSrtDate;
    }

    public Date getEmployementEndDate() {
        return EmployementEndDate;
    }

    public void setEmployementEndDate(Date EmployementEndDate) {
        this.EmployementEndDate = EmployementEndDate;
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

    public float getExpectedWage() {
        return ExpectedWage;
    }

    public void setExpectedWage(float ExpectedWage) {
        this.ExpectedWage = ExpectedWage;
    }

    public String getBackgrndCheckStatus() {
        return BackgrndCheckStatus;
    }

    public void setBackgrndCheckStatus(String BackgrndCheckStatus) {
        this.BackgrndCheckStatus = BackgrndCheckStatus;
    }

    public String getAllotedCustomer() {
        return AllotedCustomer;
    }

    public void setAllotedCustomer(String AllotedCustomer) {
        this.AllotedCustomer = AllotedCustomer;
    }

    public String getWeekDayTimings() {
        return WeekDayTimings;
    }

    public void setWeekDayTimings(String WeekDayTimings) {
        this.WeekDayTimings = WeekDayTimings;
    }

    public String getSaturdayTimings() {
        return SaturdayTimings;
    }

    public void setSaturdayTimings(String SaturdayTimings) {
        this.SaturdayTimings = SaturdayTimings;
    }

    public String getSundayTimings() {
        return SundayTimings;
    }

    public void setSundayTimings(String SundayTimings) {
        this.SundayTimings = SundayTimings;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getAvailableSDate() {
        return availableSDate;
    }

    public void setAvailableSDate(Date availableSDate) {
        this.availableSDate = availableSDate;
    }

    public Date getAvailableEDate() {
        return availableEDate;
    }

    public void setAvailableEDate(Date availableEDate) {
        this.availableEDate = availableEDate;
    }

    public String getWeekDayWrkTimings() {
        return WeekDayWrkTimings;
    }

    public void setWeekDayWrkTimings(String WeekDayWrkTimings) {
        this.WeekDayWrkTimings = WeekDayWrkTimings;
    }

    public String getSaturdaywrkTimings() {
        return SaturdaywrkTimings;
    }

    public void setSaturdaywrkTimings(String SaturdaywrkTimings) {
        this.SaturdaywrkTimings = SaturdaywrkTimings;
    }

    public String getSundayWrkTimings() {
        return SundayWrkTimings;
    }

    public void setSundayWrkTimings(String SundayWrkTimings) {
        this.SundayWrkTimings = SundayWrkTimings;
    }

}
