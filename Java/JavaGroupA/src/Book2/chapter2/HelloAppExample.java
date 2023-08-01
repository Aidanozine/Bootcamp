package Book2.chapter2;

public class HelloAppExample {
    public String helloMessage;

    public static String helloMessage2;

    public static void main(String[] args) {
        HelloAppExample h = new HelloAppExample();
        h.helloMessage = "Hello World";
        System.out.println(h.helloMessage);

        helloMessage2 = "Sup World";
        System.out.println(helloMessage2);
    }
}
