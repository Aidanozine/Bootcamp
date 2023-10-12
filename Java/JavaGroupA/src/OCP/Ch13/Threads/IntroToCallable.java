package OCP.Ch13.Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class IntroToCallable {
    public static void main(String[] args) throws Exception {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get()); // 41
        } /*catch(Exception e){ //redundant because of "throws Exception
            System.out.println(e);
        }*/ finally {
            service.shutdown();
        }
        service.awaitTermination(1, TimeUnit.MINUTES);
        if(service.isTerminated()) System.out.println("Finished!");
        else System.out.println("At least one task is still running");
    }
}
