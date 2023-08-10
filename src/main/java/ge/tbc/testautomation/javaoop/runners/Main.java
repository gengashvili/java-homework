package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnyPair<Field[], Field[]> fieldsPair = getDeclaredFields(16, "something");

        List<Field> integerFields = Arrays.asList(fieldsPair.getElementOne());
        List<Field> stringFields = Arrays.asList(fieldsPair.getElementTwo());


        System.out.println("integer fields : ");
        for (Field field : integerFields) {
            System.out.println(field.getName());
        }
        System.out.println();


        System.out.println("string fields : ");
        for (Field field : stringFields) {
            System.out.println(field.getName());
        }
        System.out.println();



        Circle circle = new Circle(40);
        Rectangle rectangle = new Rectangle(20,30);

        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle,rectangle);

        System.out.println(figurePair);
    }

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] objOneFields = objOne.getClass().getDeclaredFields();
        Field[] objTwoFields = objTwo.getClass().getDeclaredFields();

        return new AnyPair<>(objOneFields, objTwoFields);
    }
}
