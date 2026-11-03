
class Shared {
    synchronized void produce() {
        System.out.println("Producer is waiting");

        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Producer received notification");
    }

    synchronized void consume() {
        System.out.println("Consumer is working");
        notify();
        System.out.println("Consumer sent notification");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.produce());
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            obj.consume();
        });

        t1.start();
        t2.start();
    }
}
