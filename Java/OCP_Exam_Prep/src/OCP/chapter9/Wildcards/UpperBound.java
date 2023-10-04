/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.Wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desmo
 */
public class UpperBound {

    public static long total(List list) {
        long count = 0;
        for (Object obj : list) {
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<? extends Number> list1 = new ArrayList<Double>();
        ArrayList<? extends Number> list2 = new ArrayList<Integer>();
        
        total(list1);
        total(list2);
    }
}
