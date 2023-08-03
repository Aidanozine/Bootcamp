package Book2.chapter8;

public class MyOwnException {
    public static void main(String[] args) {
        try {
            doAThing(true);
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    public static void doAThing(boolean t)
        throws Exception {
            if (t)
                throw new Exception();
        }
    }
