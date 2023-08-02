package Book2.chapter3;

import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
//        int a = 21, b = 6;
//        double answer = a / b; // answer = 3.0
//        System.out.println(answer);

//        int a = 21, b = 6;
//        double answer = (int)a / b; // answer = 3.0
//        System.out.println(answer);

//        int a = 21, b = 6;
//        double answer = (double)a / b; // answer = 3.5
//        System.out.println(answer); //need at least one variable to be "double" to produce a decimal

//        double x = 29.4;
//        double y = 93.5;
//        double z = -19.3;
//
//        System.out.println("round(x): " + Math.round(x));
//        System.out.println("round(y): " + Math.round(y));
//        System.out.println("round(z): " + Math.round(z));
//        System.out.println("ceil(x): " + Math.ceil(x));
//        System.out.println("ceil(y): " + Math.ceil(y));
//        System.out.println("ceil(z): " + Math.ceil(z));
//        System.out.println("floor(x): " + Math.floor(x));
//        System.out.println("floor(y): " + Math.floor(y));
//        System.out.println("floor(z): " + Math.floor(z));
//        System.out.println("rint(x): " + Math.rint(x));
//        System.out.println("rint(y): " + Math.rint(y));
//        System.out.println("rint(z): " + Math.rint(z));

        float x = 0.1f;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x));
        // Answer isn't accurate with float
    }
}