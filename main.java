// Abstract class
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

// Triangle class
class Triangle extends Shape {
    double a, b, c;

    Triangle(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());

        Triangle t = new Triangle(3,4, 5);
        System.out.println("Triangle Area: " + t.calculateArea());
        System.out.println("Triangle Perimeter: " + t.calculatePerimeter());
    }
}
