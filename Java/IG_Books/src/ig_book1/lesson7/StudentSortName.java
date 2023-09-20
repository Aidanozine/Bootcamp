/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ig_book1.lesson7;

import java.util.Comparator;

/**
 *
 * @author desmo
 */
public class StudentSortName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        int result = s2.getName().compareTo(s1.getName());
        return result;
    }
}
