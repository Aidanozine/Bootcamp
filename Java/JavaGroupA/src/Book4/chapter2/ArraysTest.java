package Book4.chapter2;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] startValues = new int[10];
        Arrays.fill(startValues, 100);
        for (int i: startValues) {
            System.out.println(i);
        }
    }
}
