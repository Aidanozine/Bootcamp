/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter3;

/**
 *
 * @author desmo
 */
public class ContinueStatement {

    public static void main(String[] args) {
//        Which statements, when inserted independently into the following blank, will cause the code
//to print 2 at runtime? (Choose all that apply.)

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++) {
            RABBIT:
            for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0) {
                    continue BUNNY;
                }
                count++;
            }
        }
        System.out.println(count);

//A. break BUNNY
//B. break RABBIT <CORRECT>
//C. continue BUNNY <CORRECT>
//D. continue RABBIT
//E. break <CORRECT>
//F. continue
//G. None of the above, as the code contains a compiler error.
    }
}
