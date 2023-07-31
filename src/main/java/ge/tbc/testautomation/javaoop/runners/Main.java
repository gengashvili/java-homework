package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        try {
            Circle circle = new Circle(-1.0);
        } catch (RadiusException re) {
            System.out.println(re.getMessage());
        }


        try {
            Circle circle1 = new Circle(1.5);
            Circle circle2 = new Circle(2.0);
            Circle circle3 = new Circle(2.5);
            Circle circle4 = new Circle(3.0);
            Circle circle5 = new Circle(3.5);
            Circle circle6 = new Circle(4.0);
        } catch (LimitException le) {
            System.out.println(le.getMessage());
        }

        System.out.println();


        String str = "Test Automation Bootcamp 6, 2022";

        System.out.println(str.substring(5,15).toLowerCase()+"\n");

        String[] strArray = str.split(" ");

        for(String arrayItem : strArray) {
            System.out.println(arrayItem);
        }

        System.out.println();

        for(String arrayItem : strArray) {
            System.out.println(arrayItem.length());
        }

        System.out.println();

        String changedStr = str.replace(" ", "-");
        System.out.println(changedStr+"\n");


        String[] phoneNumbers = {
                "555-123-456",
                "555-9876-54321",
                "595-246-810",
                "595-135-7911",
                "592-098-765",
                "592-4321-098",
                "599-648-193",
                "599-123-456-789"
        };

        for(String number: phoneNumbers) {
            System.out.println(phoneNumberValidation(number));
        }


    }

    private static boolean phoneNumberValidation(String phoneNumber) {

        String phoneNumberPattern = "^(555|595|592|599)\\d{6}$";
        String parsedPhoneNumber = phoneNumber.replace("-","");
        boolean result = parsedPhoneNumber.matches(phoneNumberPattern);

        return result;
    }

}
