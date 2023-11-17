package SoccerApp;

import java.util.HashMap;

public class League {
    static String team1 = "Liverpool";
    static int score1 = 3;
    static String team2 = "ManchesterUnited";
    static int score2 = 3;
    static String team3 = "Tarantulas";
    static int score3 = 1;
    static String team4 = "FC Awesome";
    static int score4 = 0;
    static String team5 = "Lions";
    static int score5 = 1;
    static String team6 = "Grouches";
    static int score6 = 0;


    static String teamRes1 = "Win";
    static String teamRes2 = "Draw";
    static String teamRes3 = "Lose";
    static String teamRes4 = "Win";
    static String teamRes5 = "Draw";
    static String teamRes6 = "Lose";

    static int winPoints = 3;
    static int drawPoints = 1;
    static int losePoints = 0;

    public static void main(String[] args) {

        HashMap<String, Integer> scoreBoard = new HashMap<>();
        scoreBoard.put(team1, score1);
        scoreBoard.put(team2, score2);
        scoreBoard.put(team3, score3);
        scoreBoard.put(team4, score4);
        scoreBoard.put(team5, score5);
        scoreBoard.put(team6, score6);

        System.out.println(scoreBoard);

        System.out.println();
        System.out.println("MATCHES:");
        System.out.println("Match 1: " + team1 + " VS " + team6);
        System.out.println("Outcome: " + '\n' + team1 + " " + teamRes1 + '\n' + team6 + " " + teamRes6);

        System.out.println();
        System.out.println("Match 2: " + team2 + " VS " + team5);
        System.out.println("Outcome: " + '\n' + team2 + " " + teamRes2 + '\n' + team5 + " " + teamRes5);

        System.out.println();
        System.out.println("Match 3: " + team3 + " VS " + team4);
        System.out.println("Outcome: " + '\n' + team3 + " " + teamRes3 + '\n' + team4 + " " + teamRes4);

        matchPoints1();
        matchPoints2();
        matchPoints3();
        scoreBoard.put(team1, score1);
        scoreBoard.put(team2, score2);
        scoreBoard.put(team3, score3);
        scoreBoard.put(team4, score4);
        scoreBoard.put(team5, score5);
        scoreBoard.put(team6, score6);
        System.out.println();
        System.out.println(scoreBoard);
    }

    static void matchPoints1(){
        if(teamRes1.equalsIgnoreCase("Win") && teamRes6.equalsIgnoreCase("Lose")){
            score1 += winPoints;
        } else if(teamRes1.equalsIgnoreCase("Draw") && teamRes6.equalsIgnoreCase("Draw")){
            score1 += drawPoints;
            score6 += drawPoints;
        } else {
            score6 += winPoints;
        }
    }

    static void matchPoints2(){
        if(teamRes2.equalsIgnoreCase("Win") && teamRes5.equalsIgnoreCase("Lose")){
            score2 += winPoints;
        } else if(teamRes2.equalsIgnoreCase("Draw") && teamRes5.equalsIgnoreCase("Draw")){
            score2 += drawPoints;
            score5 += drawPoints;
        } else {
            score5 += winPoints;
        }
    }

    static void matchPoints3(){
        if(teamRes3.equalsIgnoreCase("Win") && teamRes4.equalsIgnoreCase("Lose")){
            score3 += winPoints;
        } else if(teamRes3.equalsIgnoreCase("Draw") && teamRes4.equalsIgnoreCase("Draw")){
            score3 += drawPoints;
            score4 += drawPoints;
        } else {
            score4 += winPoints;
        }
    }
}
