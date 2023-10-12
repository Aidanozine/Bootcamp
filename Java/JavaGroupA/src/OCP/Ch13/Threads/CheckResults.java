package OCP.Ch13.Threads;

public class CheckResults {
    private static int counter = 0;
    public static void main(String[] args) {
        new Thread(() ->
        {
            for(int i = 0; i < 1_000_000; i++) counter++;
        }).start();
        while(counter < 1_000_000) {
            System.out.println("Not reached yet");
        }
        System.out.println("Reached: "+counter);
    }
}

class CheckResultsWithSleep{
    private static int counter = 0;
    public static void main(String[] a) {
       Thread t = new Thread();
       new Thread(() ->
        {
            for(int i = 0; i < 1_000_000; i++) counter++;
        });
        System.out.println(t.getState());
               t.start();
        System.out.println(t.getState());
        while(counter < 1_000_000) {
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1_000); // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reached: "+counter);
    }
}

class CheckResultsWithSleepAndInterrupted{
    private static int counter = 0;
    public static void main(String[] a) {
        final var mainThread = Thread.currentThread();
        new Thread(() ->
        {
            for(int i = 0; i < 1_000_000; i++) counter++;
            mainThread.interrupt();
        }).start();
        while(counter < 1_000_000) {
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1_000); // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reached: "+counter);
    }
}
