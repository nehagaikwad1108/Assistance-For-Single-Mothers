/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccinationTrackerWorkQueue;


import java.util.ArrayList;

/**
 *
 * @author NEHA
 */
public class VaccinationTrackerWorkQueue {
     private ArrayList<VaccinationTrackerWorkRequest> workRequestListV;

    public VaccinationTrackerWorkQueue() {
        workRequestListV = new ArrayList<>();
    }

    public ArrayList<VaccinationTrackerWorkRequest> getWorkRequestListV() {
        return workRequestListV;
    }
    
      public VaccinationTrackerWorkRequest addRequest(VaccinationTrackerWorkRequest request) {
        workRequestListV.add(request);
        return request;
    }
}
