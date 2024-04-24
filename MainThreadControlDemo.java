public class MainThreadControlDemo {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        // Print main thread's name and priority
        System.out.println("Main thread: " + mainThread.getName());
        System.out.println("Main thread priority: " + mainThread.getPriority());

        // Change main thread's priority
        mainThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Updated main thread priority: " + mainThread.getPriority());

        // Sleep the main thread for 2 seconds
        System.out.println("Sleeping main thread for 2 seconds...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while sleeping.");
        }

        // Create a new thread and start it
        Thread otherThread = new Thread(() -> {
            System.out.println("Other thread running.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Other thread interrupted while sleeping.");
            }
        });
        otherThread.start();

        // Join the other thread with the main thread
        try {
            System.out.println("Main thread waiting for other thread to finish...");
            otherThread.join();
            System.out.println("Other thread finished.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }

        System.out.println("Main thread exiting.");
    }
}
