/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ig_book1.lesson7;


/**
 *
 * @author desmo
 */
public class Student{
    private String name;
    private long id = 0;
    private Double gpa = 0.0;
    
    public Student (String name, long id, Double gpa){
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
    
    @Override
    public String toString(){
        return this.name + " " + this.gpa;
    }
}
