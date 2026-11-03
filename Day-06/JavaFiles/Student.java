public class Student {
    Student() {
        System.out.println("Constructor Overloading");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, String dept) {
        System.out.println("Name: " + name + " Dept: " + dept);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Bidhisha");
        Student s3 = new Student("Bidhisha", "CSE");
    }
}