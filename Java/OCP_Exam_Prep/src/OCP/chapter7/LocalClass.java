/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public class LocalClass {

    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {

            public int multiply() {
                return length * width * height;
            }
        }
//        width = 2; //would mean width isn't effectively final
    }
}
