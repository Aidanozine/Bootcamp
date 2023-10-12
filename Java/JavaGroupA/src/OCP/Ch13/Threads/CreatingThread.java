package OCP.Ch13.Threads;

public class CreatingThread {
    public static void main(String[] args) {
//        new Thread(() -> System.out.print("Hello")).start();
//        System.out.print("World");
//        ---------------------------------------------------------
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () ->
        {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        System.out.println("begin");
         new Thread(printInventory).start();
         new Thread(printRecords).start();
         new Thread(printInventory).start();
         System.out.println("end");
        //--------------------------------------------------------
         }
    }

class Zoo {
    public static void pause() { // Defines the thread task
        try {
            Thread.sleep(10_000); // Wait for 10 seconds
        } catch (InterruptedException e) {
        }
        System.out.println("Thread finished!");
    }
    public static void main(String[] args) {
        var job = new Thread(() -> pause()); // Create thread
//        job.setDaemon(true);
        System.out.println(job.getState());
        job.start(); // Start thread
        System.out.println(job.getState());
        System.out.println("Main method finished!");
        System.out.println(job.getState());
    }
}
