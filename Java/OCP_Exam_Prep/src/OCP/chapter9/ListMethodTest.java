/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author desmo
 */
public class ListMethodTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        list.add(0, "NY"); // [NY,SD]
        list.set(1, "FL"); // [NY,FL]
        System.out.println(list.get(0)); // NY
        System.out.println(list);
        list.remove("NY"); // [FL]
        list.remove(0); // []
//        list.set(0, "?"); // IndexOutOfBoundsException
//        var number = Arrays.asList(1, 2, 3);
//        System.out.println(number);
//        number.replaceAll(e -> e * 2);
//        System.out.println(number);

        List<String> list2 = new ArrayList<>();
        list2.add("Wolk");
        list2.add("Jakkal");
        Object[] objectArray = list2.toArray();
        String[] stringArray = list2.toArray(new String[0]);
        System.out.println(list2);
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2
        list2.clear();
        System.out.println(list2);
    }
}
