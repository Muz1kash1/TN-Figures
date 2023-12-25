package org.TN.figures;

public class Rectangle implements Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0.0 || height <= 0.0) {
            throw new RuntimeException();
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
