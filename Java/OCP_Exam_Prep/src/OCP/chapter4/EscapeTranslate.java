/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter4;

/**
 *
 * @author desmo
 */
public class EscapeTranslate {
    public static void main(String[] args) {
        var str = "dogs go \"woof\"";
        System.out.println(str);
        
        var str2 = "1 \\n 2";
        System.out.println(str2);
        System.out.println(str2.translateEscapes());
    }
}
