package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.annotationsAndComparators.Analyzable;
import ge.tbc.testautomation.annotationsAndComparators.Rectangle;
import ge.tbc.testautomation.annotationsAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationsAndComparators.VariableNameAnnotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Analyzable analyzable = new Analyzable();

        Field[] fields = analyzable.getClass().getDeclaredFields();

        for (Field field : fields) {
            VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);

            if(!(field.getName().equalsIgnoreCase(annotation.name()))) {
                System.out.println("VARIABLE NAME MISMATCH FOUND.");
                System.out.println(annotation.name() + " != " + field.getName() + "\n");
            }
        }

        String string1 = "string1";
        String string2 = "string2";
        String string3 = "string3";
        String string4 = "string4";


        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(10,3,2,9,4,5,1,6,8,7));

        System.out.println("unsorted integerArrayList: " + integerArrayList);

        Collections.sort(integerArrayList);

        System.out.println("sorted integerArrayList: " + integerArrayList);



        List<Rectangle> rectangleList = new ArrayList<>(
                Arrays.asList(
                        new Rectangle(4,5),
                        new Rectangle(9,6),
                        new Rectangle(2,8),
                        new Rectangle(1,2),
                        new Rectangle(22,15),
                        new Rectangle(7,5),
                        new Rectangle(9,5),
                        new Rectangle(34,25),
                        new Rectangle(19,50),
                        new Rectangle(40,19)
                )
        );

        RectangleComparator comparator = new RectangleComparator();

        System.out.println("\n-unsorted rectangleList-");
        for (Rectangle rectangle : rectangleList) {
            System.out.println(rectangle);
        }
        System.out.println();

        rectangleList.sort(comparator);

        System.out.println("-sorted rectangleList-");
        for (Rectangle rectangle : rectangleList) {
            System.out.println(rectangle);
        }


    }
}
