/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
//public class ZooGiftShop {

//    abstract class SaleTodayOnly {
//
//        abstract int dollarsOff();
//    }
//
//    public int admission(int basePrice) {
//        SaleTodayOnly s = new SaleTodayOnly() {
//            int dollarsOff()
//            {
//                return 3;
//            }
//        };
//        return basePrice - s.dollarsOff();
//    }
//}
    
public class ZooGiftShop{    

     interface SaleTodayOnly {

        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly s = new SaleTodayOnly(){
            public int dollarsOff()
            {
                return 3;
            }
        };
        return basePrice - s.dollarsOff();
    }
}
