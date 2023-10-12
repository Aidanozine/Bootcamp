package OCP.Ch13.Threads;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestConcurrentCollections {
    public static void main(String[] args) {
//        var foodData = new HashMap<String, Integer>(); //throws exception
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        for(String key: foodData.keySet())
//            foodData.remove(key);
//----------------------------------------------------------
//        var foodData = new ConcurrentHashMap<String, Integer>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        System.out.println("Before: " + foodData);
//        for(String key: foodData.keySet()){
//            foodData.remove(key);
//        }
//        System.out.println("After: " + foodData);
//----------------------------------------------------------
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " "); // 4 3 42
            favNumbers.add(n+1);
        }
        System.out.println();
        System.out.println("Size: " + favNumbers.size()); // Size: 6 --> includes whitespace (4_3_42)
    }
}
