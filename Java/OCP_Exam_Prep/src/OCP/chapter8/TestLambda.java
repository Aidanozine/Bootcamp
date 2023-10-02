/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

/**
 *
 * @author desmo
 */
//public class TestLambda {
//    public static void main(String[] args) {
//        ImplementTest imp = new ImplementTest();
//        print(imp);
//    }
//    
//    static void print(ImplementTest imp){
//        System.out.println(imp.test("Have", 1, 3.14));
//    }
//}
//
//interface InterfaceA{
//    boolean test(String s, int i, Double d);
//}
//
//class ImplementTest implements InterfaceA{
//    public boolean test(String s, int i, Double d){
//        return s.contains("Have");
//    }
//}

public class TestLambda {
    public static void main(String[] args) {
        ImplementTest imp = new ImplementTest();
        print(imp);
    }
    
    static void print(InterfaceA interf){
        System.out.println(interf.test("Have", 1, 3.14));
    }
}

interface InterfaceA{
    boolean test(String s, int i, Double d);
}

class ImplementTest implements InterfaceA{
    public boolean test(String s, int i, Double d){
        return s.contains("Have");
    }
}