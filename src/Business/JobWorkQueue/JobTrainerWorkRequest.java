/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.JobWorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author nupur
 */
public  class JobTrainerWorkRequest extends JobCounsellorWorkRequest {
    private String result;
    private String message;
     private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String motherStatus;
    private String motherNmae;
   private String courseTaken;
   private String courseGrades;
   
    public String getMotherStatus() {
        return motherStatus;
    }

    public void setMotherStatus(String motherStatus) {
        this.motherStatus = motherStatus;
    }

    public String getMotherNmae() {
        return motherNmae;
    }

    public void setMotherNmae(String motherNmae) {
        this.motherNmae = motherNmae;
    }

    public String getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(String courseTaken) {
        this.courseTaken = courseTaken;
    }

    public String getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(String courseGrades) {
        this.courseGrades = courseGrades;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     @Override
public String toString(){
return message;
}
}
