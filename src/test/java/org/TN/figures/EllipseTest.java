package org.TN.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EllipseTest {

    @Test
    void getArea() {
        Ellipse ellipse = new Ellipse(2.0, 2.0);
        assertEquals(Math.PI * 4.0, ellipse.getArea());
    }

    @Test
    void throwsExceptionWhenNegativeHalfAxis() {
        assertThrows(RuntimeException.class, () -> {
            Ellipse ellipse = new Ellipse(-2.0, 2.0);
        });
    }
}