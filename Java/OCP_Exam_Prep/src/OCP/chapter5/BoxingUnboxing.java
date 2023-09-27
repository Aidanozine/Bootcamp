/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class BoxingUnboxing {

//    int quack = 5;
//    Integer quackquack = Integer.valueOf(quack); // Convert int to Integer Autoboxing - primitive to wrapper
//    int quackquackquack = quackquack.intValue(); // Convert Integer to int Unboxing - wrapper to primitive
    int quack = 5;
    Integer quackquack = quack; // Autoboxing - primitive to wrapper
    int quackquackquack = quackquack; // Unboxing - wrapper to primitive

    Short tail = 8; // Autoboxing
    Character p = Character.valueOf('p');
    char paw = p; // Unboxing
    Boolean nose = true; // Autoboxing
    Integer e = Integer.valueOf(9);
    long ears = e; // Unboxing, then implicit casting
    
//    Long badGorilla = 8; // DOES NOT COMPILE - Long is wrapper long
    //can't convert int -> long then long -> Long OR int -> Integer then Integer -> Long simultaneously
}
