package Book2.chapter2;

public class EnumTest {
    public static enum CardSuite {HEARTS, SPADES, CLUBS, DIAMONDS}

    public static void main(String[] args) {
        CardSuite suite;
        suite = CardSuite.HEARTS;
        System.out.println("The suite is " + suite);
    }
}
