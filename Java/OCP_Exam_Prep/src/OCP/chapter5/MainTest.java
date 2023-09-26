/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

import OCP.chapter5.PenguinGrowthSpurt.Penguin;
import OCP.chapter5.pond.duck.DuckTest;

/**
 *
 * @author desmo
 */
public class MainTest {
    public static void main(String[] args) {
        PenguinGrowthSpurt.main(new String[6]);
        DuckTest.main(new String[6]);
        System.out.println(Snake.tongueThing);
        Snake.speakParcelTongue();
        Snake s = new Snake();
        s = null;
        s.speakParcelTongue();
    }
}
