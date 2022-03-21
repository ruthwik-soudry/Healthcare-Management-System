
package HealthClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ruthwiksoudry
 */
public class HealthSystem {

    private final List<Patient> patientDirectory = new ArrayList<>();
    private final List<Person> personDirectory = new ArrayList<>();
    private final List<Community> communityDirectory = new ArrayList<>();
    private final List<House> houseDirectory = new ArrayList<>();
    private final List<City> cityDirectory = new ArrayList<>();
  

    public List<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public List<Person> getPersonDirectory() {
        return personDirectory;
    }
    
    
    public void addPerson(Person person) {
        this.personDirectory.add(person);
    }

    public void addPatient(Patient patient) {
        this.personDirectory.add(patient);
        this.patientDirectory.add(patient);
    }

    public List<City> getCitiesDirectory() {
        return cityDirectory;
    }
    
     public void removePatient(Patient patient){
        this.personDirectory.remove(patient);
        this.patientDirectory.remove(patient);
    }
     
     
    public House getOrAddHouse(House house) {
        Optional<House> currentHouse = this.houseDirectory
                .stream()
                .filter((item) -> {
                    return item.getCity().equalsIgnoreCase(house.getCity()) &&
                           item.getHouseNumber().equalsIgnoreCase(house.getHouseNumber()) &&
                           item.getCommunityName().equalsIgnoreCase(house.getCommunityName());
                })
                .findFirst();
        if (currentHouse.isPresent()) {
            return currentHouse.get();
        }
        else {
            Optional<City> existingCity = this.cityDirectory
                .stream()
                .filter((h) -> h.getCity().equalsIgnoreCase(house.getCity()))
                .findFirst();
            if (!existingCity.isPresent()) {
                City city = new City(house.getCity());
                this.cityDirectory.add(city);
            }
            
            Optional<Community> existingCommunity = this.communityDirectory
                .stream()
                .filter((item) -> item.getCommunityName().equalsIgnoreCase(house.getCommunityName()))
                .findFirst();
            if (!existingCommunity.isPresent()) {
                Community community = new Community(house.getCommunityName(), house.getCity());
                this.communityDirectory.add(community);
            }
            this.houseDirectory.add(house);
        }
        return house;
    }
    
    public Patient getPatientById(int patientId) {
        Optional<Patient> patientDetails = this.patientDirectory
                .stream()
                .filter((item) -> item.getPatientId() == patientId)
                .findFirst();
        if (patientDetails.isPresent()) {
            return patientDetails.get();
        }
        else {
            return null;
        }
    }
    
    public static List<Patient> findPatientsByAbnormalHR(List<Patient> patients) {
        
        List<Patient> patientWithAbnormalHR = new ArrayList<Patient>();
        
        patients.forEach((Patient patient) -> {
            if (!VitalSignCheck.checkNormalHR(patient)) {
                patientWithAbnormalHR.add(patient);
            }
        });
        
        return patientWithAbnormalHR;
    }
     
    public HashMap displayPatientsByAbnormalHR() {
        
        List<Patient> patientWithAbnormalHR = findPatientsByAbnormalHR(this.patientDirectory);
        
        HashMap<String,String> communityPatientMap = new HashMap<String,String>();
        
        patientWithAbnormalHR.forEach((patient) -> {
            String community = patient.getResidence().getCommunityName();
            String countString = communityPatientMap.getOrDefault(community, "0");
            int count = Integer.parseInt(countString);
            communityPatientMap.put(community, String.valueOf(count+1));
        });
        
        return communityPatientMap;

    }
    
    public static List<Patient> findPatientsAbnormalBP(List<Patient> patients) {
        
        List<Patient> patientWithAbnormalBP = new ArrayList<Patient>();
        
        patients.forEach((Patient patient) -> {
            if (!VitalSignCheck.checkNormalBP(patient)) {
                patientWithAbnormalBP.add(patient);
            }
        });
        
        return patientWithAbnormalBP;
    }
 
    public HashMap displayPatientsByAbnormalBP() {
        List<Patient> patientWithAbnormalBP = findPatientsAbnormalBP(this.patientDirectory);
        
        HashMap<String,String> patientCommunityMap = new HashMap<String,String>();
        
        patientWithAbnormalBP.forEach((patient) -> {
            String community = patient.getResidence().getCommunityName();
            String stringCounter = patientCommunityMap.getOrDefault(community, "0");
            int count = Integer.parseInt(stringCounter);
            patientCommunityMap.put(community, String.valueOf(count+1));
        });
        
        return patientCommunityMap;
    }
}

