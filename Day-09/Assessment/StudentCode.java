
class Student {
    String name;
    int marks[] = new int[3];
    int total;
    double average;
    char grade;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    void calculate() {
        total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        average = total / 3.0;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class StudentCode {
    public static void main(String[] args) {
        Student s1 = new Student("Bidhisha", 95, 90, 92);
        Student s2 = new Student("Rahul", 80, 75, 85);
        Student s3 = new Student("Priya", 70, 65, 75);

        Student students[] = {s1, s2, s3};

        Student topper = students[0];

        for (int i = 0; i < students.length; i++) {
            students[i].calculate();
            students[i].display();

            if (students[i].total > topper.total) {
                topper = students[i];
            }
        }

        System.out.println("Class Topper: " + topper.name);
        System.out.println("Topper Total: " + topper.total);
    }
}
