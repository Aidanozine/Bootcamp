package OCP.Ch13.Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();
//        if(lock.tryLock()) {
        if(lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
//            } finally {
            } catch(Exception e){
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    private static void printHello(Lock lock) {
        try {
//            lock.lock();
            Thread.sleep(1000);
            System.out.println("Hello");
//        } finally {
        } catch(Exception e){
            lock.unlock();
        }
    }
}
