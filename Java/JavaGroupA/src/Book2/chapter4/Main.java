package Book2.chapter4;

public class Main {
    public static void main(String[] args) {
        int appleCount = 1;

        String msg = "You have " + appleCount + " apple"
                + ((appleCount>1) ? "s." : ".");
        System.out.println(msg);

        String answer = "yes!";
        if (answer.equalsIgnoreCase("Yes!")) {
            System.out.println("They are equal.");
        }
        }
}
