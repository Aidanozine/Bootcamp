package soccer.play;

import soccer.event.GameEvent;
import soccer.event.Goal;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import soccer.util.PlayerDatabase;
import soccer.util.PlayerDatabaseException;
import soccer.util.Settings;

public class League {

    public static void main(String[] args) {
        
        League theLeague = new League();
        String teamNames = "The Robins,The Pelicans,The Sparrows,The Magpies,The Crows";
        int teamSize = 5;

        try { Team[] theTeams = theLeague.createTeams(teamNames, teamSize);
            Game[] theGames = theLeague.createGames(theTeams);
            System.out.println(theLeague.getLeagueAnnouncement(theGames));
            
            for (Game currGame : theGames) {
                currGame.playGame();
                System.out.println(currGame.getDescription(true));
            }

            theLeague.setTeamStats(theTeams, theGames);
            theLeague.showBestTeam(theTeams);
            IDisplayDataItem[][] dataGrid = theLeague.getLeagueDataGrid(theGames, theTeams);
            theLeague.outputTextLeagueGrid(dataGrid);
        } catch (PlayerDatabaseException e) {
            e.printStackTrace(System.err);
        }
    }

    public Team[] createTeams(String teamNames, int teamSize) throws PlayerDatabaseException {
        PlayerDatabase playerDB = new PlayerDatabase();
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        
        for (int i =0; i < theTeams.length; i++){
             theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        int daysBetweenGames = 0;
        ArrayList theGames = new ArrayList();
        
        for (Team homeTeam: theTeams){
            for (Team awayTeam: theTeams){
               if (homeTeam != awayTeam) {
                   daysBetweenGames += Settings.DAYS_BETWEEN_GAMES;
                   theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
               } 
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
    }

    public void setTeamStats(Team[] theTeams, Game[] theGames) {
        for (Team currTeam: theTeams){
            currTeam.setGoalsTotal(0);
            currTeam.setPointsTotal(0);

            for (Player currPlayer: currTeam.getPlayerArray()){
                currPlayer.setGoalsScored(0);
            }
        }

        for (Game currGame: theGames){
            
            GameResult theResult = currGame.getGameResult(); 
            if (theResult.isDrawnGame()) {
                currGame.getHomeTeam().incPointsTotal(Settings.DRAWN_GAME_POINTS);
                theResult.getAwayTeam().incPointsTotal(Settings.DRAWN_GAME_POINTS);
            } else {
                theResult.getWinner().incPointsTotal(Settings.WINNER_GAME_POINTS);
            }

            theResult.getHomeTeam().incGoalsTotal(theResult.getHomeTeamScore());
            theResult.getAwayTeam().incGoalsTotal(theResult.getAwayTeamScore());
        }
    }
    
    
    public void showBestTeam(Team[] theTeams) {        
        Arrays.sort(theTeams);
        Team currBestTeam = theTeams[0];  
        System.out.println("\nTeam Points");       
           
        for (Team currTeam: theTeams){
            System.out.println(currTeam.getTeamName() + " : " + currTeam.getPointsTotal() + " : "
                     + currTeam.getGoalsTotal());
        }       
        System.out.println("Winner of the League is " + currBestTeam.getTeamName());        
    }
    
    public String getLeagueAnnouncement(Game[] theGames){       
        Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(), 
        theGames[theGames.length - 1].getTheDateTime().toLocalDate());    
        return "The league is scheduled to run for " +
        thePeriod.getMonths() + " month(s), and " +
        thePeriod.getDays() + " day(s)\n";
    }
    
    public void setPlayerStats(Game[] theGames) {
        for (Game currGame : theGames) {
            for (GameEvent currEvent : currGame.getEvents()) {
                if (currEvent instanceof Goal) {
                    currEvent.getThePlayer().incGoalsScored();
                }
            }
        }
    }
    
    public void showBestPlayersByLeague(Team[] theTeams){
        ArrayList <Player> thePlayers = new ArrayList();
        for (Team currTeam: theTeams){
            thePlayers.addAll(Arrays.asList(currTeam.getPlayerArray()));
        }
        
        Collections.sort(thePlayers, (p1, p2) -> Double.valueOf(p2.getGoalsScored()).compareTo(Double.valueOf(p1.getGoalsScored())));
        System.out.println("\n\nBest Players in League");
        for (Player currPlayer: thePlayers){
            System.out.println(currPlayer.getPlayerName() + " : " + currPlayer.getGoalsScored());
        }
    }    
    
    public void showBestPlayersByTeam(Team[] theTeams){
        for (Team currTeam: theTeams){
            Arrays.sort(currTeam.getPlayerArray(), (p1, p2) -> Double.valueOf(p2.getGoalsScored()).compareTo(Double.valueOf(p1.getGoalsScored())));
            System.out.println("\n\nBest Players in " + currTeam.getTeamName());
            for (Player currPlayer: currTeam.getPlayerArray()){
                System.out.println(currPlayer.getPlayerName() + " : " + currPlayer.getGoalsScored());
            }
        }
    }
    
    public IDisplayDataItem[][] getLeagueDataGrid(Game[] theGames, Team[] theTeams) {
        int numTeams = theTeams.length;
        IDisplayDataItem[][] theGrid = new IDisplayDataItem[numTeams + 1][numTeams + 3];

        int colNum = 0;
        int rowNum = 0;

        theGrid[rowNum][colNum] = new DisplayString("");

        for (int i = 0; i < theTeams.length; i++) {
            theTeams[i].setId(i);
            theGrid[rowNum][colNum + 1] = theTeams[i];
            colNum++;
        }

        theGrid[rowNum][colNum + 1] = new DisplayString("Points");
        theGrid[rowNum][colNum + 2] = new DisplayString("Goals");

        for (int i = 0; i < theTeams.length; i++) {
            rowNum = i + 1;
            colNum = 0;
            Team currHomeTeam = theTeams[i];
            theGrid[rowNum][colNum] = currHomeTeam;

            for (Team currAwayTeam : theTeams) {
                colNum++;
                if (currHomeTeam != currAwayTeam) {
                    for (Game theGame : theGames) {
                        if (theGame.getHomeTeam() == currHomeTeam && theGame.getAwayTeam() == currAwayTeam) {
                            theGrid[rowNum][colNum] = theGame;
                            break;
                        }
                    }
                } else {
                    theGrid[rowNum][colNum] = new DisplayString(" X ");  // team can't play against itself
                }
            }
            theGrid[rowNum][colNum + 1] = new DisplayString(new Integer(currHomeTeam.getPointsTotal()).toString());
            theGrid[rowNum][colNum + 2] = new DisplayString(new Integer(currHomeTeam.getGoalsTotal()).toString());
        }
        return theGrid;
    }
    
    public void outputTextLeagueGrid(IDisplayDataItem[][] dataGrid) {
        int[] stringLength = new int[dataGrid[0].length];
        int totalLength = 0;
        
        for (int i = 0; i < dataGrid[0].length; i++){          
            int currLongest = 0;
            for (IDisplayDataItem[] dataGrid1 : dataGrid) {
                int currLength = dataGrid1[i].getDisplayDetail().length();
                if (currLength > currLongest) currLongest = currLength;
            }
            stringLength[i] = currLongest;
            totalLength += currLongest;
        }

        int numCols = dataGrid[0].length;
        int numExtraCharsPerColum = 3;
        String separatorLine = new String(new char[totalLength + (numCols * numExtraCharsPerColum) + 1]).replace("\0", "-"); 
        System.out.println(separatorLine);    
        for (IDisplayDataItem[] theRow: dataGrid){

            for (int j = 0; j < theRow.length; j++){
                int extraChars = stringLength[j] - theRow[j].getDisplayDetail().length(); 
                System.out.print("| " + theRow[j].getDisplayDetail() + new String(new char[extraChars]).replace("\0", " ") + " ");
            }            
            System.out.print("|");
            System.out.println();
            System.out.println(separatorLine);
        }
    }
        
    public void simpleDisplay(IDisplayDataItem[][] dataGrid) {   
    for (IDisplayDataItem[] theRow: dataGrid){

            for (IDisplayDataItem theItem: theRow){
                    System.out.print(theItem.getDisplayDetail() + " : ");
            } 
            System.out.println();
        }
    }  
}
