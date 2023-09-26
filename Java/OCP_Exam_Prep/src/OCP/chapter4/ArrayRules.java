/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter4;

import java.util.Arrays;

/**
 *
 * @author desmo
 */
public class ArrayRules {

    public static void main(String[] args) {
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        againStrings[0] = (new StringBuilder()).toString(); // COMPILEs
//        objects[0] = new StringBuilder(); // Careful!
        Object[] objectsA = new Object[2]; // "new Object[2]" helps
        objectsA[0] = new StringBuilder(); // Works now

        String[] mammals = {"Birds", "Horses", "Dogs"};
        System.out.println(mammals.length); //won't compile

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        System.out.println(Arrays.compare(new String[]{"1"}, new String[]{"a"})); // DOES NOT COMPILE

        System.out.println("First: ");
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));
        System.out.println("Second: ");
        System.out.println(Arrays.mismatch(new String[]{"a"},
                new String[]{"A"}));
        System.out.println("Third: ");
        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));

        int[][] vars1; // 2D array
        int vars2[][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4[], space[][]; // a 2D AND a 3D array
        
        int[][] rectangle = new int[3][2];
        int count = 0;
        System.out.println("Loop through array: ");
        for (int i = 0; i < rectangle.length; i++){
            for (int j = 0; j < rectangle[i].length; j++){
                rectangle[i][j] = count;
                System.out.println(count + " ");
                count++;
            }
        }
        
        System.out.println("Loop through other array: ");
        for (int i = 0; i < rectangle.length; i++){
            System.out.println();
            for (int j = 0; j < rectangle[i].length; j++){
                System.out.print(rectangle[i][j]);
            }
        } 
    }
}
