package HealthClub;

/**
 *
 * @author ruthwiksoudry
 */
public class Community extends City {
    
    String community;  
    
    public Community(String communityName, String cityName) {
        super(cityName);
        this.community = communityName;
    }

    public String getCommunityName() {
        return community;
    }

    public void setCommunityName(String communityName) {
        this.community = communityName;
    }
    
}
