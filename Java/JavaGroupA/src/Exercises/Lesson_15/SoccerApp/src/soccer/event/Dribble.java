package soccer.event;

public class Dribble extends GameEvent {
    public Dribble(){
        
        super();
        
    }
    
    public String toString() {
        return "Dribble ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new GainPossession(), new Shoot(), new Pass()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
}
