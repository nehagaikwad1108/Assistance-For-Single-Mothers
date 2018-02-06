package Business.JobWorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author nupur
 */
public class JobFinderWorkRequest extends JobTrainerWorkRequest {

    private String result;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
   private String motherName;
   private String jobName;
   private float jobSalary;

    public float getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(float jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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
    public String toString() {
        return message;
    }
}
