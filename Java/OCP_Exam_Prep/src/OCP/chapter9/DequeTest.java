/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author desmo
 */
public class DequeTest {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        System.out.println(deque.offerFirst(10));//true
        System.out.println(deque.offerLast(4));//true
        System.out.println(deque.peekFirst());//10
        System.out.println(deque.pollFirst());//10
        System.out.println(deque.pollLast());//4
        System.out.println(deque.pollFirst()); //null
        System.out.println(deque.peekFirst());//null
        
        Deque<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack);
        stack.poll();
        stack.pop();
        System.out.println(stack);
    }
}
