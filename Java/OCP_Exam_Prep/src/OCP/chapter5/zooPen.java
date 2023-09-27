/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class zooPen {
    private static final int NUM_BUCKETS = 45;
    
    public static void main(String[] args) {
        try{
        NUM_BUCKETS = 5;
        } catch(Exception e){
            System.out.println("Can't change final variable: " + e);}
    }
}
