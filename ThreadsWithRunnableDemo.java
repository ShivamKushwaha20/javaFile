// Runnable implementation to print your name
class MyNameRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("My name is John Doe."); // Replace with your name
    }
}

// Runnable implementation to print "Hello Java"
class HelloJavaRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello Java");
    }
}

public class ThreadsWithRunnableDemo {
    public static void main(String[] args) {
        // Create instances of the Runnable implementations
        Runnable myNameRunnable = new MyNameRunnable();
        Runnable helloJavaRunnable = new HelloJavaRunnable();

        // Create threads using the Runnable instances
        Thread thread1 = new Thread(myNameRunnable);
        Thread thread2 = new Thread(helloJavaRunnable);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
