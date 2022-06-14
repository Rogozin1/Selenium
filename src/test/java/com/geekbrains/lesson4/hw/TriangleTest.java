package com.geekbrains.lesson4.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.geekbrains.lesson4.hw.Triangle.calcAreaTriangle;

public class TriangleTest {
    @Test
    void checkTriangleAreaFormula() throws Exception {
        Assertions.assertEquals(1.732, calcAreaTriangle(2, 2, 2), 0.001);
    }

    @Test
    void exceptionWhenBadTriangle() {
        Assertions.assertThrows(Exception.class, () -> calcAreaTriangle(1, -1, 1));
    }
}
