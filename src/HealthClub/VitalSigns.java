
package HealthClub;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author ruthwiksoudry
 */
public class VitalSigns {
    
   private int heartRate;
   private int bloodPressure;
   private int respiratoryRate;
   private float weightInKg;
   private float weightInPound;
   private Instant date;
   
   
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    
    public int getbloodPressure() {
        return bloodPressure;
    }

    public void setbloodPressure(int sysBP) {
        this.bloodPressure = sysBP;
    }
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
    
    public float getWeightInPounds() {
        return weightInPound;
    }

    public void setWeightInPound(float weightInPound) {
        this.weightInPound = weightInPound;
    }
    

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKilos(float weightInKg) {
        this.weightInKg = weightInKg;
    }
    
    public Instant getDate() {
        Date newDate = new Date();
        return newDate.toInstant();
    }
}
