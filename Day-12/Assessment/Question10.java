import java.util.*;
import java.io.*;

public class Question10 {

    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
            System.out.println("--------------------");
        }

        String toFile() {
            return id + "," + name + "," + department + "," + salary;
        }
    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static HashMap<Integer, Employee> employeeMap = new HashMap<>();
    static HashSet<Integer> employeeIds = new HashSet<>();

    static Scanner sc = new Scanner(System.in);
    static String fileName = "employees.txt";

    static void loadEmployees() {
        try (BufferedReader reader =
                new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 4) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String department = data[2];
                    double salary = Double.parseDouble(data[3]);

                    if (id > 0 && salary >= 0 && employeeIds.add(id)) {
                        Employee e =
                                new Employee(id, name, department, salary);

                        employees.add(e);
                        employeeMap.put(id, e);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("New employee file will be created.");
        } catch (IOException e) {
            System.out.println("Error loading file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid data found in file.");
        }
    }

    static void saveEmployees() {
        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter(fileName))) {

            for (Employee e : employees) {
                writer.write(e.toFile());
                writer.newLine();
            }

            System.out.println("Records saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving records.");
        }
    }

    static void addEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            if (id <= 0 || employeeIds.contains(id)) {
                System.out.println("Invalid or duplicate employee ID.");
                return;
            }

            System.out.print("Enter employee name: ");
            String name = sc.nextLine().replace(",", " ");

            System.out.print("Enter department: ");
            String department = sc.nextLine().replace(",", " ");

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }

            Employee e = new Employee(id, name, department, salary);

            employees.add(e);
            employeeMap.put(id, e);
            employeeIds.add(id);

            System.out.println("Employee added successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }

    static void searchEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Employee e = employeeMap.get(id);

            if (e != null) {
                e.display();
            } else {
                System.out.println("Employee not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID.");
        }
    }

    static void updateSalary() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Employee e = employeeMap.get(id);

            if (e == null) {
                System.out.println("Employee not found.");
                return;
            }

            System.out.print("Enter new salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }

            e.salary = salary;
            System.out.println("Salary updated successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }

    static void deleteEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Employee e = employeeMap.remove(id);

            if (e != null) {
                employees.remove(e);
                employeeIds.remove(id);
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID.");
        }
    }

    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    public static void main(String[] args) {
        loadEmployees();

        while (true) {
            System.out.println("\nEMPLOYEE RECORD MANAGER");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Save and Exit");

            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addEmployee();
                    break;

                case "2":
                    searchEmployee();
                    break;

                case "3":
                    updateSalary();
                    break;

                case "4":
                    deleteEmployee();
                    break;

                case "5":
                    displayEmployees();
                    break;

                case "6":
                    saveEmployees();
                    sc.close();
                    System.out.println("Program closed.");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}