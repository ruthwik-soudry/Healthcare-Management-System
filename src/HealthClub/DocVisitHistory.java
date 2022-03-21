package HealthClub;

import java.util.Stack;

/**
 *
 * @author ruthwiksoudry
 */
public class DocVisitHistory {
    
    //creating object of doctor encounter or visit history
    public Stack<DocVisit> docHistory = new Stack<DocVisit>();
    
    public DocVisit recentEncounter;
    
    public void storedEncounters(DocVisit encounter){
        this.recentEncounter = encounter;
        this.docHistory.push(encounter);
    }
}

