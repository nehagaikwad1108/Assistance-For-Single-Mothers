/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccinationTrackerWorkQueue;

/**
 *
 * @author nupur
 */
public class HospitalTrackerWorkRequest extends VaccinationTrackerWorkRequest {
    private String vaccResult;
    private String vaccName;
    private int vaccQuantity;

    public String getVaccResult() {
        return vaccResult;
    }

    public void setVaccResult(String vaccResult) {
        this.vaccResult = vaccResult;
    }

    public String getVaccName() {
        return vaccName;
    }

    public void setVaccName(String vaccName) {
        this.vaccName = vaccName;
    }
 
    
}
