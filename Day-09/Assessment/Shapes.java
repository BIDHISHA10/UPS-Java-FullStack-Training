
class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape shapes[] = {
            new Circle(7),
            new Rectangle(5, 4),
            new Triangle(6, 8)
        };

        System.out.printf("Circle area: %.2f%n", shapes[0].area());
        System.out.println("Rectangle area: " + shapes[1].area());
        System.out.println("Triangle area: " + shapes[2].area());
    }
}
