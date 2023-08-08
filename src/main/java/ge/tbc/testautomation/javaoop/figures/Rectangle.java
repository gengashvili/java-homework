package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public void printPackageName() {
        String currentPackage = Circle.class.getPackage().getName();

        System.out.println("current class package - " + currentPackage);
    }

    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle {" + " a = " + a + ", b=" + b + " }";
    }
}
