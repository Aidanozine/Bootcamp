/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter4;

/**
 *
 * @author desmo
 */
public class Substrings {

    public static void main(String[] args) {
        var name = "animals";
        System.out.println(name.substring(3)); // mals
        System.out.println(name.substring(name.indexOf('m'))); // mals
        System.out.println(name.substring(3, 4)); // m
        System.out.println(name.substring(3, 7)); // mals
        System.out.println(name.substring(3, 3)); // empty string
//        System.out.println(name.substring(3, 2)); // exception
//        System.out.println(name.substring(3, 8)); // exception

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("C")); // false
        System.out.println("abc".endsWith("a")); // false
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        var sb1 = new StringBuilder().append("Hey");
        sb1.append(" ");
        sb1.append("C3PO");
        System.out.println(sb1);
        sb1.insert(5, "-");
        sb1.insert(9, "!");
        System.out.println(sb1);
        sb1.delete(0, 4);
        System.out.println(sb1);
        sb1.deleteCharAt(5);
        System.out.println(sb1);
        sb1.insert(5, " :P");
        System.out.println(sb1);
        sb1.replace(0, 5, "R2D2");
        System.out.println(sb1);

        String s = sb1.insert(2, "-").toString();
        System.out.println(s);

        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two); // false -- different objects
        System.out.println(one == three); // true -- content differs, but same objects

        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x.equals(z)); // true
        System.out.println(x == z); //false

        var x1 = new StringBuilder("Hello World");
        var z1 = new StringBuilder("Hello World");
        System.out.println((x).equals(z1)); // false
        System.out.println(x1 == z1); //false
        System.out.println((x.toString()).equals((z1.toString()))); // true

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); //true
        System.out.println(first == second.intern()); //true
        System.out.println(first == third);  //false
        System.out.println(first == third.intern()); //true
    }
}
