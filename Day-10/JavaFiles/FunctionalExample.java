@FunctionalInterface
interface Message {
    void show();
}

public class FunctionalExample {
    public static void main(String[] args) {
        Message message = () -> System.out.println("Hello Java");

        message.show();
    }
}