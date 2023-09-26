/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter4;

/**
 *
 * @author desmo
 */
public class FormattingValues {

    public static void main(String[] args) {
        var name = "Kate";
        var orderId = 5;
// All print: Hello Kate, order 5 is ready
        System.out.println("Hello " + name + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready",
                name, orderId));
        System.out.println("Hello %s, order %d is ready"
                .formatted(name, orderId));

        var name1 = "James";
        var score = 90.25;
        var total = 100;
        System.out.println(String.format("%s:%n Score: %f out of %d", name1, score, total));
        System.out.println("%s:%n Score: %f out of %d".formatted(name1, score, total));
        System.out.println("%s:%n Score: %.2f out of %d".formatted(name1, score, total));
        System.out.println("%8.2f".formatted(score));

        var pi = 3.14159265359;
        System.out.println(("[%f]".formatted(pi))); // [3.141593]
        System.out.println(("[%12.8f]".formatted(pi))); // [ 3.14159265]
        System.out.println(("[%012f]".formatted(pi))); // [00003.141593]
        System.out.println(("[%12.2f]".formatted(pi))); // [ 3.14]
        System.out.println(("[%.3f]".formatted(pi))); // [3.142]
    }
}
