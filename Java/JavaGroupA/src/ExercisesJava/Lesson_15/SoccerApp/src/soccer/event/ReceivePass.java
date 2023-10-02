package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Dribble;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GainPossession;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Pass;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Shoot;

public class ReceivePass extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {

    public ReceivePass(){

        super();

    }
    public String toString() {
        return "Receive pass ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new Dribble(), new GainPossession(), new Shoot(), new Pass()};
        return theEvent;
    }

    public boolean changePlayer() {
        return true;
    }

    public boolean changeTeam() {
        return false;
    }
}
