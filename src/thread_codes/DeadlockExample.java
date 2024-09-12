package thread_codes;


public class DeadlockExample {
	 private final Object lock1 = new Object();
	    private final Object lock2 = new Object();

	    public void method1() {
	        synchronized (lock1) {
	            System.out.println("Thread 1 holding lock 1...");
	            try {
	                Thread.sleep(100);
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	            System.out.println("Thread 1: Waiting for lock 2...");

	            synchronized (lock2) { // Thread 1 tries to acquire lock2
	                System.out.println("Thread 1: Holding lock 1 and 2...");
	            }
	        }
	    }

	    public void method2() {
	        synchronized (lock2) {
	            System.out.println("Thread 2 holding lock 2...");
	            try {
	                Thread.sleep(100);
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	            System.out.println("Thread 2: Waiting for lock 1...");

	            synchronized (lock1) { // Thread 2 tries to acquire lock1
	                System.out.println("Thread 2: Holding lock 2 and 1...");
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadlockExample deadlock = new DeadlockExample();

        // Create two threads that will NOT cause a deadlock
        Thread th1 = new Thread(deadlock::method1);
        Thread th2 = new Thread(deadlock::method2);

        th1.start();
        th2.start();
	}

}
