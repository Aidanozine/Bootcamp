/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public interface ZooRenovation {

    /*public*/ String projectName();  //public by default

    /*abstract*/ String status(); //abstract by default

    default void printStatus() {
        System.out.println("The " + projectName() + " project is " + status());
    }
}

class Zoo implements ZooRenovation{
    @Override
    public String projectName(){
        return "Joburg Zoo";
    }
    
    @Override
    public String status(){
       return "ongoing";
    }
    
    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.printStatus();
    }
}
