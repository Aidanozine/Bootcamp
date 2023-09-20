/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ig_book1.lesson7;

import java.util.*;
import java.util.Collections;

/**
 *
 * @author desmo
 */
public class TestComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        
        studentList.add(new Student("Peter Parker", 1111L, 4.0));
        studentList.add(new Student("Flash Tompson", 2222L, 2.1));
        studentList.add(new Student("Harry Osborn", 3333L, 3.6));
        
        System.out.println("===Sorting Names===");
        
        Collections.sort(studentList, sortName);
        for (Student student:studentList){
            System.out.println(student);
        }
        
        System.out.println("===Sorting GPA===");
        
        Collections.sort(studentList, sortGpa);
        for (Student student:studentList){
            System.out.println(student);
        }
    }
}
