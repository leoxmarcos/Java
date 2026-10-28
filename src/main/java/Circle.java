public class Circle {
    protected float radius;
    private float area;
    final float pi = 3.14f;

    // Default constructor
    Circle() {
        radius = 0.0f;
    }

    // Parameterized constructor
    Circle(float radius) {
        this.radius = radius;
    }

    // Copy constructor
    Circle(Circle c) {
        radius = c.radius;
    }

    void display() {
        System.out.println("Radius=" + radius);
        System.out.println("Area=" + area);
    }

    void calc_Area() {
        area = pi * radius * radius;
    }
}