package Book2.chapter2;

//public class HelloApp2pal {
//        public static String helloMessage = "Sup";/*needs "public" for HelloApp2 to use without creating an instance*/
//
//    public static void main(String[] args)
//        {
//            helloMessage = "Hello, World!";
//            System.out.println(helloMessage);
//        }
//}

public class HelloApp2pal {
    public static String helloMessage = "Sup";/*needs "public" for HelloApp2 to use without creating an instance*/

    public static void main(String[] args)
    {
        HelloApp happ = new HelloApp();
        happ.helloMessage = "Hello, World!";
        System.out.println(happ.helloMessage);

        HelloApp happ2 = new HelloApp();
        happ2.helloMessage = "Hello, Earth!";
        System.out.println(happ2.helloMessage);
    }
}