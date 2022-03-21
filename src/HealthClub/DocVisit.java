package HealthClub;

import java.util.Date;

/**
 *
 * @author ruthwiksoudry
 */
public class DocVisit {
    
    public VitalSigns vitalSign;
    public Date currentTimeFormat;

    public DocVisit(VitalSigns vital) {
        this.vitalSign = vital;
        this.currentTimeFormat = new Date();
    }
    
    public VitalSigns getVitalSign() {
        return vitalSign;
        
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }
       
    public Date getTimeStamp() {
        return currentTimeFormat;
    }
    
}
