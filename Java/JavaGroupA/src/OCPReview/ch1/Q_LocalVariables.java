package OCPReview.ch1;

import java.util.Arrays;

public class Q_LocalVariables {
    public static void main(String[] args) {
        final int y = 10;
        int x = 20;
//        y = x + 10; //can't change value of y: is final

        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
//        favoriteNumbers = null; // DOES NOT COMPILE
        System.out.println(Arrays.toString(favoriteNumbers));

        findAnswer(true);
        findAnswer(false);
    }

    //////////////////////////////////////////////
    // Uninitialized Local Variables
    // So ALL Local variables do NOT have a default value and MUST be initialized before use.
    // Whereas the opposite is true for instance variables.
    public int notValid() {
        int y = 10;
        int x;
//        int reply = x + y; // DOES NOT COMPILE
//        return reply;
        return 0;
    }

    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // x is initialized here
        int z; // z is declared here but never initialized or used
        int reply = x + y;
        return reply;
    }

    public static void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}