package Book5.chapter1;

//public class CountDownClock extends Thread{ //part1
//    public void run(){
//        for (int t = 20; t >= 0; t--){
//            System.out.println("T-minus: " + t);
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {}
//        }
//    }
//}

//class CountDownClock extends Thread implements TimeMonitor { //part2
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

class CountDownClock extends Thread implements TimeMonitor { //part3
    private int t;
    public CountDownClock(int start){
        this.t = start;
    }

    public void run(){
        boolean aborted = false;
        for (; t >= 0; t--){
            System.out.println("T-minus :" + t);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                aborted = true;
            }
            if (Thread.interrupted()){
                aborted = true;
            }
            if (aborted){
                System.out.println("Stopping the clock");
                break;
            }
        }
    }

    public int getTime(){
        return t;
    }

    public synchronized void abortCountDown(){
        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);
        for (Thread t : threads) t.interrupt();
    }
}