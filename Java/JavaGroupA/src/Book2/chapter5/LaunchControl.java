package Book2.chapter5;

public class LaunchControl {
    public static void main(String[] args) {
        int count;
        System.out.println("We are launching in T minus ");
        for ( count = 10; count >= 0; count--) {
            if (count == 8) {
                System.out.println("Ignition sequence start!");
            } else {
                System.out.println(count + "...");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("All engines running!");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("AAAAAAAND!! WE HAVE LIFTOFF!!!!");
    }
}
