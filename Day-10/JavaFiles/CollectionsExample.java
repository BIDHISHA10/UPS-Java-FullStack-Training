import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Arun");
        list.add("Priya");
        list.add("Bidhisha");
        System.out.println("ArrayList: " + list);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Arun");
        linkedList.addFirst("Ravi");
        linkedList.addLast("Priya");
        System.out.println("LinkedList: " + linkedList);

        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        System.out.println("Vector: " + vector);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(30);
        System.out.println("HashSet: " + hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Arun");
        linkedHashSet.add("Priya");
        linkedHashSet.add("Arun");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println("TreeSet: " + treeSet);

        Queue<String> queue = new LinkedList<>();
        queue.offer("Arun");
        queue.offer("Priya");
        queue.offer("Rahul");

        System.out.println("Queue removed: " + queue.poll());
        System.out.println("Queue next: " + queue.peek());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("PriorityQueue removed: " + priorityQueue.poll());
    }
}