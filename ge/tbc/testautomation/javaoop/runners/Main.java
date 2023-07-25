package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Circle circle1 = new Circle(random.nextDouble() * 100);
        System.out.println("number of circle instances: " + Circle.numberOfCircleInstances);

        Circle circle2 = new Circle(random.nextDouble() * 100);
        System.out.println("number of circle instances: " + Circle.numberOfCircleInstances);

        Circle circle3 = new Circle(random.nextDouble() * 100);
        System.out.println("number of circle instances: " + Circle.numberOfCircleInstances);

        Circle circle4 = new Circle(random.nextDouble() * 100);
        System.out.println("number of circle instances: " + Circle.numberOfCircleInstances);

        Circle circle5 = new Circle(random.nextDouble() * 100);
        System.out.println("number of circle instances: " + Circle.numberOfCircleInstances);


        System.out.println();

        String circle1ToString = Util.circleToString(circle1);
        String circle2ToString = Util.circleToString(circle2);
        String circle3ToString = Util.circleToString(circle3);
        String circle4ToString = Util.circleToString(circle4);
        String circle5ToString = Util.circleToString(circle5);

        System.out.println(circle1ToString);
        System.out.println(circle2ToString);
        System.out.println(circle3ToString);
        System.out.println(circle4ToString);
        System.out.println(circle5ToString);
    }
}
