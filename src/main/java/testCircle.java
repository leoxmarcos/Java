public class testCircle {
    public static void main(String[] args) {
        Circle c1, c2, c3, c4;

        c1 = new Circle(2.0f);
        c2 = new Circle(3.0f);
        c3 = new Circle(4.0f);
        c4 = new Circle(c2);

        System.out.println("c1 Address=" + c1);
        c1.calc_Area();
        c1.display();

        System.out.println("c2 Address=" + c2);
        c2.calc_Area();
        c2.display();

        System.out.println("c3 Address=" + c3);
        c3.calc_Area();
        c3.display();

        System.out.println("c4 Address=" + c4);
        c4.calc_Area();
        c4.display();

        System.out.println("\n----- newCircle Objects -----");

        newCircle n1, n2, n3, n4;

        n1 = new newCircle(2.0f);
        n2 = new newCircle(3.0f);
        n3 = new newCircle(4.0f);
        n4 = new newCircle(n2);

        System.out.println("n1 Address=" + n1);
        n1.calc_Area();
        n1.calc_Perimeter();
        n1.display();

        System.out.println("n2 Address=" + n2);
        n2.calc_Area();
        n2.calc_Perimeter();
        n2.display();

        System.out.println("n3 Address=" + n3);
        n3.calc_Area();
        n3.calc_Perimeter();
        n3.display();

        System.out.println("n4 Address=" + n4);
        n4.calc_Area();
        n4.calc_Perimeter();
        n4.display();
    }
}