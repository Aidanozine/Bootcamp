package ExercisesJava.Lesson_15.SoccerApp.src.soccer.play;

public class Player implements Comparable {

    private String playerName;
    private int goalsScored;

    public void incGoalsScored() {
        this.goalsScored++;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player() {}

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int compareTo(Object thePlayer){
        if (this.getGoalsScored() < ((ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Player)thePlayer).getGoalsScored()){
            return 1;
        } else {
            return -1;
        }
    }
}
