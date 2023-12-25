package org.TN;


import org.TN.figures.Ellipse;
import org.TN.figures.Rectangle;


public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(3.0,3.0);
//        rectangle.draw();

        Ellipse ellipse = new Ellipse(10.0, 10.0);
        ellipse.draw();
        System.out.println(ellipse.getArea());
    }
}