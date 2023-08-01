package Book2.chapter3;

import java.util.Scanner;

public class MarblesApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //declarations
        int numOfMarbles;
        int numOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

        //get input data
        System.out.println("Let's divvy-up some marbles");
        System.out.print("Number of marbles: ");
        numOfMarbles = sc.nextInt();
        System.out.println("Number of children: ");
        numOfChildren = sc.nextInt();

        //Result calculation
        marblesPerChild = numOfMarbles / numOfChildren;
        marblesLeftOver = numOfMarbles - (numOfChildren * marblesPerChild);

        //Present results
        System.out.println("Give each child " + marblesPerChild + " marbles.");
        System.out.println("You will have " + marblesLeftOver + " marbles left.");
    }
}
