/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author desmo
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(4); // offer works same as add
        System.out.println(queue.peek());
        System.out.println(queue.remove()); // 10: first in -> first out
        System.out.println(queue.peek()); // 4: last in -> last out
    }
}
