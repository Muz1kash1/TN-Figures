package org.TN.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {

    @Test
    void getArea() {
        Ellipse rectangle = new Ellipse(2.0, 2.0);
        assertEquals(Math.PI * 4.0, rectangle.getArea());
    }

    @Test
    void throwsExceptionWhenNegativeHalfAxis() {
        assertThrows(RuntimeException.class, () -> {
            Ellipse rectangle = new Ellipse(-2.0, 2.0);
        });
    }
}