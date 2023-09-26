/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter4;

/**
 *
 * @author desmo
 */
public class MethodChaining {

    public static void main(String[] args) {
        var start = "AniMaL ";
        var trimmed = start.trim(); // "AniMaL"
        var lowercase = trimmed.toLowerCase(); // "animal"
        var result = lowercase.replace('a', 'A'); // "AnimAl"
        System.out.println(result);

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
