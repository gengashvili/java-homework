package ge.tbc.testautomation.javaoop.figures;

public class Figure {
    public static int numberOfInstances = 0;

    public Figure() {
        numberOfInstances++;
    }

    public double getArea() {
        return -1.0;
    }
    public double getPerimeter() {
        return -1.0;
    }
}
