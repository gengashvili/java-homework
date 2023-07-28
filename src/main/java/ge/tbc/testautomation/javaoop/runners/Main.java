package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.5,15.5);
        Triangle triangle = new Triangle(5.0,5.0,7.0,6.0);

        Rectangle rectangle1 = new Rectangle(10.0,11.5);
        Rectangle rectangle2 = new Rectangle(7.0,19.5);

        System.out.println("rectangle area: " + rectangle.getArea());
        System.out.println("rectangle perimeter: " + rectangle.getPerimeter() + "\n");

        System.out.println("triangle area: " + triangle.getArea());
        System.out.println("triangle perimeter: " + triangle.getPerimeter() + "\n");

        HelperFunctions.compareRectangles(rectangle1,rectangle2);

    }
}
