/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class Methods {

    public static void main(String[] args) {
        long h = getHeight();
        System.out.println(h);
    }

//    public class Trip {
//
//        public void visitZoo(String name, int waitTime) {
//        }
//
//        public void visitZoo(String attraction, int rainFall) {
//        } // DOES NOT COMPILE -- Refer to below
//    }
    
    public class Trip {

        public void visitZoo(String name, int waitTime) {
        }

        public void visitZoo(int rainFall, String attraction) {
        } //Content is ordered differently
    }
    
    public class Students{
        public void classAttendance(String name, int daysPresent){
        }
        
        public void classAttendance(boolean present, String dayOfWeek){
        }
    }
    
    public static long getHeight(){
        long height = 9L;
        return height;
    }

    public class Measurement {

        public class Measurements {

            int getHeight1() {
                int temp = 9;
                return temp;
            }
//int getHeight2() {
//int temp = 9L; // DOES NOT COMPILE
//return temp; //trying to put a long in an int
//}
//int getHeight3() {
//long temp = 9L; // DOES NOT COMPILE
//return temp; //trying to return a long when an int is expected
//}
        }
    }
}
