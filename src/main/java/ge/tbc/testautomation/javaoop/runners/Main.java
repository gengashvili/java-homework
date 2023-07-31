package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
//import ge.tbc.testautomation.javaoop.figures.Rectangle;
//import ge.tbc.testautomation.javaoop.figures.Triangle;
//import ge.tbc.testautomation.javaoop.util.HelperFunctions;
//import ge.tbc.testautomation.javaoop.util.Util;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10.0);

        System.out.println("circle area - " + circle.getArea());
        System.out.println("circle length - " + circle.getLength());
        circle.printPackageName();
        System.out.println();


        Circle doubleSizedCircle = circle.returnDoubleSizedCircle(circle);

        System.out.println("doubleSizedCircle area - " + doubleSizedCircle.getArea());
        System.out.println("doubleSizedCircle length - " + doubleSizedCircle.getLength());
        System.out.println();


        Circle customSizedCircle = circle.returnCustomSizedCircle(circle, 5);

        System.out.println("customSizedCircle area - " + customSizedCircle.getArea());
        System.out.println("customSizedCircle length - " + customSizedCircle.getLength());
        System.out.println();

        System.out.println(circle.validateCircle(new Circle(-10)));
        System.out.println(circle.validateCircle(new Circle(10)));

    }

}
