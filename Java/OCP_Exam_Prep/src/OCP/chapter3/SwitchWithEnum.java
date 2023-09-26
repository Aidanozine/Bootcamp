/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter3;

/**
 *
 * @author desmo
 */
public class SwitchWithEnum {
    static enum Season {SPRING, SUMMER, AUTUMN, WINTER}
    
    public static void main(String[] args) {
        System.out.println(getWeather(Season.SUMMER));
    }
    
//    static String getWeather(Season value){
//        return switch(value){
//            case WINTER -> {yield "Brrrrrrrr";}
//            case SPRING -> {yield "Bees 'a buzzing";}
//            case SUMMER -> {yield "Wow! It's HOT";}
//            case AUTUMN -> {yield "Leaves cahnging colour";}
//        };
//    }
    
    static String getWeather(Season value){
        return switch(value){
            case WINTER -> "Brrrrrrrr";
            case SPRING -> "Bees 'a buzzing";
            case SUMMER -> "Wow! It's HOT";
            case AUTUMN -> "Leaves cahnging colour";
        };
    }
}
