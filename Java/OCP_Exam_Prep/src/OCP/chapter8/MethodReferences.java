/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

/**
 *
 * @author desmo
 */
//interface LearnToSpeak{
//    void speak(String sound);
//}
//
//public class MethodReferences{
//    public static void main(String[] args) {
//        Duckling.makeSound("Hi! I'm Donald!");
//    }
//}
//
//class DuckHelper {
//    public static void teacher(String name, LearnToSpeak trainer){
//        trainer.speak(name);
//    }
//}
//
//class Duckling{
//    public static void makeSound(String sound) {
//        LearnToSpeak learner = System.out::println;
//        DuckHelper.teacher(sound, learner);
//    }
//}


interface LearnToSpeak{
    void speak(String sound);
}

public class MethodReferences{
    public static void main(String[] args) {
//        Duckling.makeSound("Hi! I'm Donald!"); //class Duckling no longer needed
        LearnToSpeak l = s -> { /*------can have multiple prints with this------*/
            System.out.println(s); //makes class Duckling redundant with Line 43
        /*------just remember each line must have a ";"------*/};
        DuckHelper.teacher("Hi! I'm Donald!", l); //makes class Duckling redundant with Line 42
    }
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer){
        trainer.speak(name);
    }
}

//class Duckling{ //made redundant by Line 42 - 43
//    public static void makeSound(String sound) {
//        LearnToSpeak learner = System.out::println;
//        DuckHelper.teacher(sound, learner);
//    }
//}
