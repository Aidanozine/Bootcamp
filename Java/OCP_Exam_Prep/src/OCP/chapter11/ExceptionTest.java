/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

import java.io.IOException;

/**
 *
 * @author desmo
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            fall(12);
        } catch (IOException e) {
            System.out.println(e);
        }
//-------------------------------------------------
//        fall(null);
    }

    static void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }

    }
}
