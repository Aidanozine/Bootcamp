package Book4.chapter2;

public class EnhancedLoop {
//    public static void main(String[] args) {
//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
//                "Friday", "Saturday", "Sunday"};
//
//        for (String d : days) {
//            System.out.println(d);
//        }
//    }

    public static void main(String[] args) {
        String[] daysOfWeek = getDaysOfWeek();
        printStringArray(getDaysOfWeek());
    }
    public static String[] getDaysOfWeek() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        return days;
    }

    public static void printStringArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
