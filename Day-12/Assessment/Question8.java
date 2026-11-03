public class Question8 {

    static class SharedData {
        int number;
        boolean available = false;
        boolean finished = false;

        synchronized void produce(int value) throws InterruptedException {
            while (available) {
                wait();
            }

            number = value;
            available = true;

            System.out.println("Produced: " + number);
            notifyAll();
        }

        synchronized boolean consume() throws InterruptedException {
            while (!available && !finished) {
                wait();
            }

            if (available) {
                System.out.println("Consumed: " + number);
                available = false;
                notifyAll();
                return true;
            }

            return false;
        }

        synchronized void finish() {
            finished = true;
            notifyAll();
        }
    }

    static class Producer extends Thread {
        SharedData data;

        Producer(SharedData data) {
            this.data = data;
        }

        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    data.produce(i);
                }

                data.finish();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer extends Thread {
        SharedData data;

        Consumer(SharedData data) {
            this.data = data;
        }

        public void run() {
            try {
                while (data.consume()) {
                    // Continue consuming available values
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedData data = new SharedData();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        consumer.start();
        producer.start();

        producer.join();
        consumer.join();

        System.out.println("Finished.");
    }
}