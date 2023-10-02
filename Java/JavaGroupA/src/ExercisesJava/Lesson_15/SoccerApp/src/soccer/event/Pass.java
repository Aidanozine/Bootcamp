package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GainPossession;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.ReceivePass;

public class Pass extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {

    public Pass(){
        super();
    }

    public String toString() {
        return "Pass attempt ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new ReceivePass(), new GainPossession()};
        return theEvent;
    }

    public boolean changePlayer() {
        return false;
    }

    public boolean changeTeam() {
        return false;
    }
}
