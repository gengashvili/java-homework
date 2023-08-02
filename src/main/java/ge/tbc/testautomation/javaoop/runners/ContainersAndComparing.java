package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.*;

public class ContainersAndComparing {

    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();

        numbers.add("555-542-231");
        numbers.add("555-887-987");
        numbers.add("555-161-143");
        numbers.add("555-189-6667");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println();

//        ან ეს
//        for (String number : numbers) {
//            System.out.println(number);
//        }


        Iterator<String> iterator =  numbers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        HashMap<String,String> phoneNumbersData = new HashMap<>();

        phoneNumbersData.put("გიორგი",numbers.get(0));
        phoneNumbersData.put("დათო", numbers.get(1));
        phoneNumbersData.put("ნიკა",numbers.get(2));
        phoneNumbersData.put("სანდრო", numbers.get(3));

        for (String key: phoneNumbersData.keySet()) {
            if(phoneNumbersData.get(key).contains("8")) {
                System.out.println(key);
            }
        }
        System.out.println();


        TreeSet<Circle> circlesTreeSet = new TreeSet<>();

        circlesTreeSet.add(new Circle(20.0));
        circlesTreeSet.add(new Circle(15.0));
        circlesTreeSet.add(new Circle(12.5));
        circlesTreeSet.add(new Circle(10.0));
        circlesTreeSet.add(new Circle(15.0));
        circlesTreeSet.add(new Circle(9.0));
        circlesTreeSet.add(new Circle(12.5));
        circlesTreeSet.add(new Circle(13.0));
        circlesTreeSet.add(new Circle(19.0));
        circlesTreeSet.add(new Circle(19.0));


        for (Circle circle : circlesTreeSet) {
            System.out.println(circle);
        }
        System.out.println();


        HashSet<Circle> circlesHashSet = new HashSet<>();

        circlesHashSet.add(new Circle(10.5));
        circlesHashSet.add(new Circle(10.5));
        circlesHashSet.add(new Circle(12.0));
        circlesHashSet.add(new Circle(15.0));
        circlesHashSet.add(new Circle(17.0));
        circlesHashSet.add(new Circle(19.0));
        circlesHashSet.add(new Circle(20.0));
        circlesHashSet.add(new Circle(20.0));
        circlesHashSet.add(new Circle(25.0));
        circlesHashSet.add(new Circle(30.0));

        for (Circle circle : circlesHashSet) {
            System.out.println(circle);
        }





    }

}
