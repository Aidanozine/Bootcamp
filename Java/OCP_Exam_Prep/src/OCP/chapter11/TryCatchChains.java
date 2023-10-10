/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

/**
 *
 * @author desmo
 */
public class TryCatchChains {
    public static void main(String[] args) {
        visitPorcupine();
    }
    
    static void visitPorcupine(){
        try{
            seeAnimals();
        } catch(OutToLunch e){
            System.out.println("Back in 5.");
            System.out.println("If not, read this again.");
        } catch(EnclosureClosedForCleaning e){
            System.out.println("Sanitation is very important to us.");
        } catch(EnclosureCleaning e){
            System.out.println("Sanitation is very important to us.");
        } /*catch(EnclosureClosedForCleaning e){ //won't compile if after EnclosureCleaning
            System.out.println("Sanitation is very important to us.");
        }*/
    }
    
    static void seeAnimals(){
        System.out.println("Whoa! That's so cool!");
    }
}

class OutToLunch extends RuntimeException{}

class EnclosureClosedForCleaning extends RuntimeException{}

class EnclosureCleaning extends RuntimeException{}
