/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public class Snake implements IsColdBlooded {

    @Override
    public boolean hasScales() { // Required override
        return true;
    }

    @Override
    public double getTemperature() { // Optional override
        return 12;
    }
    
    public static void main(String[] args) {
        Snake s = new Snake();
        System.out.println("Has scales: " + s.hasScales());
        System.out.println("Body temp: " + s.getTemperature());
    }
}

interface IsColdBlooded {

    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}
