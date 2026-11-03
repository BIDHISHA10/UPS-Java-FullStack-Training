
class Worker extends Thread {
    public void run() {
        try {
            System.out.println("Worker started");
            Thread.sleep(3000);
            System.out.println("Worker completed");

        } catch (InterruptedException e) {
            System.out.println("Worker interrupted");
            Thread.currentThread().interrupt();
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        Worker t = new Worker();

        t.start();

        try {
            System.out.println("Main waiting");
            t.join();
            System.out.println("Main completed");

        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
