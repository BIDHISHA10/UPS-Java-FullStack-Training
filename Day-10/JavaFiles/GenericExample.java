class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.set("Bidhisha");

        Box<Integer> numberBox = new Box<>();
        numberBox.set(100);

        System.out.println("Name: " + nameBox.get());
        System.out.println("Number: " + numberBox.get());
    }
}