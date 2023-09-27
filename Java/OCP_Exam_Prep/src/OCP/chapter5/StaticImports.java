/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

import java.util.Date;
//import java.sql.Date; //will complain in Case 1

/**
 *
 * @author desmo
 */
public class StaticImports {

    public static void main(String[] args) {
//        Date date = new Date(); //Case 1
        java.util.Date date = new java.util.Date(); // makes import redundant
    }
}
