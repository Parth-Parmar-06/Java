package AbstractClass;

abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double getArea();
}

class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }
    double getArea() {
        return dim1*dim2;
    }
}

class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }
    double getArea() {
        return (0.5*dim1*dim2);
    }
}

public class AreaExample {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(9, 5);
        Triangle tri = new Triangle(10, 8);
        Figure fig;

        fig = rect;
        System.out.println("Rectange Area: " + fig.getArea());

        fig = tri;
        System.out.println("Triangle Area: " + fig.getArea());
    }
}
