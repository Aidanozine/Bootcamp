package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GainPossession;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Pass;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Shoot;

public class Dribble extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {
    public Dribble(){

        super();

    }

    public String toString() {
        return "Dribble ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
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
