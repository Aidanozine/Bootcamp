package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GainPossession;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.ReceivePass;

public class Kickoff extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {  // Really it's a special Pass

    public Kickoff() {
    }

    public String toString() {
        return "Kickoff ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new ReceivePass(), new GainPossession()};
        return theEvent;
    }

    public boolean changePlayer() {
        return true;
    }

    public boolean changeTeam() {
        return true;
    }

    public void setBallPos(int ballPos) { // not used
        super.ballPos = 50;
    }
}
