/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";
        tickets = addTickets(tickets); //"tickets = " is VERY important to update current value
        guests = addGuests(guests);
        System.out.println(tickets + guests);
    }
    
    public static int addTickets(int tickets){
        tickets++;
        return tickets;
    }
    
    public static String addGuests(String guests){
        guests += "d";
        return guests;
    }
}
