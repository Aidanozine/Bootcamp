/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 *
 * @author desmo
 */
public class TryWithResources {

    public static void main(String[] args) throws IOException {
//        try (var in = new FileInputStream("data.txt");
//                var out = new FileOutputStream("out.txt");) {
//        }
//--------------------------------------------------------------
//        try (MyFileClass ab = new MyFileClass(1);
//                MyFileClass cd = new MyFileClass(2)) {
//        }
//--------------------------------------------------------------
//        Scanner s2 = new Scanner(System.in); //needs to be defined here to be accessible in try-catch block
//        try (Scanner s = new Scanner(System.in)) {
//            s.nextLine();
//        } catch (Exception e) {
////            s.nextInt(); //won't compile
//            s2.nextInt();
//        } finally {
////            s.nextInt(); //won't compile
//            s2.nextInt();
//        }
//--------------------------------------------------------------
//        try (MyFileClass bookReader = new MyFileClass(1); MyFileClass movieReader = new MyFileClass(2)) {
//            System.out.println("Try Block");
//            throw new RuntimeException();
//        } catch (Exception e) {
//            System.out.println("Catch Block");
//        } finally {
//            System.out.println("Finally Block");
//        }
//--------------------------------------------------------------
//        final var bookReader = new MyFileClass(4);
//        MyFileClass movieReader = new MyFileClass(5);
//        try (bookReader;
//                var tvReader = new MyFileClass(6); movieReader) {
//            System.out.println("Try Block");
//        } finally {
//            System.out.println("Finally Block");
//        }
//--------------------------------------------------------------
        try (var t = new TurkeyCage()) {
            System.out.println("Put turkeys in");
        }
        
//        try (JammedTurkeyCage j = new JammedTurkeyCage()) {
//            System.out.println("Put turkeys in");
//        } catch (IllegalStateException e) {
//            System.out.println("Caught: " + e.getMessage());
//        }

        try (JammedTurkeyCage j = new JammedTurkeyCage()) {
            throw new IllegalStateException("Ran off");
        } catch (IllegalStateException e) {
            for (Throwable j : e.getSuppressed()) {
                System.out.println("Suppressed: " + j.getMessage());
            }
        }
    }

}

class MyFileClass implements AutoCloseable {

    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() {
        System.out.println("Closing: " + num);
    }
}

class TurkeyCage implements AutoCloseable {

    public void close() {
        System.out.println("Close gate");
    }
}

class JammedTurkeyCage implements AutoCloseable {

    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");

    }
}
