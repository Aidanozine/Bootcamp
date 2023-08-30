package Book4.chapter4;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<>();
//        officers.add("Razor");
//        officers.add("Cutter");
//        officers.add("Walsh");
//        officers.add("Lich");
//        officers.add("Delta");
//        officers.remove("Walsh"); //if (): removes first item by default
////        officers.clear();
//        System.out.println(officers);
//        officers.addLast("Razor"); //works same as "add"
//        officers.add("Cutter");
//        officers.addFirst("Walsh");
//        officers.add("Lich");
//        officers.addFirst("Delta");
////        officers.set(2, "Blade");
//        String removedItem = officers.set(2, "Blade");
//        for (String s : officers) {
//            System.out.println(s);
//        }
//        System.out.println("Removed item: " + removedItem);

        String tuttle = "Tuttle";
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");

        officers.add(2,tuttle);

        System.out.println(officers);
        officers.remove("Blake");
        System.out.println(officers);
        officers.remove(2);
        System.out.println(officers);
        officers.remove((tuttle));
        System.out.println(officers);
        officers.remove();
        System.out.println(officers);
        officers.clear();
        System.out.println("officers" + officers);
    }
}
