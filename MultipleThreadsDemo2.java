class ChildThread extends Thread {
    public ChildThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }
}

public class MultipleThreadsDemo2 {
    public static void main(String[] args) {
        // Create and start multiple child threads
        ChildThread thread1 = new ChildThread("Thread 1");
        ChildThread thread2 = new ChildThread("Thread 2");
        ChildThread thread3 = new ChildThread("Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
