package OCP.Ch13.Threads;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepishManager {
// private int sheepCount = 0;
// private void incrementAndReport(){
//     System.out.println((++sheepCount) + " sheep");
// }
//
//    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(20);
//        try{
//            SheepishManager manager = new SheepishManager();
//            for(int i = 0; i < 10; i++){
//                service.submit(() -> manager.incrementAndReport());
//            }
//        } finally{
//            service.shutdown();
//        }
//    }
//-----------------------------------------------------------
//    private volatile int sheepCount = 0;
//    private void incrementAndReport(){
//        System.out.println((++sheepCount) + " mental sheep");
//    }
//
//    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(20);
//        try{
//            SheepishManager manager = new SheepishManager();
//            for(int i = 0; i < 10; i++){
//                service.submit(() -> manager.incrementAndReport());
//            }
//        } finally{
//            service.shutdown();
//        }
//    }
//---------------------------------------------------------
//private AtomicInteger sheepCount = new AtomicInteger();
//    private void incrementAndReport(){
//        System.out.println(sheepCount.incrementAndGet() + " atomic sheep");
//    }
//
//    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(20);
//        try{
//            SheepishManager manager = new SheepishManager();
//            for(int i = 0; i < 10; i++){
//                service.submit(() -> manager.incrementAndReport());
//            }
//        } finally{
//            service.shutdown();
//        }
//    }
//--------------------------------------------------------------------------
//private int sheepCount = 0;
// private void incrementAndReport() {
//         synchronized(this) {
//             System.out.print((++sheepCount)+" ");
//             }
//         }
// public static void main(String[] args) {
//         ExecutorService service = Executors.newFixedThreadPool(20);
//        try {
//             var manager = new SheepishManager();
//             for(int i = 0; i < 10; i++)
//                 service.submit(() ->
//                    manager.incrementAndReport());
//             } finally {
//             service.shutdown();
//             } }
//-----------------------------------------------------------
private int sheepCount = 0;
    private void incrementAndReport() {
        synchronized(this) {
            System.out.print((++sheepCount)+" ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            var manager = new SheepishManager();
            for(int i = 0; i < 10; i++)
                service.submit(() ->
                        manager.incrementAndReport());
        } finally {
            service.shutdown();
        } }
}
