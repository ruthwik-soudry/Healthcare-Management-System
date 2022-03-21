package HealthClub;

import java.time.LocalDate;

/**
 *
 * @author ruthwiksoudry
 */
public class Patient extends Person {

    private int patientId;
    private final DocVisitHistory docEncounterHistory = new DocVisitHistory();
    
    public Patient( 
            String firstName, 
            String lastName, 
            LocalDate dateOfBirth, 
            String houseNumber, 
            String communityName, 
            String cityName,
            int patientId,
            int personId) {
            super(firstName, lastName, dateOfBirth, houseNumber, communityName, cityName, personId);
            this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public DocVisitHistory getEncounterHistory() {
        return docEncounterHistory;
    }
    
  }
