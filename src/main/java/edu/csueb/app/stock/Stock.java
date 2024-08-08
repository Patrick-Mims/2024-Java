package edu.csueb.app.stock;

public class Stock {
    private final String ticker;
    private final String name;
    private final Double previousClosingPrice;
    private final Double currentPrice;

    public Stock(String ticker, String name, Double previousClosingPrice, Double currentPrice) {
        this.ticker = ticker;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (this.previousClosingPrice - this.currentPrice);
    }

    public String tostring() {
        return "ticker : " + this.ticker + " height: " + this.name + " getChangePercent -> " + getChangePercent();
    }
}
/* *
    9.2 (The Stock class)
    Following the example of the Circle class in Section 9.2, design a class named Stock that contains:

    A string data field named symbol for the stock's ticker.
    A string data field named name for the stock's name.
    A double data field named previousClosingPrice that stores stock price for the previous day.
    A double data field named currentPrice that stores the stock price for the current time.

    A constructor that creates a stock with the specified ticker and name.

    A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.

    Draw the UML diagram for the class and then implement the class.

    Write a test program that creates a Stock object with the stock symbol ORAL,
    the name Oracle Corporation, and the previous closing price of 34.5.

    Set a new current price to 34.35 and display the price-change percentage.
*/
