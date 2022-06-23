package com.geekbrains.HW4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.geekbrains.HW4.Triangle.calcAreaTriangle;

public class TriangleTest {
    @Test
    void checkTriangleAreaFormula() throws Exception {
        Assertions.assertEquals(10.825, calcAreaTriangle(5, 5, 5), 0.001);
    }

    @Test
    void exceptionWhenBadTriangle() {
        Assertions.assertThrows(Exception.class, () -> calcAreaTriangle(1, -1, 1));
    }
}
