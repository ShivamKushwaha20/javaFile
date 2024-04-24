class MyRunnable implements Runnable {
    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread " + id + " started.");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread " + id + " interrupted.");
        }
        System.out.println("Thread " + id + " finished.");
    }
}

public class MultipleThreadsDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(1));
        Thread thread2 = new Thread(new MyRunnable(2));
        Thread thread3 = new Thread(new MyRunnable(3));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Main thread continuing execution...");
    }
}
