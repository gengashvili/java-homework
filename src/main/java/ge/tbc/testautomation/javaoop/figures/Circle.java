package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;


public class Circle extends Figure implements IResizableCircle, IValidCircle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public double getLength() {
        return this.radius * 2 * Math.PI;
    }
    @Override
    public void printPackageName() {
        String currentPackage = Circle.class.getPackage().getName();

        System.out.println("current class package - " + currentPackage);
    }


    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        return new Circle(circle.radius * 2);
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        return new Circle(circle.radius * byvValue);
    }

    @Override
    public boolean validateCircle(Circle circle) {
        return circle.radius > 0;
    }
}
