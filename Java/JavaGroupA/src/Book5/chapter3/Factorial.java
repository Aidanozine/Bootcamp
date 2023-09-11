package Book5.chapter3;

import java.util.Scanner;

public class Factorial {
    private static Scanner sc = new Scanner(System.in);
    private static long factorial (int n){
        long f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to get the factorial: ");
        int n = sc.nextInt();
        long fact;
        fact = factorial(n);
        System.out.println("Factorial of " + n + ": " + fact);
    }
}
