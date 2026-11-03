
public class LambdaThreadExample {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Thread is running");
        };

        Thread t = new Thread(task);
        t.start();

        System.out.println("Main method completed");
    }
}
