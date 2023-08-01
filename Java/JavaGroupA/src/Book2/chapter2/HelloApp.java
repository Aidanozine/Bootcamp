package Book2.chapter2;

//public class HelloApp {
//    static String helloMessage;
//    public static void main(String[] args)
//    {
//        helloMessage = "Hello, World!";
//        System.out.println(helloMessage);
//    }
//}

//public class HelloApp {
//    /*Cannot use*/
//    String helloMessage;
//    public void main(String[] args)
//    {
//        helloMessage = "Hello, World!";
//        System.out.println(helloMessage);
//    }
//}

//public class HelloApp {
//    String helloMessage;
//    public static void main(String[] args)
//    {
//        HelloApp ha = new HelloApp();
//        ha.helloMessage = "Hello, World!";
//        System.out.println(ha.helloMessage);
//    }
//}

public class HelloApp {
    String helloMessage;
    public static void main(String[] args)
    {
        String s = "5";
        int x = Integer.parseInt(s);
        float x2 = Float.parseFloat(s);
        double x3 = Double.parseDouble(s);

        System.out.println(x + " " + x2 + " " + x3);
    }
}

//public class HelloApp {
//    String helloMessage;
//    public static void main(String[] args)
//    {
//        double pi = 3.1314;
//        int iPi;
//        iPi = (int) pi;
//    }
//}