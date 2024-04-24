class Counter {
    private int count = 0;

    // Method to increment the counter without synchronization
    public void incrementUnsynchronized() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    // Method to increment the counter using a synchronized block
    public void incrementSynchronized() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter without synchronization
        Thread thread1 = new Thread(() -> {
            counter.incrementUnsynchronized();
        });

        Thread thread2 = new Thread(() -> {
            counter.incrementUnsynchronized();
        });

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("Unsynchronized Count: " + counter.getCount());

        // Reset counter for synchronized demonstration
        counter = new Counter();

        // Create two threads that increment the counter using synchronization
        Thread thread3 = new Thread(() -> {
            counter.incrementSynchronized();
        });

        Thread thread4 = new Thread(() -> {
            counter.incrementSynchronized();
        });

        thread3.start();
        thread4.start();

        // Wait for both threads to finish
        thread3.join();
        thread4.join();

        System.out.println("Synchronized Count: " + counter.getCount());
    }
}
