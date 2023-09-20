/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ig_book1.lesson7;

import java.util.*;

/**
 *
 * @author desmo
 */
public class TestComparable {
    public static void main(String[] args) {
        Set<ComparableStudent> studentList = new TreeSet<>();
        
        studentList.add(new ComparableStudent("Peter Parker", 1111L, 4.0));
        studentList.add(new ComparableStudent("Flash Tompson", 2222L, 2.1));
        studentList.add(new ComparableStudent("Harry Osborn", 3333L, 3.6));
        
        for (ComparableStudent student:studentList){
            System.out.println(student);
        }
    }
}
