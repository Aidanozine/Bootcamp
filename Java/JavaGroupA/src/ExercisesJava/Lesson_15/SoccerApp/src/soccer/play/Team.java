package ExercisesJava.Lesson_15.SoccerApp.src.soccer.play;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;

public class Team implements Comparable, IDisplayDataItem {
    private String teamName;
    private ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;
    private boolean detailAvailable = false;
    private int id = 0;
    private String detailType = "Team";

    public int compareTo(Object theTeam){
        int returnValue = -1;
        if (this.getPointsTotal()< ((ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team)theTeam).getPointsTotal()) {
            returnValue = 1;
        } else if (this.getPointsTotal() == ((ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team)theTeam).getPointsTotal()){
            if (this.getGoalsTotal()< ((ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team)theTeam).getGoalsTotal()) {
                returnValue = 1;
            }
        }
        return returnValue;
    }

    public void incGoalsTotal(int goals){
        this.setGoalsTotal(this.getGoalsTotal() + goals);
    }

    public void incPointsTotal(int points){
        this.pointsTotal += points;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Player[] players) {
        this(teamName);
        this.playerArray = players;
    }

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public int getGoalsTotal() {
        return goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }

    public String toString(){
        return teamName;
    }

    public String getDisplayDetail(){
        return teamName;
    }
    public boolean isDetailAvailable (){
        return detailAvailable;
    }
    public int getID(){
        return id;
    }
    public String getDetailType() {
        return detailType;
    }

    public void setDetailAvailable(boolean detailAvailable) {
        this.detailAvailable = detailAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGetDetailType() {
        return detailType;
    }

    public void setGetDetailType(String detailType) {
        this.detailType = detailType;
    }

    public GameEvent getNextPlayAttempt(GameEvent currEvent){

        GameEvent[] possEvents = currEvent.getNextEvents();
        currEvent = possEvents[(int) (Math.random()
                * (possEvents.length))];
        return currEvent;
    }
}
