package Book5.chapter1;

//public class CountDownApp { //needs CountDownClock.java part1
//    public static void main(String[] args) {
//        Thread clock = new CountDownClock();
//        clock.start();
//    }
//}

//public class CountDownApp { //needs LaunchEvent.java part1
//    public static void main(String[] args) {
//        Thread clock = new CountDownClock();
//        Runnable flood, ignition, liftoff;
//        flood = new LaunchEvent(16, "Flood the launch pad!");
//        ignition = new LaunchEvent(6, "Prime the engines!");
//        liftoff = new LaunchEvent(0, "Liftoff!");
//
//        clock.start();
//        new Thread(flood).start();
//        new Thread(ignition).start();
//        new Thread(liftoff).start();
//    }
//}

//import java.util.ArrayList;
//
//public class CountDownApp { //needs LaunchEvent.java + CountDownClock.java part2
//    public static void main(String[] args) {
//        CountDownClock clock = new CountDownClock(20);
//        ArrayList<Runnable> events = new ArrayList<>();
//        events.add(new LaunchEvent(16, "Flood the launch pad!", clock));
//        events.add(new LaunchEvent(6, "Prime the engines!", clock));
//        events.add(new LaunchEvent(0, "Liftoff!", clock));
//        clock.start();
//        for (Runnable e : events) {
//            new Thread(e).start();
//        }
//    }
//}
//
//interface TimeMonitor{
//    int getTime();
//}

//class CountDownClock extends Thread implements TimeMonitor { //in CountDownClock.java
//    private int time;
//    public CountDownClock (int start){
//        this.time = start;
//    }
//
//    public void run(){
//        for (; time >= 0; time--){
//            System.out.println("T-minus :" + time);
//
//            try {
//                Thread.sleep(1000);
//            } catch(InterruptedException e) {}
//        }
//    }
//
//    public int getTime(){
//        return time;
//    }
//}

//class LaunchEvent implements Runnable { //in LaunchEvent.java
//    private int start;
//    private String message;
//    TimeMonitor tm;
//    public LaunchEvent(int start, String message, TimeMonitor monitor){
//        this.start = start;
//        this.message = message;
//        this.tm = monitor;
//    }
//
//    @Override
//    public void run(){
//        boolean eventDone = false;
//        while (!eventDone){
//            try {
//                Thread.sleep(10);
//            } catch(InterruptedException e) {}
//
//            if (tm.getTime() <= start){
//                System.out.println(this.message);
//                eventDone = true;
//            }
//        }
//    }
//}

import java.util.ArrayList;

public class CountDownApp { //needs LaunchEvent.java + CountDownClock.java part3
    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);
        ArrayList<Runnable> events = new ArrayList<>();
        events.add(new LaunchEvent(16, "Flood the launch pad!", clock));
        events.add(new LaunchEvent(6, "Prime the engines!", clock));
        events.add(new LaunchEvent(0, "Liftoff!", clock));
        clock.start();
        for (Runnable e : events){
            new Thread(e).start();
        }
    }
}

interface TimeMonitor{
    int getTime();
    void abortCountDown();
}

//class CountDownClock extends Thread implements TimeMonitor { //in CountDownClock.java
//    private int t;
//    public CountDownClock(int start){
//        this.t = start;
//    }
//
//    public void run(){
//        boolean aborted = false;
//        for (; t >= 0; t--){
//            System.out.println("T-minus :" + t);
//            try {
//                Thread.sleep(1000);
//            } catch(InterruptedException e) {
//                aborted = true;
//            }
//            if (Thread.interrupted()){
//                aborted = true;
//            }
//            if (aborted){
//                System.out.println("Stopping the clock");
//                break;
//            }
//        }
//    }
//
//    public int getTime(){
//        return t;
//    }
//
//    public synchronized void abortCountDown(){
//        Thread[] threads = new Thread[Thread.activeCount()];
//        Thread.enumerate(threads);
//        for (Thread t : threads) t.interrupt();
//    }
//}

//class LaunchEvent implements Runnable { //in LaunchEvent.java
//    private int start;
//    private String message;
//    TimeMonitor tm;
//    public LaunchEvent(int start, String message, TimeMonitor monitor){
//        this.start = start;
//        this.message = message;
//        this.tm = monitor;
//    }
//
//    public void run(){
//        boolean eventDone = false;
//        boolean aborted = false;
//        while (!eventDone){
//            try {
//                Thread.sleep(10);
//            } catch(InterruptedException e) {
//                aborted = true;
//            }
//
//            if (tm.getTime() <= start){
//                System.out.println(this.message);
//                eventDone = true;
//                System.out.println("Abort!");
//                tm.abortCountDown();
//            }
//
//            if (Thread.interrupted()){
//                aborted = true;
//            }
//            if (aborted){
//                System.out.println("Aborting " + message);
//                break;
//            }
//        }
//    }
//}