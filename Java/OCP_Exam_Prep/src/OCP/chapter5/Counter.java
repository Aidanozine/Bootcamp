/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        Counter c = new Counter();
        System.out.println(count);
    }
}
