package Book2.chapter8;

public class CrazyWithZeros {
    public static void main(String[] args) throws Exception {
        try {
            int answer = divideTheseNumbers(5,0);
        } catch (Exception e) {
            System.out.println("Tried twice " + "\nStill didn't work.");
        }
    }

    public static int divideTheseNumbers(int a, int b)
        throws Exception {
        int c;
        try {
            c = b/a;
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println("No dice." + "\nTry again.");
            c = a/b;
            System.out.println("Success!" + "\nSecond time's the charm!");
        } finally {
            System.out.println("Time to clean-up shop.");
        }
        System.out.println("It worked all along!");
        return c;
    }
}
