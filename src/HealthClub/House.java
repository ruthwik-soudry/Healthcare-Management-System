package HealthClub;

/**
 *
 * @author ruthwiksoudry
 */
public class House extends Community {

    private final String houseNumber;
    
    public House(String houseNumber, String community, String city){
        super(community, city);
        this.houseNumber = houseNumber;
    }
    
    public String getHouseNumber() {
        return houseNumber;
    }
    
}
