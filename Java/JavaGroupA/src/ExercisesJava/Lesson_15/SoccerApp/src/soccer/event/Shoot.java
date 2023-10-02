package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Goal;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Kickout;

public class Shoot extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {

    public Shoot(){ // Ignore - no change until Goal or Kickout
    }

    public String toString() {
        return "Shoots ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new Goal(), new Kickout()};
        return theEvent;
    }

    public boolean changePlayer() {
        return false;
    }

    public boolean changeTeam() {
        return false;
    }

    public void setBallPos(int currBallPos) {
        super.ballPos = currBallPos;
    }
}
