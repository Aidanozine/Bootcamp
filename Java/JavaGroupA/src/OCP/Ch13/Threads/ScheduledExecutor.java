package OCP.Ch13.Threads;

import java.util.concurrent.*;

public class ScheduledExecutor {
    public static void main(String[] args) throws Exception{
//        ScheduledExecutorService service
//                = Executors.newSingleThreadScheduledExecutor();
//        Runnable task1 = () -> System.out.println("Hello Zoo");
//        Callable<String> task2 = () -> "Monkey";
//        ScheduledFuture<?> r1 = service.schedule(task1, 1, TimeUnit.SECONDS);
//        ScheduledFuture<?> r2 = service.schedule(task2, 6, TimeUnit.SECONDS);
//        System.out.println(r2.get());
        //-----------------------------------------------------
//        ScheduledExecutorService service
//                = Executors.newSingleThreadScheduledExecutor();
//        try{
//            Runnable task1 = () -> System.out.println("Hello Zoo");
//            Callable<String> task2 = () -> "Monkey";
//            ScheduledFuture<?> r1 = service.schedule(task1, 1, TimeUnit.SECONDS);
//            ScheduledFuture<?> r2 = service.schedule(task2, 6, TimeUnit.SECONDS);
//            System.out.println(r2.get());
//        } finally{
//            service.shutdown();
//        }
        //--------------------------------------------------------
//        ScheduledExecutorService service
//                = Executors.newSingleThreadScheduledExecutor();
//            Runnable task1 = () -> System.out.println("Hello Zoo");
//            Callable<String> task2 = () -> "Monkey";
//            service.scheduleWithFixedDelay(task1, 0, 1, TimeUnit.SECONDS);
        //-----------------------------------------------------------
        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Runnable task3 = () -> System.out.println("Hello Park");
        Callable<String> task2 = () -> "Monkey";
        Callable<String> task4 = () -> "Zebra";
        service.submit(task1);
        System.out.println(service.submit(task2).get(10, TimeUnit.SECONDS));
        service.submit(task3);
        System.out.println(service.submit(task4).get(10, TimeUnit.SECONDS));
    }
}
