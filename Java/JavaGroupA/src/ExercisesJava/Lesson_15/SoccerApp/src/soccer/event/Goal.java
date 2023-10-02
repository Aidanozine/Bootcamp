package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Kickoff;

public class Goal extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {

    public Goal(){

    }
    public String toString() {
        return "GOAL! ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
        GameEvent theEvent[] = {new Kickoff()};
        return theEvent;
    }

    public boolean changePlayer() {
        return false;
    }

    public boolean changeTeam() {
        return false;
    }

    public void setBallPos(int ballPos) { // not used
        super.ballPos = 100;
    }
}
