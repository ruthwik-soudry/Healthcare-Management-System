package HealthClub;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruthwiksoudry
 */

//see if tbd
public class PatientDirectory {

    List<Patient> patientList = new ArrayList<Patient>();

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patients) {
        this.patientList = patients;
    }
    
    public void addPatient(Patient patient){
        this.patientList.add(patient);
    }
}
