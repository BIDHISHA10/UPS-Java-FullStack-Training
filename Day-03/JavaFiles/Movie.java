import java.util.Scanner;

class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to City Cinemas");

        while (true) {
            System.out.println("\nToday's Movie List");
            System.out.println("1. Retro");
            System.out.println("2. Jailer");
            System.out.println("3. Dragon");
            System.out.println("4. GOAT");
            System.out.println("0. Exit");
            System.out.print("Choose a movie: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for visiting City Cinemas.");
                break;
            }

            String movieName;
            String screen;

            switch (choice) {
                case 1:
                    movieName = "Retro";
                    screen = "Screen 1";
                    break;
                case 2:
                    movieName = "Jailer";
                    screen = "Screen 2";
                    break;
                case 3:
                    movieName = "Dragon";
                    screen = "Screen 3";
                    break;
                case 4:
                    movieName = "GOAT";
                    screen = "Screen 4";
                    break;
                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }

            System.out.println("\nBooking Details");
            System.out.println("Movie: " + movieName);
            System.out.println("Screen: " + screen);

            System.out.println("\nSeat Types");
            System.out.println("1. With A/c - Rs.350");
            System.out.println("2. Without A/c - Rs.200");
            System.out.print("Choose your seat type: ");

            int seatChoice = sc.nextInt();

            if (seatChoice == 1) {
                System.out.println("Seat Type: With A/c");
                System.out.println("Ticket Price: Rs.350");
                System.out.println("Booking successful!");
            } else if (seatChoice == 2) {
                System.out.println("Seat Type: Without A/c");
                System.out.println("Ticket Price: Rs.200");
                System.out.println("Booking successful!");
            } else {
                System.out.println("Invalid seat choice!");
            }
        }

        sc.close();
    }
}

