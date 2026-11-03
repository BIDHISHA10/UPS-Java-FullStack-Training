
class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + ": " + i
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
