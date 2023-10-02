package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GainPossession;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.ReceivePass;

public class Kickout extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {

    public Kickout(){
    }

    public String toString() {
        return "Saved. Kickout ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
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
