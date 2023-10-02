/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7.SealedClasses;

/**
 *
 * @author desmo
 */
public sealed class Antelope /*permits Gazelle*/{} //doesn't need to permit if in the same file or within the sealed class

final class Gazelle extends Antelope {}

//public class George extends Gazelle {} // DOES NOT COMPILE




//non-sealed interface Wildebeast extends Antelope {}public sealed interface Antelope permits Gazelle, Wildebeast{} //doesn't need to permit if in the same file or within the sealed class
//
//final class Gazelle implements Antelope {}
//
////public class George extends Gazelle {} // DOES NOT COMPILE
//
//non-sealed interface Wildebeast extends Antelope {}


