/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 *
 * @author desmo
 */
public class IntStreamTest {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average(); //converting intStream into a Double
        if(avg.isPresent()){
            System.out.println(avg.getAsDouble());
        }
    }
}
