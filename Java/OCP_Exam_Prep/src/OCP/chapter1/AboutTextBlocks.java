/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter1;

/**
 *
 * @author desmo
 */
public class AboutTextBlocks {
    public static void main(String[] args) {
        String msg1 = """
                     Hey there, bro
                     Long time
                     No see
                     """;
        System.out.println("1:");
        System.out.println(msg1);
        
        String msg2 = """
                     Hey there, bro
                         Long time
                              No see
                     """;
        System.out.println("2:");
        System.out.println(msg2);
        
        String msg3 = """
                     Hey there, bro \
                         Long time \
                              No see
                     """;
        System.out.println("3:");
        System.out.println(msg3);
    }
}
