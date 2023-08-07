package ge.tbc.testautomation.annotationsAndComparators;

import java.util.Comparator;
import java.util.List;

public class RectangleComparator implements Comparator<Rectangle> {


    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        double rec1Area = o1.getArea();
        double rec2Area = o2.getArea();

        return Double.compare(rec2Area, rec1Area);
    }

}
