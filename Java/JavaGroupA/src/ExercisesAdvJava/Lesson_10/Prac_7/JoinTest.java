package ExercisesAdvJava.Lesson_10.Prac_7;

import java.util.List;
import java.util.stream.Collectors;

public class JoinTest {

    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        // Print out a sorted Buyer's List
        System.out.println("=== Sorted Buyer's List ===");
        String result = tList.stream()
                .map(t -> t.getBuyerName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println("Buyer list: " + result);




    }
}
