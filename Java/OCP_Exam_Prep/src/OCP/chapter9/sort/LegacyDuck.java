/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.sort;

/**
 *
 * @author desmo
 */
public class LegacyDuck implements Comparable {
    private String name;
    private int id;
    
    @Override
    public int compareTo(Object obj){
        LegacyDuck d = (LegacyDuck)obj;
        return name.compareTo(d.name);
    }
    
    public int compareTo(LegacyDuck l) {
        return id - l.id; // sorts ascending by id
    }
    
    public static void main(String[] args) {
        var legacyD1 = new LegacyDuck();
        var legacyD2 = new LegacyDuck();
        legacyD1.id = 6;
        legacyD2.id = 9;
        System.out.println(legacyD1.compareTo(legacyD2));
        System.out.println(legacyD1.compareTo(legacyD1));
        System.out.println(legacyD2.compareTo(legacyD1));
    }
}