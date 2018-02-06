/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.JobWorkQueue;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class JobWorkQueue {
     private ArrayList<JobCounsellorWorkRequest> councellorWorkRequestList;
     private ArrayList<JobFinderWorkRequest> finderWorkRequestList;
     private ArrayList<JobTrainerWorkRequest> trainerWorkRequestList;
       private ArrayList<TrackerWorkRequest> trackerWorkRequestList;

    public ArrayList<TrackerWorkRequest> getTrackerWorkRequestList() {
        return trackerWorkRequestList;
    }
    public ArrayList<JobFinderWorkRequest> getFinderWorkRequestList() {
        return finderWorkRequestList;
    }
    public ArrayList<JobCounsellorWorkRequest> getCouncellorWorkRequestList() {
        return councellorWorkRequestList;
    }

    public JobWorkQueue() {
        councellorWorkRequestList = new ArrayList<>();
        finderWorkRequestList = new ArrayList<>();
        trainerWorkRequestList = new ArrayList<>();
        trackerWorkRequestList = new ArrayList<>();
    }

    public ArrayList<JobTrainerWorkRequest> getTrainerWorkRequestList() {
        return trainerWorkRequestList;
    }
    
    
  
  
}
