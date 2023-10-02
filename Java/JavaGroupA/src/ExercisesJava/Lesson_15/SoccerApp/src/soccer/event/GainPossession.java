package ExercisesJava.Lesson_15.SoccerApp.src.soccer.event;
public class GainPossession extends ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent {

    public GainPossession(){
        super();
    }

    public String toString() {
        return "Won possession ";
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GainPossession(), new Pass(), new Dribble(), new Shoot()};
        return theEvent;
    }

    public boolean changePlayer() {
        return true;
    }

    public boolean changeTeam() {
        return true;
    }
}
