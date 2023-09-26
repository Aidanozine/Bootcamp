/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

import OCP.chapter5.pond.goose.Gosling;
import OCP.chapter5.pond.goose.LostDuckling;
import OCP.chapter5.pond.inland.BirdWatcherFromAfar;
import OCP.chapter5.pond.shore.BirdWatcher;
import OCP.chapter5.pond.swan.Swan;

/**
 *
 * @author desmo
 */
public class PondTest {
    public static void main(String[] args) {
        Gosling gosling = new Gosling();
        gosling.swim();
        BirdWatcher birdWatcher = new BirdWatcher();
        birdWatcher.watchBird();
        BirdWatcherFromAfar bwaf = new BirdWatcherFromAfar();
        bwaf.watchBird();
        Swan swan = new Swan();
        swan.helpOtherBird();
        swan.helpOtherSwan();
        new LostDuckling().swim();
    }
}
