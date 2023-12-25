package org.TN.figures;

public class Ellipse implements Figure {
    private final double semiMajorAxis;
    private final double semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        if (semiMajorAxis <= 0.0 || semiMinorAxis <= 0.0) {
            throw new RuntimeException();
        }
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public void draw() {
        for (int y = (int) semiMinorAxis; y >= -semiMinorAxis; y--) {
            for (int x = (int) -semiMajorAxis; x <= semiMajorAxis; x++) {
                if (isOnEllipseContour(x, y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private boolean isOnEllipseContour(int x, int y) {
        double value = (x * x) / (semiMajorAxis * semiMajorAxis) + (y * y) / (semiMinorAxis * semiMinorAxis);
        return Math.abs(value - 1) < 0.1;
    }


    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

}

