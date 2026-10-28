public class newCircle extends Circle {
    private float perimeter;

    // Default constructor
    newCircle() {
        super();
    }

    // Parameterized constructor
    newCircle(float radius) {
        super(radius);
    }

    // Copy constructor
    newCircle(newCircle c) {
        super(c);
    }

    void display() {
        super.display();
        System.out.println("Perimeter=" + perimeter);
    }

    void calc_Perimeter() {
        perimeter = 2 * super.pi * super.radius;
    }
}