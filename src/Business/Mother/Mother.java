package Business.Mother;

import java.util.Date;

/**
 *
 * @author nupur
 */
public class Mother {

    public Mother() {
        MotherID = count;
        count++;
    }

    private String Name;
    private int age;
    private int MotherID;
    private static int count = 1;
    private String emailID;
    private String Address;
    private String contactNo;
    private String medicalHistory;

    private boolean ciminalHistory;
    private String criminalHistory;
    private boolean PastAddiction;
    private String PastAddictionHistory;
    private boolean PresentAddiction;
    private String PresentAddictionHistory;
    private boolean Bail;
    private String BailDetails;
    private boolean Parole;
    private String ParoleDetails;

    private int AptitudeScore;

    private boolean BabySittingClient;
    private String AllotedBabySitter;
    private String IDofAllotedBabySitter;
    
    private String JobTrainingStatus;
    private String JobCounsellingStatus;
    private float MonthlyEarnigs;
    private float MonthlyExpenses;
     
    private String Education;
    private String PastWorkingExperience;
    private String VocationalCertificates;
    private String ProfessionalDegree;
  private String EducationLevel;
    private String skillType;
    private String workExperience;
   
    private String SchoolEducation;
    private String CollegeEducation;
    private String ProfessionalCources;
    private String Certificates;
    private String rentAlert;
    private String groceriesAlert;
    private String personalExpenseAlert;
    private String savingsAlert;
    private String phoneAlert;
    private float dreamJobSal;
    private String fieldOfInterest;
    private int startDate;
    private int endDate;
    private String courseName;
    private String courseStatus;
    private String jobApplicationStatus;
    private String jobStatus;
    private String courseGrade;
    private String foodStatus;
    private String transportStatus;
    private String houseStatus;
    private String foodName;
    private String foodPrice;
    private String transName;
    private String transPrice;
    private String houseName;
    private String housePrice;
    private Date sDate;
    private Date eDate;

    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }

    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }
    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(String foodStatus) {
        this.foodStatus = foodStatus;
    }

    public String getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus;
    }

    public String getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    public String getTransPrice() {
        return transPrice;
    }

    public void setTransPrice(String transPrice) {
        this.transPrice = transPrice;
    }

    public String getDieticienStatus() {
        return DieticienStatus;
    }

    public void setDieticienStatus(String DieticienStatus) {
        this.DieticienStatus = DieticienStatus;
    }

    public String getDieticianEndDate() {
        return DieticianEndDate;
    }

    public void setDieticianEndDate(String DieticianEndDate) {
        this.DieticianEndDate = DieticianEndDate;
    }

    //requests
    private String DieticienStatus;
    private String DieticianEndDate;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice;
    }
        
    
    
    
    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }
  
    
   public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }
      
    public String getJobApplicationStatus() {
        return jobApplicationStatus;
    }

    public void setJobApplicationStatus(String jobApplicationStatus) {
        this.jobApplicationStatus = jobApplicationStatus;
    }
    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
    public String getFieldOfInterest() {
        return fieldOfInterest;
    }

    public void setFieldOfInterest(String fieldOfInterest) {
        this.fieldOfInterest = fieldOfInterest;
    }
    public float getDreamJobSal() {
        return dreamJobSal;
    }

    public void setDreamJobSal(float dreamJobSal) {
        this.dreamJobSal = dreamJobSal;
    }

    public String getRentAlert() {
        return rentAlert;
    }

    public void setRentAlert(String rentAlert) {
        this.rentAlert = rentAlert;
    }

    public String getGroceriesAlert() {
        return groceriesAlert;
    }

    public void setGroceriesAlert(String groceriesAlert) {
        this.groceriesAlert = groceriesAlert;
    }

    public String getPersonalExpenseAlert() {
        return personalExpenseAlert;
    }

    public void setPersonalExpenseAlert(String personalExpenseAlert) {
        this.personalExpenseAlert = personalExpenseAlert;
    }

    public String getSavingsAlert() {
        return savingsAlert;
    }

    public void setSavingsAlert(String savingsAlert) {
        this.savingsAlert = savingsAlert;
    }

    public String getPhoneAlert() {
        return phoneAlert;
    }

    public void setPhoneAlert(String phoneAlert) {
        this.phoneAlert = phoneAlert;
    }
    private int QuantsScore;

    public int getAptitudeScore() {
        return AptitudeScore;
    }

    public void setAptitudeScore(int AptitudeScore) {
        this.AptitudeScore = AptitudeScore;
    }

    public float getMonthlyEarnigs() {
        return MonthlyEarnigs;
    }

    public void setMonthlyEarnigs(float MonthlyEarnigs) {
        this.MonthlyEarnigs = MonthlyEarnigs;
    }

    public float getMonthlyExpenses() {
        return MonthlyExpenses;
    }

    public void setMonthlyExpenses(float MonthlyExpenses) {
        this.MonthlyExpenses = MonthlyExpenses;
    }

    public String getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(String EducationLevel) {
        this.EducationLevel = EducationLevel;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
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
    private int VerbalScore;

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
    
    @Override
    public String toString() {
        return Name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public boolean isCiminalHistory() {
        return ciminalHistory;
    }

    public void setCiminalHistory(boolean ciminalHistory) {
        this.ciminalHistory = ciminalHistory;
    }

    public boolean isPastAddiction() {
        return PastAddiction;
    }

    public void setPastAddiction(boolean PastAddiction) {
        this.PastAddiction = PastAddiction;
    }

    public String getPastAddictionHistory() {
        return PastAddictionHistory;
    }

    public void setPastAddictionHistory(String PastAddictionHistory) {
        this.PastAddictionHistory = PastAddictionHistory;
    }

    public boolean isPresentAddiction() {
        return PresentAddiction;
    }

    public void setPresentAddiction(boolean PresentAddiction) {
        this.PresentAddiction = PresentAddiction;
    }

    public String getPresentAddictionHistory() {
        return PresentAddictionHistory;
    }

    public void setPresentAddictionHistory(String PresentAddictionHistory) {
        this.PresentAddictionHistory = PresentAddictionHistory;
    }

    public boolean isBail() {
        return Bail;
    }

    public void setBail(boolean Bail) {
        this.Bail = Bail;
    }

    public String getBailDetails() {
        return BailDetails;
    }

    public void setBailDetails(String BailDetails) {
        this.BailDetails = BailDetails;
    }

    public boolean isParole() {
        return Parole;
    }

    public void setParole(boolean Parole) {
        this.Parole = Parole;
    }

    public String getParoleDetails() {
        return ParoleDetails;
    }

    public void setParoleDetails(String ParoleDetails) {
        this.ParoleDetails = ParoleDetails;
    }

    public boolean isBabySittingClient() {
        return BabySittingClient;
    }

    public void setBabySittingClient(boolean BabySittingClient) {
        this.BabySittingClient = BabySittingClient;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMotherID() {
        return MotherID;
    }

    public String getIDofAllotedBabySitter() {
        return IDofAllotedBabySitter;
    }

    public void setIDofAllotedBabySitter(String IDofAllotedBabySitter) {
        this.IDofAllotedBabySitter = IDofAllotedBabySitter;
    }

    public String getAllotedBabySitter() {
        return AllotedBabySitter;
    }

    public void setAllotedBabySitter(String AllotedBabySitter) {
        this.AllotedBabySitter = AllotedBabySitter;
    }

    

    public String getJobTrainingStatus() {
        return JobTrainingStatus;
    }

    public void setJobTrainingStatus(String JobTrainingStatus) {
        this.JobTrainingStatus = JobTrainingStatus;
    }

    public String getJobCounsellingStatus() {
        return JobCounsellingStatus;
    }

    public void setJobCounsellingStatus(String JobCounsellingStatus) {
        this.JobCounsellingStatus = JobCounsellingStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mother(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

   
    public String getCriminalHistory() {
        return criminalHistory;
    }

    public void setCriminalHistory(String criminalHistory) {
        this.criminalHistory = criminalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    

}
