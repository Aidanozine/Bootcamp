/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

/**
 *
 * @author desmo
 */
public class ConstructorMethod {

    public static void main(String[] args) {
        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String();

        var myString = methodRef.create();
        System.out.println(myString.equals("Snake")); // false
        
        StringCopier clone = String::new;
        StringCopier beta = (s) -> new String(s);
        System.out.println(clone.copy("Snail"));
    }
}

@FunctionalInterface
interface EmptyStringCreator{
    String create();
}

@FunctionalInterface
interface StringCopier{
    String copy(String value);
}
