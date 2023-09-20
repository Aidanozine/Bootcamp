/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ig_book1.lesson7;

/**
 *
 * @author desmo
 */
public class ComparableStudent implements Comparable<ComparableStudent>{
    private String name;
    private long id = 0;
    private Double gpa = 0.0;
    
    public ComparableStudent (String name, long id, Double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    
    public String getName(){
        return name;
    }
    
    public long getId(){
        return id;
    }
    
    public Double getGpa(){
        return gpa;
    }
    
//    @Override
//    public int compareTo (Student s){
//        int result = this.name.compareTo(s.getName()); //ascending order of gpa
//        if (result > 0){
//            return 1;
//        } else if (result < 0){
//            return -1;
//        } else {
//            return 0;
//        }
//    }
    
     @Override
    public int compareTo (ComparableStudent s){
        int result = this.name.compareTo(s.getName()); //descending order of gpa
        if (result > 0){
            return -1;
        } else if (result < 0){
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.gpa;
    }
}
