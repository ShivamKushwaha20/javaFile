class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("Second thread started.");
        try {
            Thread.sleep(3000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Second thread interrupted.");
        }
        System.out.println("Second thread finished.");
    }
}

public class SecondThreadDemo {
    public static void main(String[] args) {
        SecondThread secondThread = new SecondThread();

        secondThread.start(); // Start the second thread

        try {
            System.out.println("Main thread waiting for second thread to finish...");
            secondThread.join(); // Wait for the second thread to finish
            System.out.println("Second thread finished.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for second thread.");
        }

        System.out.println("Main thread exiting.");
    }
}
