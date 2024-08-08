package edu.csueb.app;

import edu.csueb.app.rectangle.Rectangle;
import edu.csueb.app.stock.Stock;

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

        System.out.println("");
    }
}
