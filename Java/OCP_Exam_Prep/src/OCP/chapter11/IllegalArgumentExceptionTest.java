/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

/**
 *
 * @author desmo
 */
public class IllegalArgumentExceptionTest {
int numberEggs;
    public static void main(String[] args) {
        IllegalArgumentExceptionTest iae = new IllegalArgumentExceptionTest();
        iae.setNumberEggs(-13);
    }

    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0) {
            throw new IllegalArgumentException("# eggs must not be negative");
        }
        this.numberEggs = numberEggs;
    }
}
