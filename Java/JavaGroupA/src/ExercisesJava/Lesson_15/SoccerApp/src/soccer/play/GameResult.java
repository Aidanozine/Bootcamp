package ExercisesJava.Lesson_15.SoccerApp.src.soccer.play;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Goal;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Game;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team;

public class GameResult {
    private final ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team homeTeam;
    private final ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team awayTeam;
    private ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team winner;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private boolean isDrawn;

    public boolean isDrawnGame() {
        return isDrawn;
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team getWinner()  {
        return this.winner;
    }
    public int getHomeTeamScore(){
        return this.homeTeamGoals;
    }
    public int getAwayTeamScore(){
        return this.awayTeamGoals;
    }

    public GameResult(ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Game currGame) {
        this.homeTeam = currGame.getHomeTeam();
        this.awayTeam = currGame.getAwayTeam();
        getScore(currGame);
        if (homeTeamGoals == awayTeamGoals){
            this.isDrawn = true;
        } else if (homeTeamGoals > awayTeamGoals) {
            this.winner = this.homeTeam;
        } else {
            this.winner = this.awayTeam;
        }
    }

    private void getScore(Game currGame) {
        for (GameEvent currEvent: currGame.getEvents()) {
            if (currEvent instanceof Goal) {
                if (currEvent.getTheTeam()==currGame.getHomeTeam()){
                    this.homeTeamGoals++;
                } else {
                    this.awayTeamGoals++;
                }
            }
        }
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }
}
