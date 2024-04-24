class MyThread extends Thread {
    private int id;

    public MyThread(int id) {
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

public class JoinThreadsDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        MyThread thread3 = new MyThread(3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            System.out.println("Main thread waiting for threads to finish...");
            thread1.join();
            thread2.join();
            thread3.join();
            System.out.println("All threads finished.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for threads.");
        }

        System.out.println("Main thread exiting.");
    }
}
