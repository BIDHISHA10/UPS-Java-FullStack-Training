public class Question7 {

    static class TicketCounter {
        int tickets = 10;

        synchronized void bookTickets(String customer) {
            if (tickets >= 4) {
                tickets -= 4;
                System.out.println(customer + " booked 4 tickets.");
                System.out.println("Tickets remaining: " + tickets);
            } else {
                System.out.println(customer + " could not book tickets.");
                System.out.println("Tickets available: " + tickets);
            }
        }
    }

    static class Customer extends Thread {
        TicketCounter counter;

        Customer(TicketCounter counter, String name) {
            this.counter = counter;
            setName(name);
        }

        public void run() {
            counter.bookTickets(getName());
        }
    }

    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Customer c1 = new Customer(counter, "Customer 1");
        Customer c2 = new Customer(counter, "Customer 2");
        Customer c3 = new Customer(counter, "Customer 3");

        c1.start();
        c2.start();
        c3.start();
    }
}