/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author desmo
 */
public class ExceptionsAndInterfaces {

    public void good() throws IOException {
        ExceptionCaseStudy.create().stream().count();
    }

    public void bad() throws IOException {
        Supplier<List<String>> s;
//= ExceptionCaseStudy::create; // DOES NOT COMPILE
    }

    public void wrapped() {
        Supplier<List<String>> s2 = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }

    class ExceptionCaseStudy {

        private static List<String> create() throws IOException {
            throw new IOException();
        }
    }
}
