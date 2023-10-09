package ExercisesJava.Lesson_15.SoccerApp.src.soccer.play;

import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.GameEvent;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.event.Kickoff;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.GameResult;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.IDisplayDataItem;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Player;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team;
import ExercisesJava.Lesson_15.SoccerApp.src.soccer.util.Settings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Game implements IDisplayDataItem {

    private ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team homeTeam;
    private ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team awayTeam;
    private GameEvent[] events;
    private LocalDateTime theDateTime;

    private boolean detailAvailable = false;
    private int id = 0;
    private String detailType = "Game";

    public Game(ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team homeTeam, ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team awayTeam, LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }

    public void playGame() {
        ArrayList<GameEvent> eventList = new ArrayList();
        ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team currTeam;
        ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Player currPlayer;
        GameEvent currEvent = new Kickoff();
        currEvent.setBallPos(50);
        //currEvent.setTheTeam(this.getTheTeams()[(int)(Math.random()*2)]);
        currEvent.setTheTeam(Math.random() > 0.5?homeTeam: awayTeam);
        currEvent.setThePlayer(currEvent.getTheTeam().
                getPlayerArray()[(int) (Math.random() * this.homeTeam.getPlayerArray().length)]);
        currEvent.setTheTime(0);
        eventList.add(currEvent);


        for (int i = 1; i <= Settings.GAME_LENGTH; i++){

            if (Math.random() > Settings.GAME_EVENT_FREQUENCY){ //get currTeam and currPlayer if a change is needed

                currTeam = currEvent.getTheTeam();
                currPlayer = currEvent.getThePlayer();

                int currBallPos = currEvent.getBallPos(); // need before starting new event

//                GameEvent[] possEvents = currEvent.getNextEvents();
//                currEvent = possEvents[(int) (Math.random()
//                        * (possEvents.length))];

                // replaced by

                currEvent = currTeam.getNextPlayAttempt(currEvent); // tells whether to change player and team


//                currEvent.setTheTeam(currEvent.changeTeam()?getOtherTeam(currTeam): currTeam);


                currEvent.setBallPos(currBallPos );

                if (currEvent.changeTeam()) {
                    currTeam = getOtherTeam(currTeam);
                    currEvent.reverseBallPos();
                }
                currEvent.setTheTeam(currTeam);

                // following ensures players don't repeat
                ArrayList <Player> currPlayerList = new ArrayList(Arrays.asList(currEvent.getTheTeam().getPlayerArray()));
                currPlayerList.remove(currPlayer);
                currEvent.setThePlayer(
                        currEvent.changePlayer()?
                                currPlayerList.get((int)(Math.random() * currPlayerList.size())):
                                currPlayer
                );

                currEvent.setTheTime(i);
                eventList.add(currEvent);
//                System.out.println(i);
            }
            this.events = new GameEvent[eventList.size()];
            eventList.toArray(events);
        }
    }

    public String getDescription(boolean showEvents) {

        StringBuilder returnString = new StringBuilder(); // Announces game
        returnString.append(this.getHomeTeam().getTeamName() + " vs. " +
                this.getAwayTeam().getTeamName() + " (" +
                this.getTheDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) + ")");
        returnString.append("\n");

        ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.GameResult theResult = getGameResult();

        if (theResult.isDrawnGame()){
            returnString.append("It's a draw!");
        } else  {
            returnString.append(theResult.getWinner().getTeamName());
            returnString.append(" win!");
        }
        returnString.append(" (" + theResult.getHomeTeamScore() + " - " + theResult.getAwayTeamScore() + ") \n");

        if (showEvents){
            for (GameEvent currEvent: this.getEvents()) {
                returnString.append(currEvent.getBallPos() + " : " + currEvent + "after " +
                        currEvent.getTheTime() + " mins by " +
                        currEvent.getThePlayer().getPlayerName() +
                        " of " + currEvent.getTheTeam().getTeamName() +
                        "\n");
            }
        }
        return returnString.toString();
    }

    public String getDescription() {
        return getDescription(false);
    }

    public String getScore(){
        String theScore;
        ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.GameResult theResult = getGameResult();
        theScore = theResult.getHomeTeamScore() + " - " + theResult.getAwayTeamScore();
        return theScore;
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team getOtherTeam(ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team currTeam){
        if (currTeam == homeTeam){
            currTeam = awayTeam;
        } else currTeam = homeTeam;
        return currTeam;
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public GameEvent[] getEvents() {
        return events;
    }

    public void setEvents(GameEvent[] events) {
        this.events = events;
    }

    public LocalDateTime getLocalDateTime() {
        return getTheDateTime();
    }

    public void setLocalDateTime(LocalDateTime theDateTime) {
        this.setTheDateTime(theDateTime);
    }

    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }

    public ExercisesJava.Lesson_15.SoccerApp.src.soccer.play.GameResult getGameResult(){
        return new GameResult(this);
    }

    public String getDisplayDetail(){
        return getScore();
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
}