/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class StaticInitializers {

    private static final int SEC_PER_MIN;
    private static final int MIN_PER_HOUR;
    private static final int SEC_PER_HOUR;

    static {
        SEC_PER_MIN = 60;
        MIN_PER_HOUR = 60;
    }

    static {
        SEC_PER_HOUR
                = SEC_PER_MIN * MIN_PER_HOUR;
    }
}
