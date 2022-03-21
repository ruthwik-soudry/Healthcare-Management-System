package HealthClub;

import java.time.Period;
import java.time.LocalDate;

/**
 *
 * @author ruthwiksoudry
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private int personId;
    private House residence;
    private AgeGroup ageGroup;
    private LocalDate dateOfBirth;
    
    public Person(
            String firstName, 
            String lastName, 
            LocalDate dateOfBirth, 
            String houseNumber, 
            String communityName, 
            String cityName,
            int personId
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId = personId;
        this.dateOfBirth = dateOfBirth;
        this.residence = new House(houseNumber, communityName, cityName);
        this.setAgeGroup();
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
        
    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    private void setAgeGroup() {
        
        //this function detemines if the person is child or adult based on the age
        Period timePeriod = Period.between(LocalDate.now(), this.dateOfBirth);
        
        int ageInNoOfMonths = Math.abs((timePeriod.getYears()*12) + Math.abs(timePeriod.getMonths()));
        
        int ageInNoOfYears = ageInNoOfMonths / 12;
        
        if (ageInNoOfMonths <= 12) {
            this.ageGroup = AgeGroup.Newborn;
        } else if (ageInNoOfYears >= 1 && ageInNoOfYears <= 3) {
            this.ageGroup = AgeGroup.Toddler;

        } else if (ageInNoOfYears > 3 && ageInNoOfYears <= 12) {
            this.ageGroup = AgeGroup.SchoolKid;

        } else if (ageInNoOfYears >= 13 && ageInNoOfYears <= 19) {
            this.ageGroup = AgeGroup.Teenager;

        } else if (ageInNoOfYears >= 20 && ageInNoOfYears <= 50) {
            this.ageGroup = AgeGroup.Adult;

        } else {
            this.ageGroup = AgeGroup.OldAge;
        }
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House houseNumber) {
        this.residence = houseNumber;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
