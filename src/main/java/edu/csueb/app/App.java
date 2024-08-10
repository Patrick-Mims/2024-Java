package edu.csueb.app;

import edu.csueb.app.chapter21.Challenge01;
import edu.csueb.app.rectangle.Rectangle;
import edu.csueb.app.stock.Stock;

import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main( String[] args ) {
        Rectangle rectangle = new Rectangle(4, 40);
        Stock stock = new Stock("orcl", "oracle corporation", 35.00, 20.00);

        System.out.println();

        System.out.println("Rectangle Class 9.1");
        System.out.println(rectangle.toString());

        System.out.println();

        System.out.println("Stock Class 9.2");
        System.out.println(stock.tostring());

        System.out.println();

        Set<String> set01 = new LinkedHashSet<>();

        set01.add("George");
        set01.add("Jim");
        set01.add("John");
        set01.add("Blake");
        set01.add("Kevin");
        set01.add("Michael");

        System.out.println("This is set01 -> " + set01);

        Challenge01 ch01 = new Challenge01();

        Set<String> union = ch01.getUnion(set01);
        // Set<String> difference = ch01.getDifference(set01);
        // Set<String> intersection = ch01.getIntersection(set01);

        System.out.println("getUnion() -> " + union);
        // System.out.println("getDifference()  -> " + difference);
        // System.out.println("getIntersection() -> " + ch01.getIntersection(set01));
    }
}