
package HealthClub;

/**
 *
 * @author ruthwiksoudry
 */
public class VitalSignCheck {
    
        public static boolean checkNormalHR(Patient patient) {
        //function to check if the heart rate is normal or not for different age groups

        AgeGroup ageRange = patient.getAgeGroup();
           try{

        DocVisitHistory docHistory = patient.getEncounterHistory();
        DocVisit docvisit = docHistory.recentEncounter;
        VitalSigns vitalSign = docvisit.getVitalSign();
        int heartRate = vitalSign.getHeartRate();
        
        switch (ageRange) {
            case Newborn:
                return heartRate > 49 && heartRate < 71;
            case Toddler:
                return heartRate > 69 && heartRate < 101;
            case SchoolKid:
            case Teenager:
                return heartRate > 79 && heartRate < 111;
            case Adult:
                return heartRate > 79 && heartRate < 121;
            case OldAge:
                return heartRate > 109 && heartRate < 121;
            }
            return true;
        } catch( Exception e){
                System.out.println("exception");   
                return true;

    }
}

    public static boolean checkNormalBP(Patient patient) {
        
        //function to check for normal blood pressure for different age group
        AgeGroup ageRange = patient.getAgeGroup();
        
        try {
            
        DocVisitHistory docHistory = patient.getEncounterHistory();
        DocVisit docvisit = docHistory.recentEncounter;
        
        VitalSigns vitalSign = docvisit.getVitalSign();
        int bloodPressure = vitalSign.getbloodPressure();
        
        switch (ageRange) {
            case Newborn:
                return bloodPressure > 49 && bloodPressure < 71;
            case Toddler:
                return bloodPressure > 69 && bloodPressure < 101;
            case SchoolKid:
            case Teenager:
                return bloodPressure > 79 && bloodPressure < 111;
            case Adult:
                return bloodPressure > 79 && bloodPressure < 121;
            case OldAge:
                return bloodPressure > 109 && bloodPressure < 121;
        }
        return true;
      }
       catch(Exception e){
        System.out.println("exception");
        return true;
 }
    }
    
}
