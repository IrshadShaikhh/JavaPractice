package thread_codes;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockHandle {

	private final Lock lock1 = new ReentrantLock();
	private final Lock lock2 = new ReentrantLock();
	
	public void method1()
	{
		try {
            if (lock1.tryLock()) {
                System.out.println("Thread 1 holding lock 1...");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Thread 1: Waiting for lock 2...");

                if (lock2.tryLock()) {
                    try {
                        System.out.println("Thread 1: Holding lock 1 and 2...");
                    } finally {
                        lock2.unlock();  // Always release lock2
                    }
                } else {
                    System.out.println("Thread 1: Could not acquire lock 2");
                }
            }
        } finally {
            lock1.unlock();  // Always release lock1
        }
	}
	
	public void method2()
	{
		try {
            if (lock2.tryLock()) {
                System.out.println("Thread 2 holding lock 2...");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Thread 2: Waiting for lock 1...");

                if (lock1.tryLock()) {
                    try {
                        System.out.println("Thread 2: Holding lock 1 and 2...");
                    } finally {
                        lock1.unlock();  // Always release lock2
                    }
                } else {
                    System.out.println("Thread 2: Could not acquire lock 2");
                }
            }
        } finally {
            lock2.unlock();  // Always release lock1
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadlockHandle deadlock = new DeadlockHandle();

        // Create two threads that will NOT cause a deadlock
        Thread th1 = new Thread(deadlock::method1);
        Thread th2 = new Thread(deadlock::method2);

        th1.start();
        th2.start();
	}

}
