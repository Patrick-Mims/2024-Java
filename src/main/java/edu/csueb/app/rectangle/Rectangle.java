package edu.csueb.app.rectangle;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {}

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return (getHeight() * 2) + (getWidth() * 2);
    }

    public String toString() {
        return "Width: " + this.width + " Height: " + this.height + " getPerimeter -> " + getPerimeter();
    }
}

/* *
 * 9.1 (The rectangle class)
 * Following the example of the Circle class in Section 9.2,
 * design a class named Rectangle to represent a rectangle.
 *
 * The class contains:
 *
 * Two double data fields named width and height that specify the width and height of the rectangle.
 * The default values are 1 for both width and height.
 *
 * A no-arg constructor that creates a default rectangle.
 * A constructor that creates a default rectangle.
 * A method named getArea() that returns the area of this rectangle.
 * A method named getPerimeter() that returns the perimeter.
 *
 * Draw the UML diagram for the class and then implement the class.
 * Write a test program that creates two Rectangle objects:
 *
 * one with width 4 and height 40 and the other with width 3.5 and height 35.9.
 *
 * Display the width, height, area and perimeter of each rectangle in this order.
 */
