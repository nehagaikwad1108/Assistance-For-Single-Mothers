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
public class VaccinationDoctorWorkRequest extends VaccinationTrackerWorkRequest {
    private String vaccineName;

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    
}
