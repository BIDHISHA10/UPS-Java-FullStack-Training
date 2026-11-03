public class Question3 {

    static class Employee {
        int id;
        String name;
        double basicSalary;

        Employee(int id, String name, double basicSalary) {
            this.id = id;
            this.name = name;
            this.basicSalary = basicSalary;
        }

        double calculateSalary() {
            return basicSalary;
        }

        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + calculateSalary());
        }
    }

    static class FullTimeEmployee extends Employee {
        FullTimeEmployee(int id, String name, double salary) {
            super(id, name, salary);
        }

        @Override
        double calculateSalary() {
            return basicSalary + basicSalary * 0.20;
        }
    }

    static class PartTimeEmployee extends Employee {
        int hours;
        double hourlyRate;

        PartTimeEmployee(int id, String name, int hours, double rate) {
            super(id, name, 0);
            this.hours = hours;
            this.hourlyRate = rate;
        }

        @Override
        double calculateSalary() {
            return hours * hourlyRate;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Arun", 30000);
        Employee e2 = new PartTimeEmployee(2, "Ravi", 80, 200);

        System.out.println("Full Time Employee");
        e1.display();

        System.out.println("\nPart Time Employee");
        e2.display();
    }
}