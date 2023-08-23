package soccer.event;

import soccer.util.Settings;

public class Kickout extends GameEvent {
    
    public Kickout(){
    }
    
    public String toString() {
        return "Saved. Kickout ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new GainPossession(), new ReceivePass()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return true;
    }
    
    public boolean changeTeam() {
        return true;
    }
    
    public void setBallPos(int ballPos) { // not used
       super.ballPos = 95;
    }
}
