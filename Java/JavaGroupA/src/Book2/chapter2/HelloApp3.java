package Book2.chapter2;

public class HelloApp3 {
    public static void main(String[] args) {
        int x, taxRate = 10;
        double subTotal = 100;
        double total = 1000;
        if (taxRate > 0) {
            double taxAmount;
            taxAmount = subTotal + taxRate;
            total = subTotal + total;
            System.out.println(taxAmount);
    }
    }
}

//public class HelloApp3 {
//    public static void main(String[] args) {
//        int xInt;
//        long yLong;
//        xInt = 32;
//        yLong = xInt;
//        long xLong1 = 58473882;
//        long xLong2 = 58_473_882;
//    }
//}

//public class HelloApp3 {
//    public static void main(String[] args) {
//        int xInt;
//        long yLong;
//        yLong = 32;
//        xInt = yLong;
//        /*cannot do, yLong is longer than xInt*/
//        long xLong1 = 58473882;
//        long xLong2 = 58_473_882;
//    }
//}