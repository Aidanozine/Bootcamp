/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5.pond.duck;

import OCP.chapter5.pond.goose.Gosling;
import OCP.chapter5.pond.inland.BirdWatcherFromAfar;
import OCP.chapter5.pond.shore.BirdWatcher;
import OCP.chapter5.pond.swan.Swan;

/**
 *
 * @author desmo
 */

public class DuckTest {
    public static void main(String[] args) {
        GoodDuckling duck = new GoodDuckling();
        duck.makeNoise();
        BadDuckling duck2 = new BadDuckling();
        duck2.makeNoise();
    }
}
