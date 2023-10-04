/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desmo
 */
interface Flyer {

    void fly();
}

class HangGlider implements Flyer {

    public void fly() {
    }
}

class Goose implements Flyer {

    public void fly() {
    }
}

public class TestingGenericInterfaces {
 private void anyFlyer (List < Flyer > flyer) {}
    private void groupOfFlyers (List < ? extends Flyer > flyer){}

    public static void main(String[] args) {
        List<Flyer> flyers = new ArrayList<>();
        List<HangGlider> hangGliders = new ArrayList<>();
        List<Goose> geese = new ArrayList<>();

        TestingGenericInterfaces git = new TestingGenericInterfaces();
        git.anyFlyer(flyers);
//        git.anyFlyer(hangGliders);
//        git.anyFlyer(geese);

        git.groupOfFlyers(flyers);
        git.groupOfFlyers(hangGliders);
        git.groupOfFlyers(geese);

    }
}
