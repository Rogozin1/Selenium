package com.geekbrains.lesson4.hw;

public class Triangle {
    public static double calcAreaTriangle(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Стороны треугольника должны быть положительными!!!");
        }

        double hP = (a + b + c) / 2;

        return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
    }
}
