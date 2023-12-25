package org.TN.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(2.0, 2.0);
        assertEquals(4.0, rectangle.getArea());
    }

    @Test
    void throwsExceptionWhenNegativeWidth() {
        assertThrows(RuntimeException.class, () -> {
            Rectangle rectangle = new Rectangle(-2.0, 2.0);
        });
    }
}