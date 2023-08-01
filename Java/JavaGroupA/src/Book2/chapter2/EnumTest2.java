package Book2.chapter2;

public class EnumTest2 {

    public static enum opinions {Good, Bad, Ugly}

    public static void main(String[] args) {
        opinions suite;
        suite = opinions.Bad;
        System.out.println("Your opinion of broccoli is: " + suite);
    }
}
