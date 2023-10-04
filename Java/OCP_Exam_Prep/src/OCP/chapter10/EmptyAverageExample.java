/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.Optional;

/**
 *
 * @author desmo
 */
public class EmptyAverageExample {

    public static void main(String[] args) {
//        Optional<Double> optionalScore = average(93, 15, 65);
//        if (optionalScore.isPresent()) {
//            System.out.println(optionalScore.get());
//        } else {
//            System.out.println("There are no scores present.");
//        }

//        Optional<Double> opt = average();
//        System.out.println(opt.orElse(Double.NaN));
//        System.out.println(opt.orElseGet(() -> Math.random()));
//        Optional<Double> opt = average();
//        System.out.println(opt.orElseThrow());

        Optional<Double> opt = average();
        System.out.println(opt.orElseThrow(() -> new IllegalStateException())); 
    }

    public static Optional<Double> average(int... scores) { //"..." unspecified number of inputs / array of int
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
//        return Optional.of((double) sum / scores.length); // .of((double) sum / scores.length) is the factory method
//        // type of factory method must match that of return type

        return Optional.ofNullable((double) sum / scores.length); //is factory method containing : Optional o = (value == null) ? Optional.empty() : Optional.of(value)
    }
}
