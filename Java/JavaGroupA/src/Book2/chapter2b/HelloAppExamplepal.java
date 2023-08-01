package Book2.chapter2b;

import Book2.chapter2.HelloAppExample;

public class HelloAppExamplepal {
    public static void main(String[] args) {
        HelloAppExample h = new HelloAppExample();
        h.helloMessage = "hi there";
        System.out.println(h.helloMessage);

        System.out.println(HelloAppExample.helloMessage2);

        HelloAppExample.main(args);
    }
}
