package ge.tbc.testautomation.javaoop.figures;

public class Triangle extends Figure {
    double a, b, c, h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a * h) * 0.5;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
