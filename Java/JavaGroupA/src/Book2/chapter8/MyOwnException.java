package Book2.chapter8;

public class MyOwnException {
    public static void main(String[] args) {
        try {
            doSomething(true);
        } catch (Exception error) {
            System.out.println("There's something screwy going on around here.");
        }
    }

//    public static void main(String[] args) {
//        try {
//            doSomething(true);
//        } catch (Exception error) {
//            System.out.println(error);
//        }
//    }

    public static void doSomething(boolean t)
            throws Exception
    {
        String name = "Ned";
        if (name.length() < 2);
        {
            throw new Exception("MASSIVE ERROR!!!! PLEASE HELP!!!");
        }
    }
}
